DROP DATABASE IF EXISTS FREELANCESYSTEM;

CREATE DATABASE FREELANCESYSTEM;

DROP SCHEMA IF EXISTS final_project;
CREATE SCHEMA IF NOT EXISTS final_project;

drop table if exists USER_SKILLS;
drop table if exists SKILLS;
drop table if exists PAYMENTS;
drop table if exists FEEDBACKS;
drop table if exists ATTACHMENTS;
drop table if exists MESSAGES;
drop table if exists ORDERS;
drop table if exists USERS;
DROP TABLE if EXISTS USER_ORDERS;

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
  rating INT NOT NULL
);
CREATE TABLE ORDERS(
  order_id SERIAL PRIMARY KEY ,
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
  sender_of_message INT NOT NULL REFERENCES USERS,
  recipient_of_message INT NOT NULL REFERENCES USERS,
  type VARCHAR NOT NULL,
  status VARCHAR NOT NULL
);

CREATE TABLE PAYMENTS(
  payment_id SERIAL PRIMARY KEY,
  ammount INT NOT NULL,
  date_of_payment DATE NOT NULL,
  order_id_of_payment INT NOT NULL REFERENCES ORDERS,
  status VARCHAR(255) NOT NUll
);
CREATE TABLE FEEDBACKS(
  feedback_id SERIAL PRIMARY KEY,
  date_of_feedback DATE NOT NULL,
  text_of_feedback VARCHAR NOT NULL,
  sender_of_feedback INT NOT NULL REFERENCES USERS,
  recipient_of_feedback INT NOT NULL REFERENCES USERS,
  order_id_of_feedback INT NOT NULL REFERENCES ORDERS
);
CREATE TABLE ATTACHMENTS(
  attachment_id SERIAL PRIMARY KEY,
  link VARCHAR,
  message_id_of_attachment INT NOT NULL REFERENCES MESSAGES,
  order_id_of_attachment INT NOT NULL REFERENCES ORDERS
);
create table USER_SKILLS(
  userskill_user_id SERIAL,
  userskill_skill_id SERIAL
);
CREATE TABLE USER_ORDERS(
  user_order_user_id SERIAL PRIMARY KEY,
  user_order_order_id SERIAL PRIMARY KEY
);