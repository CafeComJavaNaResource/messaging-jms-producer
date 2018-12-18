package com.github.cafecomjavanaresource.todo.http;

import com.github.cafecomjavanaresource.todo.converter.TodoConverter;
import com.github.cafecomjavanaresource.todo.http.data.request.TodoRequest;
import com.github.cafecomjavanaresource.todo.http.data.response.SuccessResponse;
import com.github.cafecomjavanaresource.todo.usecase.TodoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
@AllArgsConstructor
public class TodoController {

    private final TodoConverter todoConverter;
    private final TodoUseCase todoUseCase;

    @PostMapping
    public SuccessResponse create(@RequestBody TodoRequest request) {

        todoUseCase.createTodo(todoConverter.toEntity(request));

        return new SuccessResponse(true);

    }


}
