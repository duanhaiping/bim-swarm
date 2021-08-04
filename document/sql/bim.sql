/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : bim

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-08-24 13:48:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ums_admin
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin`;
CREATE TABLE `ums_admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `icon` varchar(500) DEFAULT NULL COMMENT '头像',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `nick_name` varchar(200) DEFAULT NULL COMMENT '昵称',
  `note` varchar(500) DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` int(1) DEFAULT '1' COMMENT '帐号启用状态：0->禁用；1->启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='后台用户表';

-- ----------------------------
-- Records of ums_admin
-- ----------------------------
INSERT INTO `ums_admin` VALUES ('1', 'test', '$2a$10$NZ5o7r2E.ayT2ZoxgjlI.eJ6OEYqjH7INR/F.mXDbjZJi9HF0YCVG', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg.jpg', 'test@qq.com', '测试账号', null, '2018-09-29 13:55:30', '2018-09-29 13:55:39', '1');
INSERT INTO `ums_admin` VALUES ('3', 'admin', '$2a$10$.E1FokumK5GIXWgKlg.Hc.i/0/2.qdAwYFL1zc5QHdyzpXOr38RZO', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg.jpg', 'admin@163.com', '系统管理员', '系统管理员', '2018-10-08 13:32:47', '2019-04-20 12:45:16', '1');
INSERT INTO `ums_admin` VALUES ('4', 'macro', '$2a$10$Bx4jZPR7GhEpIQfefDQtVeS58GfT5n6mxs/b4nLLK65eMFa16topa', 'string', 'macro@qq.com', 'macro', 'macro专用', '2019-10-06 15:53:51', '2020-02-03 14:55:55', '1');
INSERT INTO `ums_admin` VALUES ('6', 'productAdmin', '$2a$10$6/.J.p.6Bhn7ic4GfoB5D.pGd7xSiD1a9M6ht6yO0fxzlKJPjRAGm', null, 'product@qq.com', '商品管理员', '只有商品权限', '2020-02-07 16:15:08', null, '1');
INSERT INTO `ums_admin` VALUES ('7', 'orderAdmin', '$2a$10$UqEhA9UZXjHHA3B.L9wNG.6aerrBjC6WHTtbv1FdvYPUI.7lkL6E.', null, 'order@qq.com', '订单管理员', '只有订单管理权限', '2020-02-07 16:15:50', null, '1');

-- ----------------------------
-- Table structure for ums_admin_login_log
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_login_log`;
CREATE TABLE `ums_admin_login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `ip` varchar(64) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `user_agent` varchar(100) DEFAULT NULL COMMENT '浏览器登录类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8 COMMENT='后台用户登录日志表';

-- ----------------------------
-- Records of ums_admin_login_log
-- ----------------------------
INSERT INTO `ums_admin_login_log` VALUES ('1', '3', '2018-12-23 14:27:00', '0:0:0:0:0:0:0:1', null, null);
INSERT INTO `ums_admin_login_log` VALUES ('2', '3', '2019-04-07 16:04:39', '0:0:0:0:0:0:0:1', null, null);
INSERT INTO `ums_admin_login_log` VALUES ('3', '3', '2019-04-08 21:47:52', '0:0:0:0:0:0:0:1', null, null);
INSERT INTO `ums_admin_login_log` VALUES ('4', '3', '2019-04-08 21:48:18', '0:0:0:0:0:0:0:1', null, null);
INSERT INTO `ums_admin_login_log` VALUES ('5', '3', '2019-04-18 22:18:40', '0:0:0:0:0:0:0:1', null, null);

-- ----------------------------
-- Records of ums_member_task
-- ----------------------------

-- ----------------------------
-- Table structure for ums_menu
-- ----------------------------
DROP TABLE IF EXISTS `ums_menu`;
CREATE TABLE `ums_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父级ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `title` varchar(100) DEFAULT NULL COMMENT '菜单名称',
  `level` int(4) DEFAULT NULL COMMENT '菜单级数',
  `sort` int(4) DEFAULT NULL COMMENT '菜单排序',
  `name` varchar(100) DEFAULT NULL COMMENT '前端名称',
  `icon` varchar(200) DEFAULT NULL COMMENT '前端图标',
  `hidden` int(1) DEFAULT NULL COMMENT '前端隐藏',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COMMENT='后台菜单表';

