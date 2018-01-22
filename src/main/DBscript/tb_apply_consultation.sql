CREATE TABLE tb_apply_consultation
(
  ID                      BIGINT       NOT NULL AUTO_INCREMENT
    PRIMARY KEY,
  BUSSINESS_ID            VARCHAR(100) NULL,
  APPLY_DOCTOR            VARCHAR(200) NULL,
  APPLY_HOSPITAL          VARCHAR(300) NULL,
  APPLY_HOSPITAL_LOCATION VARCHAR(300) NULL,
  APPLY_TIME              DATETIME     NULL,
  CONSULT_WAY             VARCHAR(5)   NULL,
  CONSULT_DOCTOR          VARCHAR(100) NULL,
  CONSULT_HOSPITAL        VARCHAR(300) NULL,
  CONSULT_END_TIME        DATETIME     NULL,
  DCM_TRANS_WAY           VARCHAR(20)  NULL,
  HANDLE_PROCESS          VARCHAR(20)  NULL,
  OP_TIME                 DATETIME     NULL
);

COMMENT ON TABLE tb_apply_consultation IS '辅助诊断'
;

COMMENT ON COLUMN tb_apply_consultation.ID IS '主键ID'
;

COMMENT ON COLUMN tb_apply_consultation.BUSSINESS_ID IS '远程辅助诊断业务ID'
;

COMMENT ON COLUMN tb_apply_consultation.APPLY_DOCTOR IS '发请求医生'
;

COMMENT ON COLUMN tb_apply_consultation.APPLY_HOSPITAL IS '发请求的医院'
;

COMMENT ON COLUMN tb_apply_consultation.APPLY_TIME IS '发请求的时间'
;

COMMENT ON COLUMN tb_apply_consultation.CONSULT_WAY IS '会诊方式： 1.自主阅片  2.AI辅助  3.专家会诊'
;

COMMENT ON COLUMN tb_apply_consultation.CONSULT_DOCTOR IS '诊断医生'
;

COMMENT ON COLUMN tb_apply_consultation.CONSULT_HOSPITAL IS '诊断医院'
;

COMMENT ON COLUMN tb_apply_consultation.CONSULT_END_TIME IS '诊断结束时间'
;

COMMENT ON COLUMN tb_apply_consultation.DCM_TRANS_WAY IS '影像的下载和传输方式（HTTP,FTP等）'
;

COMMENT ON COLUMN tb_apply_consultation.HANDLE_PROCESS IS '申请处理进度：1，请求诊断中 2诊断完成'
;

COMMENT ON COLUMN tb_apply_consultation.OP_TIME IS '操作时间'
;

