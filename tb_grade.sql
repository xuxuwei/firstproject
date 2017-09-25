/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-10-07 22:30:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_grade`
-- ----------------------------
DROP TABLE IF EXISTS `tb_grade`;
CREATE TABLE `tb_grade` (
  `id` int(100) DEFAULT NULL,
  `rid` int(100) DEFAULT NULL,
  `studentid` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `rname` varchar(100) DEFAULT NULL,
  `english` int(100) DEFAULT NULL,
  `math` int(100) DEFAULT NULL,
  `chinese` int(100) DEFAULT NULL,
  PRIMARY KEY (`studentid`),
  KEY `id` (`id`),
  KEY `rid` (`rid`),
  KEY `rname` (`rname`),
  KEY `name` (`name`),
  CONSTRAINT `tb_grade_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tb_user` (`id`),
  CONSTRAINT `tb_grade_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `tb_role` (`id`),
  CONSTRAINT `tb_grade_ibfk_3` FOREIGN KEY (`rname`) REFERENCES `tb_role` (`rname`),
  CONSTRAINT `tb_grade_ibfk_4` FOREIGN KEY (`name`) REFERENCES `tb_user` (`uname`)
) ENGINE=InnoDB AUTO_INCREMENT=20162230 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_grade
-- ----------------------------
INSERT INTO `tb_grade` VALUES ('5', '0', '20160002', '许', '学生', '79', '88', '69');
INSERT INTO `tb_grade` VALUES ('13', '0', '20162210', '片', '学生', '69', '78', '89');
INSERT INTO `tb_grade` VALUES ('4', '0', '20162221', '小', '学生', '66', '77', '88');
INSERT INTO `tb_grade` VALUES ('6', '0', '20162223', '中', '学生', '89', '91', '81');
INSERT INTO `tb_grade` VALUES ('7', '0', '20162224', '好', '学生', '79', '39', '93');
INSERT INTO `tb_grade` VALUES ('8', '0', '20162225', '苕', '学生', '91', '89', '76');
INSERT INTO `tb_grade` VALUES ('9', '0', '20162226', '分', '学生', '73', '91', '81');
INSERT INTO `tb_grade` VALUES ('10', '0', '20162227', '饿', '学生', '86', '79', '91');
INSERT INTO `tb_grade` VALUES ('11', '0', '20162228', '想', '学生', '67', '59', '95');
INSERT INTO `tb_grade` VALUES ('12', '0', '20162229', '买', '学生', '91', '76', '88');
