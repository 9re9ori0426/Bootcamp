-- 실행 : ctrl + enter (커서 위치 실행 문장에)

-- row, 행, record, 데이터 1개 data obj
-- column, 열, field,

-------
-- DBA : 서버 전원관리, 백업/복구, 계정 관리
-- DBP : CRUD <= 목표
-------
-- SQL : db와 소통하는 언어

create table student2
(
    s_name varchar2(20 char) primary key,
    s_age  number(2) not null,
    s_kor  number(3) not null,
    s_eng  number(3) not null,
    s_jp   number(3) not null
);

-- 조회
select * from student2;

-- 생성/추가/삽입
insert into student values ('mz', 20, 90, 80,70);

-- insert into STUDEnT(s_name, s_eng) values ('bo', 25);

insert into student2 values ('mz', 20, 90, 80,70);
insert into student2 values ('mz', 20, 90, 80,70);

select * from STUDENT;

UPdate STUDENT
set S_AGE = 22
WHERE S_NAME = 'mz';

-- 데이터 삭제
delete STUDENT Where S_NAME = 'bo';

commit


