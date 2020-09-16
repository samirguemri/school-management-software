package com.samir.sms.controller.services.scores;

import com.samir.sms.controller.data.dao.scores.IScoresDAO;
import com.samir.sms.model.object.CourseItem;
import com.samir.sms.model.object.Scores;
import com.samir.sms.model.person.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ScoresService")
public class ScoresService {

    private final IScoresDAO scoresDAO;

    @Autowired
    public ScoresService(@Qualifier("FakeScoresDAO") IScoresDAO scoresDAO) {
        this.scoresDAO = scoresDAO;
    }
}
