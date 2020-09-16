package com.samir.sms.controller.data.dao.scores;

import com.samir.sms.model.object.CourseItem;
import com.samir.sms.model.object.Scores;
import com.samir.sms.model.person.Student;

public interface IScoresDAO {

    void insertStudentScores(Student student, Scores scores);
    Scores selectStudentScores(Student student);
    Float selectStudentCourseScore(Student student, CourseItem courseItem);
    boolean updateStudentScores(Student student, CourseItem courseItem, Float newScore);
}
