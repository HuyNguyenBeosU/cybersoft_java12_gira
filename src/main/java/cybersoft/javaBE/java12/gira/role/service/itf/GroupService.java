package cybersoft.javaBE.java12.gira.role.service.itf;

import java.util.List;

import cybersoft.javaBE.java12.gira.role.dto.CreateGroupDto;
import cybersoft.javaBE.java12.gira.role.dto.GroupDto;
import cybersoft.javaBE.java12.gira.role.entity.Group;

public interface GroupService {
	List<GroupDto> findAll();

	Group addNewGroup(CreateGroupDto dto);
}
