package com.LITRuleEngine.LITPOC.models;

public class Event {
    // each rule will trigger an eventId
    private Integer eventId;
    // description of the rule for debugging Purpose
    private String eventDescription;

    public Event(Integer eventId, String eventDescription) {
        this.eventId = eventId;
        this.eventDescription = eventDescription;
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

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventDescription='" + eventDescription + '\'' +
                '}';
    }
}
