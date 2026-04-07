package com.employee.service;

import com.employee.model.Performance;

public class EvaluationService {

    public double calculateScore(Performance p){

        validate(p);

        return (p.getAttendance()*0.2)+
                (p.getTaskCompletion()*0.3)+
                (p.getTeamwork()*0.2)+
                (p.getSkill()*0.15)+
                (p.getCommunication()*0.15);

    }

    public String getRating(double score){

        if(score>=90)
            return "Excellent";

        if(score>=75)
            return "Good";

        if(score>=60)
            return "Average";

        if(score>=40)
            return "Needs Improvement";

        return "Poor";

    }

    private void validate(Performance p){

        if(p.getAttendance()<0 || p.getAttendance()>100)
            throw new IllegalArgumentException("Invalid attendance");

        if(p.getTaskCompletion()<0 || p.getTaskCompletion()>100)
            throw new IllegalArgumentException("Invalid task score");

    }

}