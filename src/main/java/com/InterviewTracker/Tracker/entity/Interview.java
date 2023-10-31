package com.InterviewTracker.Tracker.entity;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@Document(collection = "candidateData")
public class Interview {
    @Id
    private String id;
    
    @Indexed(unique=true)
    private Integer empId;
    private String employeeName;
    
    @Indexed(unique=true)
    private String email;
    
    private Date baselineDate;
    private String localGrade;
    private String currentDayStatus;
    private String mainProject;
    private String accountName;
    private String trainingBatchId;
    private String mentorName;
    private String trainingScoreFeedback;
    private String bucket;
    private String qualitativeFeedback;
   
    private String oceanAttemptedTillDate;
    private double oceanScoreIfAttempted;
    private String hsCertificationDone;
    private Date digiDashboardUpdatedRegularly;
    private String accountShadowsDone;
    private String currentStatus;
    private String upskillingWhileOnBench;
    private String currentInitiativeInvolvedIn;
    private String workDoneLast3Months;
    private String personReachable;
    private String pscRemarks;
    private String btoAverageQ3Attendance;
    private double sapienceAvgLast3Months;
    private Integer leaveBalance;
    private Integer leaveAppliedLast3Months;
    private String botpStatus;
    private String subStatus;
    private String college;
    private String collegeType;
    private String education;
    private int recruitmentSwarScore;
    private int recruitmentAptitudeScore;
    private int recruitmentCodingScore;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBaselineDate() {
		return baselineDate;
	}
	public void setBaselineDate(Date baselineDate) {
		this.baselineDate = baselineDate;
	}
	public String getLocalGrade() {
		return localGrade;
	}
	public void setLocalGrade(String localGrade) {
		this.localGrade = localGrade;
	}
	public String getCurrentDayStatus() {
		return currentDayStatus;
	}
	public void setCurrentDayStatus(String currentDayStatus) {
		this.currentDayStatus = currentDayStatus;
	}
	public String getMainProject() {
		return mainProject;
	}
	public void setMainProject(String mainProject) {
		this.mainProject = mainProject;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getTrainingBatchId() {
		return trainingBatchId;
	}
	public void setTrainingBatchId(String trainingBatchId) {
		this.trainingBatchId = trainingBatchId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public String getTrainingScoreFeedback() {
		return trainingScoreFeedback;
	}
	public void setTrainingScoreFeedback(String trainingScoreFeedback) {
		this.trainingScoreFeedback = trainingScoreFeedback;
	}
	public String getBucket() {
		return bucket;
	}
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	public String getQualitativeFeedback() {
		return qualitativeFeedback;
	}
	public void setQualitativeFeedback(String qualitativeFeedback) {
		this.qualitativeFeedback = qualitativeFeedback;
	}
	public String getOceanAttemptedTillDate() {
		return oceanAttemptedTillDate;
	}
	public void setOceanAttemptedTillDate(String oceanAttemptedTillDate) {
		this.oceanAttemptedTillDate = oceanAttemptedTillDate;
	}
	public double getOceanScoreIfAttempted() {
		return oceanScoreIfAttempted;
	}
	public void setOceanScoreIfAttempted(double oceanScoreIfAttempted) {
		this.oceanScoreIfAttempted = oceanScoreIfAttempted;
	}
	public String getHsCertificationDone() {
		return hsCertificationDone;
	}
	public void setHsCertificationDone(String hsCertificationDone) {
		this.hsCertificationDone = hsCertificationDone;
	}
	public Date getDigiDashboardUpdatedRegularly() {
		return digiDashboardUpdatedRegularly;
	}
	public void setDigiDashboardUpdatedRegularly(Date digiDashboardUpdatedRegularly) {
		this.digiDashboardUpdatedRegularly = digiDashboardUpdatedRegularly;
	}
	public String getAccountShadowsDone() {
		return accountShadowsDone;
	}
	public void setAccountShadowsDone(String accountShadowsDone) {
		this.accountShadowsDone = accountShadowsDone;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public String getUpskillingWhileOnBench() {
		return upskillingWhileOnBench;
	}
	public void setUpskillingWhileOnBench(String upskillingWhileOnBench) {
		this.upskillingWhileOnBench = upskillingWhileOnBench;
	}
	public String getCurrentInitiativeInvolvedIn() {
		return currentInitiativeInvolvedIn;
	}
	public void setCurrentInitiativeInvolvedIn(String currentInitiativeInvolvedIn) {
		this.currentInitiativeInvolvedIn = currentInitiativeInvolvedIn;
	}
	public String getWorkDoneLast3Months() {
		return workDoneLast3Months;
	}
	public void setWorkDoneLast3Months(String workDoneLast3Months) {
		this.workDoneLast3Months = workDoneLast3Months;
	}
	public String getPersonReachable() {
		return personReachable;
	}
	public void setPersonReachable(String personReachable) {
		this.personReachable = personReachable;
	}
	public String getPscRemarks() {
		return pscRemarks;
	}
	public void setPscRemarks(String pscRemarks) {
		this.pscRemarks = pscRemarks;
	}
	public String getBtoAverageQ3Attendance() {
		return btoAverageQ3Attendance;
	}
	public void setBtoAverageQ3Attendance(String btoAverageQ3Attendance) {
		this.btoAverageQ3Attendance = btoAverageQ3Attendance;
	}
	public double getSapienceAvgLast3Months() {
		return sapienceAvgLast3Months;
	}
	public void setSapienceAvgLast3Months(double sapienceAvgLast3Months) {
		this.sapienceAvgLast3Months = sapienceAvgLast3Months;
	}
	public Integer getLeaveBalance() {
		return leaveBalance;
	}
	public void setLeaveBalance(Integer leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
	public Integer getLeaveAppliedLast3Months() {
		return leaveAppliedLast3Months;
	}
	public void setLeaveAppliedLast3Months(Integer leaveAppliedLast3Months) {
		this.leaveAppliedLast3Months = leaveAppliedLast3Months;
	}
	public String getBotpStatus() {
		return botpStatus;
	}
	public void setBotpStatus(String botpStatus) {
		this.botpStatus = botpStatus;
	}
	public String getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCollegeType() {
		return collegeType;
	}
	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getRecruitmentSwarScore() {
		return recruitmentSwarScore;
	}
	public void setRecruitmentSwarScore(int recruitmentSwarScore) {
		this.recruitmentSwarScore = recruitmentSwarScore;
	}
	public int getRecruitmentAptitudeScore() {
		return recruitmentAptitudeScore;
	}
	public void setRecruitmentAptitudeScore(int recruitmentAptitudeScore) {
		this.recruitmentAptitudeScore = recruitmentAptitudeScore;
	}
	public int getRecruitmentCodingScore() {
		return recruitmentCodingScore;
	}
	public void setRecruitmentCodingScore(int recruitmentCodingScore) {
		this.recruitmentCodingScore = recruitmentCodingScore;
	}
	
	public Interview(String id, Integer empId, String employeeName, String email, Date baselineDate, String localGrade,
			String currentDayStatus, String mainProject, String accountName, String trainingBatchId, String mentorName,
			String trainingScoreFeedback, String bucket, String qualitativeFeedback, String oceanAttemptedTillDate,
			double oceanScoreIfAttempted, String hsCertificationDone, Date digiDashboardUpdatedRegularly,
			String accountShadowsDone, String currentStatus, String upskillingWhileOnBench,
			String currentInitiativeInvolvedIn, String workDoneLast3Months, String personReachable,
			String pscRemarks, String btoAverageQ3Attendance, double sapienceAvgLast3Months, Integer leaveBalance,
			Integer leaveAppliedLast3Months, String botpStatus, String subStatus, String college, String collegeType,
			String education, int recruitmentSwarScore, int recruitmentAptitudeScore, int recruitmentCodingScore) {
		super();
		this.id = id;
		this.empId = empId;
		this.employeeName = employeeName;
		this.email = email;
		this.baselineDate = baselineDate;
		this.localGrade = localGrade;
		this.currentDayStatus = currentDayStatus;
		this.mainProject = mainProject;
		this.accountName = accountName;
		this.trainingBatchId = trainingBatchId;
		this.mentorName = mentorName;
		this.trainingScoreFeedback = trainingScoreFeedback;
		this.bucket = bucket;
		this.qualitativeFeedback = qualitativeFeedback;
		this.oceanAttemptedTillDate = oceanAttemptedTillDate;
		this.oceanScoreIfAttempted = oceanScoreIfAttempted;
		this.hsCertificationDone = hsCertificationDone;
		this.digiDashboardUpdatedRegularly = digiDashboardUpdatedRegularly;
		this.accountShadowsDone = accountShadowsDone;
		this.currentStatus = currentStatus;
		this.upskillingWhileOnBench = upskillingWhileOnBench;
		this.currentInitiativeInvolvedIn = currentInitiativeInvolvedIn;
		this.workDoneLast3Months = workDoneLast3Months;
		this.personReachable = personReachable;
		this.pscRemarks = pscRemarks;
		this.btoAverageQ3Attendance = btoAverageQ3Attendance;
		this.sapienceAvgLast3Months = sapienceAvgLast3Months;
		this.leaveBalance = leaveBalance;
		this.leaveAppliedLast3Months = leaveAppliedLast3Months;
		this.botpStatus = botpStatus;
		this.subStatus = subStatus;
		this.college = college;
		this.collegeType = collegeType;
		this.education = education;
		this.recruitmentSwarScore = recruitmentSwarScore;
		this.recruitmentAptitudeScore = recruitmentAptitudeScore;
		this.recruitmentCodingScore = recruitmentCodingScore;
	}
    
	
//    @Indexed(unique = true)
//    private Integer empId;
//    private String employeeName;
//    
//    @Indexed(unique = true)
//    private String email;
//    private String projectName;
//    private String projectCode;
//    private String projectManager;
//    private String projectLocation;
//    private Boolean interviewed;
//    private Date interviewDate;
//    private String feedback;
//    private String feedbackDescription;
//    private String comment;
//    private String status;
//    private Date proposedDate;
//    private String mentorName;
//    private String image;
//    
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public Integer getEmpId() {
//		return empId;
//	}
//	public void setEmpId(Integer empId) {
//		this.empId = empId;
//	}
//	public String getEmployeeName() {
//		return employeeName;
//	}
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getProjectName() {
//		return projectName;
//	}
//	public void setProjectName(String projectName) {
//		this.projectName = projectName;
//	}
//	public String getProjectCode() {
//		return projectCode;
//	}
//	public void setProjectCode(String projectCode) {
//		this.projectCode = projectCode;
//	}
//	public String getProjectManager() {
//		return projectManager;
//	}
//	public void setProjectManager(String projectManager) {
//		this.projectManager = projectManager;
//	}
//	public String getProjectLocation() {
//		return projectLocation;
//	}
//	public void setProjectLocation(String projectLocation) {
//		this.projectLocation = projectLocation;
//	}
//	public Boolean getInterviewed() {
//		return interviewed;
//	}
//	public void setInterviewed(Boolean interviewed) {
//		this.interviewed = interviewed;
//	}
//	public Date getInterviewDate() {
//		return interviewDate;
//	}
//	public void setInterviewDate(Date interviewDate) {
//		this.interviewDate = interviewDate;
//	}
//	public String getFeedback() {
//		return feedback;
//	}
//	public void setFeedback(String feedback) {
//		this.feedback = feedback;
//	}
//	public String getFeedbackDescription() {
//		return feedbackDescription;
//	}
//	public void setFeedbackDescription(String feedbackDescription) {
//		this.feedbackDescription = feedbackDescription;
//	}
//	public String getComment() {
//		return comment;
//	}
//	public void setComment(String comment) {
//		this.comment = comment;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status= status;
//	}
//	public Date getProposedDate() {
//		return proposedDate;
//	}
//	public void setProposedDate(Date proposedDate) {
//		this.proposedDate = proposedDate;
//	}
//	public String getMentorName() {
//		return mentorName;
//	}
//	public void setMentorName(String mentorName) {
//		this.mentorName = mentorName;
//	}
//	public Interview() {
//		super();
//	}
//	public Interview(String id, Integer empId, String employeeName, String email, String projectName,
//			String projectCode, String projectManager, String projectLocation, Boolean interviewed, Date interviewDate,
//			String feedback, String feedbackDescription, String comment,String status, Date proposedDate,
//			String mentorName,String image) {
//		super();
//		this.id = id;
//		this.empId = empId;
//		this.employeeName = employeeName;
//		this.email = email;
//		this.projectName = projectName;
//		this.projectCode = projectCode;
//		this.projectManager = projectManager;
//		this.projectLocation = projectLocation;
//		this.interviewed = interviewed;
//		this.interviewDate = interviewDate;
//		this.feedback = feedback;
//		this.feedbackDescription = feedbackDescription;
//		this.comment = comment;
//		this.status = status;
//		this.proposedDate = proposedDate;
//		this.mentorName = mentorName;
//		this.image=image;
//	}
//	public String getImage() {
//		return image;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//    // Constructors, getters, and setters
//    // ...
    
    
    
}
