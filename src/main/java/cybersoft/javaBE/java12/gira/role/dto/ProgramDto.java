package cybersoft.javaBE.java12.gira.role.dto;

import cybersoft.javaBE.java12.gira.role.util.HttpMethods;

public interface ProgramDto {
	// projection
	public Long getId();
	public String getName();
	public String getPath();
	public HttpMethods getMethod();
}
