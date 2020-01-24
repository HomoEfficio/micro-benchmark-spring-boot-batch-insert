drop database if exists `batch_insert`;
create database `batch_insert`;
use `batch_insert`;
drop table if exists `item_jdbc`;
create table `item_jdbc` (`id` bigint not null auto_increment, `name` varchar(255), `description` varchar(255), primary key (id)) engine=InnoDB;
