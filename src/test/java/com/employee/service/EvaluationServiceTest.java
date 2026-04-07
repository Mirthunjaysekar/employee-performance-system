package com.employee.service;

import com.employee.model.Performance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvaluationServiceTest {

    EvaluationService service =
            new EvaluationService();

    @Test
    void testScoreCalculation(){

        Performance p =
                new Performance(90,85,80,75,70);

        double score =
                service.calculateScore(p);

        assertTrue(score>70);

    }

    @Test
    void testExcellentRating(){

        String rating =
                service.getRating(95);

        assertEquals("Excellent",rating);

    }

    @Test
    void testInvalidAttendance(){

        Performance p =
                new Performance(120,80,70,60,50);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.calculateScore(p)
        );

    }

    @Test
    void testInvalidTaskScore(){

        Performance p =
                new Performance(80,150,70,60,50);

        assertThrows(
                IllegalArgumentException.class,
                () -> service.calculateScore(p)
        );

    }

}