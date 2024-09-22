package com.ameda.kisevu.jenkins_demo.service.serviceImpl;
/*
*
@author ameda
@project Jenkins-repo
*
*/

import com.ameda.kisevu.jenkins_demo.dto.PersonDTO;
import com.ameda.kisevu.jenkins_demo.entity.Person;
import com.ameda.kisevu.jenkins_demo.repo.PersonRepository;
import com.ameda.kisevu.jenkins_demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public Person savePerson(PersonDTO dto){
        Person person = Person.builder()
                .age(dto.getAge())
                .name(dto.getName())
                .build();
        return  repository.save(person);
    }

    @Override
    public List<Person> retrievePeople() {
        return repository.findAll();
    }

}
