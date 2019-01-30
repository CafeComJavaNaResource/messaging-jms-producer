package com.github.cafecomjavanaresource.todo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoApplicationTest {

    @Test
    public void contextLoads() {
        TodoApplication.main(new String[]{});
    }

}

