package com.LITRuleEngine.LITPOC.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private Integer empId;
    private String name;
    private Date DoJ;
    private String jobRole;

    public Employee(String DoJ, String name, String jobRole, Integer empId) throws Exception {
        this.name = name;
        this.DoJ = Employee.date(DoJ);
        this.jobRole = jobRole;
        this.empId = empId;
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

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", DoJ=" + DoJ +
                ", jobRole='" + jobRole + '\'' +
                '}';
    }
}
