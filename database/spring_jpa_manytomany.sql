CREATE DATABASE  IF NOT EXISTS `spring_jpa_manytomany` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `spring_jpa_manytomany`;
-- MySQL dump 10.13  Distrib 5.7.28, for Linux (x86_64)
--
-- Host: localhost    Database: spring_jpa_manytomany
-- ------------------------------------------------------
-- Server version	5.7.28-0ubuntu0.18.04.4

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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'Astronomy'),(2,'Charms'),(3,'Dark Arts'),(4,'Flying'),(5,'Herbology'),(6,'History of Magic'),(7,'Potions'),(8,'Transfiguration');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wizard`
--

DROP TABLE IF EXISTS `wizard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wizard` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `biography` varchar(255) DEFAULT NULL,
  `birth_place` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `muggle` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wizard`
--

LOCK TABLES `wizard` WRITE;
/*!40000 ALTER TABLE `wizard` DISABLE KEYS */;
INSERT INTO `wizard` VALUES (1,'','london','1980-07-31','harry','potter',_binary '\0'),(2,'Friend of Harry Potter','','1979-09-19','hermione','granger',_binary '\0'),(3,'mother of Harry Potter','','1960-01-30','lily','potter',_binary '\0'),(4,'Best friend of Harry','','1980-03-01','ron','weasley',_binary '\0'),(5,'Sister of Ron and girlfriend of Harry','','1981-08-11','ginny','weasley',_binary '\0'),(6,'','','1978-04-01','fred','weasley',_binary '\0'),(7,'','','1978-04-01','george','weasley',_binary '\0'),(8,'','','1950-02-06','arthur','weasley',_binary '\0'),(9,'','','1949-01-01','molly','weasley',_binary '\0'),(10,'','','1980-06-05','drago','malefoy',_binary '\0'),(11,'','','1881-07-01','albus','dumbledore',_binary '\0'),(12,'','','1960-01-09','severus','rogue',_binary '\0'),(13,'Celui-Dont-On-Ne-Doit-Pas-Prononcer-Le-Nom alias Voldermort','','1926-12-31','tom','jedusor',_binary '\0'),(14,'Cousin d\'Harry','','1980-06-23','dudley','dursley',_binary '');
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

-- Dump completed on 2019-11-22 11:20:04