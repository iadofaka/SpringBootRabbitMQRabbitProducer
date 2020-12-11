package mx.santander.producer.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Document(collection = "tyc")
public class Tycs implements Serializable {

    @Id
    private int id;
    private String applicationId;
}
