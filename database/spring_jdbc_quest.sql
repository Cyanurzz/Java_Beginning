CREATE DATABASE  IF NOT EXISTS `spring_jdbc_quest` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `spring_jdbc_quest`;
-- MySQL dump 10.13  Distrib 5.7.25, for Linux (x86_64)
--
-- Host: localhost    Database: spring_jdbc_quest
-- ------------------------------------------------------
-- Server version	5.7.25-0ubuntu0.18.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `school`
--

DROP TABLE IF EXISTS `school`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `capacity` int(11) DEFAULT NULL,
  `country` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school`
--

LOCK TABLES `school` WRITE;
/*!40000 ALTER TABLE `school` DISABLE KEYS */;
INSERT INTO `school` VALUES (1,'Castelobruxo',380,'Brazil'),(2,'Durmstrang Institute',570,'Sweden'),(3,'Hogwarts School of Witchcraft and Wizardry',450,'United Kingdom'),(4,'Ilvermorny School of Witchcraft and Wizardry',300,'USA'),(5,'Koldovstoretz',125,'Russia');
/*!40000 ALTER TABLE `school` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wizard`
--

DROP TABLE IF EXISTS `wizard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wizard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `birthday` date NOT NULL,
  `birth_place` varchar(255) DEFAULT NULL,
  `biography` text,
  `is_muggle` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wizard`
--

LOCK TABLES `wizard` WRITE;
/*!40000 ALTER TABLE `wizard` DISABLE KEYS */;
INSERT INTO `wizard` VALUES (1,'harry','potter','1980-07-31','london','',0),(2,'hermione','granger','1979-09-19','','Friend of Harry Potter',0),(3,'lily','potter','1960-01-30','','mother of Harry Potter',0),(4,'ron','weasley','1980-03-01','','Best friend of Harry',0),(5,'ginny','weasley','1981-08-11','','Sister of Ron and girlfriend of Harry',0),(6,'fred','weasley','1978-04-01','','',0),(7,'george','weasley','1978-04-01','','',0),(8,'arthur','weasley','1950-02-06','','',0),(9,'molly','weasley','1949-01-01','','',0),(10,'drago','malefoy','1980-06-05','','',0),(11,'albus','dumbledore','1881-07-01','','',0),(12,'severus','rogue','1960-01-09','','',0),(13,'tom','jÃƒÂ©dusor','1926-12-31','','Celui-Dont-On-Ne-Doit-Pas-Prononcer-Le-Nom alias Voldermort',0),(14,'dudley','dursley','1980-06-23','','Cousin d\'Harry',1);
/*!40000 ALTER TABLE `wizard` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-23 10:40:45
