package cybersoft.javaBE.java12.gira.role.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateProgramDto {
	@NotNull(message = "{program.name.not-blank}")
	@Size(min = 3, max = 50, message = "{program.name.size}")
	private String name;
	/* getter setter*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
