package com.LITRuleEngine.LITPOC.models;

public class CMRatings {
    private String name;
    private Integer rating;
    private String metricName;


    public CMRatings(String name, String metricName, Integer rating) {
        this.name = name;
        this.rating = rating;
        this.metricName = metricName;
    }

    @Override
    public String toString() {
        return "CMRatings{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", metricName='" + metricName + '\'' +
                '}';
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
}
