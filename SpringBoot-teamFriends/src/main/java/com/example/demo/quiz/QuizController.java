package com.example.demo.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.QuizDao;

@Controller
public class QuizController {

	@RequestMapping("/index")
	public String start(Model model) {
		model.addAttribute("title", "この人誰だろな？");
		return "index";
	}

	@RequestMapping("/quiz1")
	public String quiz1(Model model) {
		model.addAttribute("message", "問題文");
		return "quiz/quiz1";
	}

	@RequestMapping("/right")
	public String right(Model model) {
		return "quiz/right";
	}

	@RequestMapping("/wrong")
	public String wrong(Model model) {
		return "quiz/wrong";
	}
	
	private final QuizDao quizdao;
	@Autowired
	public QuizController(QuizDao quizdao) {
	this.quizdao = quizdao;
	}
	
}


