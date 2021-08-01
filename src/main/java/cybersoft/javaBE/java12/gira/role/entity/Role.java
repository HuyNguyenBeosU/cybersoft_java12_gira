package cybersoft.javaBE.java12.gira.role.entity;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cybersoft.javaBE.java12.gira.common.entity.BaseEntity;

@Entity
@Table(name ="gira_role")
public class Role extends BaseEntity {	
	private String name;
	private String description;
	
	@ManyToOne
	private Group group;	
}
