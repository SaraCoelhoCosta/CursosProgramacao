-- Consultas com diferentes funções do JOINs.

SELECT * FROM Prefeitos;
SELECT * FROM Estados;

-- INNER: pega os dados das tabelas que estão relacionados entre si.
SELECT * FROM Cidades c INNER JOIN Prefeitos p on c.id = p.cidade_id;

-- LEFT JOIN/LEFT OUTER JOIN: pega dados das tabelas que estão relacionados entre si e os dados da tabela a esquerda.
SELECT * FROM Cidades c LEFT JOIN Prefeitos p on c.id = p.cidade_id;

-- RIGHT JOIN/RIGHT OUTER JOIN: pega dados das tabelas que estão relacionados entre si e os dados da tabela a direita.
SELECT * FROM Cidades c RIGHT JOIN Prefeitos p on c.id = p.cidade_id;

-- FULL: Não é suportado pelo MySQL
-- SELECT * FROM cidades c full JOIN prefeitos p on c.id = p.cidade_id;

-- Faz a função do FULL, através do UNION.
SELECT * FROM Cidades c LEFT OUTER JOIN Prefeitos p on c.id = p.cidade_id
UNION
SELECT * FROM Cidades c RIGHT JOIN Prefeitos p on c.id = p.cidade_id;