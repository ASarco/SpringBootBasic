package com.imgarena.demo;

import com.imgarena.demo.domain.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator, Integer> {

}
