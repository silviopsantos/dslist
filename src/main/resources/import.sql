INSERT INTO tb_game_list (nome) VALUES ('Ação');
INSERT INTO tb_game_list (nome) VALUES ('Aventura');
INSERT INTO tb_game_list (nome) VALUES ('RPG');
INSERT INTO tb_game_list (nome) VALUES ('Ação/Aventura');
INSERT INTO tb_game_list (nome) VALUES ('RPG/Ação');

INSERT INTO tb_game (titulo, ano, genero, plataforma, img_Url, descricao_Curta, descricao_Longa) VALUES ('Red Dead Redemption 2', 2018, 'Ação/Aventura', 'PlayStation, Xbox, PC', 'https://exemplo.com/rdr2.jpg', 'Um épico do velho oeste.', 'Arthur Morgan luta para sobreviver enquanto enfrenta dilemas morais e o declínio do bando de Dutch van der Linde.');
INSERT INTO tb_game (titulo, ano, genero, plataforma, img_Url, descricao_Curta, descricao_Longa) VALUES ('Elden Ring', 2022, 'RPG', 'PlayStation, Xbox, PC', 'https://exemplo.com/eldenring.jpg', 'Uma aventura sombria e desafiante.', 'Em um vasto mundo de fantasia, o jogador deve reunir fragmentos do Elden Ring para se tornar o Lorde Prístino.');
INSERT INTO tb_game (titulo, ano, genero, plataforma, img_Url, descricao_Curta, descricao_Longa) VALUES ('The Witcher 3: Wild Hunt', 2015, 'RPG', 'PlayStation, Xbox, PC, Switch', 'https://exemplo.com/witcher3.jpg', 'Uma aventura épica de Geralt de Rivia.', 'Geralt viaja por um mundo vasto em busca de Ciri, enfrentando monstros e intrigas políticas.');
INSERT INTO tb_game (titulo, ano, genero, plataforma, img_Url, descricao_Curta, descricao_Longa) VALUES ('Grand Theft Auto V', 2013, 'Ação', 'PlayStation, Xbox, PC', 'https://exemplo.com/gta5.jpg', 'Uma história de crime e ambição.', 'Três protagonistas em Los Santos envolvem-se em grandes golpes e escapadas épicas.');
INSERT INTO tb_game (titulo, ano, genero, plataforma, img_Url, descricao_Curta, descricao_Longa) VALUES ('Dark Souls III', 2016, 'RPG', 'PlayStation, Xbox, PC', 'https://exemplo.com/ds3.jpg', 'Desafios brutais em um mundo sombrio.', 'O jogador deve explorar um mundo devastado e enfrentar inimigos temíveis para restaurar a chama da vida.');
INSERT INTO tb_game (titulo, ano, genero, plataforma, img_Url, descricao_Curta, descricao_Longa) VALUES ('Cyberpunk 2077', 2020, 'RPG/Ação', 'PlayStation, Xbox, PC', 'https://exemplo.com/cyberpunk.jpg', 'Uma aventura futurista em Night City.', 'Em um mundo cyberpunk, o jogador assume o papel de V e busca imortalidade através de implantes tecnológicos.');

INSERT INTO tb_pertencente (lista_id, game_id, posicao) VALUES (1, 4, 0);
INSERT INTO tb_pertencente (lista_id, game_id, posicao) VALUES (3, 2, 0);
INSERT INTO tb_pertencente (lista_id, game_id, posicao) VALUES (3, 3, 1);
INSERT INTO tb_pertencente (lista_id, game_id, posicao) VALUES (4, 1, 0);
INSERT INTO tb_pertencente (lista_id, game_id, posicao) VALUES (3, 5, 2);
INSERT INTO tb_pertencente (lista_id, game_id, posicao) VALUES (5, 6, 0);