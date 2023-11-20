package com.training.dependencyInjection.listAlgorithms;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component("descendingSort")
public class DescendingSort implements SortAlgorithmInterface {
    @Override
    public void sort(List array) {
        Collections.sort(array, Collections.reverseOrder());
    }
}
