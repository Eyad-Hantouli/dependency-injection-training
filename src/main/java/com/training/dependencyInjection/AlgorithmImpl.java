package com.training.dependencyInjection;

import com.training.dependencyInjection.listAlgorithms.SortAlgorithmInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlgorithmImpl {
    private final SortAlgorithmInterface sortAlgorithmInterface;

    @Autowired
    public AlgorithmImpl(@Qualifier("descendingSort") SortAlgorithmInterface sortAlgorithmInterface) {
        this.sortAlgorithmInterface = sortAlgorithmInterface;
    }

    public void sort(List list) {
        this.sortAlgorithmInterface.sort(list);
    }
}
