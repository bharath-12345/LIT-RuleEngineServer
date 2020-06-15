package com.LITRuleEngine.LITPOC.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String name;
    private Date DoJ;
    private String jobRole;

    public Employee(String name, String jobRole, String DoJ) throws Exception {
        this.name = name;
        this.DoJ = Employee.date(DoJ);
        this.jobRole = jobRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoJ() {
        return DoJ;
    }

    public void setDoJ(Date doJ) {
        DoJ = doJ;
    }

    public String getJobType() {
        return jobRole;
    }

    public void setJobType(String jobType) {
        this.jobRole = jobType;
    }

    public static Date date(String str) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.parse( str );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", DoJ=" + DoJ +
                ", jobType='" + jobRole + '\'' +
                '}';
    }
}
