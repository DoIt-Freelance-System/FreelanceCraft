-- TODO for Andrii Tramon
-- Create initialization dump of DB with test data.

INSERT INTO users VALUES (1, 'root', 'Big', 'Brother', 'johndoe@gmail.com', '12345678a', 'ADMINISTRATOR', 'active', '2017-01-01', 0.0 );
INSERT INTO users VALUES (2, 'brown', 'Alex', 'Brown', 'someexecutor@gmail.com', '12345678a', 'EXECUTOR', 'status', '2017-01-02', 0.0 );
INSERT INTO users VALUES (3, 'smith', 'Adam', 'Smith', 'mrsmith@gmail.com', '12345678a', 'CUSTOMER', 'status', '2017-01-03', 0.0 );
INSERT INTO users VALUES (4, 'bolt', 'Mr', 'Bolt', 'mrbolt@gmail.com', '12345678a', 'CUSTOMER', 'status', '2017-01-04', 0.0 );
INSERT INTO users VALUES (5, 'Arny', 'Arnold', 'Schwarzenegger', 'arny@gmail.com', '12345678a', 'EXECUTOR', 'status', '2017-01-05', 0.0 );
INSERT INTO users VALUES (6, 'anonymous', 'John', 'Doe', 'anonymous@gmail.com', '12345678a', 'EXECUTOR', 'status', '2017-01-05', 0.0 );
INSERT INTO users VALUES (7, 'flower', 'Stella', 'Snakes', 'flower@gmail.com', '12345678a', 'CUSTOMER', 'status', '2017-01-05', 0.0 );
INSERT INTO users VALUES (8, 'junior', 'RJ', 'Forest', 'jrforest@gmail.com', '12345678a', 'CUSTOMER', 'status', '2017-02-01', 0.0 );
INSERT INTO users VALUES (9, 'fowler', 'Martin', 'Fowler', 'bddinaction@gmail.com', '12345678a', 'CUSTOMER', 'status', '2017-02-03', 0.0 );
INSERT INTO users VALUES (10, 'dan-north', 'Dan', 'North', 'manning@gmail.com', '12345678a', 'CUSTOMER', 'status', '2017-03-03', 0.0 );
INSERT INTO users VALUES (11, 'cay', 'Cay', 'Horstmann', 'javaguru@gmail.com', '12345678a', 'EXECUTOR', 'status', '2017-03-07', 0.0 );

INSERT INTO skills VALUES (1, 'Java');
INSERT INTO skills VALUES (2, 'C#');
INSERT INTO skills VALUES (3, 'JS');
INSERT INTO skills VALUES (4, 'Python');
INSERT INTO skills VALUES (5, 'C++');
INSERT INTO skills VALUES (6, 'Business Analysis');
INSERT INTO skills VALUES (7, 'Project Management');
INSERT INTO skills VALUES (8, 'Functional (manual) testing');
INSERT INTO skills VALUES (9, 'Test Automation');
INSERT INTO skills VALUES (10, 'Scrum/agile');
INSERT INTO skills VALUES (11, 'SQL');
INSERT INTO skills VALUES (12, 'DevOps');

INSERT INTO user_skills VALUES (1, 1);
INSERT INTO user_skills VALUES (1, 2);
INSERT INTO user_skills VALUES (1, 3);
INSERT INTO user_skills VALUES (1, 4);
