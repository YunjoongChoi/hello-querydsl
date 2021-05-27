CREATE TABLE BOARD (id BIGINT AUTO_INCREMENT
                    , title VARCHAR
                    , content CLOB
                    , writer VARCHAR
                    , article_Type VARCHAR
                    , regist_Date_Time TIMESTAMP
                    , update_Date_Time TIMESTAMP
                    , PRIMARY KEY (id));