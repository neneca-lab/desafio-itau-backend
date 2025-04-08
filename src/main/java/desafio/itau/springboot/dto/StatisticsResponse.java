package desafio.itau.springboot.dto;

import java.util.DoubleSummaryStatistics;

import lombok.Getter;

@Getter
public class StatisticsResponse {

    private long count;
    private double sum;
    private double avg;
    private double min;
    private double max;


    public StatisticsResponse(DoubleSummaryStatistics statistics) {
        this.count = statistics.getCount();
        this.sum = statistics.getSum();
        this.avg = statistics.getAverage();
        this.min = statistics.getMin();
        this.max = statistics.getMax();
    }   
}  