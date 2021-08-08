package cybersoft.javaBE.java12.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javaBE.java12.gira.role.dto.CreateRoleDto;
import cybersoft.javaBE.java12.gira.role.entity.Role;
import cybersoft.javaBE.java12.gira.role.repository.RoleRepository;
import cybersoft.javaBE.java12.gira.role.service.itf.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	private RoleRepository repository;
	
	public RoleServiceImpl(RoleRepository roleRepository) {
		repository = roleRepository;
	}
	
	@Override
	public List<Role> findAll() {	
		return repository.findAll();
	}

	@Override
	public Role addNewRole(CreateRoleDto dto) {
		Role newRole = new Role();
		newRole.setName(dto.getName());
		newRole.setDescription(dto.getDescription());
		
		return repository.save(newRole);
	}

}