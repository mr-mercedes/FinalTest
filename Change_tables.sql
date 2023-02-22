USE ZooDB;


-- Удалить верблюдов
DELETE FROM Sumpters WHERE Animal_type='Camels';
DROP TABLE Camels;


-- Создать объединённую таблицу лошадей и ослов
CREATE TABLE AllSumpters(
    sumpter_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Name VARCHAR(20) NOT NULL,
    BirthDay DATE NOT NULL,
    A_subtype INT NOT NULL,
    A_type INT NOT NULL
)
SELECT Name, BirthDay,  A_subtype, A_type FROM
Horses UNION 
SELECT Name, BirthDay,  A_subtype, A_type FROM
Donkeys;

-- Удалить таблицы лошадей и ослов
DROP TABLE Horses;
DROP TABLE Donkeys;

-- Вывод объединенной таблицы на экран
SELECT Name, Birthday, Sumpters.Animal_type AS Subtype, Animals.Animal_type AS Category
FROM AllSumpters
JOIN Sumpters ON AllSumpters.A_subtype=Sumpters.Type_id
JOIN Animals ON AllSumpters.A_type=Animals.Type_id;