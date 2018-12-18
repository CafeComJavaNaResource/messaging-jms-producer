package com.github.cafecomjavanaresource.todo.converter.impl;

import com.github.cafecomjavanaresource.todo.converter.TodoConverter;
import com.github.cafecomjavanaresource.todo.http.data.request.TodoRequest;
import com.github.cafecomjavanaresource.todo.message.data.TodoMessage;
import com.github.cafecomjavanaresource.todo.usecase.data.TodoEntity;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
public class TodoConverterImpl implements TodoConverter {

    @Override
    public TodoEntity toEntity(TodoRequest todoRequest) {

        if (isNull(todoRequest)) return null;

        return TodoEntity.builder()
                .description(todoRequest.getDescription())
                .build();
    }

    @Override
    public TodoMessage toMessage(TodoEntity todoEntity) {
        if (isNull(todoEntity)) return null;

        return TodoMessage.builder()
                .description(todoEntity.getDescription())
                .build();
    }
}
