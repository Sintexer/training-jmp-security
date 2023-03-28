INSERT INTO roles(id, name) VALUES(1, 'USER_ROLE');
INSERT INTO roles(id, name) VALUES(2, 'ADMIN_ROLE');
INSERT INTO roles(id, name) VALUES(3, 'GUEST_ROLE');

INSERT INTO privilegess(id, name) VALUES(1, 'view:info');
INSERT INTO privilegess(id, name) VALUES(2, 'view:admin');

INSERT INTO roles_privileges(role_id, privilege_id) VALUES(1, 1);
INSERT INTO roles_privileges(role_id, privilege_id) VALUES(2, 1);
INSERT INTO roles_privileges(role_id, privilege_id) VALUES(2, 2);

INSERT INTO users(id, email, password) VALUES(1, 'user@mail.com', '$2a$10$pCo3QavlQFqpUKh6c/BIQ.kgIvuhsq6Z5QhaaDgxnLBS5KRm5nDIC');
INSERT INTO users(id, email, password) VALUES(2, 'admin@mail.com', '$2a$10$P6ZEQ3eApgaSR63cHU0.ge.Vo8ddkNEg0zndXBzd/vF2endCo5Jmi');
INSERT INTO users(id, email, password) VALUES(3, 'guest@mail.com', '$2a$10$9mzwVnrorg68DBnTE7gH8Oc3KeC.EGTrSGT4sFVDCyeE4TYDcN7fu');

INSERT INTO users_roles(user_id, role_id) VALUES(1, 1);
INSERT INTO users_roles(user_id, role_id) VALUES(2, 2);
INSERT INTO users_roles(user_id, role_id) VALUES(3, 3);

SELECT setval('users_seq', (SELECT MAX(id) FROM users));
SELECT nextval('users_seq');
SELECT setval('roles_seq', (SELECT MAX(id) FROM roles));
SELECT nextval('roles_seq');
SELECT setval('privilegess_seq', (SELECT MAX(id) FROM privilegess) + 1);
SELECT nextval('privilegess_seq');
