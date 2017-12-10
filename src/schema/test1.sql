CREATE TABLE student(
   id bigint unsigned NOT NULL auto_increment,
   name VARCHAR(64) NOT NULL,
   age INTEGER unsigned NOT NULL,
   major INTEGER unsigned NOT NULL,
   create_time datetime NOT NULL,
   PRIMARY KEY (id),
   KEY idx_major(major)
);