package com.ameda.kisevu.jenkins_demo.repo;/*
*
@author ameda
@project Jenkins-repo
*
*/

import com.ameda.kisevu.jenkins_demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
