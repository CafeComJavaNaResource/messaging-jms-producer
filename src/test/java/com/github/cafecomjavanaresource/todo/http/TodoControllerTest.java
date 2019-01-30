package com.github.cafecomjavanaresource.todo.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.cafecomjavanaresource.todo.converter.TodoConverter;
import com.github.cafecomjavanaresource.todo.http.data.request.TodoRequest;
import com.github.cafecomjavanaresource.todo.usecase.TodoUseCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(TodoController.class)
public class TodoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    TodoConverter todoConverter;

    @MockBean
    TodoUseCase todoUseCase;

    @Test
    public void create() throws Exception {

        TodoRequest request = new TodoRequest("descricao");

        this.mockMvc.perform(post("/todo")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
        .content(new ObjectMapper().writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value("true"));
    }
}