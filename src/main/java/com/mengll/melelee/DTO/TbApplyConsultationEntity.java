package com.mengll.melelee.DTO;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author mengll
 * @create 2017-12-26 20:11
 **/
@Entity
@Table(name = "tb_apply_consultation", schema = "saas", catalog = "")
public class TbApplyConsultationEntity {
	private long id;
	private String bussinessId;
	private String applyDoctor;
	private String applyHospital;
	private String applyHospitalLocation;
	private Timestamp applyTime;
	private String consultWay;
	private String consultDoctor;
	private String consultHospital;
	private Timestamp consultEndTime;
	private String dcmTransWay;
	private String handleProcess;
	private Timestamp opTime;

	@Id
	@Column(name = "ID", nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "BUSSINESS_ID", nullable = true, length = 100)
	public String getBussinessId() {
		return bussinessId;
	}

	public void setBussinessId(String bussinessId) {
		this.bussinessId = bussinessId;
	}

	@Basic
	@Column(name = "APPLY_DOCTOR", nullable = true, length = 200)
	public String getApplyDoctor() {
		return applyDoctor;
	}

	public void setApplyDoctor(String applyDoctor) {
		this.applyDoctor = applyDoctor;
	}

	@Basic
	@Column(name = "APPLY_HOSPITAL", nullable = true, length = 300)
	public String getApplyHospital() {
		return applyHospital;
	}

	public void setApplyHospital(String applyHospital) {
		this.applyHospital = applyHospital;
	}

	@Basic
	@Column(name = "APPLY_HOSPITAL_LOCATION", nullable = true, length = 300)
	public String getApplyHospitalLocation() {
		return applyHospitalLocation;
	}

	public void setApplyHospitalLocation(String applyHospitalLocation) {
		this.applyHospitalLocation = applyHospitalLocation;
	}

	@Basic
	@Column(name = "APPLY_TIME", nullable = true)
	public Timestamp getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Timestamp applyTime) {
		this.applyTime = applyTime;
	}

	@Basic
	@Column(name = "CONSULT_WAY", nullable = true, length = 5)
	public String getConsultWay() {
		return consultWay;
	}

	public void setConsultWay(String consultWay) {
		this.consultWay = consultWay;
	}

	@Basic
	@Column(name = "CONSULT_DOCTOR", nullable = true, length = 100)
	public String getConsultDoctor() {
		return consultDoctor;
	}

	public void setConsultDoctor(String consultDoctor) {
		this.consultDoctor = consultDoctor;
	}

	@Basic
	@Column(name = "CONSULT_HOSPITAL", nullable = true, length = 300)
	public String getConsultHospital() {
		return consultHospital;
	}

	public void setConsultHospital(String consultHospital) {
		this.consultHospital = consultHospital;
	}

	@Basic
	@Column(name = "CONSULT_END_TIME", nullable = true)
	public Timestamp getConsultEndTime() {
		return consultEndTime;
	}

	public void setConsultEndTime(Timestamp consultEndTime) {
		this.consultEndTime = consultEndTime;
	}

	@Basic
	@Column(name = "DCM_TRANS_WAY", nullable = true, length = 20)
	public String getDcmTransWay() {
		return dcmTransWay;
	}

	public void setDcmTransWay(String dcmTransWay) {
		this.dcmTransWay = dcmTransWay;
	}

	@Basic
	@Column(name = "HANDLE_PROCESS", nullable = true, length = 20)
	public String getHandleProcess() {
		return handleProcess;
	}

	public void setHandleProcess(String handleProcess) {
		this.handleProcess = handleProcess;
	}

	@Basic
	@Column(name = "OP_TIME", nullable = true)
	public Timestamp getOpTime() {
		return opTime;
	}

	public void setOpTime(Timestamp opTime) {
		this.opTime = opTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TbApplyConsultationEntity that = (TbApplyConsultationEntity) o;

		if (id != that.id) return false;
		if (bussinessId != null ? !bussinessId.equals(that.bussinessId) : that.bussinessId != null) return false;
		if (applyDoctor != null ? !applyDoctor.equals(that.applyDoctor) : that.applyDoctor != null) return false;
		if (applyHospital != null ? !applyHospital.equals(that.applyHospital) : that.applyHospital != null)
			return false;
		if (applyHospitalLocation != null ? !applyHospitalLocation.equals(that.applyHospitalLocation) : that.applyHospitalLocation != null)
			return false;
		if (applyTime != null ? !applyTime.equals(that.applyTime) : that.applyTime != null) return false;
		if (consultWay != null ? !consultWay.equals(that.consultWay) : that.consultWay != null) return false;
		if (consultDoctor != null ? !consultDoctor.equals(that.consultDoctor) : that.consultDoctor != null)
			return false;
		if (consultHospital != null ? !consultHospital.equals(that.consultHospital) : that.consultHospital != null)
			return false;
		if (consultEndTime != null ? !consultEndTime.equals(that.consultEndTime) : that.consultEndTime != null)
			return false;
		if (dcmTransWay != null ? !dcmTransWay.equals(that.dcmTransWay) : that.dcmTransWay != null) return false;
		if (handleProcess != null ? !handleProcess.equals(that.handleProcess) : that.handleProcess != null)
			return false;
		if (opTime != null ? !opTime.equals(that.opTime) : that.opTime != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (bussinessId != null ? bussinessId.hashCode() : 0);
		result = 31 * result + (applyDoctor != null ? applyDoctor.hashCode() : 0);
		result = 31 * result + (applyHospital != null ? applyHospital.hashCode() : 0);
		result = 31 * result + (applyHospitalLocation != null ? applyHospitalLocation.hashCode() : 0);
		result = 31 * result + (applyTime != null ? applyTime.hashCode() : 0);
		result = 31 * result + (consultWay != null ? consultWay.hashCode() : 0);
		result = 31 * result + (consultDoctor != null ? consultDoctor.hashCode() : 0);
		result = 31 * result + (consultHospital != null ? consultHospital.hashCode() : 0);
		result = 31 * result + (consultEndTime != null ? consultEndTime.hashCode() : 0);
		result = 31 * result + (dcmTransWay != null ? dcmTransWay.hashCode() : 0);
		result = 31 * result + (handleProcess != null ? handleProcess.hashCode() : 0);
		result = 31 * result + (opTime != null ? opTime.hashCode() : 0);
		return result;
	}
}
