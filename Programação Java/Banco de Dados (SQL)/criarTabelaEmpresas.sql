-- Criando tabela Empresas e tabela relacional entre Cidades e Empresas.

CREATE TABLE IF NOT EXISTS Empresas (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cnpj INT unsigned,
    UNIQUE KEY (cnpj)
);

-- Tabela relacional entre Cidades e Empresas.
CREATE TABLE IF NOT EXISTS empresas_unidades (
    empresa_id INT UNSIGNED NOT NULL,
    cidade_id INT UNSIGNED NOT NULL,
    -- TINYINT(1): único valor.
    sede TINYINT(1) NOT NULL,
    PRIMARY KEY (empresa_id, cidade_id)
);