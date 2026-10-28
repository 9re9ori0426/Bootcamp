-- 테이블 관계를 중심으로 뭔가를 만들기 위해 RDB

-- 강남 맥도날드 1호점 빅맥 8000원
-- 강남 맥도날드 2호점 빅맥 8000원
-- 종로 3가 맥도날드 2호점 1955 9500원
-- 종각 맥도날드 2호점 1955 9500원
-- 역삼동 스타벅스 1호점 카페라떼 4000원
-- 대학로 스타벅스 6000원 돌체라떼

CREATE TABLE MENU
(
    M_NO    number(3) primary key,
    M_NAME  varchar2(20 char) not null,
    M_PRICE number(6)         not null,
    M_PLACE number(3)         not null
);

DROP TABLE MENU;

CREATE TABLE restaurant
(
    r_no    number(3) primary key,
    r_name  varchar2(30 char) not null,
    r_place varchar2(20 char) not null
);

create sequence menu_seq increment by 1 start with 1;
create sequence restaurant_seq increment by 1 start with 1;

select *
from menu;
select *
from restaurant;


insert into menu
values (menu_seq.nextval, '돼지곱창', 10000, 1);
insert into menu
values (menu_seq.nextval, '소곱창', 15000, 1);
insert into menu
values (menu_seq.nextval, '야채곱창', 9000, 2);
insert into menu
values (menu_seq.nextval, '카페라떼', 6000, 3);
insert into menu
values (menu_seq.nextval, '아메리카노', 4000, 3);
insert into menu
values (menu_seq.nextval, '돌체라떼', 7000, 4);

insert into RESTAURANT
values (RESTAURANT_seq.nextval, '황소곱창', '종로');
insert into RESTAURANT
values (RESTAURANT_seq.nextval, '동대문곱창', '동대문');
insert into RESTAURANT
values (RESTAURANT_seq.nextval, '황소곱창', '동대문');
insert into RESTAURANT
values (RESTAURANT_seq.nextval, '스타벅스', '종로');
insert into RESTAURANT
values (RESTAURANT_seq.nextval, '스타벅스', '강남');

insert into RESTAURANT
values (500, '스타벅스', '광화문');

insert into MENU
values (menu_seq.nextval, '체리블로썸', 2000, 500);
insert into MENU
values (menu_seq.nextval, '딸기스무디', 1000, 2);

select *
from RESTAURANT;
select *
from MENU;

UPDATE MENU
SET M_PLACE = 4
where M_NO = 8;

Delete MENU
where M_NO = 7;

SELECT r_place, r_name, M_NAME, M_Price
FROM RESTAURANT,
     MENU
WHERE R_NO = M_PLACE;


-- 딴거
create table human
(
    h_no    number(2) primary key,
    h_name  varchar2(20 char) not null,
    h_birth date              not null
);

create table owner
(
    o_no         number(2) primary key,
    o_ceo        number(2) not null,
    o_restaurant number(3) not null
);

drop sequence HUMAN_SEQ;
drop sequence OWNER_SEQ;

create sequence human_seq increment by 1 start with 1;
create sequence owner_seq increment by 1 start with 1;

insert into HUMAN
values (human_seq.nextval, '김', to_date('1980-05-05', 'YYYY-MM-DD'));
insert into HUMAN
values (human_seq.nextval, '나', to_date('1985-06-05', 'YYYY-MM-DD'));
insert into HUMAN
values (human_seq.nextval, '박', to_date('1980-07-05', 'YYYY-MM-DD'));
insert into HUMAN
values (human_seq.nextval, '이', to_date('1985-08-05', 'YYYY-MM-DD'));
insert into HUMAN
values (20, '최', to_date('1985-08-05', 'YYYY-MM-DD'));


insert into owner
values (OWNER_seq.nextval, 1, 1);
insert into owner
values (OWNER_seq.nextval, 2, 2);
insert into owner
values (OWNER_seq.nextval, 3, 3);
insert into owner
values (OWNER_seq.nextval, 4, 4);
insert into owner
values (OWNER_seq.nextval, 20, 4);

