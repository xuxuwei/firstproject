/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-10-07 22:30:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` char(10) NOT NULL DEFAULT '',
  `pass` varchar(10) NOT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `education` varchar(10) DEFAULT NULL,
  `hobbies` varchar(10) DEFAULT NULL,
  `demo` varchar(10) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`,`uname`),
  KEY `roleid` (`roleid`),
  KEY `uname` (`uname`),
  CONSTRAINT `tb_user_ibfk_1` FOREIGN KEY (`roleid`) REFERENCES `tb_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '管理员', '123', '女', '博士后', '打麻将;钓鱼;', '113', '2');
INSERT INTO `tb_user` VALUES ('2', '黄老师', '123', '女', '小学', '敲代码;', 'sb', '1');
INSERT INTO `tb_user` VALUES ('3', '钟老师', '123', '男', '小学', '钓鱼;', '4654', '1');
INSERT INTO `tb_user` VALUES ('4', '小', '123', '女', '初中', '敲代码;打球;', '12', '0');
INSERT INTO `tb_user` VALUES ('5', '许', '123', '男', '小学', '打麻将;', '123', '0');
INSERT INTO `tb_user` VALUES ('6', '中', '123', '男', '小学', '钓鱼;打球;', '00', '0');
INSERT INTO `tb_user` VALUES ('7', '好', '123', '男', '高中', '打球;', '24', '0');
INSERT INTO `tb_user` VALUES ('8', '苕', '123', '女', '小学', '敲代码;打麻将;', '546', '0');
INSERT INTO `tb_user` VALUES ('9', '分', '123', '男', '大专', '打麻将;钓鱼;', '54', '0');
INSERT INTO `tb_user` VALUES ('10', '饿', '123', '女', '小学', '敲代码;打球;', '42', '0');
INSERT INTO `tb_user` VALUES ('11', '想', '123', '男', '本科', '打麻将;', '54', '0');
INSERT INTO `tb_user` VALUES ('12', '买', '123', '女', '高中', '打麻将;', '57', '0');
INSERT INTO `tb_user` VALUES ('13', '片', '123', '女', '小学', '敲代码;', '78', '0');
