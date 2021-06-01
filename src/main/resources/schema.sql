CREATE TABLE BOARD (id BIGINT AUTO_INCREMENT
                    , title VARCHAR
                    , content CLOB
                    , writer VARCHAR
                    , article_Type VARCHAR
                    , regist_Date_Time TIMESTAMP
                    , update_Date_Time TIMESTAMP
                    , user_idx BIGINT
                    , PRIMARY KEY (id));

CREATE TABLE USER (user_idx BIGINT AUTO_INCREMENT
                    , user_Id VARCHAR
                    , nickname VARCHAR
                    , regist_Date_Time TIMESTAMP
                    , update_Date_Time TIMESTAMP
                    , PRIMARY KEY (USER_IDX));

CREATE TABLE BOARD_COMMENT (board_Comment_Idx BIGINT AUTO_INCREMENT
                            , board_idx BIGINT
                            , user_idx BIGINT
                            , content VARCHAR
                            , regist_Date_Time TIMESTAMP
                            , update_Date_Time TIMESTAMP
                            , PRIMARY KEY (board_Comment_Idx));