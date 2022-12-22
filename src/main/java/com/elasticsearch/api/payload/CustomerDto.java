package com.elasticsearch.api.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private String id;
    private String first_name;
    private String last_name;
    private int age;
    private String res_code;
    private String res_msg;
}
