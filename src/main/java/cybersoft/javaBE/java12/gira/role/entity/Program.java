package cybersoft.javaBE.java12.gira.role.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cybersoft.javaBE.java12.gira.common.entity.BaseEntity;
import cybersoft.javaBE.java12.gira.role.util.HttpMethods;

@Entity
public class Program extends BaseEntity {
	@NotNull
	@Column(unique = true)
	@Size(min = 3, max = 50)
	private String name;
	private HttpMethods method; //safe type
	private String path;
	
	@ManyToMany(mappedBy="programs")
	private Set<Role> roles = new HashSet<>();
	
	/*getter setter*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HttpMethods getMethod() {
		return method;
	}

	public void setMethod(HttpMethods method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
