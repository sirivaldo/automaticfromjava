-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-08-29 11:26:40.038

-- tables
-- Table: Cidade
CREATE TABLE `Cidade` (
    `Codigo` int NOT NULL,
    `nome` varchar(30) NOT NULL,
    `populacaomaneiro789` int NOT NULL,
    `regiao` varchar(30) NOT NULL,
    `Estado_Codigo` int NOT NULL,
    CONSTRAINT `Cidade_pk` PRIMARY KEY (`Codigo`)
);

-- Table: Estado
CREATE TABLE `Estado` (
    `Codigo` int NOT NULL,
    `nome` varchar(30) NOT NULL,
    `Pais_Codigo` int NOT NULL,
    CONSTRAINT `Estado_pk` PRIMARY KEY (`Codigo`)
);

-- Table: Pais
CREATE TABLE `Pais` (
    `Codigo` int NOT NULL,
    `nome` varchar(30) NOT NULL,
    CONSTRAINT `Pais_pk` PRIMARY KEY (`Codigo`)
);

-- foreign keys
-- Reference: Cidade_Estado (table: Cidade)
ALTER TABLE `Cidade` ADD CONSTRAINT `Cidade_Estado` FOREIGN KEY `Cidade_Estado` (`Estado_Codigo`)
    REFERENCES `Estado` (`Codigo`);

-- Reference: Estado_Pais (table: Estado)
ALTER TABLE `Estado` ADD CONSTRAINT `Estado_Pais` FOREIGN KEY `Estado_Pais` (`Pais_Codigo`)
    REFERENCES `Pais` (`Codigo`);

-- End of file.

