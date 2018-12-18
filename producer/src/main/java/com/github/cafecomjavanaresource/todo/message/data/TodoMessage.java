package com.github.cafecomjavanaresource.todo.message.data;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TodoMessage implements Serializable {

    private String description;
}
