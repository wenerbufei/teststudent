/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : ssm_example

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-12-02 14:33:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `cla` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('51', '凤凰', '111', '1@163.com', '1', '11');
INSERT INTO `student` VALUES ('53', '蚂蚁', null, null, null, null);
INSERT INTO `student` VALUES ('55', '熊继华', null, null, null, null);
INSERT INTO `student` VALUES ('59', '明天你好', null, null, null, null);
INSERT INTO `student` VALUES ('60', '', null, null, null, null);
