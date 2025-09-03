CREATE DATABASE snct;
use snct;
CREATE TABLE tblead(
id int primary key auto_increment,
nome varchar(80)not null,
email varchar(80) not null,
telefone varchar(11) not null,
cpf varchar(14) not null
);

ALTER TABLE tblead ADD COLUMN cpf VARCHAR(14) NOT NULL;

INSERT INTO tblead (nome, email, telefone, cpf) VALUES
('reme', 'reme1@email.com', '11988880001', '111.111.111-11'),
('lua', 'lua2@email.com', '11988880002', '222.222.222-22'),
('marte', 'marte3@email.com', '11988880003', '333.333.333-33'),
('Patricia Mendes', 'patricia4@email.com', '11988880004', '444.444.444-44'),
('Ana Costa', 'ana5@email.com', '11988880005', '555.555.555-55'),
('Pedro Santos', 'pedro6@email.com', '11988880006', '666.666.666-66'),
('Juliana Rocha', 'juliana7@email.com', '11988880007', '777.777.777-77'),
('Fernando Lima', 'fernando8@email.com', '11988880008', '888.888.888-88'),
('Beatriz Nunes', 'beatriz9@email.com', '11988880009', '999.999.999-99'),
('Lucas Almeida', 'lucas10@email.com', '11988880010', '000.000.000-00'),
('Camila Torres', 'camila11@email.com', '11988880011', '123.456.789-10'),
('Ricardo Martins', 'ricardo12@email.com', '11988880012', '321.654.987-01'),
('Larissa Gomes', 'larissa13@email.com', '11988880013', '147.258.369-12'),
('André Ferreira', 'andre14@email.com', '11988880014', '258.369.147-23'),
('Sofia Lima', 'sofia15@email.com', '11988880015', '369.147.258-34'),
('Gustavo Barros', 'gustavo16@email.com', '11988880016', '741.852.963-45'),
('Isabela Moura', 'isabela17@email.com', '11988880017', '852.963.741-56'),
('Marcos Pinto', 'marcos18@email.com', '11988880018', '963.741.852-67'),
('Rafaela Duarte', 'rafaela19@email.com', '11988880019', '159.357.258-78'),
('Thiago Souza', 'thiago20@email.com', '11988880020', '357.159.852-89'),
('Helena Castro', 'helena21@email.com', '11988880021', '951.753.456-90');


UPDATE tblead SET cpf = '111.222.333-44' WHERE id = 2;
UPDATE tblead SET telefone = '11999999999' WHERE id = 10;
UPDATE tblead SET nome = 'Carolina Ribeiro' WHERE id = 15;


DELETE FROM tblead WHERE id = 5;
DELETE FROM tblead WHERE id = 12;
DELETE FROM tblead WHERE id = 18;
DELETE FROM tblead WHERE id = 20;


SELECT * FROM tblead;

SELECT * FROM tblead WHERE nome LIKE 'helena Castro';

SHOW TABLES;

DROP TABLE IF EXISTS tblead;
