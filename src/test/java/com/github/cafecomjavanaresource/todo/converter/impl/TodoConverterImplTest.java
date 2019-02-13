package com.github.cafecomjavanaresource.todo.converter.impl;

import com.github.cafecomjavanaresource.todo.http.data.request.TodoRequest;
import com.github.cafecomjavanaresource.todo.message.data.TodoMessage;
import com.github.cafecomjavanaresource.todo.usecase.data.TodoEntity;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class TodoConverterImplTest {

    @InjectMocks
    TodoConverterImpl todoConverter;

    @Test
    public void testToEntity() {

        TodoRequest request = new TodoRequest("This is my description");

        TodoEntity result = todoConverter.toEntity(request);

        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result.getDescription()).isNotNull();
        Assertions.assertThat(result.getDescription()).isEqualToIgnoringCase("This is my description");

        result = todoConverter.toEntity(null);

        Assertions.assertThat(result).isNull();
    }

    @Test
    public void testToMessage() {

        TodoEntity entity = TodoEntity.builder()
                .description("My description")
                .build();

        TodoMessage result = todoConverter.toMessage(entity);

        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result.getDescription()).isNotNull();
        Assertions.assertThat(result.getDescription()).isEqualToIgnoringCase("My description");

        result = todoConverter.toMessage(null);

        Assertions.assertThat(result).isNull();

    }
}