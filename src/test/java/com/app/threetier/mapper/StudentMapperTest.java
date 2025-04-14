package com.app.threetier.mapper;

import com.app.threetier.domain.StudentVO;
import com.app.threetier.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class StudentMapperTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void taskInsertTest() {
        StudentVO studentVO = new StudentVO();
        studentVO.setKor(90);
        studentVO.setEng(45);
        studentVO.setMath(77);
        studentService.register(studentVO);
    }

    @Test
    public void taskListTest() {
        studentService.getStudents().stream().map(StudentVO::toString).forEach(log::info);
    }
}
