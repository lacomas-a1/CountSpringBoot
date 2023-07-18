package com.count.Count.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.count.Count.Service.Repo.SubjectRepository;

@Controller
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;
    
    
    @RequestMapping("/")
	public String loginPage() {
		return "subject-count";
	}
    
    @GetMapping("/")
    public String showDashboard(Model model) {
        long count = subjectRepository.count();
        System.out.println("Total number of subjects: " + count);
        model.addAttribute("count", count);
        return "subject-count";
    }


}

