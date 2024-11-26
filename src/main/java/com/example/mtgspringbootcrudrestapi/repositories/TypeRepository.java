package com.example.mtgspringbootcrudrestapi.repositories;

import com.example.mtgspringbootcrudrestapi.domain.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
}
