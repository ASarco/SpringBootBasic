package com.imgarena.demo.controller;

import com.imgarena.demo.OperatorRepository;
import com.imgarena.demo.domain.Operator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperatorController {


  @Autowired
  private OperatorRepository operatorRepository;

  @GetMapping("/operators/{operatorId}")
  public ResponseEntity<Operator> getOperator(@PathVariable Integer operatorId) {
    var operator = operatorRepository.findById(operatorId);
    if (operator.isPresent()) {
      return ResponseEntity.ok(operator.get());
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @GetMapping("/operators/")
  public ResponseEntity<List<Operator>> getOperators() {
    var operators = operatorRepository.findAll();
    return ResponseEntity.ok(operators);
  }

}
