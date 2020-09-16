package com.samir.sms.model.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Scores {

    @JsonProperty("scores") private Map<CourseItem,Float> scoresMap;

    public Scores( Map<CourseItem, Float> scores) {
        this.scoresMap = scores;
    }

    public Map<CourseItem, Float> getScores() {
        return this.scoresMap;
    }

    public void setScores(Map<CourseItem, Float> scores) {
        this.scoresMap = scores;
    }
}
