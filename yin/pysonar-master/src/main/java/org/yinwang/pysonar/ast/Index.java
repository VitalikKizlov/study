package org.yinwang.pysonar.ast;

import org.jetbrains.annotations.NotNull;
import org.yinwang.pysonar.State;
import org.yinwang.pysonar.types.Type;


public class Index extends Node {

    public Node value;


    public Index(Node n, String file, int start, int end) {
        super(file, start, end);
        this.value = n;
        addChildren(n);
    }


    @NotNull
    @Override
    public Type transform(State s) {
        return transformExpr(value, s);
    }


    @NotNull
    @Override
    public String toString() {
        return "<Index:" + value + ">";
    }

}
