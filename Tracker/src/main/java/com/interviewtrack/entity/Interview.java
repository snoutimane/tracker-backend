package com.interviewtrack.entity;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "candidateData")
public class Interview {
    @Id
    private String id;

    private Integer empId;
    private String employeeName;
    private String email;
    private String projectName;
    private String projectCode;
    private String projectManager;
    private String projectLocation;
    private Boolean interviewed;
    private Date interviewDate;
    private String feedback;
    private String feedbackDescription;
    private String comment;
    private String feedbackAttachment;
    private Date proposedDate;
    private String mentorName;
    private String image;
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
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getProjectLocation() {
		return projectLocation;
	}
	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}
	public Boolean getInterviewed() {
		return interviewed;
	}
	public void setInterviewed(Boolean interviewed) {
		this.interviewed = interviewed;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getFeedbackDescription() {
		return feedbackDescription;
	}
	public void setFeedbackDescription(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getFeedbackAttachment() {
		return feedbackAttachment;
	}
	public void setFeedbackAttachment(String feedbackAttachment) {
		this.feedbackAttachment = feedbackAttachment;
	}
	public Date getProposedDate() {
		return proposedDate;
	}
	public void setProposedDate(Date proposedDate) {
		this.proposedDate = proposedDate;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public Interview() {
		super();
	}
	public Interview(String id, Integer empId, String employeeName, String email, String projectName,
			String projectCode, String projectManager, String projectLocation, Boolean interviewed, Date interviewDate,
			String feedback, String feedbackDescription, String comment, String feedbackAttachment, Date proposedDate,
			String mentorName,String image) {
		super();
		this.id = id;
		this.empId = empId;
		this.employeeName = employeeName;
		this.email = email;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.projectManager = projectManager;
		this.projectLocation = projectLocation;
		this.interviewed = interviewed;
		this.interviewDate = interviewDate;
		this.feedback = feedback;
		this.feedbackDescription = feedbackDescription;
		this.comment = comment;
		this.feedbackAttachment = feedbackAttachment;
		this.proposedDate = proposedDate;
		this.mentorName = mentorName;
		this.image=image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

    // Constructors, getters, and setters
    // ...
    
}
