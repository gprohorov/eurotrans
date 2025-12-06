package edu.eurotrans.api.controller;
/*
  @author   Olga
  @project   EuroTrans
  @class  AndroidTrackerController
  @version  1.0.0
  @since 28.06.25 - 13.05
*/

import edu.eurotrans.api.dto.AndroidTrackerLocationData;
import edu.eurotrans.dao.entity.WorkTripSalaryHistoryEntity;
import edu.eurotrans.dao.service.SalaryService;
import edu.eurotrans.util.MapUpdater;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/tracker")
@RequiredArgsConstructor
public class AndroidTrackerController {

	private final MapUpdater mapUpdater;
	private final SalaryService salaryService;

	@RequestMapping(method = RequestMethod.POST, path = "/auth")
	public ResponseEntity<?> checkLogin(Authentication authentication) {
		return ResponseEntity.ok("Auth complete");
	}

	@PostMapping("/coordinates")
	public ResponseEntity<?> updateCoordinates(Authentication authentication, @RequestBody AndroidTrackerLocationData locationData) {
		locationData.setEmail(authentication.getName());
		mapUpdater.addLocationData(locationData);
		return ResponseEntity.ok("updating complete");
	}

	@GetMapping("/distance")
	public ResponseEntity<?> saveDailyDistance(Authentication authentication, @RequestParam Integer distance) {
		WorkTripSalaryHistoryEntity entity = salaryService.saveDailyDistance(authentication.getName(), distance);
		if (entity != null) {
			return ResponseEntity.ok("Save successful");
		}
		return ResponseEntity.status(500).build();
	}
}
