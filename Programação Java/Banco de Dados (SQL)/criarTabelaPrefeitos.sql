-- Criando tabela Prefeitos.

CREATE TABLE IF NOT EXISTS Prefeitos (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cidade_id INT UNSIGNED,
    -- Faz com que seja único e sem repetições.
    UNIQUE KEY (cidade_id),
    -- Diz quem é a chave estrangeira e de qual tabela é.
    FOREIGN KEY (cidade_id) REFERENCES Cidades (id)
); 