package com.training.dependencyInjection.listAlgorithms;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component("ascendingSort")
public class AscendingSort implements SortAlgorithmInterface {
    @Override
    public void sort(List array) {
        Collections.sort(array);
    }
}
