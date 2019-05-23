package com.cav.googlecloud.security.controllers;

import java.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cav.googlecloud.security.model.Fund;


@RestController
public class SecureController {

	@PostMapping
	@Secured("ROLE_USER")
	@RequestMapping(value = "/AddFunds", method = RequestMethod.POST)
	@PreAuthorize("hasPermission(#fund, 'place-funds')")
	Map<String, Object> placeOrder(Fund fund) {

		Map<String, Object> map = new HashMap<>();
		map.put("fundId", UUID.randomUUID());
		return map;
	}
	
	@GetMapping
	@Secured("ROLE_ADMIN")
	Map<String, Object> manage(@AuthenticationPrincipal Principal user) {
		return Collections.singletonMap("user", user.getName());
	}
}
