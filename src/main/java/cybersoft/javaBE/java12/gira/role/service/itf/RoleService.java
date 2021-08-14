package cybersoft.javaBE.java12.gira.role.service.itf;

import java.util.List;

import javax.validation.Valid;

import cybersoft.javaBE.java12.gira.role.dto.AddProgramDto;
import cybersoft.javaBE.java12.gira.role.dto.CreateRoleDto;
import cybersoft.javaBE.java12.gira.role.dto.RoleDto;
import cybersoft.javaBE.java12.gira.role.entity.Role;
//abstraction
public interface RoleService {
	//contract
	List<RoleDto> findAll();

	Role addNewRole(CreateRoleDto dto);

	Role addProgram(AddProgramDto dto);
	
}
