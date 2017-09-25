/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-10-07 22:30:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_module`
-- ----------------------------
DROP TABLE IF EXISTS `tb_module`;
CREATE TABLE `tb_module` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(100) DEFAULT NULL,
  `upid` int(11) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `demo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_module
-- ----------------------------
INSERT INTO `tb_module` VALUES ('1', '用户管理', '1', null, null);
INSERT INTO `tb_module` VALUES ('2', '权限管理', '1', null, null);
INSERT INTO `tb_module` VALUES ('3', '模块管理', '2', null, null);
INSERT INTO `tb_module` VALUES ('4', '成绩管理', '3', null, null);
INSERT INTO `tb_module` VALUES ('5', '成绩查询', '3', null, null);
INSERT INTO `tb_module` VALUES ('6', '修改个人信息', '4', null, null);
INSERT INTO `tb_module` VALUES ('7', '学生管理', '3', null, null);
INSERT INTO `tb_module` VALUES ('8', '学生查询', '1', '1', '');
