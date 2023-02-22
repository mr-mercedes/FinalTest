DROP DATABASE IF EXISTS ZooDB;
CREATE DATABASE ZooDB;
USE ZooDB;

-- Создание и заполнение старших таблиц

CREATE TABLE Animals(
    Type_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Animal_type VARCHAR(20) NOT NULL
);

INSERT Animals(Animal_type) VALUES
('Pets'),
('Sumpters'); 

-- вывести созданные таблицы
SELECT * FROM Animals;

CREATE TABLE Sumpters(
    Type_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Animal_type VARCHAR(20) NOT NULL
);

CREATE TABLE Pets(
    Type_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Animal_type VARCHAR(20) NOT NULL
);

INSERT Sumpters(Animal_type) VALUES
('Horses'),
('Donkeys'), 
('Camels'); 

INSERT Pets(Animal_type) VALUES
('Cats'),
('Dogs'),
('Hamsters'); 

-- вывести созданные таблицы

SELECT * FROM Pets;
SELECT * FROM Sumpters;

-- создание и заполнение младших таблиц
-- создание таблиц домашних животных

CREATE TABLE Cats(
    Cat_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Name VARCHAR(20) NOT NULL,
    BirthDay DATE NOT NULL,
    A_subtype INT NOT NULL,
    A_type INT NOT NULL
);

CREATE TABLE Dogs(
    Dog_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Name VARCHAR(20) NOT NULL,
    BirthDay DATE NOT NULL,
    A_subtype INT NOT NULL,
    A_type INT NOT NULL
);

CREATE TABLE Hamsters(
    Hamster_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Name VARCHAR(20) NOT NULL,
    BirthDay DATE NOT NULL,
    A_subtype INT NOT NULL,
    A_type INT NOT NULL
);

-- создание таблиц вьючных животных

CREATE TABLE Horses(
    Horse_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Name VARCHAR(20) NOT NULL,
    BirthDay DATE NOT NULL,
    A_subtype INT NOT NULL,
    A_type INT NOT NULL
);

CREATE TABLE Donkeys(
    Donkey_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Name VARCHAR(20) NOT NULL,
    BirthDay DATE NOT NULL,
    A_subtype INT NOT NULL,
    A_type INT NOT NULL
);

CREATE TABLE Camels(
    Camel_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    Name VARCHAR(20) NOT NULL,
    BirthDay DATE NOT NULL,
    A_subtype INT NOT NULL,
    A_type INT NOT NULL
);




-- заполнение таблиц вьючных животных

INSERT Horses(Name, BirthDay, A_subtype, A_Type) VALUES
('Празеодим', '2019-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Horses'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Неодим','2021-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Horses'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Прометий','2022-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Horses'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Самарий','2016-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Horses'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters'));
INSERT Donkeys(Name, BirthDay, A_subtype, A_Type) VALUES
('Радон', '2017-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Donkeys'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Криптон','2021-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Donkeys'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Аргон','2022-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Donkeys'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Гелий','2020-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Donkeys'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters'));
INSERT Camels(Name, BirthDay, A_subtype, A_Type) VALUES
('Кант', '2022-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Camels'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Ницше', '2021-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Camels'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Гегль', '2012-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Camels'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters')),
('Фейхтвагнер','2019-02-21',(SELECT Type_id FROM Sumpters WHERE Animal_type='Camels'), (SELECT Type_id FROM Animals WHERE Animal_type='Sumpters'));


-- заполнение таблиц домашних  животных

INSERT Cats(Name, BirthDay, A_subtype, A_Type) VALUES
('Мурзик', '2019-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Cats'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Мурка','2018-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Cats'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Снежок','2018-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Cats'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Клёпа','2018-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Cats'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets'));
INSERT Dogs(Name, BirthDay, A_subtype, A_Type) VALUES
('Барбос', '2017-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Dogs'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Жучка','2021-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Dogs'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Жемчужина','2021-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Dogs'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Арчибальд','2021-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Dogs'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets'));
INSERT Hamsters(Name, BirthDay, A_subtype, A_Type) VALUES
('Персиваль', '2022-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Hamsters'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Наполеон','2016-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Hamsters'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Цезарь','2016-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Hamsters'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets')),
('Атилла','2016-02-21',(SELECT Type_id FROM Pets WHERE Animal_type='Hamsters'), (SELECT Type_id FROM Animals WHERE Animal_type='Pets'));

/*
SELECT * FROM Cats;
SELECT * FROM Dogs;
SELECT * FROM Hamsters;
SELECT * FROM Horses;
SELECT * FROM Donkeys;
SELECT * FROM Camels;
*/
-- Вывод домашних животных

SELECT Name, BirthDay, Pets.Animal_type, Animals.Animal_type AS Category FROM
(SELECT * FROM Cats UNION SELECT * FROM Dogs UNION SELECT * FROM Hamsters) AS t1
JOIN Animals ON t1.A_type=Animals.type_id
JOIN Pets ON t1.A_subtype=Pets.Type_id;

-- Вывод вьючных животных

SELECT Name, BirthDay, Sumpters.Animal_type, Animals.Animal_type AS Category FROM
(SELECT * FROM Camels UNION SELECT * FROM Donkeys UNION SELECT * FROM Horses) AS t1
JOIN Animals ON t1.A_type=Animals.type_id
JOIN Sumpters ON t1.A_subtype=Sumpters.Type_id;




