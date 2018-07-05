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
//use this keyword to the typeOfDepartment to refer to the class member
    public void setTypeOfDepartment(String typeOfDepartment) {
        TypeOfDepartment = typeOfDepartment;
    }
// this is a better practice
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
//what is this method
    public void print(){
       Log.e("Department:","Method to print the Type of the department ");
    }

    public void print(String departmentName) {
        Log.e ("Departmentparent class ","your department is "+departmentName);
    }
}
