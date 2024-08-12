package models;

import java.util.Random;

public class StackSort {
    private int vetSize = 0;
    private int[] vet = {};

    public StackSort(int vetSize) throws Exception{
        if(vetSize < 0)
            throw new Exception("Tamanho do vetor precisa ser maior ou igual a 0");
        this.vetSize = vetSize;
    }

    public int[] getVet() {
        return vet;
    }
    
    public void createVet(){
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);

        vet = new int[vetSize];

        for(int i = 0; i < vetSize; i++){
            vet[i] = random.nextInt(101); // Gera números de 0 a 100
        }
    }

    public void ordenar() {
        Stack mainStack = new Stack(vetSize);
        Stack auxStack = new Stack(vetSize);

        for(int i = 0; i < vetSize; i++){
            mainStack.push(vet[i]);
        }

        while (!mainStack.isEmpty()) {
            int temp = mainStack.top();
            mainStack.pop();

            while (!auxStack.isEmpty() && auxStack.top() > temp) {
                mainStack.push(auxStack.top());
                auxStack.pop();
            }

            auxStack.push(temp);
        }

        // Copiar os elementos ordenados de volta para a pilha original
        while (!auxStack.isEmpty()) {
            mainStack.push(auxStack.top());
            auxStack.pop();
        }
        
        for(int i = vetSize - 1; i > 0; i--){
            vet[i] = mainStack.top();
            mainStack.pop();
        }
    }
    
    public String exit() throws Exception{
        StackSort stackSort = new StackSort(vetSize);
        
        stackSort.createVet();
        
        String exit = "Vetor com valores randomizados de 0 a 100:\n";
        
        for(int i = 0; i < vetSize; i++){
            exit += stackSort.getVet()[i] + " ";
        }
        exit += "\n\n";
        
        stackSort.ordenar();
        
        exit += "Elementos ordenados:\n";
        for(int i = vetSize - 1; i >= 0; i--){
            exit += stackSort.getVet()[i] + " ";
        }
        
        return exit;
    }
}