truncate table HUMAN;

SELECT *
FROM HUMAN;
SELECT *
FROM OWNER;

SELECT *
FROM MENU
WHERE M_PRICE = (SELECT MAX(M_PRICE) fROM MENU);

SELECT *
FROM HUMAN
WHERE h_birth = (SELECT MIN(h_birth) fROM HUMAN);


SELECT AVG(M_PRICE)
FROM MENU
WHERE M_NAME LIKE '%곱창';


SELECT *
FROM RESTAURANT
WHERE r_place LIKE '%종로%';


SELECT H_NO, h_name, R_NO, R_NAME, r_place
FROM HUMAN,
     OWNER,
     RESTAURANT
WHERE o_ceo = h_no
  AND o_restaurant = R_NO;

select m_name, M_PRICE
from MENU,
     RESTAURANT
where M_PLACE = r_no
  and r_place = '동대문';


select r_name, r_place
from RESTAURANT
where r_no in (select M_PLACE
               From MENU
               where m_name like '%곱창');

select distinct r_name, r_place
from RESTAURANT,
     menu
where r_no = M_PLACE
  and m_name like '%곱창';

select r_name, r_place
from RESTAURANT
where r_no in (select m_place
               from menu
               where M_Price = (select MIN(M_PRICE)
                                from menu
                                where m_name LIKE '%커피'));
-- 명확한 해결이 불가능 (설게 부터 잘못되었음ㅅㄱ)
-- m_type을 쓰시던지~~

------------------------
-- join
SELECT M_NAME, M_Price, R_name, r_place
FROM RESTAURANT
         inner join MENU
                    on M_PLACE = R_NO;

SELECT M_NAME, M_Price, R_name, r_place
FROM RESTAURANT,
     MENU
WHERE M_PLACE = R_NO;

-- 스타벅스 종로지점의 메뉴 이름과 가격, 레스토랑 정보
SELECT M_NAME, M_Price, R_NO, R_name, r_place
FROM RESTAURANT,
     MENU
WHERE M_PLACE = R_NO
  and r_name = '스타벅스'
  and r_place LIKE '종로%';

SELECT M_NAME, M_Price, restaurant.*
FROM RESTAURANT,
     MENU
WHERE M_PLACE = R_NO
  and r_name = '스타벅스'
  and r_place LIKE '종로%';

select m_name, m_price, r_no, r_name, r_place
from menu,
     restaurant
where m_place = (select r_no
                 from restaurant
                 where r_name = '스타벅스'
                   and r_place = '종로');

select m_name, m_price, r_no, r_name, r_place
from menu,
     restaurant
where m_place = r_no
  and m_place = (select r_no
                 from restaurant
                 where r_name = '스타벅스'
                   and r_place = '종로');

-- owner, human
select r_name, r_place, h_name, h_birth, M_NAME, M_PRICE
from RESTAURANT,
     Human,
     Menu,
     Owner
where r_no = M_PLACE
  and h_no = o_ceo
  and o_restaurant = r_no
  and h_birth = (select max(h_birth) from human)
order by h_name;

select M_NAME, M_PRICE
from RESTAURANT,
     Human,
     Menu,
     Owner
where r_no = M_PLACE
  and h_no = o_ceo
  and o_restaurant = r_no
  and h_birth = (select min(h_birth) from human)
order by h_name;

select m_name, M_PRICE
from MENU
where M_PLACE = (select o_restaurant
                 from OWNER
                 where o_ceo = (select h_no
                                from HUMAN
                                where h_birth = (select min(h_birth)
                                                 from human)));

select R_NAME, R_PLACE
FROM RESTAURANT
WHERE r_no IN ( select M_PLACE from menu where m_name like '%곱창' );

SELECT DISTINCT R_NAME, R_PLACE
FROM RESTAURANT, MENU
WHERE R_NO = M_PLACE AND M_NAME LIKE '%곱창%';

-- alter table MENU add constraint constraintMtoR foreign key (M_Place) references RESTAURANT(R_NO);
