-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.
create database recodedb;
use recodedb;

CREATE TABLE PACOTE (
Preço double,
Quantidade int,
Destino varchar(30),
ID_PACOTE int PRIMARY KEY,
Origem varchar(30)
);

CREATE TABLE CLIENTE (
Nome varchar(50),
Sexo char(10),
DN date,
Email varchar(50),
Telefone_res int,
Telefone_cel int,
Telefone_emer int,
Senha varchar(64),
Numero int,
Cidade varchar(20),
CEP int,
Rua varchar(30),
Bairro varchar(20),
ID_CLIENTE int PRIMARY KEY,
CPF int
);

CREATE TABLE PACOTE_Promocioanal (
Quantidade_Promo int,
Destino_Promo varchar(30),
Preço_Promo double,
ID_PACOTE int,
FOREIGN KEY(ID_PACOTE) REFERENCES PACOTE (ID_PACOTE)
);

CREATE TABLE Data_viagem (
Data1_viagem date,
Data2_viagem date,
Data3_viagem date
);

CREATE TABLE ADMINISTRADOR (

id_ADMINISTRADOR varchar(30) PRIMARY KEY,
NomeADM varchar(50),
EmailADM varchar(50),
SenhaADM varchar(30)
);

CREATE TABLE PACOTE (
ID_PACOTE int PRIMARY KEY
FOREIGN KEY (preço) REFERENCE (


select * from CLIENTE;
select * from PACOTE;

