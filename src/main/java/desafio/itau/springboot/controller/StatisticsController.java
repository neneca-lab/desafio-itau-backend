package desafio.itau.springboot.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.itau.springboot.dto.StatisticsResponse;
import desafio.itau.springboot.service.TransactionService;

@RestController
@RequestMapping("/estatistica")
public class StatisticsController {

    private final TransactionService transactionService;
    public StatisticsController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<StatisticsResponse> getStatistics() {
        DoubleSummaryStatistics statistics = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsResponse(statistics));
    }

}
