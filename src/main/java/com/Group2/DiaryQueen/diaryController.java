package com.Group2.DiaryQueen;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Group2.DiaryQueen.model.DiaryHome;

@Controller
@RequestMapping("/diary")
public class diaryController {
	
	private List<DiaryHome> diaries;
	
	@PostConstruct
	private void loadData() {
		//create diaries 
		DiaryHome d1 = new DiaryHome(1, "10/20","10:42","Travel Journal Day 1", "first day in Germany" );
		DiaryHome d2 = new DiaryHome(2, "10/23", "3:45", "Daily Journal", "daily record of the life");
		
		//create the list
		diaries = new ArrayList<>();
		
		//add to the list
		diaries.add(d1);
		diaries.add(d2);
		
	}
	
	
	//Mapping for the homepage list
	@GetMapping("/homepage")
	public String listDiaries(Model theModel) {
		theModel.addAttribute("diary", diaries);
		
		return "HomePage";
	}
	
	@GetMapping("/add")
	public String addNewDiary() {
		return "AddNew";
	}
	

}
