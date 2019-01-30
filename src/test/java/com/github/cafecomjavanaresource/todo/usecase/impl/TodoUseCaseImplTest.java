package com.github.cafecomjavanaresource.todo.usecase.impl;

import com.github.cafecomjavanaresource.todo.converter.TodoConverter;
import com.github.cafecomjavanaresource.todo.usecase.TodoUseCase;
import com.github.cafecomjavanaresource.todo.usecase.data.TodoEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TodoUseCaseImplTest {

    @Mock
    JmsTemplate jmsTemplate;
    @Mock
    private TodoConverter todoConverter;
    private TodoUseCase todoUseCase;

    @Before
    public void setUp() {

        todoUseCase = new TodoUseCaseImpl(jmsTemplate, todoConverter);
    }

    @Test
    public void createTodo() {

        todoUseCase.createTodo(TodoEntity.builder().build());
    }
}