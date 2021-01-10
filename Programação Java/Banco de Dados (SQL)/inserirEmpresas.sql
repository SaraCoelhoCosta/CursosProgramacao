-- Inserindo dados na tabela Empresas. 

-- CNPJ ultrapassa o tamanho do INT. Mundaça para VARCHAR.
ALTER TABLE Empresas MODIFY cnpj VARCHAR(14);

-- Inserindo.
INSERT INTO Empresas
    (nome, cnpj)
VALUES
    ('Bradesco', 95694186000132),
    ('Vale', 27887148000146),
    ('Cielo', 01598317000134);

-- Descreve as informações da tabela.
DESC Empresas;
DESC Prefeitos;

SELECT *
FROM Empresas;

SELECT *
FROM Cidades;

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
VALUES
    (1, 1, 1),
    (1, 3, 0),
    (2, 1, 0),
    (2, 3, 1);