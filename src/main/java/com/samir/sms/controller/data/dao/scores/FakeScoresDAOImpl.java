package com.samir.sms.controller.data.dao.scores;

import com.samir.sms.model.object.CourseItem;
import com.samir.sms.model.object.LocalUniqueId;
import com.samir.sms.model.object.Scores;
import com.samir.sms.model.person.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("FakeScoresDAO")
public class FakeScoresDAOImpl implements IScoresDAO {
    
    private final Map<LocalUniqueId,Scores> scoresTable;

    public FakeScoresDAOImpl() {
        scoresTable = new HashMap<>();
    }

    @Override
    public void insertStudentScores(Student student, Scores scores) {
        scoresTable.put(student.getUid(),scores);
    }

    @Override
    public Scores selectStudentScores(Student student) {
        return scoresTable.get(student.getUid());
    }

    @Override
    public Float selectStudentCourseScore(Student student, CourseItem courseItem) {
        return scoresTable.get(student.getUid()).getScores().get(courseItem);
    }

    @Override
    public boolean updateStudentScores(Student student, CourseItem courseItem, Float newScore) {
        if ( scoresTable.get(student.getUid()).getScores().put(courseItem,newScore) != null )
            return true;
        return false;
    }
}
