package com.count.Count.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.count.Count.Model.Subject;
import com.count.Count.Service.SubjectService;
import com.count.Count.Service.Repo.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;
//
//    @Override
//    public List<Subject> getAllSubjects() {
//        return subjectRepository.findAll();
//    }
//
//    @Override
//    public void saveSubject(Subject subject) {
//        subjectRepository.save(subject);
//    }
//
//    @Override
//    public Subject getSubjectById(long id) {
//        Optional<Subject> optional = subjectRepository.findById(id);
//        Subject subject = null;
//        if (optional.isPresent()) {
//            subject = optional.get();
//        } else {
//            throw new RuntimeException(" Subject not found for id :: " + id);
//        }
//        return subject;
//    }
//
//    @Override
//    public void deleteSubjectById(long id) {
//        this.subjectRepository.deleteById(id);
//    }

    @Override
    public long getSubjectCount() {
        return subjectRepository.count();
    }
}

