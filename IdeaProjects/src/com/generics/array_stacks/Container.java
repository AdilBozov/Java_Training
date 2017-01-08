package com.generics.array_stacks;

/**
 * Created by Adil Bozov on 23.10.2016 г..
 */
public interface Container<T> {
    void push(T element);
    T pop();
}
