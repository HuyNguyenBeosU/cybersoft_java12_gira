package cybersoft.javaBE.java12.gira.role.service.itf;

import java.util.List;

import cybersoft.javaBE.java12.gira.role.dto.CreateRoleDto;
import cybersoft.javaBE.java12.gira.role.entity.Role;
//abstraction
public interface RoleService {
	//contract
	List<Role> findAll();

	Role addNewRole(CreateRoleDto dto);
	
}
