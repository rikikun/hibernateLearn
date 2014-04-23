-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- โฮสต์: localhost
-- เวลาในการสร้าง: 
-- รุ่นของเซิร์ฟเวอร์: 5.0.51
-- รุ่นของ PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- ฐานข้อมูล: `jsptest`
-- 

-- --------------------------------------------------------

-- 
-- โครงสร้างตาราง `department`
-- 

CREATE TABLE `department` (
  `DEPARTMENT_ID` int(11) NOT NULL auto_increment,
  `DEPT_NAME` varchar(255) default NULL,
  PRIMARY KEY  (`DEPARTMENT_ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

-- 
-- dump ตาราง `department`
-- 

INSERT INTO `department` VALUES (1, 'Programmer');
INSERT INTO `department` VALUES (2, 'Account');
INSERT INTO `department` VALUES (3, 'Sales');
INSERT INTO `department` VALUES (4, 'Programmer');
INSERT INTO `department` VALUES (5, 'Sales');
INSERT INTO `department` VALUES (6, 'Sales');

-- --------------------------------------------------------

-- 
-- โครงสร้างตาราง `employee`
-- 

CREATE TABLE `employee` (
  `id` int(11) NOT NULL auto_increment,
  `first_name` varchar(255) default NULL,
  `last_name` varchar(255) default NULL,
  `salary` int(11) default NULL,
  `department_id` int(11) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_hr5ovw667hkx0jl5cmyo66wb8` (`department_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

-- 
-- dump ตาราง `employee`
-- 

INSERT INTO `employee` VALUES (1, 'fff', 'ddd', 33333, 1);
INSERT INTO `employee` VALUES (2, 'Thanakorn', 'Thanprasit', 150000, 4);
INSERT INTO `employee` VALUES (3, 'ererer', '1qerwer', 112121212, 5);
INSERT INTO `employee` VALUES (4, 'thakkk', 'kkkaht', 18828, 6);
