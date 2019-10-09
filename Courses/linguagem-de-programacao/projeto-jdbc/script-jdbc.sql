create database gaga;
use gaga;

CREATE TABLE `gaga`.`leitura` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `origem` VARCHAR(45) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `data_hora` DATETIME NULL,
  PRIMARY KEY (`id`));
  
  select * from gaga.leitura;
  
  insert into gaga.leitura (origem, valor, data_hora)
  values
  ('CPU', '95', current_timestamp()),
  ('Memória', '82', current_timestamp()),
  ('Memória', '37', current_timestamp());
  