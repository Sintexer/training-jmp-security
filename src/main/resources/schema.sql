DROP SCHEMA public CASCADE;
CREATE SCHEMA public;

CREATE TABLE IF NOT EXISTS users (
    id BIGINT,
    email VARCHAR(255),
    password VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS roles (
    id BIGINT,
    name VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS privilegess (
    id BIGINT,
    name VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS users_roles (
    user_id BIGINT,
    role_id BIGINT
);

CREATE TABLE IF NOT EXISTS roles_privileges (
    role_id BIGINT,
    privilege_id BIGINT
);

CREATE SEQUENCE IF NOT EXISTS users_seq START 1;
ALTER SEQUENCE users_seq OWNED BY users.id;
ALTER TABLE users ALTER COLUMN id SET DEFAULT nextval('users_seq');

CREATE SEQUENCE IF NOT EXISTS roles_seq START 1;
ALTER SEQUENCE roles_seq OWNED BY roles.id;
ALTER TABLE roles ALTER COLUMN id SET DEFAULT nextval('roles_seq');

CREATE SEQUENCE IF NOT EXISTS privilegess_seq START 1;
ALTER SEQUENCE privilegess_seq OWNED BY privilegess.id;
ALTER TABLE privilegess ALTER COLUMN id SET DEFAULT nextval('privilegess_seq');
