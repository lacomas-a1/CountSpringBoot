package com.count.Count.Service.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.count.Count.Model.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    long count();
}
