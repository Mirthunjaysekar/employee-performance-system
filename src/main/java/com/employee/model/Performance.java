package com.employee.model;

public class Performance {

    private double attendance;
    private double taskCompletion;
    private double teamwork;
    private double skill;
    private double communication;

    public Performance(double attendance,
                       double taskCompletion,
                       double teamwork,
                       double skill,
                       double communication){

        this.attendance=attendance;
        this.taskCompletion=taskCompletion;
        this.teamwork=teamwork;
        this.skill=skill;
        this.communication=communication;
    }

    public double getAttendance(){
        return attendance;
    }

    public double getTaskCompletion(){
        return taskCompletion;
    }

    public double getTeamwork(){
        return teamwork;
    }

    public double getSkill(){
        return skill;
    }

    public double getCommunication(){
        return communication;
    }

}