package lk.ijse.studentsmanagement.dto;

import lk.ijse.studentsmanagement.entity.SuperEntity;

import java.sql.Date;
import java.sql.Time;

public class ExamDTO implements SuperDTO {
    String examId;
    String subjectId;
    String batchId;
    String description;
    Date examDate;
    String lab;
    Time time;
    String subjectName;

    public ExamDTO(String subjectId, String batchId, Date examDate, String description, String lab, String subjectName) {
        this.subjectId = subjectId;
        this.batchId = batchId;
        this.description = description;
        this.examDate = examDate;
        this.lab = lab;
        this.subjectName = subjectName;
    }

    public ExamDTO(String batchId) {
        this.batchId = batchId;
    }

    public ExamDTO(String examId, String batchId) {
        this.examId = examId;
        this.batchId = batchId;
    }

    public ExamDTO(String examId, String subjectId, String batchId, String description, Date examDate) {
        this.examId = examId;
        this.subjectId = subjectId;
        this.batchId = batchId;
        this.description = description;
        this.examDate = examDate;
    }


    @Override
    public String toString() {
        return "Exam{" +
                "examId='" + examId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", batchId='" + batchId + '\'' +
                ", description='" + description + '\'' +
                ", examDate=" + examDate +
                ", lab='" + lab + '\'' +
                ", time=" + time +
                '}';
    }

    public String getExamId() {
        return examId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getDescription() {
        return description;
    }

    public Date getExamDate() {
        return examDate;
    }

    public String getLab() {
        return lab;
    }

    public Time getTime() {
        return time;
    }

    public ExamDTO(String examId, String subjectId, String batchId, String description, Date examDate, String lab, Time time) {
        this.examId = examId;
        this.subjectId = subjectId;
        this.batchId = batchId;
        this.description = description;
        this.examDate = examDate;
        this.lab = lab;
        this.time = time;
    }
}
