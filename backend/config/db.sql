-- 1. 创建数据库（注意字符集）
CREATE DATABASE ai_note CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 2. 创建用户并授权（如果需要）
CREATE USER 'root'@'%' IDENTIFIED BY 'Aurum42775237';
GRANT ALL PRIVILEGES ON ai_note.* TO 'root'@'%';
FLUSH PRIVILEGES;
