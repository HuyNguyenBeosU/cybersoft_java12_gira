package cybersoft.javaBE.java12.gira.role.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AddProgramDto {
	@NotNull
	@Min(value = 1)
	private Long RoleId;
	@NotNull
	@Min(value = 1)
	private Long ProgramId;
	
	/*getter setter*/
	public Long getRoleId() {
		return RoleId;
	}
	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}
	public Long getProgramId() {
		return ProgramId;
	}
	public void setProgramId(Long programId) {
		ProgramId = programId;
	}
	
}
