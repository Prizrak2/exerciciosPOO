package models;

public class Stack {

    private final int[] Stack;
    private int top;
    private final int size;

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.Stack = new int[size];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull(){
        return this.top >= size - 1;
    }

    public int top() {
        if (this.isEmpty()) {
            System.out.println("Erro: A pilha está Vazia!");
            return Integer.parseInt(null);
        }
        return this.Stack[this.top];
    }

    public void pop() {
        if (this.isEmpty()) {
            System.out.println("Erro: A pilha está Vazia!");
        }
        --top;
    }

    public void push(int valor) {
        if(this.isFull()){
            System.out.println("Erro: A pilha está cheia!");
        } else {
            this.Stack[++top] = valor;
        }
    }
}