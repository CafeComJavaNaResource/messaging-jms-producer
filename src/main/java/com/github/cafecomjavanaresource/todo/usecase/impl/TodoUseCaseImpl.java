package com.github.cafecomjavanaresource.todo.usecase.impl;

import com.github.cafecomjavanaresource.todo.converter.TodoConverter;
import com.github.cafecomjavanaresource.todo.usecase.TodoUseCase;
import com.github.cafecomjavanaresource.todo.usecase.data.TodoEntity;
import lombok.AllArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TodoUseCaseImpl implements TodoUseCase {

    private final JmsTemplate jmsTemplate;
    private final TodoConverter todoConverter;

    @Override
    public void createTodo(TodoEntity todoEntity) {

        jmsTemplate.convertAndSend("todo-channel", todoConverter.toMessage(todoEntity));

    }
}
