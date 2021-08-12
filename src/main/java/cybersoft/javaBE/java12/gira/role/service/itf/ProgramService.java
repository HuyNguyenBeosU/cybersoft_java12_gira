package cybersoft.javaBE.java12.gira.role.service.itf;

import java.util.List;

import cybersoft.javaBE.java12.gira.role.dto.CreateProgramDto;
import cybersoft.javaBE.java12.gira.role.entity.Program;

public interface ProgramService {
	List<Program> findAll();

	Program addNewProgram(CreateProgramDto dto);

}
