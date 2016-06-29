package com.welovekids.states;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;
import com.welovekids.util.QuestionImpl;

/**
 * Created by chris on 30/04/2016.
 */
public class Multiply extends AbstractState {
    @Override
    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        int answer = (int) Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl("" + digit1 + operator + digit2,
                String.valueOf(answer), String.valueOf(operator));
    }

    @Override
    public char getOperator() {
        return 'x';
    }
}
