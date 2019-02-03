SET names utf8;
SET foreign_key_checks = 0;

DROP database IF EXISTS ChatService;
CREATE database IF NOT EXISTS ChatService;
use ChatService;



/*
 *		UserTable
 *
 *		ユーザー情報
 *
 */
DROP TABLE IF EXISTS userTable;
CREATE TABLE userTable(
	id INT NOT NULL PRIMARY KEY auto_increment,
	loginId VARCHAR(255) NOT NULL,
	password VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	name VARCHAR(255) NOT NULL,
	validFlg TINYINT NOT NULL DEFAULT 1,
	admin TINYINT NOT NULL DEFAULT 0,
	authFlg TINYINT NOT NULL DEFAULT 0
);
