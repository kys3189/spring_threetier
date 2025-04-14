package com.app.threetier.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StudentVO {
    private Long id;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private Double average;
}
