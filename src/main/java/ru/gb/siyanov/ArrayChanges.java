package ru.gb.siyanov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChanges <T> {
    public void elementReplacement(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));

    }

    public List convertingToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
