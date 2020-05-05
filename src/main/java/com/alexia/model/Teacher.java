package com.alexia.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity(name="teacher")
public class Teacher implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String surname;
	private String patronymic;
	private String birthday;
	private String tabelnum;
	private String placebirth;
	private String country;
	private String gender;
	private String status;
	private String education;
	private String iin;
	private byte[] pic;
	private String telephone;
	private String telwork;
	private String mobile;
	private String document;
	private String seria;
	private String numdoc;
	private String isdoc;
	private String isdate;
	private String undate;
	private String national;
	private String citizenship;
	private String workstatus;
	private String workview;
	private String workorganization;
	private String worksub;
	private String workunit;
	private String workqualification;
	private String worknumber;
	private String workdata;
	private String workterm;
	private String workreception;
	private String workdissolution;
	private String worknumleave;
	private String workaddholidays;
	private String expform;
	private String exprecept;
	private String expdissolution;
	private String exporganization;
	private String exppost;
	private String familyname;
	private String familydigree;
	private String familybirth;
	private String familyplace;
	private String familywork;
	private String familypost;
	private String familyresidence;
	private String eduinstitution;
	private String edulacation;
	private String edurecept;
	private String edugraduation;
	private String eduspecialty;
	private String educlass;
	private String eduseria;
	private String edunum;
	private String edudiploma;
	private String edudegree;
	private String militarydoc;
	private String militarytic;
	private String militaryser;
	private String militaryname;
	private String militarygroup;
	private String militarycat;
	private String militarystr;
	private String militaryspec;
	private String militarysuit;
	private String militarydate;
	private String militarytrack;
	private String medicalseria;
	private String medicalnum;
	private String medicaldate;
	private String medicalpast;
	private String medicalchronic;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	private boolean finished;
	@NotNull
	@OneToMany(mappedBy = "teacher")
	private Set<TeacherTask> teacherTask = new HashSet<TeacherTask>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getTabelnum() {
		return tabelnum;
	}

	public void setTabelnum(String tabelnum) {
		this.tabelnum = tabelnum;
	}

	public String getPlacebirth() {
		return placebirth;
	}

	public void setPlacebirth(String placebirth) {
		this.placebirth = placebirth;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}


	public Set<TeacherTask> getTeacherTask() {
		return teacherTask;
	}

	public void setTeacherTask(Set<TeacherTask> teacherTask) {
		this.teacherTask = teacherTask;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getIin() {
		return iin;
	}

	public void setIin(String iin) {
		this.iin = iin;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelwork() {
		return telwork;
	}

	public void setTelwork(String telwork) {
		this.telwork = telwork;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getSeria() {
		return seria;
	}

	public void setSeria(String seria) {
		this.seria = seria;
	}

	public String getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public String getIsdoc() {
		return isdoc;
	}

	public void setIsdoc(String isdoc) {
		this.isdoc = isdoc;
	}

	public String getIsdate() {
		return isdate;
	}

	public void setIsdate(String isdate) {
		this.isdate = isdate;
	}

	public String getUndate() {
		return undate;
	}

	public void setUndate(String undate) {
		this.undate = undate;
	}

	public String getWorkstatus() {
		return workstatus;
	}

	public void setWorkstatus(String workstatus) {
		this.workstatus = workstatus;
	}

	public String getWorkview() {
		return workview;
	}

	public void setWorkview(String workview) {
		this.workview = workview;
	}

	public String getWorkorganization() {
		return workorganization;
	}

	public void setWorkorganization(String workorganization) {
		this.workorganization = workorganization;
	}

	public String getWorksub() {
		return worksub;
	}

	public void setWorksub(String worksub) {
		this.worksub = worksub;
	}

	public String getWorkunit() {
		return workunit;
	}

	public void setWorkunit(String workunit) {
		this.workunit = workunit;
	}

	public String getWorkqualification() {
		return workqualification;
	}

	public void setWorkqualification(String workqualification) {
		this.workqualification = workqualification;
	}

	public String getWorknumber() {
		return worknumber;
	}

	public void setWorknumber(String worknumber) {
		this.worknumber = worknumber;
	}

	public String getWorkdata() {
		return workdata;
	}

	public void setWorkdata(String workdata) {
		this.workdata = workdata;
	}

	public String getWorkterm() {
		return workterm;
	}

	public void setWorkterm(String workterm) {
		this.workterm = workterm;
	}

	public String getWorkreception() {
		return workreception;
	}

	public void setWorkreception(String workreception) {
		this.workreception = workreception;
	}

	public String getWorkdissolution() {
		return workdissolution;
	}

	public void setWorkdissolution(String workdissolution) {
		this.workdissolution = workdissolution;
	}

	public String getWorknumleave() {
		return worknumleave;
	}

	public void setWorknumleave(String worknumleave) {
		this.worknumleave = worknumleave;
	}

	public String getWorkaddholidays() {
		return workaddholidays;
	}

	public void setWorkaddholidays(String workaddholidays) {
		this.workaddholidays = workaddholidays;
	}

	public String getExpform() {
		return expform;
	}

	public void setExpform(String expform) {
		this.expform = expform;
	}

	public String getExprecept() {
		return exprecept;
	}

	public void setExprecept(String exprecept) {
		this.exprecept = exprecept;
	}

	public String getExpdissolution() {
		return expdissolution;
	}

	public void setExpdissolution(String expdissolution) {
		this.expdissolution = expdissolution;
	}

	public String getExporganization() {
		return exporganization;
	}

	public void setExporganization(String exporganization) {
		this.exporganization = exporganization;
	}

	public String getExppost() {
		return exppost;
	}

	public void setExppost(String exppost) {
		this.exppost = exppost;
	}

	public String getFamilyname() {
		return familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public String getFamilydigree() {
		return familydigree;
	}

	public void setFamilydigree(String familydigree) {
		this.familydigree = familydigree;
	}

	public String getFamilybirth() {
		return familybirth;
	}

	public void setFamilybirth(String familybirth) {
		this.familybirth = familybirth;
	}

	public String getFamilyplace() {
		return familyplace;
	}

	public void setFamilyplace(String familyplace) {
		this.familyplace = familyplace;
	}

	public String getFamilywork() {
		return familywork;
	}

	public void setFamilywork(String familywork) {
		this.familywork = familywork;
	}

	public String getFamilypost() {
		return familypost;
	}

	public void setFamilypost(String familypost) {
		this.familypost = familypost;
	}

	public String getFamilyresidence() {
		return familyresidence;
	}

	public void setFamilyresidence(String familyresidence) {
		this.familyresidence = familyresidence;
	}

	public String getEduinstitution() {
		return eduinstitution;
	}

	public void setEduinstitution(String eduinstitution) {
		this.eduinstitution = eduinstitution;
	}

	public String getEdulacation() {
		return edulacation;
	}

	public void setEdulacation(String edulacation) {
		this.edulacation = edulacation;
	}

	public String getEdurecept() {
		return edurecept;
	}

	public void setEdurecept(String edurecept) {
		this.edurecept = edurecept;
	}

	public String getEdugraduation() {
		return edugraduation;
	}

	public void setEdugraduation(String edugraduation) {
		this.edugraduation = edugraduation;
	}

	public String getEduspecialty() {
		return eduspecialty;
	}

	public void setEduspecialty(String eduspecialty) {
		this.eduspecialty = eduspecialty;
	}

	public String getEduclass() {
		return educlass;
	}

	public void setEduclass(String educlass) {
		this.educlass = educlass;
	}

	public String getEduseria() {
		return eduseria;
	}

	public void setEduseria(String eduseria) {
		this.eduseria = eduseria;
	}

	public String getEdunum() {
		return edunum;
	}

	public void setEdunum(String edunum) {
		this.edunum = edunum;
	}

	public String getEdudiploma() {
		return edudiploma;
	}

	public void setEdudiploma(String edudiploma) {
		this.edudiploma = edudiploma;
	}

	public String getEdudegree() {
		return edudegree;
	}

	public void setEdudegree(String edudegree) {
		this.edudegree = edudegree;
	}

	public String getMilitarydoc() {
		return militarydoc;
	}

	public void setMilitarydoc(String militarydoc) {
		this.militarydoc = militarydoc;
	}

	public String getMilitarytic() {
		return militarytic;
	}

	public void setMilitarytic(String militarytic) {
		this.militarytic = militarytic;
	}

	public String getMilitaryser() {
		return militaryser;
	}

	public void setMilitaryser(String militaryser) {
		this.militaryser = militaryser;
	}

	public String getMilitaryname() {
		return militaryname;
	}

	public void setMilitaryname(String militaryname) {
		this.militaryname = militaryname;
	}

	public String getMilitarygroup() {
		return militarygroup;
	}

	public void setMilitarygroup(String militarygroup) {
		this.militarygroup = militarygroup;
	}

	public String getMilitarycat() {
		return militarycat;
	}

	public void setMilitarycat(String militarycat) {
		this.militarycat = militarycat;
	}

	public String getMilitarystr() {
		return militarystr;
	}

	public void setMilitarystr(String militarystr) {
		this.militarystr = militarystr;
	}

	public String getMilitaryspec() {
		return militaryspec;
	}

	public void setMilitaryspec(String militaryspec) {
		this.militaryspec = militaryspec;
	}

	public String getMilitarysuit() {
		return militarysuit;
	}

	public void setMilitarysuit(String militarysuit) {
		this.militarysuit = militarysuit;
	}

	public String getMilitarydate() {
		return militarydate;
	}

	public void setMilitarydate(String militarydate) {
		this.militarydate = militarydate;
	}

	public String getMilitarytrack() {
		return militarytrack;
	}

	public void setMilitarytrack(String militarytrack) {
		this.militarytrack = militarytrack;
	}

	public String getMedicalseria() {
		return medicalseria;
	}

	public void setMedicalseria(String medicalseria) {
		this.medicalseria = medicalseria;
	}

	public String getMedicalnum() {
		return medicalnum;
	}

	public void setMedicalnum(String medicalnum) {
		this.medicalnum = medicalnum;
	}

	public String getMedicaldate() {
		return medicaldate;
	}

	public void setMedicaldate(String medicaldate) {
		this.medicaldate = medicaldate;
	}

	public String getMedicalpast() {
		return medicalpast;
	}

	public void setMedicalpast(String medicalpast) {
		this.medicalpast = medicalpast;
	}

	public String getMedicalchronic() {
		return medicalchronic;
	}

	public void setMedicalchronic(String medicalchronic) {
		this.medicalchronic = medicalchronic;
	}


}
