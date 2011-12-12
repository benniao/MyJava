# ************************************************************
# Sequel Pro SQL dump
# Version 3408
#
# http://www.sequelpro.com/
# http://code.google.com/p/sequel-pro/
#
# Host: 127.0.0.1 (MySQL 5.5.11)
# Database: ElectiveSystem
# Generation Time: 2011-12-12 22:57:49 +0800
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table COURSE
# ------------------------------------------------------------

DROP TABLE IF EXISTS `COURSE`;

CREATE TABLE `COURSE` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(500) DEFAULT NULL,
  `teacher` varchar(200) DEFAULT NULL,
  `begin_week` int(11) DEFAULT NULL,
  `end_week` int(11) DEFAULT NULL,
  `course_time` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `grade` int(11) DEFAULT NULL,
  `student_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `COURSE` WRITE;
/*!40000 ALTER TABLE `COURSE` DISABLE KEYS */;

INSERT INTO `COURSE` (`id`, `name`, `teacher`, `begin_week`, `end_week`, `course_time`, `address`, `grade`, `student_num`)
VALUES
	(1,'面向对象程序设计','桂浩',1,18,'2:4-5;5:8-9','国软403',2,60),
	(2,'数据库原理','熊庆文',1,18,'1:3-8;4:3-5','国软402',2,40);

/*!40000 ALTER TABLE `COURSE` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table STUDENT
# ------------------------------------------------------------

DROP TABLE IF EXISTS `STUDENT`;

CREATE TABLE `STUDENT` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `password` varchar(200) DEFAULT NULL,
  `student_no` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `STUDENT` WRITE;
/*!40000 ALTER TABLE `STUDENT` DISABLE KEYS */;

INSERT INTO `STUDENT` (`id`, `password`, `student_no`, `name`)
VALUES
	(1,'123456','2010302660010','聂亚杰');

/*!40000 ALTER TABLE `STUDENT` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table STUDENT_COURSE
# ------------------------------------------------------------

DROP TABLE IF EXISTS `STUDENT_COURSE`;

CREATE TABLE `STUDENT_COURSE` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
