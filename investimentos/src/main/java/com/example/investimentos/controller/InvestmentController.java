package com.example.investimentos.controller;

import com.example.investimentos.model.Investment;
import com.example.investimentos.service.InvestmentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/investimentos")
public class InvestmentController {

    private final InvestmentService service;

    public InvestmentController(InvestmentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Investment> create(@Valid @RequestBody Investment investment) {
        Investment saved = service.save(investment);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public List<Investment> listAll() {
        return service.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Investment> update(@PathVariable Long id, @Valid @RequestBody Investment updatedInvestment) {
        return service.findById(id)
                .map(existing -> {
                    existing.setNome(updatedInvestment.getNome());
                    existing.setTipo(updatedInvestment.getTipo());
                    existing.setValorInvestido(updatedInvestment.getValorInvestido());
                    existing.setDataInvestimento(updatedInvestment.getDataInvestimento());
                    return ResponseEntity.ok(service.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return service.findById(id)
                .map(existing -> {
                    service.deleteById(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

