package cybersoft.javaBE.java12.gira.role.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javaBE.java12.gira.common.ResponseHandler;
import cybersoft.javaBE.java12.gira.role.dto.CreateGroupDto;
import cybersoft.javaBE.java12.gira.role.dto.GroupDto;
import cybersoft.javaBE.java12.gira.role.entity.Group;
import cybersoft.javaBE.java12.gira.role.service.itf.GroupService;

@RestController
@RequestMapping("/api/group")
public class GroupController {
	private GroupService service;
	
	public GroupController(GroupService groupService) {
		service = groupService;
	}
	
	@GetMapping("")
	public Object findAllGroup() {
		List<GroupDto> groups = service.findAll();
		return ResponseHandler.getResponse(groups, HttpStatus.OK);
	}
	
	@PostMapping
	public Object saveGroup(@Valid @RequestBody CreateGroupDto dto, BindingResult errors) {
		if(errors.hasErrors()) {
			return ResponseHandler.getResponse(HttpStatus.BAD_REQUEST);
		}
		Group addedGroup = service.addNewGroup(dto);
		
		return ResponseHandler.getResponse(addedGroup, HttpStatus.CREATED);
	}

}
