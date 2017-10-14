package com.nendejan.scheduleking.models.data;


import com.nendejan.scheduleking.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


@Repository
@Transactional
public interface RoleDao extends CrudRepository<Role, Integer> {
}