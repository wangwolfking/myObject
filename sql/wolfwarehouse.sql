/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.17-log : Database - wolfwarehouse
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`wolfwarehouse` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `wolfwarehouse`;

/*Table structure for table `manufacturer` */

DROP TABLE IF EXISTS `manufacturer`;

CREATE TABLE `manufacturer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '厂商id',
  `manu_name` varchar(100) NOT NULL COMMENT '厂商名字',
  `address` varchar(200) DEFAULT NULL COMMENT '厂商地址',
    `create_by` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '最后更新人id',
  `update_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `is_delete` varchar(4) DEFAULT 'N'
 COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manufacturer` */

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `pro_name` varchar(100) NOT NULL COMMENT '商品名称',
  `code` varchar(100) DEFAULT NULL COMMENT '商品编码',
  `manufacture_date` datetime DEFAULT NULL COMMENT '生产日期',
  `manufacturer_id` int(11) DEFAULT NULL COMMENT '厂商id',
  `wholesale_price` double DEFAULT NULL COMMENT '批发价格',
  `retail_price` double DEFAULT NULL COMMENT '零售价格',
  `color` int(11) DEFAULT NULL COMMENT '商品颜色',
    `create_by` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '最后更新人id',
  `update_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `is_delete` varchar(4) DEFAULT 'N'
 COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `products` */

/*Table structure for table `storage` */

DROP TABLE IF EXISTS `storage`;

CREATE TABLE `storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '仓库id',
  `ware_name` varchar(100) NOT NULL COMMENT '仓库名称',
  `company_id` int(11) NOT NULL COMMENT '所属单位id',
  `address` varchar(100) DEFAULT NULL COMMENT '仓库地址',
    `create_by` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '最后更新人id',
  `update_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `is_delete` varchar(4) DEFAULT 'N'
 COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storage` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(100) NOT NULL COMMENT '用户名',
  `full_name` varchar(100) NOT NULL COMMENT '姓名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `address` varchar(100) DEFAULT NULL COMMENT '住址',
  `sex` varchar(4) DEFAULT '1' COMMENT '性别1男2女',
  `mobilephone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `type` varchar(20) DEFAULT NULL COMMENT '用户类型',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '最后更新人id',
  `update_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `is_delete` varchar(4) DEFAULT 'N'
 COMMENT '是否删除',
  `dep_id` int(11) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
