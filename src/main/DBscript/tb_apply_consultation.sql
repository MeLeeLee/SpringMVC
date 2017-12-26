create table tb_apply_consultation
(
  ID bigint not null auto_increment
    primary key,
  BUSSINESS_ID varchar(100) null,
  APPLY_DOCTOR varchar(200) null,
  APPLY_HOSPITAL varchar(300) null,
  APPLY_HOSPITAL_LOCATION varchar(300) null,
  APPLY_TIME datetime null,
  CONSULT_WAY varchar(5) null,
  CONSULT_DOCTOR varchar(100) null,
  CONSULT_HOSPITAL varchar(300) null,
  CONSULT_END_TIME datetime null,
  DCM_TRANS_WAY varchar(20) null,
  HANDLE_PROCESS varchar(20) null,
  OP_TIME datetime null
)
;

comment on table tb_apply_consultation is '辅助诊断'
;

comment on column tb_apply_consultation.ID is '主键ID'
;

comment on column tb_apply_consultation.BUSSINESS_ID is '远程辅助诊断业务ID'
;

comment on column tb_apply_consultation.APPLY_DOCTOR is '发请求医生'
;

comment on column tb_apply_consultation.APPLY_HOSPITAL is '发请求的医院'
;

comment on column tb_apply_consultation.APPLY_TIME is '发请求的时间'
;

comment on column tb_apply_consultation.CONSULT_WAY is '会诊方式： 1.自主阅片  2.AI辅助  3.专家会诊'
;

comment on column tb_apply_consultation.CONSULT_DOCTOR is '诊断医生'
;

comment on column tb_apply_consultation.CONSULT_HOSPITAL is '诊断医院'
;

comment on column tb_apply_consultation.CONSULT_END_TIME is '诊断结束时间'
;

comment on column tb_apply_consultation.DCM_TRANS_WAY is '影像的下载和传输方式（HTTP,FTP等）'
;

comment on column tb_apply_consultation.HANDLE_PROCESS is '申请处理进度：1，请求诊断中 2诊断完成'
;

comment on column tb_apply_consultation.OP_TIME is '操作时间'
;

