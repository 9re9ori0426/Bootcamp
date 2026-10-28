CREATE TABLE BMI_TEST (
    B_NO number(2) primary key,
    B_NAME varchar2( 10 char ) not null,
    B_WEIGHT number(3, 1) not null,
    B_HEIGHT number(4, 1) not null,
    B_BMI number(3, 1) not null,
    B_STATUS varchar2( 10 char) not null
);


CREATE SEQUENCE BMI_TEST_SEQ;

SELECT * FROM BMI_TEST;

TRUNCATE TABLE BMI_TEST;

alter TABLE BMI_TEST modify B_WEIGHT number(4, 1);
