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

INSERT INTO `ums_admin` VALUES ('1', 'admin', '$2a$10$.E1FokumK5GIXWgKlg.Hc.i/0/2.qdAwYFL1zc5QHdyzpXOr38RZO', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg.jpg', 'admin@163.com', '系统管理员', '系统管理员', '2018-10-08 13:32:47', '2019-04-20 12:45:16', '1');

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
INSERT INTO `ums_admin_login_log` VALUES ('1', '1', '2018-12-23 14:27:00', '0:0:0:0:0:0:0:1', null, null);
INSERT INTO `ums_admin_login_log` VALUES ('2', '1', '2019-04-07 16:04:39', '0:0:0:0:0:0:0:1', null, null);
INSERT INTO `ums_admin_login_log` VALUES ('3', '1', '2019-04-08 21:47:52', '0:0:0:0:0:0:0:1', null, null);
INSERT INTO `ums_admin_login_log` VALUES ('4', '1', '2019-04-08 21:48:18', '0:0:0:0:0:0:0:1', null, null);
INSERT INTO `ums_admin_login_log` VALUES ('5', '1', '2019-04-18 22:18:40', '0:0:0:0:0:0:0:1', null, null);


-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_role_relation`;
CREATE TABLE `ums_admin_role_relation` (
                                           `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                           `admin_id` bigint(20) DEFAULT NULL,
                                           `role_id` bigint(20) DEFAULT NULL,
                                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COMMENT='后台用户和角色关系表';

-- ----------------------------
-- Records of ums_admin_role_relation
-- ----------------------------
INSERT INTO `ums_admin_role_relation` VALUES ('1', '1', '1');


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
INSERT INTO `ums_menu` VALUES ('1', '0', '2020-02-07 16:29:13', '权限', '0', '0', 'ums', 'ums', '0');
INSERT INTO `ums_menu` VALUES ('2', '1', '2020-02-07 16:29:51', '用户列表', '1', '0', 'admin', 'ums-admin', '0');
INSERT INTO `ums_menu` VALUES ('3', '1', '2020-02-07 16:30:13', '角色列表', '1', '0', 'role', 'ums-role', '0');
INSERT INTO `ums_menu` VALUES ('4', '1', '2020-02-07 16:30:53', '菜单列表', '1', '0', 'menu', 'ums-menu', '0');
INSERT INTO `ums_menu` VALUES ('5', '1', '2020-02-07 16:31:13', '资源列表', '1', '0', 'resource', 'ums-resource', '0');


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
INSERT INTO `ums_role_menu_relation` VALUES ('1', '1', '1');
INSERT INTO `ums_role_menu_relation` VALUES ('2', '1', '2');
INSERT INTO `ums_role_menu_relation` VALUES ('3', '1', '3');
INSERT INTO `ums_role_menu_relation` VALUES ('4', '1', '4');
INSERT INTO `ums_role_menu_relation` VALUES ('5', '1', '5');

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
INSERT INTO `ums_resource` VALUES ('8', '2020-08-24 13:44:37', '创建设备类型', '/equ-type/create', '', '3');
INSERT INTO `ums_resource` VALUES ('9', '2020-08-24 13:44:37', '删除设备类型', '/equ-type/delete/**', '', '3');
INSERT INTO `ums_resource` VALUES ('10', '2020-08-24 13:44:37', '根据名称分页获取设备类型列表', '/equ-type/list', '', '3');
INSERT INTO `ums_resource` VALUES ('11', '2020-08-24 13:44:37', '修改设备类型', '/equ-type/update/**', '', '3');

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
INSERT INTO `ums_resource_category` VALUES ('3', '2020-02-07 16:35:49', '设备类型', '0');
INSERT INTO `ums_resource_category` VALUES ('4', '2020-02-07 16:35:49', '设备档案', '0');
INSERT INTO `ums_resource_category` VALUES ('5', '2020-02-07 16:35:49', '设备维护计划', '0');
INSERT INTO `ums_resource_category` VALUES ('6', '2020-02-07 16:35:49', '设备维护任务', '0');
INSERT INTO `ums_resource_category` VALUES ('7', '2020-02-07 16:35:49', '设备维护问题', '0');
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
INSERT INTO `ums_role_resource_relation` VALUES ('1', '1', '1');
INSERT INTO `ums_role_resource_relation` VALUES ('2', '1', '2');
INSERT INTO `ums_role_resource_relation` VALUES ('3', '1', '3');
INSERT INTO `ums_role_resource_relation` VALUES ('4', '1', '4');
INSERT INTO `ums_role_resource_relation` VALUES ('5', '1', '5');
INSERT INTO `ums_role_resource_relation` VALUES ('6', '1', '6');
INSERT INTO `ums_role_resource_relation` VALUES ('7', '1', '7');

-- ----------------------------
-- Table structure for ems_type
-- ----------------------------
DROP TABLE IF EXISTS `ems_type`;
CREATE TABLE `ems_type` (
                            `ID` INT NOT NULL AUTO_INCREMENT COMMENT 'ID',
                            `NAME` VARCHAR(50) NOT NULL DEFAULT '',
                            `CODE` INT NOT NULL,
                            PRIMARY KEY (`ID`)
)COLLATE='utf8_general_ci'
 ENGINE=InnoDB
 AUTO_INCREMENT=8

COMMENT='设备类型';

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
                                 `MATERIAL` NVARCHAR(128) NULL DEFAULT NULL COMMENT '材料',
                                 `PLACEMENT` NVARCHAR(500) NULL DEFAULT NULL COMMENT '安装位置',
                                 `WEIGHT` DECIMAL(32,10) NULL DEFAULT NULL COMMENT '重量',
                                 `BIM_MODEL_CODE` VARCHAR(32) NOT NULL COMMENT 'BIMGUID',
                                 `MODEL_POSITION` VARCHAR(32) NULL DEFAULT NULL COMMENT 'BIM设备位置',
                                 `INSTALL_TIME` DATE NULL  DEFAULT NULL COMMENT '安装日期',
                                 `SCRAP_DATE` DATE NULL  DEFAULT NULL COMMENT '报废日期',
                                 `LIFE_USEFUL` INT NULL  DEFAULT NULL COMMENT '使用年限',
                                 `MONTHS_USED`  INT NULL DEFAULT NULL COMMENT '已用月份',
                                 `REPAIR_TIMES` INT NULL DEFAULT NULL COMMENT '维修次数',
                                 `MAINTAIN_TIMES` INT NULL DEFAULT NULL COMMENT '保养次数',
                                 `ORIGINAL_PRICE` INT NULL DEFAULT NULL COMMENT '设备原值',
                                 `OLD_PRICE` INT NULL DEFAULT NULL COMMENT '已提旧职',
                                 `EQUITY` INT NULL DEFAULT NULL COMMENT '设备净值',
                                 `REPAIR_ORGANIZATION` NVARCHAR(128) NULL DEFAULT NULL COMMENT '维保单位',
                                 `REPAIR_TEL` VARCHAR(50) NULL DEFAULT NULL COMMENT '维保电话',
                                 `REPAIR_ADDRESS` NVARCHAR(200) NULL DEFAULT NULL COMMENT '维保单位地址',
                                 `REPAIR_BY` INT NULL DEFAULT NULL COMMENT '设备保养人',
                                 `MANUFACTURER` NVARCHAR(100) NULL DEFAULT NULL COMMENT '生产厂家',
                                 `MANUFACTURER_ADDRESS` NVARCHAR(200) NULL DEFAULT NULL COMMENT '厂家地址',
                                 `REPAIR_STANDARD` TEXT NULL DEFAULT NULL COMMENT '标准',
                                 `CREATED_BY` VARCHAR(32) NULL DEFAULT NULL COMMENT '创建人',
                                 `CREATED_TIME` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
                                 `UPDATED_BY` VARCHAR(32) NULL DEFAULT NULL COMMENT '更新人',
                                 `UPDATED_TIME` DATETIME NULL DEFAULT NULL COMMENT '更新时间',
                                 PRIMARY KEY (`ID`)
)
    COMMENT='设备'
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
COMMENT = '设备保养维护任务计划 ';

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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '设备保养维护任务计划列表 ';

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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '设备保养维护任务';


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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '保养巡检问题 ';

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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '巡更点';

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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '巡更路线 ';

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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '巡更计划 ';

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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '巡更计划子项 ';


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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '巡更任务 ';

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
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=8
    COMMENT = '巡更问题 ';
