package desafio.itau.springboot.model;

import java.time.OffsetDateTime;
import lombok.Getter;

@Getter
public class Transaction {

    private double valor;
    private OffsetDateTime dataHora;

    public Transaction(double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }
}
