package com.example.demo.Entity.MongoEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Document("Chips")
public class Chips {

    public enum Color {
        RED,
        BLUE
    }

    @Id
    private String id;

    @Indexed(name = "name")
    private String name;

    @Field("parentCompony")
    private String parent;

    private Color color;
    private Long expiry;

}