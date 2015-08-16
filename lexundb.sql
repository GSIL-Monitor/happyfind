/*
Navicat MySQL Data Transfer

Source Server         : happyfind
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-08-16 10:31:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for borrow_information
-- ----------------------------
DROP TABLE IF EXISTS `borrow_information`;
CREATE TABLE `borrow_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '借贷信息表',
  `name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `id_card` varchar(45) DEFAULT NULL COMMENT '身份证',
  `status` varchar(45) DEFAULT NULL COMMENT '状态\n',
  `source` varchar(200) DEFAULT NULL COMMENT '来源',
  `modtime` varchar(255) DEFAULT NULL COMMENT '录入时间·',
  `moduser` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for register_company
-- ----------------------------
DROP TABLE IF EXISTS `register_company`;
CREATE TABLE `register_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '企业注册信息表',
  `company_name` varchar(45) NOT NULL COMMENT '注册公司名称',
  `contact_name` varchar(45) DEFAULT NULL COMMENT '联系人姓名',
  `phone_number` int(11) NOT NULL COMMENT '联系人电话',
  `other_number` int(11) DEFAULT NULL COMMENT '联系人其他号码',
  `email` varchar(45) DEFAULT NULL COMMENT '联系人邮箱',
  `register_time` datetime DEFAULT NULL COMMENT '注册时间',
  `modtime` varchar(255) DEFAULT NULL COMMENT '录入时间·',
  `moduser` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for release_information
-- ----------------------------
DROP TABLE IF EXISTS `release_information`;
CREATE TABLE `release_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '举报信息表',
  `name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `id_card` varchar(45) DEFAULT NULL COMMENT '身份证',
  `release_type` varchar(45) DEFAULT NULL COMMENT '举报类型',
  `loan_amount` double DEFAULT NULL COMMENT '贷款金额',
  `debt_amount` varchar(45) DEFAULT NULL COMMENT '欠款金额',
  `loan_institutions` varchar(45) DEFAULT NULL COMMENT '贷款机构',
  `release_time` datetime DEFAULT NULL COMMENT '举报时间',
  `contact_number1` varchar(45) DEFAULT NULL,
  `contact_number2` varchar(45) DEFAULT NULL,
  `contact_number3` varchar(45) DEFAULT NULL,
  `loan_time` datetime DEFAULT NULL COMMENT '贷款时间',
  `loan_timelimit` varchar(20) DEFAULT NULL COMMENT '贷款期限',
  `type` varchar(45) DEFAULT NULL COMMENT '个人举报和机构举报',
  `select_amount` varchar(45) DEFAULT NULL COMMENT '查询价格',
  `is_reward` varchar(45) DEFAULT NULL COMMENT '是否悬赏',
  `overdue_time` varchar(45) DEFAULT NULL COMMENT '逾期日期',
  `modtime` varchar(255) DEFAULT NULL COMMENT '录入时间·',
  `moduser` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
 

-- ----------------------------
-- Table structure for reward_information
-- ----------------------------
DROP TABLE IF EXISTS `reward_information`;
CREATE TABLE `reward_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '悬赏信息表',
  `name` varchar(45) DEFAULT NULL COMMENT '姓名',
  `id_card` varchar(45) DEFAULT NULL COMMENT '身份证',
  `loan_time` datetime DEFAULT NULL COMMENT '贷款时间',
  `loan_mount` double DEFAULT NULL COMMENT '贷款金额',
  `release_time` datetime DEFAULT NULL COMMENT '发布日期',
  `reward_amount` double DEFAULT NULL COMMENT '悬赏金额',
  `type` varchar(45) DEFAULT NULL COMMENT '分为个人和机构\n',
  `modtime` varchar(255) DEFAULT NULL COMMENT '录入时间·',
  `moduser` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
 

-- ----------------------------
-- Table structure for reward_information
-- ----------------------------
DROP TABLE IF EXISTS `getreward_information`;
CREATE TABLE `getreward_information` (
  `id` int(11) NOT NULL  COMMENT '领赏信息表',
  `contact_number1` varchar(45) NOT NULL,
  `contact_number2` varchar(45) DEFAULT NULL,
  `contact_number3` varchar(45) DEFAULT NULL,
  `modtime` varchar(255) DEFAULT NULL COMMENT '录入时间·',
  `moduser` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for select_record_company
-- ----------------------------
DROP TABLE IF EXISTS `select_record_company`;
CREATE TABLE `select_record_company` (
  `serial_number` int(11) NOT NULL COMMENT '企业查询记录表',
  `datetime` datetime DEFAULT NULL,
  `select_company` varchar(45) DEFAULT NULL,
  `select_reason` varchar(45) DEFAULT NULL COMMENT '机构查询记录',
  PRIMARY KEY (`serial_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for select_record_person
-- ----------------------------
DROP TABLE IF EXISTS `select_record_person`;
CREATE TABLE `select_record_person` (
  `serial_number` int(11) NOT NULL COMMENT '个人查询记录表',
  `datetime` datetime DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `ip` varchar(45) DEFAULT NULL COMMENT '个人查询记录',
  PRIMARY KEY (`serial_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for supremecourt_broken_promises
-- ----------------------------
DROP TABLE IF EXISTS `supremecourt_broken_promises`;
CREATE TABLE `supremecourt_broken_promises` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '最高法院失信信息表',
  `name` varchar(45) DEFAULT NULL,
  `record_time` datetime DEFAULT NULL,
  `record_number` varchar(45) DEFAULT NULL COMMENT '最高法院失信信息',
  `release_time` datetime DEFAULT NULL,
  `perform_court` varchar(45) DEFAULT NULL,
  `province` varchar(45) DEFAULT NULL,
  `obligation` varchar(45) DEFAULT NULL,
  `perform_situation` varchar(45) DEFAULT NULL,
  `perform_situation_detail` varchar(45) DEFAULT NULL,
  `modtime` varchar(255) DEFAULT NULL COMMENT '录入时间·',
  `moduser` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for supremecourt_perform
-- ----------------------------
DROP TABLE IF EXISTS `supremecourt_perform`;
CREATE TABLE `supremecourt_perform` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '最高法院执行信息表',
  `name` varchar(45) DEFAULT NULL,
  `record_time` datetime DEFAULT NULL,
  `record_number` varchar(45) DEFAULT NULL COMMENT '最高法院执行信息',
  `release_time` datetime DEFAULT NULL,
  `perform_court` varchar(45) DEFAULT NULL,
  `province` varchar(45) DEFAULT NULL,
  `obligation` varchar(200) DEFAULT NULL,
  `perform_situation` varchar(200) DEFAULT NULL,
  `modtime` varchar(255) DEFAULT NULL COMMENT '录入时间·',
  `moduser` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for system_log
-- ----------------------------
DROP TABLE IF EXISTS `system_log`;
CREATE TABLE `system_log` (
  `dateTime` varchar(255) DEFAULT NULL,
  `logType` int(11) DEFAULT NULL,
  `logUser` varchar(255) DEFAULT NULL,
  `logcotent` varchar(255) DEFAULT NULL,
  `logkey` varchar(255) DEFAULT NULL,
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`logid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL COMMENT '用户信息表',
  `username` varchar(45) DEFAULT NULL,
  `id_card` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `work_company` varchar(45) DEFAULT NULL COMMENT '工作单位',
  `job` varchar(45) DEFAULT NULL COMMENT '职位',
  `account_amount` double DEFAULT NULL COMMENT '账户余额',
  `bank_number` varchar(45) DEFAULT NULL COMMENT '银行卡号',
  `bank_name` varchar(45) DEFAULT NULL,
  `open_bank` varchar(45) DEFAULT NULL COMMENT '开户银行',
  `province` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
