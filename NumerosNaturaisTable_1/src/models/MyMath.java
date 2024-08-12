/*
 * [Resumo]
 * Classe com todos os Métodos referentes a biblioteca "Math"
 * que não foram utilizadas na tabela da interface principal
 *
 * [Autor]
 * Lucas Pereira Nunes

 */

package models;

import java.math.BigInteger;

public class MyMath {
    
    public static BigInteger mathSqrt(BigInteger number) {
        // Se o número for menor ou igual a 3, retornar o próprio número
        if (number.compareTo(BigInteger.valueOf(3)) <= 0) {
            return number;
        }
        
        BigInteger two = BigInteger.valueOf(2);
        BigInteger recursive = number;
        BigInteger precision = BigInteger.ONE.shiftLeft(number.bitLength() / 2);

        for (int i = 0; i < 10; i++) {
            recursive = recursive.divide(two).add(number.divide(recursive.multiply(two))).divide(two);
        }

        return recursive;
    }
}
