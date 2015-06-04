DROP VIEW IF EXISTS v_library/
DROP VIEW IF EXISTS v_author/
DROP VIEW IF EXISTS v_book/

DROP TABLE IF EXISTS t_dates/
DROP TABLE IF EXISTS t_book_to_book_store/
DROP TABLE IF EXISTS t_book_store/
DROP TABLE IF EXISTS t_book/
DROP TABLE IF EXISTS t_book_details/
DROP TABLE IF EXISTS t_author/
DROP TABLE IF EXISTS t_language/
DROP TABLE IF EXISTS x_test_case_2025/
DROP TABLE IF EXISTS x_test_case_71/
DROP TABLE IF EXISTS x_test_case_64_69/
DROP TABLE IF EXISTS x_test_case_85/
DROP TABLE IF EXISTS t_986_1/
DROP TABLE IF EXISTS t_986_2/
DROP TABLE IF EXISTS x_unused/
DROP TABLE IF EXISTS t_639_numbers_table/
DROP TABLE IF EXISTS t_785/
DROP TABLE IF EXISTS t_959/
DROP TABLE IF EXISTS t_unsigned/
DROP TABLE IF EXISTS t_booleans/
DROP TABLE IF EXISTS t_identity/
DROP TABLE IF EXISTS t_identity_pk/
DROP TABLE IF EXISTS t_3111/

CREATE TABLE t_3111 (
  id int,
  inverse int,
  bool1 boolean,
  bool2 boolean,

  CONSTRAINT pk_t_3111 PRIMARY KEY (id)
)
/

CREATE TABLE t_identity_pk (
  id int identity(1, 1) not null,
  val int,

  CONSTRAINT pk_t_identity_pk PRIMARY KEY (id)
)
/

CREATE TABLE t_identity (
  id int identity(1, 1) not null,
  val int
)
/

CREATE TABLE t_dates (
  id int,
  d date,
  t timestamp,
  ts timestamp,
  d_int int,
  ts_bigint bigint,

  CONSTRAINT pk_t_dates PRIMARY KEY (id)
)
/

CREATE TABLE t_booleans (
  id int,
  one_zero int,
  true_false_lc varchar(5),
  true_false_uc varchar(5),
  yes_no_lc varchar(3),
  yes_no_uc varchar(3),
  y_n_lc char(1),
  y_n_uc char(1),
  vc_boolean varchar(1),
  c_boolean char(1),
  n_boolean int,

  CONSTRAINT pk_t_booleans PRIMARY KEY (id)
)
/

CREATE TABLE t_unsigned (
  u_byte smallint,
  u_short int,
  u_int bigint,
  u_long decimal(20)
)
/

CREATE TABLE t_language (
  cd CHAR(2) NOT NULL,
  description VARCHAR(50),
  description_english VARCHAR(50),
  id INTEGER NOT NULL,

  CONSTRAINT pk_t_language PRIMARY KEY (ID)
)
/
COMMENT ON TABLE t_language IS 'An entity holding language master data'
/
COMMENT ON COLUMN t_language.id IS 'The language ID'
/
COMMENT ON COLUMN t_language.cd IS 'The language ISO code'
/
COMMENT ON COLUMN t_language.description IS 'The language description'
/


CREATE TABLE t_785 (
  ID int,
  NAME varchar(50),
  VALUE varchar(50)
)
/

CREATE TABLE t_author (
  id INTEGER NOT NULL,
  first_name VARCHAR(50),
  last_name VARCHAR(50) NOT NULL,
  date_of_birth DATE,
  year_of_birth INTEGER,
  address VARCHAR(50),

  CONSTRAINT pk_t_author PRIMARY KEY (ID)
)
/

CREATE TABLE t_book_details (
  ID INT,

  CONSTRAINT pk_t_book_details PRIMARY KEY (ID)
)
/

