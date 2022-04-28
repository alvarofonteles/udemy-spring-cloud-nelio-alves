INSERT INTO tb_user (name, email, password) VALUES ('Alvaro Fonteles', 'alvarofonteles@gmail.com', '$2a$10$1g4OpLVxKuNlzfrUs4gNaevzIoefD/43s8gyONjbBXzTdUZ7ketze');
INSERT INTO tb_user (name, email, password) VALUES ('Lorena Braga', 'lorenabraga@gmail.com', '$2a$10$1g4OpLVxKuNlzfrUs4gNaevzIoefD/43s8gyONjbBXzTdUZ7ketze');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
