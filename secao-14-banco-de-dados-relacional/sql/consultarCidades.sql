-- Consultar Cidades
DESC cidades;

SELECT * FROM cidades;

-- Consultar Join Estados e Cidades
SELECT e.nome AS Estado, c.nome AS Cidade, regiao AS Região FROM estados AS e, cidades AS c WHERE e.id = c.estado_id;

SELECT c.nome AS Cidade, e.nome AS Estado, regiao AS Região FROM estados AS e INNER JOIN cidades AS c ON e.id = c.estado_id;

-- Consultar Join Cidades e Prefeitos

SELECT * FROM cidades c INNER JOIN prefeitos p ON c.id = p.cidade_id;

SELECT * FROM cidades c LEFT OUTER JOIN prefeitos p ON c.id = p.cidade_id;

SELECT * FROM cidades c RIGHT JOIN prefeitos p ON c.id = p.cidade_id;

SELECT * FROM cidades c LEFT OUTER JOIN prefeitos p ON c.id = p.cidade_id
UNION
SELECT * FROM cidades c RIGHT JOIN prefeitos p ON c.id = p.cidade_id;

 