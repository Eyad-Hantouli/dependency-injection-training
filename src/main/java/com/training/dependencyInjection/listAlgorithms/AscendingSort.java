package com.training.dependencyInjection.listAlgorithms;

import java.util.Collections;
import java.util.List;

public class AscendingSort implements SortAlgorithmInterface {
    @Override
    public void sort(List array) {
        Collections.sort(array);
    }
}
