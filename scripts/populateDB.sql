-- TODO for Andrii Tramon
-- Create initialization dump of DB with test data.

--                        id  nick        name      surname           email                     password     role             status    registration  rate
INSERT INTO users VALUES (1, 'root',      'Big',    'Brother',        'johndoe@gmail.com',      '12345678a', 'ADMINISTRATOR', 'active', '2017-01-01', 0.0);
INSERT INTO users VALUES (2, 'smith',     'Adam',   'Smith',          'mrsmith@gmail.com',      '12345678a', 'CUSTOMER',      'status', '2017-01-03', 0.0);
INSERT INTO users VALUES (3, 'bolt',      'Mr',     'Bolt',           'mrbolt@gmail.com',       '12345678a', 'CUSTOMER',      'status', '2017-01-04', 0.0);
INSERT INTO users VALUES (4, 'flower',    'Stella', 'Snakes',         'flower@gmail.com',       '12345678a', 'CUSTOMER',      'status', '2017-01-05', 0.0);
INSERT INTO users VALUES (5, 'brown',     'Alex',   'Brown',          'someexecutor@gmail.com', '12345678a', 'EXECUTOR',      'status', '2017-01-02', 0.0);
INSERT INTO users VALUES (6, 'Arny',      'Arnold', 'Schwarzenegger', 'arny@gmail.com',         '12345678a', 'EXECUTOR',      'status', '2017-01-05', 0.0);
INSERT INTO users VALUES (7, 'anonymous', 'John',   'Doe',            'anonymous@gmail.com',    '12345678a', 'EXECUTOR',      'status', '2017-01-05', 0.0);
INSERT INTO users VALUES (8, 'junior',    'RJ',     'Forest',         'jrforest@gmail.com',     '12345678a', 'EXECUTOR',      'status', '2017-02-01', 0.0);
INSERT INTO users VALUES (9, 'fowler',    'Martin', 'Fowler',         'bddinaction@gmail.com',  '12345678a', 'EXECUTOR',      'status', '2017-02-03', 0.0);
INSERT INTO users VALUES (10,'dan-north', 'Dan',    'North',          'manning@gmail.com',      '12345678a', 'EXECUTOR',      'status', '2017-03-03', 0.0);
INSERT INTO users VALUES (11,'cay',       'Cay',    'Horstmann',      'javaguru@gmail.com',     '12345678a', 'EXECUTOR',      'status', '2017-03-07', 0.0);
INSERT INTO users VALUES (12,'kat',       'Kathy',  'Sierra',         'oca-ocp7@gmail.com',     '12345678a', 'EXECUTOR',      'status', '2017-03-07', 0.0);
INSERT INTO users VALUES (13,'herb',      'Herbert','Schildt',        'hschildt@gmail.com',     '12345678a', 'EXECUTOR',      'status', '2017-03-07', 0.0);
INSERT INTO users VALUES (14,'bert',      'Bert',   'Bates',          'bates@gmail.com',        '12345678a', 'EXECUTOR',      'status', '2017-03-07', 0.0);
INSERT INTO users VALUES (15,'evans',     'Dave',   'Evans',          'devans@gmail.com',       '12345678a', 'EXECUTOR',      'status', '2017-03-07', 0.0);
INSERT INTO users VALUES (16,'mrach',     'Dmitrii','Mrachkovski',    'mrachkovski@gmail.com',  '12345678a', 'EXECUTOR',      'status', '2017-03-07', 0.0);

--                      user_id  skill
INSERT INTO skills VALUES (1,   'Java');
INSERT INTO skills VALUES (2,   'C#');
INSERT INTO skills VALUES (3,   'JS');
INSERT INTO skills VALUES (4,   'Python');
INSERT INTO skills VALUES (5,   'C++');
INSERT INTO skills VALUES (6,   'Business Analysis');
INSERT INTO skills VALUES (7,   'Project Management');
INSERT INTO skills VALUES (8,   'Functional (manual) testing');
INSERT INTO skills VALUES (9,   'Test Automation');
INSERT INTO skills VALUES (10,  'Scrum/agile');
INSERT INTO skills VALUES (11,  'SQL');
INSERT INTO skills VALUES (12,  'DevOps');

--                            id  skill_id
INSERT INTO user_skills VALUES (1, 1);
INSERT INTO user_skills VALUES (1, 2);
INSERT INTO user_skills VALUES (1, 3);
INSERT INTO user_skills VALUES (1, 4);
INSERT INTO user_skills VALUES (2, 4);
INSERT INTO user_skills VALUES (2, 7);
INSERT INTO user_skills VALUES (2, 8);
INSERT INTO user_skills VALUES (3, 1);
INSERT INTO user_skills VALUES (3, 4);
INSERT INTO user_skills VALUES (3, 7);
INSERT INTO user_skills VALUES (3, 8);
INSERT INTO user_skills VALUES (3, 10);
INSERT INTO user_skills VALUES (4, 1);
INSERT INTO user_skills VALUES (4, 2);
INSERT INTO user_skills VALUES (4, 3);
INSERT INTO user_skills VALUES (4, 7);
INSERT INTO user_skills VALUES (4, 12);
INSERT INTO user_skills VALUES (5, 9);
INSERT INTO user_skills VALUES (5, 11);
INSERT INTO user_skills VALUES (6, 1);
INSERT INTO user_skills VALUES (6, 2);
INSERT INTO user_skills VALUES (6, 3);
INSERT INTO user_skills VALUES (6, 4);
INSERT INTO user_skills VALUES (6, 5);
INSERT INTO user_skills VALUES (6, 6);
INSERT INTO user_skills VALUES (6, 7);
INSERT INTO user_skills VALUES (6, 8);
INSERT INTO user_skills VALUES (6, 9);
INSERT INTO user_skills VALUES (6, 10);
INSERT INTO user_skills VALUES (6, 11);
INSERT INTO user_skills VALUES (6, 12);
INSERT INTO user_skills VALUES (7, 2);
INSERT INTO user_skills VALUES (8, 3);
INSERT INTO user_skills VALUES (9, 6);
INSERT INTO user_skills VALUES (9, 7);
INSERT INTO user_skills VALUES (9, 8);
INSERT INTO user_skills VALUES (9, 9);
INSERT INTO user_skills VALUES (9, 10);
INSERT INTO user_skills VALUES (10, 6);
INSERT INTO user_skills VALUES (10, 7);
INSERT INTO user_skills VALUES (10, 8);
INSERT INTO user_skills VALUES (10, 9);
INSERT INTO user_skills VALUES (10, 10);
INSERT INTO user_skills VALUES (11, 1);

