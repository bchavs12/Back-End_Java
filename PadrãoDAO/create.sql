create table if not exists filiais
(id int auto_increment PRIMARY KEY,
nomeFilial VARCHAR(255),
rua VARCHAR(255) NOT NULL,
numero INTEGER NOT NULL,
cidade VARCHAR(255) NOT NULL,
estado VARCHAR(255) NOT NULL,
isFiveStars VARCHAR(255) NOT NULL
)