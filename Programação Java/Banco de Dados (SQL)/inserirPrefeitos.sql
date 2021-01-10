-- Inserindo dados na tabela Prefeitos.

SELECT * FROM Cidades;

INSERT INTO Prefeitos
    (nome, cidade_id)
VALUES
    ('Rodrigo Neves', 3),
    ('Raquel Lyra', 4),
    ('Zenaldo Coutinho', null);

SELECT * FROM Prefeitos;

INSERT INTO Prefeitos
    (nome, cidade_id)
VALUES
    ('Rafael Greca', null);

-- Não pode ter chave duplicada: ER_DUP_ENTRY: Duplicate entry '4' for key 'cidade_id'.
--INSERT INTO Prefeitos
--    (nome, cidade_id)
-- VALUES
--    ('Rodrigo Pinheiro', 4);