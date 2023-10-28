package com.toyota.repository;

import com.toyota.entity.ToyotaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ToyotaUser, Long> {

    Boolean existsByEmail(String email);

}
