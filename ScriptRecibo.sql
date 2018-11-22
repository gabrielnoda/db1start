-- MySQL Script generated by MySQL Workbench
-- Thu Nov 22 15:54:50 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`UF`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`UF` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CIDADE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CIDADE` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `uf_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_CIDADE_UF`
    FOREIGN KEY (`uf_id`)
    REFERENCES `mydb`.`UF` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Table `mydb`.`pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`pessoa` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `documento` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`endereco` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tipoLogradouro` VARCHAR(10) NOT NULL,
  `logradouro` VARCHAR(100) NOT NULL,
  `numero` VARCHAR(10) NOT NULL,
  `complemento` VARCHAR(10) NOT NULL,
  `cep` VARCHAR(8) NOT NULL,
  `tipo` INT NOT NULL,
  `cidade_id` INT NOT NULL,
  `pessoa_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_endereco_cidade1_idx` (`cidade_id` ASC),
  INDEX `fk_endereco_pessoa1_idx` (`pessoa_id` ASC),
  CONSTRAINT `fk_endereco_cidade1`
    FOREIGN KEY (`cidade_id`)
    REFERENCES `mydb`.`cidade` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_endereco_pessoa1`
    FOREIGN KEY (`pessoa_id`)
    REFERENCES `mydb`.`pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`recibo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`recibo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `valor` DOUBLE NOT NULL,
  `dataemissao` DATETIME NOT NULL,
  `prestador_fk` INT NOT NULL,
  `emitente_fk` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_recibo_pessoa1_idx` (`prestador_fk` ASC),
  INDEX `fk_recibo_pessoa2_idx` (`emitente_fk` ASC),
  CONSTRAINT `fk_recibo_pessoa1`
    FOREIGN KEY (`prestador_fk`)
    REFERENCES `mydb`.`pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_recibo_pessoa2`
    FOREIGN KEY (`emitente_fk`)
    REFERENCES `mydb`.`pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- 1 - faça insert na tabela UF com todas as siglas dos estados do Brasil.
insert into uf (nome)
values ('PR'), ('AC'), ('AL'), ('AP'), ('AM'), ('BA'), ('CE'), ('DF'), ('ES'), ('GO'), ('MA'), ('MT'), ('MS'), ('MG'),
('PA'), ('PB'), ('PE'), ('PI'), ('RJ'), ('RN'), ('RS'), ('RO'), ('RR'), ('SC'), ('SP'), ('SE'), ('TO');

select * from uf;
-- 2 - insira as seguintes cidades:
-- Para o SC
-- * Chapecó
-- * Blumenau
-- * Joinville

insert into cidade (nome, uf_id)
values ('Chapecó', 24), ('Blumenau', 24), ('Joinville', 24);

select * from cidade;

-- Para o PR
-- * Curitiba
-- * Maringá
-- * Lunardeli
-- * Apucarana
-- * Santa fé
-- * São Miguel do Iguaçu
-- * Arapongas
-- * Ponta Grossa
-- * Jandaia do Sul

insert into cidade (nome, uf_id)
values ('Curitiba', 1), ('Maringa', 1), ('Lunardeli', 1), ('Apucarana', 1), ('Santa Fé', 1), ('São Miguel do Iguaçu', 1),
('Arapongas', 1), ('Ponta Grossa', 1), ('Jandaia do Sul', 1);

select * from cidade
where uf_id = 1;


-- Para o SP
-- *Ribeirão Preto
insert into cidade (nome, uf_id)
values ('Ribeirão Preto', 25);

select * from cidade
where uf_id = 25;

-- 3 - Realize a remoção dos estados que não tem cidades

delete from uf where id in (
select * from (select uf.id from uf left join cidade on cidade.uf_id = uf.id where cidade.uf_id is null) as u
);

select * from uf;

-- 4 - Insira novas cidades no estado de SP

insert into cidade (nome, uf_id)
values ('Guarulhos', 25), ('Sorocaba', 25), ('Campinas', 25);

select * from cidade
where uf_id = 25;

-- 5 - Realize a atualização do nome das cidades:
-- * Lunardeli para Lunardelli
-- * Jandaia do Sul para Jandaia
-- * Maringá para Cidade Canção

update cidade
set nome = 'Lunardelli'
where id = 6;

update cidade
set nome = 'Jandaia do Sul'
where id = 12;

update cidade
set nome = 'Cidade Canção'
where id = 5;

-- 6 - Faça um select que retorne o nome das cidades e seus respectivos estados. Ordene por estados e posteriomente pelo nome das cidades 
select c.nome as Cidade, u.nome as UF from cidade c
inner join uf u on c.uf_id = u.id
order by u.nome;

select c.nome as Cidade, u.nome as UF from cidade c
inner join uf u on c.uf_id = u.id
order by c.nome;

-- 7 - Retorne quantas cidades cada estado possui :) (não expliquei ainda)
-- dica: veja group by e count()

select u.nome, count(c.nome) from uf u
inner join cidade c on u.id = c.uf_id
group by u.nome;

-- 8 - Insira tres pessoas na base de dados. Cada uma destas pessoas deve ter dois enderecos (um comercial e outro residencial). As cidades que devem ser usadas são do estado do PR (você escolhe).

-- 9 -Insira duas pessoas na base de dados. Cada uma destas pessoas deve ter dois enderecos (um comercial e outro residencial). As cidades que devem ser usadas são do estado de SP (você escolhe).

-- 10 - Insira duas pessoas na base de dados. Cada uma destas pessoas deve ter um endereco do tipo comercial. As cidades que devem ser usadas são do estado de SC (você escolhe).

-- 11 - Faça um select que retorne o nome das pessoas e seus respectivos enderecos (com cidade e estado). Ordene por nome de pessoa, nome do estado e nome da cidade

-- 12 - remova todos as pessoas que tem endereço da cidade de Ribeirão Preto

-- 13 - Mude todos os endereços residenciais do sistema. Eles devem ter cep 00000000

-- 14 - altere o nome da coluna prestador_fk para cliente_fk. 

-- 15 - Insira dois recibos sendo que eles devem ter clientes residentes no PR e o prestador de servico deve ser o mesmo (não importando o estado). Exemplo: 
-- * cliente fusca, da cidade curitiba, no PR. Prestador: DB1, estado PR.
-- * cliente tamara, da cidade maringá, no PR. Prestador: DB1, estado PR.


-- 16 - Insira dois recibos sendo que eles devem ter clientes residentes no PR e prestadores de serviços diferentes. Exemplo: 
-- * cliente fusca, da cidade curitiba, no PR. Prestador: FCV, estado PR.
-- * cliente tamara, da cidade maringá, no PR. Prestador: USP, estado SP.

-- 17 - Realize uma consulta na base de dados e exiba os seguintes dados:
-- * numero do recibo
-- * data emissao do recibo
-- * valor do recibo
-- * nome do cliente 
-- * estado do cliente
-- * nome do emitente
-- * estado do emitente

-- ordene por data de recibo, nome do cliente e nome do emitente

-- 18 - Faça uma consulta que mostre:
-- * quantidade de recibos emitidos no PR
-- * valor total de recibos emitidos no PR