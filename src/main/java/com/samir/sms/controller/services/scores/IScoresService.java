package com.samir.sms.controller.services.scores;

import com.samir.sms.model.object.CourseItem;
import com.samir.sms.model.object.Scores;
import com.samir.sms.model.person.Student;

public interface IScoresService {
    void addStudentScores(Student student, Scores scores);
    Scores getStudentScores(Student student);
    Float getStudentScore(Student student, CourseItem courseItem);
    Scores updateStudentScores(Student student, CourseItem courseItem, Float newScore);
}
