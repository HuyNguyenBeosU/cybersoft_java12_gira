package cybersoft.javaBE.java12.gira.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.javaBE.java12.gira.role.entity.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

}
