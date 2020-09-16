/*
 Navicat Premium Data Transfer

 Source Server         : soul
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : springboot_project

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 16/09/2020 10:12:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods_class
-- ----------------------------
DROP TABLE IF EXISTS `goods_class`;
CREATE TABLE `goods_class`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '类别编号',
  `class_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品类别',
  `object` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消费对象',
  `rival` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '竞争对手',
  `means` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '传播手段',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods_class
-- ----------------------------
INSERT INTO `goods_class` VALUES (1, '电脑', '程序员', '京东', '网购');
INSERT INTO `goods_class` VALUES (2, '方便面', '上班族', '康师傅', '商店零售');
INSERT INTO `goods_class` VALUES (3, '家具', '家庭主妇', '居然之家', '送货上门');

-- ----------------------------
-- Table structure for goods_manage
-- ----------------------------
DROP TABLE IF EXISTS `goods_manage`;
CREATE TABLE `goods_manage`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '进货编号',
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '货品名称',
  `goods_class_id` int(0) NULL DEFAULT NULL COMMENT '所属类别',
  `channel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '进货渠道',
  `number` int(0) NULL DEFAULT NULL COMMENT '数量',
  `price` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单价',
  `stock_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '进货时间',
  `put_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '入库时间',
  `states` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '当前状态',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `goods_manage_class_fk`(`goods_class_id`) USING BTREE,
  CONSTRAINT `goods_manage_class_fk` FOREIGN KEY (`goods_class_id`) REFERENCES `goods_class` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods_manage
-- ----------------------------
INSERT INTO `goods_manage` VALUES (1, '联想拯救者', 1, '联想厂家', 100, '10000', '2020.1.1', '2020.1.1', '在售');
INSERT INTO `goods_manage` VALUES (2, '统一老坛酸菜牛肉面', 2, '统一食品有限公司', 1000, '3', '2020.1.20', '2020.1.20', '入库');
INSERT INTO `goods_manage` VALUES (3, '沙发', 3, '席梦思之家', 5, '5000', '2020.1.15', '2020.1.15', '运输中');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账户名',
  `userpwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子邮箱',
  `createdate` date NULL DEFAULT NULL COMMENT '注册时间',
  `userstatus` int(0) NULL DEFAULT NULL COMMENT '用户状态（1启用 0禁用）',
  `role` int(0) NULL DEFAULT NULL COMMENT '用户权限（1普通用户 0管理员）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin123', 'admin123', '123456789@qq.com', '2020-01-28', 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
