package cybersoft.javaBE.java12.gira.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cybersoft.javaBE.java12.gira.role.util.HttpMethods;

public class CreateProgramDto {
	@NotNull(message = "{program.name.not-blank}")
	@Size(min = 3, max = 50, message = "{program.name.size}")
	private String name;
	
	@NotBlank
	private String path;
	
	@NotNull
	private HttpMethods method;
	
	/* getter setter*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public HttpMethods getMethod() {
		return method;
	}
	public void setMethod(HttpMethods method) {
		this.method = method;
	}
	
}
