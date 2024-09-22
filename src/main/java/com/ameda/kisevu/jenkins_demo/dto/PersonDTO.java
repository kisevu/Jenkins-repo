package com.ameda.kisevu.jenkins_demo.dto;
/*
*
@author ameda
@project Jenkins-repo
*
*/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {
    private String name;
    private Integer age;
}
