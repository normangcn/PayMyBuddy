# PayMyBuddy

DB script under this line

--------------------------------------------------------------------------------------------------------------------------------
CREATE DATABASE `PayMyBuddy` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

-- PayMyBuddy.`Transaction` definition

CREATE TABLE `Transaction` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(100) NOT NULL,
  `amount` double NOT NULL,
  `sender` int NOT NULL,
  `receiver` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Transaction_User_FK` (`sender`),
  KEY `Transaction_User_FK_1` (`receiver`),
  CONSTRAINT `Transaction_User_FK` FOREIGN KEY (`sender`) REFERENCES `User` (`id`),
  CONSTRAINT `Transaction_User_FK_1` FOREIGN KEY (`receiver`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- PayMyBuddy.`User` definition

CREATE TABLE `User` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- PayMyBuddy.User_Connection definition

CREATE TABLE `User_Connection` (
  `user` int NOT NULL,
  `connection` int NOT NULL,
  UNIQUE KEY `User_Connection_user_IDX` (`user`,`connection`) USING BTREE,
  KEY `User_Connection_User_FK_1` (`connection`),
  CONSTRAINT `User_Connection_User_FK` FOREIGN KEY (`user`) REFERENCES `User` (`id`),
  CONSTRAINT `User_Connection_User_FK_1` FOREIGN KEY (`connection`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
-------------------------------------------------------------------------------------------------------------------------------
