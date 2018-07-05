package com_.example.mkwan.inheritance;

import android.util.Log;

public class Software extends Department {
    private int grade;
    private int numberOfStudent;

    public int getGrade() {
        return grade;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    @Override
    public void print(String departmentName){
        Log.e("Software Child Class","your department is "+departmentName+"have "+numberOfStudent+"students");
    }
}
