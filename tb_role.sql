/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-10-07 22:30:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_role`
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role` (
  `id` int(100) NOT NULL,
  `rname` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`,`rname`),
  KEY `id` (`id`),
  KEY `rname` (`rname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_role
-- ----------------------------
INSERT INTO `tb_role` VALUES ('0', '学生');
INSERT INTO `tb_role` VALUES ('1', '教师');
INSERT INTO `tb_role` VALUES ('2', '管理员');
