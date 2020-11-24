package com.devmind.curs11.temaCurs11;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Project: temaCurs11
 * Author: mihai
 * Date: 11/24/2020
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TeacherConfig.class)
class TeachersTest {

    @Autowired
    private ITeacher javaTeacher;

    @Autowired
    private ITeacher mathTeacher;

    @Test
    void test(){
        String javaTeacherResponse = javaTeacher.getHomeWork();
        String mathTeacherResponse = mathTeacher.getWisdom();
        Assert.assertEquals("Java homework...", javaTeacherResponse);
        Assert.assertEquals("Hard work pays off", mathTeacherResponse);
    }
}
