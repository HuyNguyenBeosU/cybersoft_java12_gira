package cybersoft.javaBE.java12.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;
import cybersoft.javaBE.java12.gira.role.dto.CreateProgramDto;
import cybersoft.javaBE.java12.gira.role.dto.ProgramDto;
import cybersoft.javaBE.java12.gira.role.entity.Program;
import cybersoft.javaBE.java12.gira.role.repository.ProgramRepository;
import cybersoft.javaBE.java12.gira.role.service.itf.ProgramService;

@Service
public class ProgramServiceImpl implements ProgramService{
	private ProgramRepository repository;
	public ProgramServiceImpl(ProgramRepository programRepository) {
		repository = programRepository;
	}

	@Override
	public List<ProgramDto> findAll() {
		return repository.findAllDto();
	}

	@Override
	public Program addNewProgram(CreateProgramDto dto) {
		Program newProgram = new Program();
		
		newProgram.setName(dto.getName());
		newProgram.setMethod(dto.getMethod());
		newProgram.setPath(dto.getPath());
		
		return repository.save(newProgram);
	}

	@Override
	public boolean isExistedId(Long programId) {
		return repository.existsById(programId);
	}

}
