-- Consultar Estados
SELECT * FROM estados;

SELECT Sigla, Nome AS 'Nome do Estado' FROM estados WHERE regiao = 'sul';

SELECT nome, regiao FROM estados WHERE populacao >= 10 ORDER BY populacao DESC;

SELECT estado.nome FROM estados WHERE sigla = 'MA';

SELECT est.`nome` FROM estados AS est WHERE sigla = 'AM';

SELECT est.nome, sigla, populacao FROM estados AS est WHERE sigla = 'PR';

SELECT regiao AS 'Região', sum(populacao) AS Total FROM estados GROUP BY regiao ORDER BY Total DESC;

-- Consultar Estados Agregação
SELECT sum(populacao) AS Total FROM estados;

SELECT avg(populacao) AS Total FROM estados; 

-- Consultar Join Estados e Cidades
SELECT e.nome AS Estado, c.nome AS Cidade, regiao AS Região FROM estados AS e, cidades AS c WHERE e.id = c.estado_id;

SELECT c.nome AS Cidade, e.nome AS Estado, regiao AS Região FROM estados AS e INNER JOIN cidades AS c ON e.id = c.estado_id;