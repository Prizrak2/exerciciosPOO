package models;

public class BaseChanger {
    private int number = 0;
    private int base = 0;
    
    public BaseChanger() {}
    
    public BaseChanger(int number, int base) throws Exception{
        if(number < 0)
            throw new Exception("Número não pode ser menor que 0");
        this.number = number;
        if(base < 2 || base > 36)
            throw new Exception("Base precisa estar entre 2 e 36");
        this.base = base;
    }

    public String ConverteParaBaseX() {
        Stack p = new Stack(100);
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % base;
            p.push(remainder);

            number /= base;
        }

        while (!p.isEmpty()){
            // Se o resto for maior que 9, convertemos para letra

            result.append((char) (p.top() < 10 ? p.top() + '0' : p.top() + 'A' - 10));
            p.pop();
        }

        return result.toString();
    }
}