--                        id  order_name       customer       description                 price  start         finish        type                    status
INSERT INTO orders VALUES (1, 'best-web-page.com', 2, 'Task is to create a landing page', 30000, '2017-04-01', NULL,         'LANDINGS',             'OPEN');
INSERT INTO orders VALUES (2, 'AndroidMakers',     3, 'This app can produce something',   50000, '2017-03-01', NULL,         'MOBILE_APPLICATIONS',  'IN_PROGRESS');
INSERT INTO orders VALUES (3, 'minesweeper ',      4, 'The hardest game in the world',    80000, '2017-02-01', '2017-02-01', 'DESKTOP_APPLICATIONS', 'COMPLETED');
INSERT INTO orders VALUES (4, 'minesweeper v.0',   4, 'First try',                        25000, '2016-09-01', '2017-11-01', 'DESKTOP_APPLICATIONS', 'COMPLETED');

--                       id   team      user  order
INSERT INTO teams VALUES (1,  'Coders',    5,  1);
INSERT INTO teams VALUES (2,  'Coders',    6,  1);
INSERT INTO teams VALUES (3,  'Coders',    7,  1);
INSERT INTO teams VALUES (4,  'Coders',    8,  1);
INSERT INTO teams VALUES (5,  'Hackers',   9,  2);
INSERT INTO teams VALUES (6,  'Hackers',   10, 2);
INSERT INTO teams VALUES (7,  'Hackers',   11, 2);
INSERT INTO teams VALUES (8,  'Hackers',   12, 2);
INSERT INTO teams VALUES (9,  'Achievers', 13, 3);
INSERT INTO teams VALUES (10, 'Achievers', 14, 3);
INSERT INTO teams VALUES (11, 'Achievers', 15, 3);
INSERT INTO teams VALUES (12, 'Achievers', 16, 3);

--   payments               id amount     date    order_id  status
INSERT INTO payments VALUES (1, 80000.00, '2017-02-01', 3, 'COMPLETED');
INSERT INTO payments VALUES (2, 20000.00, '2017-01-08', 1, 'FAILED');


-- attachments                 id  link                                     message_id  order_id
INSERT INTO attachments VALUES (1, 'www.repository.com/project/files/page.jsp',   1,     1);
INSERT INTO attachments VALUES (2, 'www.githib.com/anotherproject/startApp.exe',  2,     2);
INSERT INTO attachments VALUES (3, 'www.playmarket.com/dashboard/alanytics.html', 3,     3);


-- feedback                 id  date           text      sender_id  recipient_id  order_id     
INSERT INTO feedback VALUES (1, '2017-01-01', 'some test ', 5,           2,          1);
INSERT INTO feedback VALUES (2, '2017-01-18', 'some test ', 7,           2,          1);
INSERT INTO feedback VALUES (3, '2017-03-28', 'some test ', 10,          3,          2);
INSERT INTO feedback VALUES (4, '2017-04-08', 'some test ', 15,          4,          3);


-- messages                 id  message         date     sender  recipient  type       status
INSERT INTO messages VALUES (1, 'Some message', '2017-04-08', 5,     2,     'REQUEST', 'RECEIVED');
INSERT INTO messages VALUES (2, 'Some message', '2017-04-15', 6,     2,     'MESSAGE', 'RECEIVED');
INSERT INTO messages VALUES (3, 'Some message', '2017-04-30', 7,     2,     'MESSAGE', 'RECEIVED');

INSERT INTO messages VALUES (4, 'Some message', '2017-03-11', 9,     3,     'MESSAGE', 'RECEIVED');
INSERT INTO messages VALUES (5, 'Some message', '2017-03-21', 10,    3,     'MESSAGE', 'RECEIVED');
INSERT INTO messages VALUES (6, 'Some message', '2017-03-08', 11,    3,     'REQUEST', 'RECEIVED');

INSERT INTO messages VALUES (7, 'Some message', '2017-02-15', 13,    4,     'MESSAGE', 'RECEIVED');
INSERT INTO messages VALUES (8, 'Some message', '2017-02-04', 14,    4,     'MESSAGE', 'SENT');
INSERT INTO messages VALUES (9, 'Some message', '2017-02-12', 15,    4,     'MESSAGE', 'SENT');