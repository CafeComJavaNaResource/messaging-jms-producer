package com.github.cafecomjavanaresource.todo.converter;

import com.github.cafecomjavanaresource.todo.http.data.request.TodoRequest;
import com.github.cafecomjavanaresource.todo.message.data.TodoMessage;
import com.github.cafecomjavanaresource.todo.usecase.data.TodoEntity;

public interface TodoConverter {

    TodoEntity toEntity(TodoRequest todoRequest);

    TodoMessage toMessage(TodoEntity todoEntity);
}
