/*
 * [Resumo]
 * Classe com todos os Métodos referentes a tabela da interface principal
 *
 * [Autor]
 * Lucas Pereira Nunes

 */

package models;

import java.math.BigInteger;

public class NumerosNaturaisTable {

    private BigInteger number = BigInteger.ZERO;

    public NumerosNaturaisTable() {

    }

    public NumerosNaturaisTable(NumerosNaturaisTable object) {
        this.number = object.get();
    }

    public NumerosNaturaisTable(BigInteger number) throws Exception {
        if (number.compareTo(BigInteger.ZERO) < 0) {
            throw new Exception("Número não pode ser menor que 0");
        }
        this.number = number;
    }

    public void set(BigInteger number) throws Exception {
        if(number.compareTo(BigInteger.ZERO) < 0){
            throw new Exception("Numero não pode ser < 0");
        }
        this.number = number;
    }

    public void set(NumerosNaturaisTable object) {
        this.number = object.get();
    }

    public BigInteger get() {
        return number;
    }

    // Método de cálculo fatorial
    public NumerosNaturaisTable mathFatorial() throws Exception {
        BigInteger fat = BigInteger.ONE;
        for (BigInteger aux = number; aux.compareTo(BigInteger.ONE) >= 0; aux = aux.subtract(BigInteger.ONE)) {
            fat = fat.multiply(aux);
        }
        System.out.println(fat);
        return new NumerosNaturaisTable(fat);
    }

    // Método de verificação de números perfeitos
    public boolean mathNumeroPerfeito() {
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ONE; i.compareTo(number) < 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                sum = sum.add(i);
            }
        }
        return sum.equals(number);
    }

    // Método de verificação de números capicuas
    public boolean mathCapicua() {
        BigInteger tempNumber = number;
        BigInteger reverse = BigInteger.ZERO;

        while (!tempNumber.equals(BigInteger.ZERO)) {
            BigInteger digit = tempNumber.mod(BigInteger.TEN);
            reverse = reverse.multiply(BigInteger.TEN).add(digit);
            tempNumber = tempNumber.divide(BigInteger.TEN);
        }

        return number.equals(reverse);
    }

    // Método de verificação de quadrados perfeitos
    public boolean mathQuadradoPerfeito() {
        BigInteger sqrt = MyMath.mathSqrt(number);
        return sqrt.multiply(sqrt).equals(number);
    }

    // Método de verificação de números primos
    public boolean mathPrimo() {
        if (number.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        for (BigInteger i = BigInteger.TWO; i.compareTo(number.divide(BigInteger.TWO)) <= 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;
    }

    // Método de conversão de bases binárias
    public String mathConverteParaBaseX(int base) {
        StringBuilder result = new StringBuilder();
        BigInteger tempNumber = number;

        while (!tempNumber.equals(BigInteger.ZERO)) {
            BigInteger[] divisionAndRemainder = tempNumber.divideAndRemainder(BigInteger.valueOf(base));
            BigInteger remainder = divisionAndRemainder[1];
            char digit = (char) (remainder.compareTo(BigInteger.TEN) < 0 ? remainder.intValue() + '0' : remainder.intValue() - 10 + 'A');
            result.insert(0, digit);
            tempNumber = divisionAndRemainder[0];
        }

        return result.toString();
    }

    // Método para calcular o MDC
    public NumerosNaturaisTable mathMDC(NumerosNaturaisTable object) throws Exception {
        NumerosNaturaisTable tempNumber = new NumerosNaturaisTable(number);
        NumerosNaturaisTable tempSecondNumber = new NumerosNaturaisTable(object.get());

        while (!tempSecondNumber.get().equals(BigInteger.ZERO)) {
            BigInteger temp = tempSecondNumber.get();
            tempSecondNumber.set(tempNumber.get().mod(tempSecondNumber.get()));
            tempNumber.set(temp);
        }

        return tempNumber;
    }

    // Método para calcular o MMC
    public NumerosNaturaisTable mathMMC(NumerosNaturaisTable object) throws Exception {
        NumerosNaturaisTable Number = new NumerosNaturaisTable();
        Number.set((number.multiply(object.get())).divide(mathMDC(object).get()));
        return Number;
    }

    // Método para verificar se dois números são primos entre si
    public boolean mathPrimosEntreSi(NumerosNaturaisTable object) throws Exception {
        return mathMDC(object).get().equals(BigInteger.ONE);
    }
}