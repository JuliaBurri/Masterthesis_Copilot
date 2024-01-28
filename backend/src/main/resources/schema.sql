DROP TABLE IF EXISTS task;
CREATE TABLE task
(
    id          BIGINT  NOT NULL,
    title       VARCHAR(255),
    description VARCHAR(255),
    duration    INT,
    due_date    TIMESTAMP,
    prio        SMALLINT,
    done        BOOLEAN NOT NULL,
    CONSTRAINT pk_task PRIMARY KEY (id)
);

INSERT INTO task
VALUES (1L, 'Prepare Review Meeting', 'Make Powerpoint, Invite guests', 30, '2024-01-29', 1, 0);
INSERT INTO task
VALUES (2L, 'Have lunch', 'cook noodles', 60, '2024-01-29', 0, 0);
INSERT INTO task
VALUES (3L, 'Prepare Workshop', 'Topic: Scrum Basics', 120, '2024-01-29', 2, 0);
INSERT INTO task
VALUES (4L, 'Setup Project', 'Create Backend with Spring Boot', 240, '2024-01-29', 0, 0);
INSERT INTO task
VALUES (5L, 'Write Email to Customer', 'Ask for needed data', 30, '2024-01-29', 1, 0);
INSERT INTO task
VALUES (6L, 'Implement Features in Project', 'Use Placeholder Data', 150, '2024-01-29', 2, 0);
