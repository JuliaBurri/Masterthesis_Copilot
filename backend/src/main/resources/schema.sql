DROP TABLE IF EXISTS task;
CREATE TABLE task
(
    id          BIGINT NOT NULL,
    title       VARCHAR(255),
    description VARCHAR(255),
    duration    INT,
    due_date    TIMESTAMP,
    prio        SMALLINT,
    done        BOOLEAN NOT NULL,
    CONSTRAINT pk_task PRIMARY KEY (id)
);

INSERT INTO task
VALUES (101, 'Prepare Review Meeting', 'Make Powerpoint, Invite guests', 30, CURDATE(), 1, 0);
INSERT INTO task
VALUES (102, 'Have lunch', 'cook noodles', 60, CURDATE(), 0, 0);
INSERT INTO task
VALUES (103, 'Prepare Workshop', 'Topic: Scrum Basics', 120, CURDATE(), 2, 0);
INSERT INTO task
VALUES (104, 'Setup Project', 'Create Backend with Spring Boot', 240, CURDATE(), 0, 0);
INSERT INTO task
VALUES (105, 'Write Email to Customer', 'Ask for needed data', 30, CURDATE(), 1, 0);
INSERT INTO task
VALUES (106, 'Implement Features in Project', 'Use Placeholder Data', 150, CURDATE(), 2, 0);
