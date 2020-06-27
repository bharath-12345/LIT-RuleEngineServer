package com.LITRuleEngine.LITPOC.models;

public class CMRatings {
    private String name;
    private Integer rating;
    private String metricName;
    private Integer empId;

    public CMRatings(String metricName, String name, Integer empId, Integer rating) {
        this.name = name;
        this.rating = rating;
        this.metricName = metricName;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "CMRatings{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", metricName='" + metricName + '\'' +
                ", empId=" + empId +
                '}';
    }
}
