package com.example.investimentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do investimento é obrigatório")
    private String nome;

    @NotBlank(message = "O tipo de investimento é obrigatório")
    private String tipo;

    @DecimalMin(value = "0.01", message = "O valor investido deve ser maior que zero")
    private BigDecimal valorInvestido;

    @PastOrPresent(message = "A data do investimento não pode estar no futuro")
    private LocalDate dataInvestimento;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public BigDecimal getValorInvestido() { return valorInvestido; }
    public void setValorInvestido(BigDecimal valorInvestido) { this.valorInvestido = valorInvestido; }

    public LocalDate getDataInvestimento() { return dataInvestimento; }
    public void setDataInvestimento(LocalDate dataInvestimento) { this.dataInvestimento = dataInvestimento; }
}

