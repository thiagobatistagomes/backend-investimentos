package com.example.investimentos.service;

import com.example.investimentos.model.Investment;
import com.example.investimentos.repository.InvestmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestmentService {

    private final InvestmentRepository repository;

    public InvestmentService(InvestmentRepository repository) {
        this.repository = repository;
    }

    public Investment save(Investment investment) {
        return repository.save(investment);
    }

    public List<Investment> findAll() {
        return repository.findAll();
    }

    public Optional<Investment> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

