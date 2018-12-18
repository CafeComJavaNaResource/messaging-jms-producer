package com.github.cafecomjavanaresource.todo.usecase.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class TodoEntity {

    private String description;
}
