DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
		id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
		roleName VARCHAR(255) default '' comment 'roleName',
		role VARCHAR(255) default '' comment 'role',
		isLock VARCHAR  comment 'isLock'
);