package com.LITRuleEngine.LITPOC.models;

import java.util.Date;

public class Event {
    // each rule will trigger an eventId
    private Integer eventId;
    // description of the rule for debugging Purpose
    private String eventDescription;
    // time when event occured
    private Date eventTimestamp;

    public Event(Integer eventId, String eventDescription) {
        this.eventId = eventId;
        this.eventDescription = eventDescription;
        this.eventTimestamp = new Date();
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Date getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventTimestamp=" + eventTimestamp +
                '}';
    }
}