CREATE TABLE t_book (
  id INTEGER NOT NULL,
  author_id INTEGER NOT NULL,
  co_author_id INTEGER,
  details_id INT,
  title VARCHAR(400) NOT NULL,
  published_in INTEGER NOT NULL,
  language_id INTEGER NOT NULL DEFAULT 1,
  content_text VARCHAR(1000),
  content_pdf VARCHAR(1000),

  CONSTRAINT pk_t_book PRIMARY KEY (ID),
  CONSTRAINT fk_t_book_author_id FOREIGN KEY (AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  CONSTRAINT fk_t_book_co_author_id FOREIGN KEY (CO_AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  CONSTRAINT fk_t_book_details_id FOREIGN KEY (DETAILS_ID) REFERENCES T_BOOK_DETAILS(ID),
  CONSTRAINT fk_t_book_language_id FOREIGN KEY (LANGUAGE_ID) REFERENCES T_LANGUAGE(ID)
)
/


CREATE TABLE t_book_store (
  name VARCHAR(400) NOT NULL,

  CONSTRAINT uk_t_book_store_name PRIMARY KEY(name)
)
/


CREATE TABLE t_book_to_book_store (
  book_store_name VARCHAR(400) NOT NULL,
  book_id INTEGER NOT NULL,
  stock INTEGER,

  CONSTRAINT pk_b2bs PRIMARY KEY(book_store_name, book_id),
  CONSTRAINT fk_b2bs_bs_name FOREIGN KEY (book_store_name)
                             REFERENCES t_book_store (name),
  CONSTRAINT fk_b2bs_b_id    FOREIGN KEY (book_id)
                             REFERENCES t_book (id)
)
/


CREATE TABLE x_unused (
  id INTEGER NOT NULL,
  name VARCHAR(10) NOT NULL,
  BIG_INTEGER DECIMAL(25),
  id_ref INTEGER,
  CLASS INT,
  FIELDS INT,
  CONFIGURATION INT,
  U_D_T INT,
  META_DATA INT,
  VALUES INT,
  TYPE0 INT,
  PRIMARY_KEY INT,
  PRIMARYKEY INT,
  name_ref VARCHAR(10),
  "FIELD 737" DECIMAL(25, 2),

  CONSTRAINT pk_x_unused PRIMARY KEY(ID, NAME),
  CONSTRAINT uk_x_unused_id UNIQUE(ID),
  CONSTRAINT fk_x_unused_self FOREIGN KEY(ID_REF, NAME_REF) REFERENCES X_UNUSED(ID, NAME)
)
/

CREATE TABLE t_986_1 (
  REF INT,

  CONSTRAINT fk_986 FOREIGN KEY(REF) REFERENCES X_UNUSED(ID)
)
/

CREATE TABLE t_986_2 (
  REF INT,

  CONSTRAINT fk_986 FOREIGN KEY(REF) REFERENCES X_UNUSED(ID)
)
/

CREATE TABLE t_639_numbers_table (
  ID INT NOT NULL,
  SHORT SMALLINT,
  INTEGER INT,
  LONG BIGINT,
  BYTE_DECIMAL DECIMAL(2, 0),
  SHORT_DECIMAL DECIMAL(4, 0),
  INTEGER_DECIMAL DECIMAL(9, 0),
  LONG_DECIMAL DECIMAL(18, 0),
  BIG_INTEGER DECIMAL(22, 0),
  BIG_DECIMAL DECIMAL(22, 5),
  FLOAT REAL,
  DOUBLE DOUBLE PRECISION,

  CONSTRAINT pk_t_639_numbers_table PRIMARY KEY(ID)
);
/


CREATE TABLE x_test_case_64_69 (
  id INTEGER NOT NULL,
  unused_id INTEGER,

  CONSTRAINT pk_x_test_case_64_69 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_64_69a FOREIGN KEY(UNUSED_ID) REFERENCES X_UNUSED(ID),
  CONSTRAINT fk_x_test_case_64_69b FOREIGN KEY(UNUSED_ID) REFERENCES X_UNUSED(ID)
)
/

CREATE TABLE x_test_case_71 (
  id INTEGER NOT NULL,
  test_case_64_69_id SMALLINT,

  CONSTRAINT pk_x_test_case_71 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_71 FOREIGN KEY(TEST_CASE_64_69_ID) REFERENCES X_TEST_CASE_64_69(ID)
)
/

CREATE TABLE x_test_case_85 (
  id INTEGER NOT NULL,
  x_unused_id INTEGER,
  x_unused_name VARCHAR(10),

  CONSTRAINT pk_x_test_case_85 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_85 FOREIGN KEY(x_unused_id, x_unused_name) REFERENCES X_UNUSED(id, name)
)
/

CREATE TABLE x_test_case_2025 (
  ref_id INTEGER NOT NULL,
  ref_name VARCHAR(10) NOT NULL,

  CONSTRAINT fk_x_test_case_2025_1 FOREIGN KEY(ref_id) REFERENCES x_test_case_85(ID),
  CONSTRAINT fk_x_test_case_2025_2 FOREIGN KEY(ref_id) REFERENCES x_test_case_71(ID),
  CONSTRAINT fk_x_test_case_2025_3 FOREIGN KEY(ref_id, ref_name) REFERENCES X_UNUSED(id, name)
)
/

CREATE OR REPLACE VIEW v_library (author, title) AS
SELECT a.first_name || ' ' || a.last_name, b.title
FROM t_author a JOIN t_book b ON b.author_id = a.id
/

CREATE VIEW v_author AS
SELECT * FROM t_author
/

CREATE VIEW v_book AS
SELECT * FROM t_book
/