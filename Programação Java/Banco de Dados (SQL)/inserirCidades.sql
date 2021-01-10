SELECT * FROM Estados;

-- Inserindo dados na tabela Cidades.

INSERT INTO Cidades(nome, area, estado_id) VALUES('Campinas', 795.0, 24), ('Niterói', 133.9, 18)

INSERT INTO Cidades(nome, area, estado_id) VALUES('Caruaru', 920.6, (SELECT id FROM Estados WHERE sigla = 'PE'))

INSERT INTO Cidades(nome, area, estado_id) VALUES('Juazeiro do Norte', 248.2, (SELECT id FROM Estados WHERE sigla = 'CE'))

SELECT *
FROM Cidades

-- Adicionei Campinas 2 vezes.
-- DELETE FROM Cidades where id = 2;
