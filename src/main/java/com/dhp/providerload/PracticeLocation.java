package com.dhp.providerload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "practice_location", type = "_doc")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PracticeLocation implements Serializable {
    @Id
    private String name;
    private String city;
}
