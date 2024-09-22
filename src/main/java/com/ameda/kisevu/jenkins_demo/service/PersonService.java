package com.ameda.kisevu.jenkins_demo.service;
/*
*
@author ameda
@project Jenkins-repo
*
*/

import com.ameda.kisevu.jenkins_demo.dto.PersonDTO;
import com.ameda.kisevu.jenkins_demo.entity.Person;

import java.util.List;

public interface PersonService {
    Person savePerson(PersonDTO dto);
    List<Person> retrievePeople();
}
