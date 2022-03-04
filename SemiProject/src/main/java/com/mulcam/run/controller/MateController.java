package com.mulcam.run.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mulcam.run.dto.Group;
import com.mulcam.run.dto.GroupAndMate;
import com.mulcam.run.dto.Mate;
import com.mulcam.run.service.MateService;

@Controller
public class MateController {

	@Autowired
	MateService mateService;

//	@GetMapping(value="/")
//	public String bankmain(Model model) {
//		model.addAttribute("cpage", "main");
//		return "main2";
//	}

	@GetMapping("/mate_main")
	public ModelAndView mate_main() {
		ModelAndView mv = new ModelAndView();
		try {
			List<GroupAndMate> mates = mateService.allpostInfo();
			mv.addObject("mates",mates);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@PostMapping("/Mmodal")
	public void Mmodal() {
		System.out.println("controller");
		try {
//			mateService.mateInfo(mate_articleNO);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@PostMapping("/Gmodal")
	public void Gmodal(@RequestParam(value="no") int mate_articleNO) {
		System.out.println("controller");
		try {
			mateService.mateInfo(mate_articleNO);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/mate_search")
	public String mate_search() {
		return "mate_search";
	}

	@GetMapping("/mate_map")
	public String mate_map() {
		return "mate_map";
	}

	@GetMapping("/mate_makemate")
	public String mate_makemate() {
		return "mate_makemate";
	}


	@PostMapping("/mate_makemate")
	public ModelAndView mate_makemate2(Mate mate) {
		ModelAndView mv = new ModelAndView("redirect:/mate_main");
		try {
			mateService.makeMate(mate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	@GetMapping("/mate_makegroup")
	public String mate_makegroup() {
		return "mate_makegroup";
	}
	 
	@PostMapping("/mate_makegroup")
	public ModelAndView mate_makegroup2(Group group) {
		ModelAndView mv = new ModelAndView("redirect:/mate_main");
		try {
			mateService.makeGroup(group);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
}