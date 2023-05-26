package compiler.front.inter.stmt;

import compiler.front.inter.Node;

public class Stmt extends Node {

    public Stmt() {

    }
    public static Stmt Null = new Stmt();
    public static Stmt Enclosing = Stmt.Null; // used for break stmts
}