-- ----------------------------
-- Records of ums_menu
-- ----------------------------
INSERT INTO `ums_menu` VALUES ('1', '0', '2020-02-02 14:50:36', '商品', '0', '0', 'pms', 'product', '0');
INSERT INTO `ums_menu` VALUES ('2', '1', '2020-02-02 14:51:50', '商品列表', '1', '0', 'product', 'product-list', '0');
INSERT INTO `ums_menu` VALUES ('3', '1', '2020-02-02 14:52:44', '添加商品', '1', '0', 'addProduct', 'product-add', '0');
INSERT INTO `ums_menu` VALUES ('4', '1', '2020-02-02 14:53:51', '商品分类', '1', '0', 'productCate', 'product-cate', '0');
INSERT INTO `ums_menu` VALUES ('5', '1', '2020-02-02 14:54:51', '商品类型', '1', '0', 'productAttr', 'product-attr', '0');
INSERT INTO `ums_menu` VALUES ('6', '1', '2020-02-02 14:56:29', '品牌管理', '1', '0', 'brand', 'product-brand', '0');
INSERT INTO `ums_menu` VALUES ('7', '0', '2020-02-07 16:29:13', '权限', '0', '0', 'ums', 'ums', '0');
INSERT INTO `ums_menu` VALUES ('8', '7', '2020-02-07 16:29:51', '用户列表', '1', '0', 'admin', 'ums-admin', '0');
INSERT INTO `ums_menu` VALUES ('9', '7', '2020-02-07 16:30:13', '角色列表', '1', '0', 'role', 'ums-role', '0');
INSERT INTO `ums_menu` VALUES ('10', '7', '2020-02-07 16:30:53', '菜单列表', '1', '0', 'menu', 'ums-menu', '0');
INSERT INTO `ums_menu` VALUES ('11', '7', '2020-02-07 16:31:13', '资源列表', '1', '0', 'resource', 'ums-resource', '0');

# -- ----------------------------
# -- Table structure for ums_permission
# -- ----------------------------
# DROP TABLE IF EXISTS `ums_permission`;
# CREATE TABLE `ums_permission` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `pid` bigint(20) DEFAULT NULL COMMENT '父级权限id',
#   `name` varchar(100) DEFAULT NULL COMMENT '名称',
#   `value` varchar(200) DEFAULT NULL COMMENT '权限值',
#   `icon` varchar(500) DEFAULT NULL COMMENT '图标',
#   `type` int(1) DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
#   `uri` varchar(200) DEFAULT NULL COMMENT '前端资源路径',
#   `status` int(1) DEFAULT NULL COMMENT '启用状态；0->禁用；1->启用',
#   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
#   `sort` int(11) DEFAULT NULL COMMENT '排序',
#   PRIMARY KEY (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='后台用户权限表';
#
# -- ----------------------------
# -- Records of ums_permission
# -- ----------------------------
# INSERT INTO `ums_permission` VALUES ('1', '0', '商品', null, null, '0', null, '1', '2018-09-29 16:15:14', '0');
# INSERT INTO `ums_permission` VALUES ('2', '1', '商品列表', 'pms:product:read', null, '1', '/pms/product/index', '1', '2018-09-29 16:17:01', '0');
# INSERT INTO `ums_permission` VALUES ('3', '1', '添加商品', 'pms:product:create', null, '1', '/pms/product/add', '1', '2018-09-29 16:18:51', '0');
# INSERT INTO `ums_permission` VALUES ('4', '1', '商品分类', 'pms:productCategory:read', null, '1', '/pms/productCate/index', '1', '2018-09-29 16:23:07', '0');
# INSERT INTO `ums_permission` VALUES ('5', '1', '商品类型', 'pms:productAttribute:read', null, '1', '/pms/productAttr/index', '1', '2018-09-29 16:24:43', '0');
# INSERT INTO `ums_permission` VALUES ('6', '1', '品牌管理', 'pms:brand:read', null, '1', '/pms/brand/index', '1', '2018-09-29 16:25:45', '0');
# INSERT INTO `ums_permission` VALUES ('7', '2', '编辑商品', 'pms:product:update', null, '2', '/pms/product/updateProduct', '1', '2018-09-29 16:34:23', '0');
# INSERT INTO `ums_permission` VALUES ('8', '2', '删除商品', 'pms:product:delete', null, '2', '/pms/product/delete', '1', '2018-09-29 16:38:33', '0');
# INSERT INTO `ums_permission` VALUES ('9', '4', '添加商品分类', 'pms:productCategory:create', null, '2', '/pms/productCate/create', '1', '2018-09-29 16:43:23', '0');
# INSERT INTO `ums_permission` VALUES ('10', '4', '修改商品分类', 'pms:productCategory:update', null, '2', '/pms/productCate/update', '1', '2018-09-29 16:43:55', '0');
# INSERT INTO `ums_permission` VALUES ('11', '4', '删除商品分类', 'pms:productCategory:delete', null, '2', '/pms/productAttr/delete', '1', '2018-09-29 16:44:38', '0');
# INSERT INTO `ums_permission` VALUES ('12', '5', '添加商品类型', 'pms:productAttribute:create', null, '2', '/pms/productAttr/create', '1', '2018-09-29 16:45:25', '0');
# INSERT INTO `ums_permission` VALUES ('13', '5', '修改商品类型', 'pms:productAttribute:update', null, '2', '/pms/productAttr/update', '1', '2018-09-29 16:48:08', '0');
# INSERT INTO `ums_permission` VALUES ('14', '5', '删除商品类型', 'pms:productAttribute:delete', null, '2', '/pms/productAttr/delete', '1', '2018-09-29 16:48:44', '0');
# INSERT INTO `ums_permission` VALUES ('15', '6', '添加品牌', 'pms:brand:create', null, '2', '/pms/brand/add', '1', '2018-09-29 16:49:34', '0');
# INSERT INTO `ums_permission` VALUES ('16', '6', '修改品牌', 'pms:brand:update', null, '2', '/pms/brand/update', '1', '2018-09-29 16:50:55', '0');
# INSERT INTO `ums_permission` VALUES ('17', '6', '删除品牌', 'pms:brand:delete', null, '2', '/pms/brand/delete', '1', '2018-09-29 16:50:59', '0');
# INSERT INTO `ums_permission` VALUES ('18', '0', '首页', null, null, '0', null, '1', '2018-09-29 16:51:57', '0');

