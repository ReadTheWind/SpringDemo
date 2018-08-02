/*
 Navicat Premium Data Transfer

 Source Server         : LOCALDB
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 02/08/2018 11:55:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(10) NULL DEFAULT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`, `remark`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张三', '男', 24, '广东深圳', '2018-03-27', '151151515@16.com', '18229661111', '1212');
INSERT INTO `user` VALUES (2, '李四', '女', 18, '北京海定', '2018-03-14', '123123@qq.com', '1231321', '备1');
INSERT INTO `user` VALUES (3, '李四1', '男', 18, '北京海定', '2018-03-08', '123123@qq.com', '1231321', '备注2');
INSERT INTO `user` VALUES (4, '李四3', '女', 18, '北京海定', '2018-03-29', '123123@qq.com', '1231321', '备注3');
INSERT INTO `user` VALUES (5, '李四2', '女', 19, '北京小胡同', '2018-04-02', '51531@qq.com', '1231212321', '备注');
INSERT INTO `user` VALUES (13, '王五', '男', 20, '中国云南香格里拉', '2015-10-02', '21345153@qq.com', '15225996659', '王五的备注');
INSERT INTO `user` VALUES (15, '王五4', '男', 20, '中国云南香格里拉', '2015-10-02', '21345153@qq.com', '15225996659', '王五的备注');

SET FOREIGN_KEY_CHECKS = 1;
