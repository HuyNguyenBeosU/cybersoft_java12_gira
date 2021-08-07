package cybersoft.javaBE.java12.gira.role.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	@GetMapping
	public Object findAllRole() {
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
	}
}
