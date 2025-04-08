package desafio.itau.springboot.controller;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.itau.springboot.dto.TransactionRequest;
import desafio.itau.springboot.model.Transaction;
import desafio.itau.springboot.service.TransactionService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/transacao")
public class TransactionController {
    
    private final TransactionService transactionService;
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Void> addTransaction(@Valid @RequestBody TransactionRequest transaction) {
        if (transaction.getDataHora().isAfter(OffsetDateTime.now()) || transaction.getValor() <= 0) {
            return ResponseEntity.unprocessableEntity().build();
        }

        transactionService.addTransaction(new Transaction(transaction.getValor(), transaction.getDataHora()));

        return ResponseEntity.status(HttpStatus.CREATED).build(); 
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransactions() {
        transactionService.clearTransactions();
        return ResponseEntity.ok().build();
    }
}
