package org.oauth2.shopapp.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Products {


    @Id
    String id;
    String name;
    String description;
    String thumbnail;
    Date createdAt;
    LocalDate updateAt;
    Boolean active;
    Double price;

    @DBRef
    Categories categories;

}
