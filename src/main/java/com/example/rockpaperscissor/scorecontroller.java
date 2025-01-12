package com.example.rockpaperscissor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class scorecontroller {
//	String data="not working";
	static Score score = new Score(34, 54, 89);


//	@GetMapping("/health")
//	public String check() {
//		return "helo world";
//	}
//
//	@GetMapping("/score")
//	public Score getScore() {
//		return score;
//	}

	@GetMapping("/score/{Result}")
	public int getResult(@PathVariable String Result) {
		if (Result.equalsIgnoreCase("wins")) {
			return score.wins;
		} else if (Result.equalsIgnoreCase("losses")) {
			return score.losses;
		} else if (Result.equalsIgnoreCase("ties")) {
			return score.ties;
		}
		return 400004;
	}

	@PostMapping("/score/{value}")
	public Score Addscore(@PathVariable String value) {
		if(value.equalsIgnoreCase("wins")) {
			score.wins++;
			return score; 
		}
		if(value.equalsIgnoreCase("losses")) {
			score.losses++;
			return score; 
		}
		if(value.equalsIgnoreCase("ties")) {
			score.ties++;
			return score; 
		}
		if(value.equalsIgnoreCase("clear")) {
			score.wins = 0;
			score.losses = 0;
			score.ties = 0;

			return score; 
		}
	
		return score;
		
		
	} 
//	@DeleteMapping("/score")
//	public Score deldata() {
//		score.wins = 0;
//		score.losses = 0;
//		score.ties = 0;
//
//		return score;
//
//	}

	@GetMapping("/score")
	public Score updatescore() {
		score.wins = 0;
		score.losses = 0;
		score.ties = 0;

		return score;
		
		
	} 
	

//	@RequestMapping("/score/{value}")
//	public String getresult(@PathVariable String value) {
//		if(value.isEmpty()) {
//			return "not mapped";
//		}else {return "not avalable";}
//
//	}

//	@GetMapping("/score/wins")
//	public int getWins() {
//		return score.wins;
//	}
//	@GetMapping("/score/losses")
//	public int getLosses() {
//		return score.losses;
//	}
//	@GetMapping("/score/ties")
//	public int getTies() {
//		return score.ties;
//	}

}
