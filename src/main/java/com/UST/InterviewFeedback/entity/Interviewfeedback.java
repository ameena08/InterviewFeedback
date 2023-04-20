package com.UST.InterviewFeedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Interviewfeedback {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private String userid;
    private String CandidateName;
    private String Position;
    private String InterviewerName;
    private String InterviewerEmpid;
    private int rating;
    private String Status;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCandidateName() {
        return CandidateName;
    }

    public void setCandidateName(String candidateName) {
        CandidateName = candidateName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getInterviewerName() {
        return InterviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        InterviewerName = interviewerName;
    }

    public String getInterviewerEmpid() {
        return InterviewerEmpid;
    }

    public void setInterviewerEmpid(String interviewerEmpid) {
        InterviewerEmpid = interviewerEmpid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Interviewfeedback(Long id, String userid, String candidateName, String position, String interviewerName, String interviewerEmpid, int rating, String status) {
        Id = id;
        this.userid = userid;
        CandidateName = candidateName;
        Position = position;
        InterviewerName = interviewerName;
        InterviewerEmpid = interviewerEmpid;
        this.rating = rating;
        Status = status;
    }

    public Interviewfeedback() {
    }
}
