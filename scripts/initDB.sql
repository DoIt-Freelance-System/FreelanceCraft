DROP DATABASE IF EXISTS FREELANCESYSTEM;

CREATE DATABASE FREELANCESYSTEM;

alter table if exists USER_SKILLS drop constraint userskill_skill_id_fkey;
alter table if exists ORDERS drop constraint customer_fkey;
alter table if exists MESSAGES drop constraint sender_of_message_fkey;
alter table if exists MESSAGES drop constraint recipient_of_message_fkey;
alter table if exists PAYMENTS drop constraint order_id_of_payment_fkey;
alter table if exists FEEDBACKS drop constraint sender_of_feedback_fkey;
alter table if exists FEEDBACKS drop constraint recipient_of_feedback_fkey;
alter table if exists FEEDBACKS drop constraint order_id_of_feedback_fkey;
alter table if exists ATTACHMENTS drop constraint message_id_of_attachment_fkey;
alter table if exists ATTACHMENTS drop constraint order_id_of_attachment_fkey;
alter table if exists USER_SKILLS drop constraint userskill_user_id_fkey;
alter table if exists USER_SKILLS drop constraint userskill_skill_id_fkey;


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
  skill_id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE USERS(
  user_id SERIAL PRIMARY KEY,
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
  order_id SERIAL PRIMARY KEY,
  customer INT NOT NULL,
  text VARCHAR NOT NULL,
  price INT NOT NULL,
  date_of_creation DATE NOT NULL,
  date_of_complection DATE,
  type_of_order VARCHAR NOT NULL,
  status VARCHAR(255) NOT NULL
);
CREATE TABLE MESSAGES(
  message_id SERIAL PRIMARY KEY,
  text_of_message VARCHAR NOT NULL,
  date_of_sending DATE NOT NULL,
  sender_of_message INT NOT NULL,
  recipient_of_message INT NOT NULL,
  type VARCHAR NOT NULL,
  status VARCHAR NOT NULL
);

CREATE TABLE PAYMENTS(
  payment_id SERIAL PRIMARY KEY,
  ammount INT NOT NULL,
  date_of_payment DATE NOT NULL,
  order_id_of_payment INT NOT NULL,
  status VARCHAR(255) NOT NUll
);
CREATE TABLE FEEDBACKS(
  feedback_id SERIAL PRIMARY KEY,
  date_of_feedback DATE NOT NULL,
  text_of_feedback VARCHAR NOT NULL,
  sender_of_feedback INT NOT NULL,
  recipient_of_feedback INT NOT NULL,
  order_id_of_feedback INT NOT NULL
);
CREATE TABLE ATTACHMENTS(
  attachment_id SERIAL PRIMARY KEY,
  link VARCHAR,
  message_id_of_attachment INT NOT NULL,
  order_id_of_attachment INT NOT NULL
);
create table USER_SKILLS(
  userskill_user_id INT NOT NULL,
  userskill_skill_id INT NOT NULL
);

alter table USER_SKILLS ADD CONSTRAINT userskill_skill_id_fkey FOREIGN KEY (userskill_skill_id) REFERENCES SKILLS (skill_id);
alter table ORDERS ADD CONSTRAINT customer_fkey FOREIGN KEY (customer) REFERENCES USERS(user_id);
alter table MESSAGES ADD CONSTRAINT  sender_of_message_fkey FOREIGN KEY (sender_of_message) REFERENCES USERS(user_id);
alter table MESSAGES ADD CONSTRAINT  recipient_of_message_fkey FOREIGN KEY (recipient_of_message) REFERENCES USERS(user_id);
alter table PAYMENTS ADD CONSTRAINT  order_id_of_payment_fkey FOREIGN KEY (order_id_of_payment) REFERENCES ORDERS(order_id);
alter table FEEDBACKS ADD CONSTRAINT  sender_of_feedback_fkey FOREIGN KEY (sender_of_feedback) REFERENCES USERS(user_id);
alter table FEEDBACKS ADD CONSTRAINT  frecipient_of_feedback_fkey FOREIGN KEY (recipient_of_feedback) REFERENCES USERS(user_id);
alter table FEEDBACKS ADD CONSTRAINT  order_id_of_feedback_fkey FOREIGN KEY (order_id_of_feedback) REFERENCES ORDERS(order_id);
alter table ATTACHMENTS ADD CONSTRAINT message_id_of_attachment_fkey FOREIGN KEY (message_id_of_attachment) REFERENCES MESSAGES(message_id);
alter table ATTACHMENTS ADD CONSTRAINT  order_id_of_attachment_fkey FOREIGN KEY (order_id_of_attachment) REFERENCES ORDERS(order_id);
alter table USER_SKILLS ADD CONSTRAINT  userskill_user_id_fkey FOREIGN KEY (userskill_user_id) REFERENCES USERS(user_id);
alter table USER_SKILLS ADD CONSTRAINT  userskill_skill_id_fkey FOREIGN KEY (userskill_skill_id) REFERENCES SKILLS(skill_id);