-- ----------------------------
-- Table structure for ums_role
-- ----------------------------
DROP TABLE IF EXISTS `ums_role`;
CREATE TABLE `ums_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `admin_count` int(11) DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) DEFAULT '1' COMMENT '启用状态：0->禁用；1->启用',
  `sort` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='后台用户角色表';

-- ----------------------------
-- Records of ums_role
-- ----------------------------

INSERT INTO `ums_role` VALUES ('1', '超级管理员', '拥有所有查看和操作功能', '0', '2020-02-02 15:11:05', '1', '0');

-- ----------------------------
-- Table structure for ums_role_menu_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_menu_relation`;
CREATE TABLE `ums_role_menu_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8 COMMENT='后台角色菜单关系表';

-- ----------------------------
-- Records of ums_role_menu_relation
-- ----------------------------
INSERT INTO `ums_role_menu_relation` VALUES ('33', '1', '1');
INSERT INTO `ums_role_menu_relation` VALUES ('34', '1', '2');
INSERT INTO `ums_role_menu_relation` VALUES ('35', '1', '3');
INSERT INTO `ums_role_menu_relation` VALUES ('36', '1', '4');
INSERT INTO `ums_role_menu_relation` VALUES ('37', '1', '5');
INSERT INTO `ums_role_menu_relation` VALUES ('38', '1', '6');
INSERT INTO `ums_role_menu_relation` VALUES ('53', '2', '7');
INSERT INTO `ums_role_menu_relation` VALUES ('54', '2', '8');
INSERT INTO `ums_role_menu_relation` VALUES ('55', '2', '9');
INSERT INTO `ums_role_menu_relation` VALUES ('56', '2', '10');
INSERT INTO `ums_role_menu_relation` VALUES ('57', '2', '11');
INSERT INTO `ums_role_menu_relation` VALUES ('72', '5', '1');
INSERT INTO `ums_role_menu_relation` VALUES ('73', '5', '2');
INSERT INTO `ums_role_menu_relation` VALUES ('74', '5', '3');
INSERT INTO `ums_role_menu_relation` VALUES ('75', '5', '4');
INSERT INTO `ums_role_menu_relation` VALUES ('76', '5', '5');
INSERT INTO `ums_role_menu_relation` VALUES ('77', '5', '6');
INSERT INTO `ums_role_menu_relation` VALUES ('78', '5', '7');
INSERT INTO `ums_role_menu_relation` VALUES ('79', '5', '8');
INSERT INTO `ums_role_menu_relation` VALUES ('80', '5', '9');
INSERT INTO `ums_role_menu_relation` VALUES ('81', '5', '10');
INSERT INTO `ums_role_menu_relation` VALUES ('82', '5', '11');
INSERT INTO `ums_role_menu_relation` VALUES ('83', '5', '12');
INSERT INTO `ums_role_menu_relation` VALUES ('84', '5', '13');
INSERT INTO `ums_role_menu_relation` VALUES ('85', '5', '14');
INSERT INTO `ums_role_menu_relation` VALUES ('86', '5', '16');
INSERT INTO `ums_role_menu_relation` VALUES ('87', '5', '17');
INSERT INTO `ums_role_menu_relation` VALUES ('88', '5', '18');
INSERT INTO `ums_role_menu_relation` VALUES ('89', '5', '19');
INSERT INTO `ums_role_menu_relation` VALUES ('90', '5', '20');
INSERT INTO `ums_role_menu_relation` VALUES ('91', '5', '21');
INSERT INTO `ums_role_menu_relation` VALUES ('92', '5', '22');
INSERT INTO `ums_role_menu_relation` VALUES ('93', '5', '23');
INSERT INTO `ums_role_menu_relation` VALUES ('94', '5', '24');
INSERT INTO `ums_role_menu_relation` VALUES ('95', '5', '25');

-- ----------------------------
-- Table structure for ums_role_permission_relation
-- ----------------------------
# DROP TABLE IF EXISTS `ums_role_permission_relation`;
# CREATE TABLE `ums_role_permission_relation` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `role_id` bigint(20) DEFAULT NULL,
#   `permission_id` bigint(20) DEFAULT NULL,
#   PRIMARY KEY (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='后台用户角色和权限关系表';

-- ----------------------------
-- Records of ums_role_permission_relation
-- ----------------------------
# INSERT INTO `ums_role_permission_relation` VALUES ('1', '1', '1');
# INSERT INTO `ums_role_permission_relation` VALUES ('2', '1', '2');
# INSERT INTO `ums_role_permission_relation` VALUES ('3', '1', '3');
# INSERT INTO `ums_role_permission_relation` VALUES ('4', '1', '7');
# INSERT INTO `ums_role_permission_relation` VALUES ('5', '1', '8');
# INSERT INTO `ums_role_permission_relation` VALUES ('6', '2', '4');
# INSERT INTO `ums_role_permission_relation` VALUES ('7', '2', '9');
# INSERT INTO `ums_role_permission_relation` VALUES ('8', '2', '10');
# INSERT INTO `ums_role_permission_relation` VALUES ('9', '2', '11');
# INSERT INTO `ums_role_permission_relation` VALUES ('10', '3', '5');
# INSERT INTO `ums_role_permission_relation` VALUES ('11', '3', '12');
# INSERT INTO `ums_role_permission_relation` VALUES ('12', '3', '13');
# INSERT INTO `ums_role_permission_relation` VALUES ('13', '3', '14');
# INSERT INTO `ums_role_permission_relation` VALUES ('14', '4', '6');
# INSERT INTO `ums_role_permission_relation` VALUES ('15', '4', '15');
# INSERT INTO `ums_role_permission_relation` VALUES ('16', '4', '16');
# INSERT INTO `ums_role_permission_relation` VALUES ('17', '4', '17');

-- ----------------------------
-- Table structure for ums_resource
-- ----------------------------
DROP TABLE IF EXISTS `ums_resource`;
CREATE TABLE `ums_resource` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                `name` varchar(200) DEFAULT NULL COMMENT '资源名称',
                                `url` varchar(200) DEFAULT NULL COMMENT '资源URL',
                                `description` varchar(500) DEFAULT NULL COMMENT '描述',
                                `category_id` bigint(20) DEFAULT NULL COMMENT '资源分类ID',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='后台资源表';

-- ----------------------------
-- Records of ums_resource
-- ----------------------------
INSERT INTO `ums_resource` VALUES ('1', '2020-02-07 16:47:34', '后台用户管理', '/admin/**', '', '1');
INSERT INTO `ums_resource` VALUES ('2', '2020-02-07 16:48:24', '后台用户角色管理', '/role/**', '', '1');
INSERT INTO `ums_resource` VALUES ('3', '2020-02-07 16:48:48', '后台菜单管理', '/menu/**', '', '1');
INSERT INTO `ums_resource` VALUES ('4', '2020-02-07 16:49:18', '后台资源分类管理', '/resourceCategory/**', '', '1');
INSERT INTO `ums_resource` VALUES ('5', '2020-02-07 16:49:45', '后台资源管理', '/resource/**', '', '1');
INSERT INTO `ums_resource` VALUES ('6', '2020-08-24 13:43:54', '登录后获取用户信息', '/admin/info', '后台用户登录需要配置', '1');
INSERT INTO `ums_resource` VALUES ('7', '2020-08-24 13:44:37', '后台用户登出', '/admin/logout', '后台用户登出需要配置', '1');

-- ----------------------------
-- Table structure for ums_resource_category
-- ----------------------------
DROP TABLE IF EXISTS `ums_resource_category`;
CREATE TABLE `ums_resource_category` (
                                         `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                         `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                         `name` varchar(200) DEFAULT NULL COMMENT '分类名称',
                                         `sort` int(4) DEFAULT NULL COMMENT '排序',
                                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='资源分类表';

-- ----------------------------
-- Records of ums_resource_category
-- ----------------------------
INSERT INTO `ums_resource_category` VALUES ('1', '2020-02-05 10:23:04', '权限模块', '0');
INSERT INTO `ums_resource_category` VALUES ('2', '2020-02-07 16:35:49', '其他模块', '0');

-- ----------------------------
-- Table structure for ums_role_resource_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_resource_relation`;
CREATE TABLE `ums_role_resource_relation` (
                                              `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                              `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
                                              `resource_id` bigint(20) DEFAULT NULL COMMENT '资源ID',
                                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=225 DEFAULT CHARSET=utf8 COMMENT='后台角色资源关系表';

-- ----------------------------
-- Records of ums_role_resource_relation
-- ----------------------------
INSERT INTO `ums_role_resource_relation` VALUES ('178', '5', '1');
INSERT INTO `ums_role_resource_relation` VALUES ('179', '5', '2');
INSERT INTO `ums_role_resource_relation` VALUES ('180', '5', '3');
INSERT INTO `ums_role_resource_relation` VALUES ('181', '5', '4');
INSERT INTO `ums_role_resource_relation` VALUES ('182', '5', '5');
INSERT INTO `ums_role_resource_relation` VALUES ('183', '5', '6');
INSERT INTO `ums_role_resource_relation` VALUES ('184', '5', '8');
INSERT INTO `ums_role_resource_relation` VALUES ('185', '5', '9');
INSERT INTO `ums_role_resource_relation` VALUES ('186', '5', '10');
INSERT INTO `ums_role_resource_relation` VALUES ('187', '5', '11');
INSERT INTO `ums_role_resource_relation` VALUES ('188', '5', '12');
INSERT INTO `ums_role_resource_relation` VALUES ('189', '5', '13');
INSERT INTO `ums_role_resource_relation` VALUES ('190', '5', '14');
INSERT INTO `ums_role_resource_relation` VALUES ('191', '5', '15');
INSERT INTO `ums_role_resource_relation` VALUES ('192', '5', '16');
INSERT INTO `ums_role_resource_relation` VALUES ('193', '5', '17');
INSERT INTO `ums_role_resource_relation` VALUES ('194', '5', '18');
INSERT INTO `ums_role_resource_relation` VALUES ('195', '5', '19');
INSERT INTO `ums_role_resource_relation` VALUES ('196', '5', '20');
INSERT INTO `ums_role_resource_relation` VALUES ('197', '5', '21');
INSERT INTO `ums_role_resource_relation` VALUES ('198', '5', '22');
INSERT INTO `ums_role_resource_relation` VALUES ('199', '5', '23');
INSERT INTO `ums_role_resource_relation` VALUES ('200', '5', '24');
INSERT INTO `ums_role_resource_relation` VALUES ('201', '5', '25');
INSERT INTO `ums_role_resource_relation` VALUES ('202', '5', '26');
INSERT INTO `ums_role_resource_relation` VALUES ('203', '5', '27');
INSERT INTO `ums_role_resource_relation` VALUES ('204', '5', '28');
INSERT INTO `ums_role_resource_relation` VALUES ('205', '5', '29');
INSERT INTO `ums_role_resource_relation` VALUES ('206', '5', '31');
INSERT INTO `ums_role_resource_relation` VALUES ('207', '5', '32');
INSERT INTO `ums_role_resource_relation` VALUES ('208', '2', '8');
INSERT INTO `ums_role_resource_relation` VALUES ('209', '2', '9');
INSERT INTO `ums_role_resource_relation` VALUES ('210', '2', '10');
INSERT INTO `ums_role_resource_relation` VALUES ('211', '2', '11');
INSERT INTO `ums_role_resource_relation` VALUES ('212', '2', '12');
INSERT INTO `ums_role_resource_relation` VALUES ('213', '2', '31');
INSERT INTO `ums_role_resource_relation` VALUES ('214', '2', '32');
INSERT INTO `ums_role_resource_relation` VALUES ('215', '1', '1');
INSERT INTO `ums_role_resource_relation` VALUES ('216', '1', '2');
INSERT INTO `ums_role_resource_relation` VALUES ('217', '1', '3');
INSERT INTO `ums_role_resource_relation` VALUES ('218', '1', '4');
INSERT INTO `ums_role_resource_relation` VALUES ('219', '1', '5');
INSERT INTO `ums_role_resource_relation` VALUES ('220', '1', '6');
INSERT INTO `ums_role_resource_relation` VALUES ('221', '1', '23');
INSERT INTO `ums_role_resource_relation` VALUES ('222', '1', '24');
INSERT INTO `ums_role_resource_relation` VALUES ('223', '1', '31');
INSERT INTO `ums_role_resource_relation` VALUES ('224', '1', '32');

-- ----------------------------
-- Table structure for ems_type
-- ----------------------------
DROP TABLE IF EXISTS `ems_type`;
CREATE TABLE `ems_type` (
                            `ID` INT NOT NULL,
                            `NAME` VARCHAR(50) NOT NULL DEFAULT '',
                            `CODE` INT NOT NULL,
                            PRIMARY KEY (`ID`)
)
COLLATE='latin1_swedish_ci';

-- ----------------------------
-- Table structure for ems_equipment
-- ----------------------------

DROP TABLE IF EXISTS `ems_equipment`;
CREATE TABLE `ems_equipment` (
                                 `ID` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                 `REGION` INT(11) NOT NULL COMMENT '管理区',
                                 `NAME` VARCHAR(1024) NOT NULL COMMENT '设备名称',
                                 `CODE` VARCHAR(32) NOT NULL COMMENT '设备编码',
                                 `TYPE` VARCHAR(1) NOT NULL DEFAULT '1' COMMENT '设备类型',
                                 `State` VARCHAR(32) NOT NULL COMMENT '设备状态',
                                 `SPECIFICATION` TEXT NULL DEFAULT NULL COMMENT '规格型号',
                                 `MAINTENANCE_CYCLE` VARCHAR(32) NULL DEFAULT NULL COMMENT '预计保养周期',
                                 `WEIGHT` DECIMAL(32,10) NULL DEFAULT NULL COMMENT '重量',
                                 `BIM_MODEL_CODE` VARCHAR(32) NOT NULL COMMENT 'BIMGUID',
                                 `MODEL_POSITION` VARCHAR(32) NULL DEFAULT NULL COMMENT 'BIM设备位置',
                                 `ISACTIVITY` VARCHAR(1) NULL DEFAULT NULL COMMENT '是否启用',
                                 `USE_DATE` DATE NULL DEFAULT NULL COMMENT '启用时间',
                                 `CREATED_BY` VARCHAR(32) NULL DEFAULT NULL COMMENT '创建人',
                                 `CREATED_TIME` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
                                 `UPDATED_BY` VARCHAR(32) NULL DEFAULT NULL COMMENT '更新人',
                                 `UPDATED_TIME` DATETIME NULL DEFAULT NULL COMMENT '更新时间',
                                 PRIMARY KEY (`ID`)
)
    COMMENT='设备 '
    COLLATE='latin1_swedish_ci'
    ENGINE=InnoDB
;

-- ----------------------------
-- Table structure for ems_equ_maintenance_task_plan
-- ----------------------------

DROP TABLE IF EXISTS `ems_equ_maintenance_task_plan`;
CREATE TABLE `ems_equ_maintenance_task_plan`(
                                          ID BIGINT NOT NULL AUTO_INCREMENT  COMMENT '' ,
                                          REGION_ID INT NOT NULL   COMMENT '' ,
                                          EQUMENT_ID INT NOT NULL   COMMENT '' ,
                                          TASK_NAME VARCHAR(128) NOT NULL   COMMENT '' ,
                                          CREATED_BY VARCHAR(32) NOT NULL   COMMENT '创建人' ,
                                          CREATED_TIME DATETIME NOT NULL   COMMENT '创建时间' ,
                                          UPDATED_BY VARCHAR(32)    COMMENT '更新人' ,
                                          UPDATED_TIME DATETIME    COMMENT '更新时间' ,
                                          TYPE VARCHAR(32) NOT NULL   COMMENT '保养类型' ,
                                          FREQUENCY_TYPE VARCHAR(32) NOT NULL   COMMENT '保养频率类型 每日，每月，每年' ,
                                          FREQUENCY_NUMBER INT NOT NULL   COMMENT '保养频率次数' ,
                                          AGENT INT NOT NULL   COMMENT '经办人' ,
                                          FUNDS DECIMAL(32,8) NOT NULL   COMMENT '' ,
                                          INSPECTION INT NOT NULL   COMMENT '' ,
                                          ADDRESS VARCHAR(32) NOT NULL   COMMENT '' ,
                                          MAINPOINT VARCHAR(32) NOT NULL   COMMENT '' ,
                                          TASK_STARTDATE DATE NOT NULL   COMMENT '计划有效期开始日期' ,
                                          TASK_ENDDATE VARCHAR(32)    COMMENT '有效期截至' ,
                                          PRIMARY KEY (ID)
) COMMENT = '设备保养维护任务计划 ';

-- ----------------------------
-- Table structure for ems_equ_maintenance_task_plan_table
-- ----------------------------

DROP  TABLE  IF EXISTS `ems_equ_maintenance_task_plan_table`;
CREATE TABLE `ems_equ_maintenance_task_plan_table`(
                                                ID INT NOT NULL AUTO_INCREMENT  COMMENT '' ,
                                                PLAN_ID INT NOT NULL   COMMENT '' ,
                                                START_DATE DATE NOT NULL   COMMENT '' ,
                                                END_DATE DATE NOT NULL   COMMENT '' ,
                                                NAME VARCHAR(32) NOT NULL   COMMENT '' ,
                                                PRIMARY KEY (ID)
) COMMENT = '设备保养维护任务计划列表 ';

-- ----------------------------
-- Table structure for ems_equ_maintenance_task
-- ----------------------------
DROP  TABLE  IF EXISTS  `ems_equ_maintenance_task` ;
CREATE TABLE `ems_equ_maintenance_task`(
                                     ID INT NOT NULL AUTO_INCREMENT  COMMENT '' ,
                                     NAME VARCHAR(128) NOT NULL  COMMENT '' ,
                                     LINK_PLAN INT NOT NULL   COMMENT '关联计划' ,
                                     AGENT  INT NOT NULL COMMENT '经办人',
                                     EXECUTOR   INT NOT NULL COMMENT '执行人',
                                     REVIEWER   INT NOT NULL  COMMENT '稽查人',
                                     CREATED_BY VARCHAR(32)    COMMENT '创建人' ,
                                     CREATED_TIME DATETIME    COMMENT '创建时间' ,
                                     UPDATED_BY VARCHAR(32)    COMMENT '更新人' ,
                                     UPDATED_TIME DATETIME    COMMENT '更新时间' ,
                                     PRIMARY KEY (ID)
) COMMENT = '设备保养维护任务';


-- ----------------------------
-- Table structure for ems_equ_maintenance_task_check_issue
-- ----------------------------
DROP  TABLE  IF EXISTS  `ems_equ_maintenance_task_check_issue` ;
CREATE TABLE `ems_equ_maintenance_task_check_issue`(
                                                 ID INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
                                                 TASK_ID INT NOT NULL   COMMENT '' ,
                                                 ISSUE VARCHAR(1024)    COMMENT '' ,
                                                 STATE VARCHAR(32)    COMMENT '' ,
                                                 SOLUTION VARCHAR(1024)    COMMENT '' ,
                                                 CREATED_BY VARCHAR(32)    COMMENT '创建人' ,
                                                 CREATED_TIME DATETIME    COMMENT '创建时间' ,
                                                 UPDATED_BY VARCHAR(32)    COMMENT '更新人' ,
                                                 UPDATED_TIME DATETIME    COMMENT '更新时间' ,
                                                 PRIMARY KEY (ID)
) COMMENT = '保养巡检问题 ';

-- ----------------------------
-- Table structure for pms_patrol_location
-- ----------------------------
DROP  TABLE  IF EXISTS  `pms_patrol_location` ;
CREATE TABLE `pms_patrol_location`(
                                ID INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
                                REGION INT NOT NULL   COMMENT '' ,
                                ADDRESS VARCHAR(1024) NOT NULL   COMMENT '' ,
                                CODE VARCHAR(32) NOT NULL   COMMENT '' ,
                                PATROL_POINT VARCHAR(1024)    COMMENT '' ,
                                SIGN_TYPE VARCHAR(32) NOT NULL   COMMENT '' ,
                                BIM_POINT VARCHAR(128)    COMMENT '' ,
                                PRIMARY KEY (ID)
) COMMENT = '巡更点';

-- ----------------------------
-- Table structure for pms_patrol_path
-- ----------------------------

DROP  TABLE  IF EXISTS  `pms_patrol_path` ;
CREATE TABLE `pms_patrol_path`(
                            ID INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
                            REGION_ID INT NOT NULL   COMMENT '' ,
                            NAME VARCHAR(32) NOT NULL   COMMENT '' ,
                            CODE VARCHAR(32) NOT NULL   COMMENT '' ,
                            TYPE VARCHAR(32) NOT NULL   COMMENT '' ,
                            BIM_PATH VARCHAR(32)    COMMENT '' ,
                            REMARK TEXT    COMMENT '' ,
                            STATE VARCHAR(32)    COMMENT '' ,
                            PRIMARY KEY (ID)
) COMMENT = '巡更路线 ';

-- ----------------------------
-- Table structure for pms_patrol_plan
-- ----------------------------

DROP  TABLE  IF EXISTS  `pms_patrol_plan` ;
CREATE TABLE `pms_patrol_plan`(
                            ID INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
                            REGION_ID INT NOT NULL   COMMENT '' ,
                            NAME VARCHAR(128) NOT NULL   COMMENT '' ,
                            STAET_DATE DATE NOT NULL   COMMENT '' ,
                            END_DATE DATE NOT NULL   COMMENT '' ,
                            PATH_ID INT NOT NULL   COMMENT '' ,
                            FREQUENCY_TYPE VARCHAR(32) NOT NULL   COMMENT '保养频率类型 每日，每月，每年' ,
                            BIM_PATH VARCHAR(32) NOT NULL   COMMENT '' ,
                            AGENT INT NOT NULL   COMMENT '经办人' ,
                            FREQUENCY_NUMBER INT NOT NULL   COMMENT '保养频率次数' ,
                            PRIMARY KEY (ID)
) COMMENT = '巡更计划 ';

-- ----------------------------
-- Table structure for pms_patrol_plan
-- ----------------------------

DROP  TABLE  IF EXISTS  `pms_patrol_plan_sub` ;
CREATE TABLE `pms_patrol_plan_sub`(
                                ID INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
                                START_DATE DATE NOT NULL   COMMENT '' ,
                                START_END DATE NOT NULL   COMMENT '' ,
                                PLAN_ID INT    COMMENT '' ,
                                PRIMARY KEY (ID)
) COMMENT = '巡更计划子项 ';


-- ----------------------------
-- Table structure for pms_patrol_task
-- ----------------------------

DROP  TABLE  IF EXISTS  `pms_patrol_task` ;

CREATE TABLE `pms_patrol_task`(
                            ID INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
                            REGION_ID INT NOT NULL   COMMENT '' ,
                            NAME VARCHAR(1024) NOT NULL   COMMENT '' ,
                            PLAN_START_DATE DATETIME NOT NULL   COMMENT '' ,
                            PLAN_END_DATE DATETIME NOT NULL   COMMENT '' ,
                            ACTUAL_START_DATE DATETIME    COMMENT '' ,
                            ACTUAL_END_DATE DATETIME    COMMENT '' ,
                            AGENT INT NOT NULL   COMMENT '经办人' ,
                            PATH_ID INT    COMMENT '' ,
                            BIM_PATH VARCHAR(32)    COMMENT '' ,
                            STATE VARCHAR(32)    COMMENT '' ,
                            PRIMARY KEY (ID)
) COMMENT = '巡更任务 ';

-- ----------------------------
-- Table structure for pms_patrol_task
-- ----------------------------

DROP  TABLE  IF EXISTS  `pms_patrol_task_issue` ;

CREATE TABLE `pms_patrol_task_issue`(
                                        ID INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
                                        `DESC` VARCHAR(32) NOT NULL COMMENT '' ,
                                        TASK_ID INT NOT NULL COMMENT '' ,
                                        NAME VARCHAR(32) NOT NULL COMMENT '' ,
                                        SOLUTE_TIME DATETIME NOT NULL COMMENT '' ,
                                        CREATED_TIME DATETIME NOT NULL COMMENT '创建时间' ,
                                        PRINCEPLE INT NOT NULL COMMENT '' ,
                                        STATE VARCHAR(32) COMMENT '' ,
                                        PRIMARY KEY (ID)
) COMMENT = '巡更问题 ';
