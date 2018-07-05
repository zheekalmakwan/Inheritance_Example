package com_.example.mkwan.inheritance;

import android.util.Log;
import android.widget.Toast;

public class Department {
    private String TypeOfDepartment;
    private String departmentName;

    public String getTypeOfDepartment() {
        return TypeOfDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setTypeOfDepartment(String typeOfDepartment) {
        TypeOfDepartment = typeOfDepartment;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void print(){
       Log.e("Department:","Method to print the Type of the department ");
    }

    public void print(String departmentName) {
        Log.e ("Departmentparent class ","your department is "+departmentName);
    }
}
