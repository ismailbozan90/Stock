-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: stock
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `log` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user` varchar(45) NOT NULL,
  `operation` varchar(45) NOT NULL,
  `time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1206 DEFAULT CHARSET=latin5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` VALUES (1021,'admin','LOGIN_SUCCES','2024-06-25 23:17:48'),(1022,'admin','PRODUCT_ADD','2024-06-25 23:21:03'),(1023,'admin','LOGIN_FAIL','2024-06-25 23:22:37'),(1024,'admin','LOGIN_SUCCES','2024-06-25 23:22:50'),(1173,'admin','LOGIN_FAIL','2024-06-25 23:23:08'),(1174,'admin','LOGIN_FAIL','2024-06-25 23:24:18'),(1175,'admin','LOGIN_SUCCES','2024-06-25 23:24:25'),(1176,'admin','PRODUCT_ADD','2024-06-25 23:24:45'),(1177,'admin','PRODUCT_DELETE','2024-06-25 23:25:03'),(1178,'admin','PRODUCT_UPDATE','2024-06-25 23:25:39'),(1179,'admin','LOGIN_SUCCES','2024-06-25 23:29:40'),(1180,'admin','LOGOUT','2024-06-25 23:29:43'),(1181,'admin','LOGIN_FAIL','2024-06-25 23:29:59'),(1182,'admin','LOGIN_SUCCES','2024-06-25 23:30:07'),(1183,'admin','LOGIN_SUCCES','2024-06-25 23:31:41'),(1184,'admin','PRODUCT_SELECT','2024-06-25 23:31:41'),(1185,'admin','PRODUCT_ADD','2024-06-25 23:32:37'),(1186,'admin','PRODUCT_SELECT','2024-06-25 23:32:37'),(1187,'admin','LOGIN_SUCCES','2024-06-25 23:34:29'),(1188,'admin','PRODUCT_SELECT','2024-06-25 23:34:29'),(1189,'admin','LOGIN_SUCCES','2024-06-25 23:35:38'),(1190,'admin','PRODUCT_SELECT','2024-06-25 23:35:38'),(1191,'admin','PRODUCT_SELECT','2024-06-25 23:35:58'),(1192,'admin','LOGOUT','2024-06-25 23:36:19'),(1193,'admin','LOGIN_SUCCES','2024-06-25 23:36:31'),(1194,'admin','PRODUCT_SELECT','2024-06-25 23:36:31'),(1195,'admin','PRODUCT_SELECT','2024-06-25 23:36:38'),(1196,'admin','PRODUCT_ADD','2024-06-25 23:37:05'),(1197,'admin','PRODUCT_SELECT','2024-06-25 23:37:05'),(1198,'admin','LOGIN_SUCCES','2024-06-25 23:38:10'),(1199,'admin','PRODUCT_SELECT','2024-06-25 23:38:10'),(1200,'admin','LOGOUT','2024-06-25 23:38:13'),(1201,'admin','LOGIN_FAIL','2024-06-25 23:38:19'),(1202,'admin','LOGIN_SUCCES','2024-06-25 23:38:29'),(1203,'admin','PRODUCT_SELECT','2024-06-25 23:38:29'),(1204,'admin','LOGIN_SUCCES','2024-06-25 23:46:37'),(1205,'admin','PRODUCT_SELECT','2024-06-25 23:46:37');
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `id` int NOT NULL AUTO_INCREMENT,
  `productCode` varchar(45) NOT NULL,
  `productName` varchar(45) NOT NULL,
  `stockCount` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `productCode_UNIQUE` (`productCode`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (4,'M9653','Mont',25),(8,'T4563','T-Shirt',12),(9,'C4563','Çorap',120),(10,'P1596','Pantolon',30),(13,'D636','Don',65),(16,'S123','Şapka',6);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','123456');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-26 22:30:46
