package com.employee;

import com.employee.model.Performance;
import com.employee.service.EvaluationService;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        EvaluationService service =
                new EvaluationService();

        Performance p =
                new Performance(90,85,80,75,70);

        double score =
                service.calculateScore(p);

        String rating =
                service.getRating(score);

        System.out.println("Score: "+score);

        System.out.println("Rating: "+rating);

        // Keep container alive for Kubernetes
        while(true){
            Thread.sleep(60000);
        }

    }

}