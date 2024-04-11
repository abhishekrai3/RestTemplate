package com.example.RestTemplateApplication.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE) // it has lowest priority
public class ArticleResponse {

    String author;
    String title;
    String description;

}
