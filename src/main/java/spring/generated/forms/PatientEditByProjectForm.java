package spring.generated.forms;

import java.sql.Timestamp;
import java.util.Map;

import spring.mine.common.form.BaseForm;
import us.mn.state.health.lims.patient.action.bean.PatientSearch;
import us.mn.state.health.lims.patient.valueholder.ObservationData;
import us.mn.state.health.lims.sample.form.ProjectData;

public class PatientEditByProjectForm extends BaseForm {
	private Map formLists;

	private Map dictionaryLists;

	private Map organizationTypeLists;

	private String patientPK = "";

	private String samplePK = "";

	private Timestamp lastupdated;

	private String patientLastUpdated = "";

	private String personLastUpdated = "";

	private String interviewDate = "";

	private String receivedDateForDisplay = "";

	private String receivedTimeForDisplay = "";

	private String interviewTime = "";

	private String currentDate = "";

	private String patientProcessingStatus = "Add";

	private String subjectNumber = "";

	private String siteSubjectNumber = "";

	private String labNo = "";

	private String centerName = "";

	private Integer centerCode;

	private String firstName = "";

	private String lastName = "";

	private String gender = "";

	private String birthDateForDisplay = "";

	private ObservationData observations;

	private ProjectData ProjectData;

	private PatientSearch patientSearch;

	private String warning;

	public PatientEditByProjectForm() {
		setFormName("PatientEditByProjectForm");
	}

	public Map getFormLists() {
		return formLists;
	}

	public void setFormLists(Map formLists) {
		this.formLists = formLists;
	}

	public Map getDictionaryLists() {
		return dictionaryLists;
	}

	public void setDictionaryLists(Map dictionaryLists) {
		this.dictionaryLists = dictionaryLists;
	}

	public Map getOrganizationTypeLists() {
		return organizationTypeLists;
	}

	public void setOrganizationTypeLists(Map organizationTypeLists) {
		this.organizationTypeLists = organizationTypeLists;
	}

	public String getPatientPK() {
		return patientPK;
	}

	public void setPatientPK(String patientPK) {
		this.patientPK = patientPK;
	}

	public String getSamplePK() {
		return samplePK;
	}

	public void setSamplePK(String samplePK) {
		this.samplePK = samplePK;
	}

	public Timestamp getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Timestamp lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getPatientLastUpdated() {
		return patientLastUpdated;
	}

	public void setPatientLastUpdated(String patientLastUpdated) {
		this.patientLastUpdated = patientLastUpdated;
	}

	public String getPersonLastUpdated() {
		return personLastUpdated;
	}

	public void setPersonLastUpdated(String personLastUpdated) {
		this.personLastUpdated = personLastUpdated;
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getReceivedDateForDisplay() {
		return receivedDateForDisplay;
	}

	public void setReceivedDateForDisplay(String receivedDateForDisplay) {
		this.receivedDateForDisplay = receivedDateForDisplay;
	}

	public String getReceivedTimeForDisplay() {
		return receivedTimeForDisplay;
	}

	public void setReceivedTimeForDisplay(String receivedTimeForDisplay) {
		this.receivedTimeForDisplay = receivedTimeForDisplay;
	}

	public String getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public String getPatientProcessingStatus() {
		return patientProcessingStatus;
	}

	public void setPatientProcessingStatus(String patientProcessingStatus) {
		this.patientProcessingStatus = patientProcessingStatus;
	}

	public String getSubjectNumber() {
		return subjectNumber;
	}

	public void setSubjectNumber(String subjectNumber) {
		this.subjectNumber = subjectNumber;
	}

	public String getSiteSubjectNumber() {
		return siteSubjectNumber;
	}

	public void setSiteSubjectNumber(String siteSubjectNumber) {
		this.siteSubjectNumber = siteSubjectNumber;
	}

	public String getLabNo() {
		return labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public Integer getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(Integer centerCode) {
		this.centerCode = centerCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDateForDisplay() {
		return birthDateForDisplay;
	}

	public void setBirthDateForDisplay(String birthDateForDisplay) {
		this.birthDateForDisplay = birthDateForDisplay;
	}

	public ObservationData getObservations() {
		return observations;
	}

	public void setObservations(ObservationData observations) {
		this.observations = observations;
	}

	public ProjectData getProjectData() {
		return ProjectData;
	}

	public void setProjectData(ProjectData ProjectData) {
		this.ProjectData = ProjectData;
	}

	public PatientSearch getPatientSearch() {
		return patientSearch;
	}

	public void setPatientSearch(PatientSearch patientSearch) {
		this.patientSearch = patientSearch;
	}

	public String getWarning() {
		return warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}
}