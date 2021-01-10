-- Criando tabela Cidade.

-- IF NOT EXISTS faz com que não gere erro quando executado mais de uma vez, pois só cria se exstir.
CREATE TABLE IF NOT EXISTS Cidades(
    
    id INT  UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    estado_id INT  UNSIGNED NOT NULL,
    area DECIMAL(10,2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) REFERENCES Estados(id)
);
 

-- CREATE TABLE IF NOT EXISTS Teste (
--   id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY
--);
 
-- Excluindo tabela Teste.
-- DROP TABLE IF EXISTS Teste;
