-- Inserir dados na tabela `Estados` usando o 'id'.

INSERT INTO Estados
    (id, nome, sigla, regiao, populacao) 
VALUES 
    (30, 'Novo', 'NV', 'Sul', 2.54);

-- Sem dizer o valor do 'id', ele vai adicionar o próximo valor (ou um valor maior) do que em relação ao último 'id'. 
INSERT INTO Estados
    (nome, sigla, regiao, populacao) 
VALUES 
    ('Mais Novo', 'MN', 'Norte', 2.5);

SELECT * FROM  Estados;