DROP DATABASE IF EXISTS FREELANCESYSTEM;

CREATE DATABASE FREELANCESYSTEM;

alter table if exists USER_SKILLS drop constraint skills_skill_id_fkey;
alter table if exists ORDERS drop constraint customer_user_id_fkey;
alter table if exists MESSAGES drop constraint message_sender_user_id_fkey;
alter table if exists MESSAGES drop constraint message_recipient_user_id_fkey;
alter table if exists PAYMENTS drop constraint payment_order_id_order_id_fkey;
alter table if exists FEEDBACKS drop constraint feedback_order_id_order_id_fkey;
alter table if exists FEEDBACKS drop constraint feedback_recipient_user_id_fkey;
alter table if exists FEEDBACKS drop constraint feedback_sender_user_id_fkey;
alter table if exists ATTACHMENTS drop constraint attachment_message_id_message_id_fkey;
alter table if exists ATTACHMENTS drop constraint attachment_order_id_order_id_fkey;
alter table if exists USER_SKILLS drop constraint userskill_skill_id_skill_id_fkey;
alter table if exists USER_SKILLS drop constraint userskill_user_id_user_id_fkey;


drop table if exists USERS;
drop table if exists ORDERS;
drop table if exists MESSAGES;
drop table if exists SKILLS;
drop table if exists PAYMENTS;
drop table if exists FEEDBACKS;
drop table if exists ATTACHMENTS;
drop table if exists USER_SKILLS;

DROP SCHEMA IF EXISTS final_project;
CREATE SCHEMA IF NOT EXISTS final_project;




CREATE TABLE SKILLS(
  skill_id SERIAL NOT NULL PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE USERS(
  user_id SERIAL NOT NULL  PRIMARY KEY,
  user_nickname VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  mail VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  role VARCHAR(255) NOT NULL,
  status VARCHAR(255) NOT NULL,
  registration_date DATE NOT NULL,
  rating INT NOT NULL,
  skills INT NOT NULL
);
CREATE TABLE ORDERS(
  order_id SERIAL NOT NULL PRIMARY KEY,
  customer INT NOT NULL,
  text VARCHAR NOT NULL,
  price INT NOT NULL,
  date_of_creation DATE NOT NULL,
  date_of_complection DATE,
  order_type VARCHAR NOT NULL,
  status VARCHAR(255) NOT NULL
);
CREATE TABLE MESSAGES(
  message_id SERIAL NOT NULL PRIMARY KEY,
  message_text VARCHAR NOT NULL,
  message_date DATE NOT NULL,
  message_sender INT NOT NULL,
  message_recipient INT NOT NULL,
  type VARCHAR NOT NULL,
  status VARCHAR NOT NULL
);

CREATE TABLE PAYMENTS(
  payment_id SERIAL NOT NULL PRIMARY KEY,
  ammount INT NOT NULL,
  payment_date DATE NOT NULL,
  payment_order_id INT NOT NULL,
  status VARCHAR(255) NOT NUll
);
CREATE TABLE FEEDBACKS(
  feedback_id SERIAL NOT NULL PRIMARY KEY,
  feedback_date DATE NOT NULL,
  feedback_text VARCHAR NOT NULL,
  feedback_sender INT NOT NULL,
  feedback_recipient INT NOT NULL,
  feedback_order_id INT NOT NULL
);
CREATE TABLE ATTACHMENTS(
  attachment_id SERIAL NOT NULL PRIMARY KEY,
  link VARCHAR,
  attachment_message_id INT NOT NULL,
  attachment_order_id INT NOT NULL
);
create table USER_SKILLS(
  userskill_user_id INT NOT NULL,
  userskill_skill_id INT NOT NULL
);

ALTER TABLE final_project.user_skills ADD CONSTRAINT skills_skill_id_fkey FOREIGN KEY (userskill_skill_id) REFERENCES final_project.skills (skill_id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION;
CREATE INDEX fki_skills_skill_id_fkey ON final_project.user_skills(userskill_skill_id);
alter table ORDERS ADD CONSTRAINT customer_user_id_fkey FOREIGN KEY (customer) REFERENCES USERS(user_id);
alter table MESSAGES ADD CONSTRAINT  message_sender_user_id_fkey FOREIGN KEY (message_sender) REFERENCES USERS(user_id);
alter table MESSAGES ADD CONSTRAINT  message_recipient_user_id_fkey FOREIGN KEY (message_recipient) REFERENCES USERS(user_id);
alter table PAYMENTS ADD CONSTRAINT  payment_order_id_order_id_fkey FOREIGN KEY (payment_order_id) REFERENCES ORDERS(order_id);
alter table FEEDBACKS ADD CONSTRAINT  feedback_sender_user_id_fkey FOREIGN KEY (feedback_sender) REFERENCES USERS(user_id);
alter table FEEDBACKS ADD CONSTRAINT  feedback_recipient_user_id_fkey FOREIGN KEY (feedback_recipient) REFERENCES USERS(user_id);
alter table FEEDBACKS ADD CONSTRAINT  feedback_order_id_order_id_fkey FOREIGN KEY (feedback_order_id) REFERENCES ORDERS(order_id);
alter table ATTACHMENTS ADD CONSTRAINT attachment_message_id_message_id_fkey FOREIGN KEY (attachment_message_id) REFERENCES MESSAGES(message_id);
alter table ATTACHMENTS ADD CONSTRAINT  attachment_order_id_order_id_fkey FOREIGN KEY (attachment_order_id) REFERENCES ORDERS(order_id);
alter table USER_SKILLS ADD CONSTRAINT  userskill_user_id_user_id_fkey FOREIGN KEY (userskill_user_id) REFERENCES USERS(user_id);
alter table USER_SKILLS ADD CONSTRAINT  userskill_skill_id_skill_id_fkey FOREIGN KEY (userskill_skill_id) REFERENCES SKILLS(skill_id);