/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author puc
 */
public class SavingAccount {
    
    private String fullName = "";
    private int agency = 0;
    private int accountNumber = 0;
    private float balance = 0;

    public SavingAccount() {
    }
    
    public SavingAccount(String fullName, int agency, int accountNumber, float balance) throws Exception{
        if(fullName.isEmpty())
            throw new Exception("Nome não pode ser vazio");
        this.fullName = fullName;
        if(agency <= 0)
            throw new Exception("Numero da Agência não pode ser menor que 0");
        this.agency = agency;
        if(accountNumber <= 0)
            throw new Exception("Numero da Conta não pode ser menor que 0");
        this.accountNumber = accountNumber;
        if(balance <= 0)
            throw new Exception("O saldo não pode ser menor que 0");
        this.balance = balance;
        if(balance < 1000)
            throw new Exception("O primeiro depósito não pode ser menor que 1000");
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws Exception{
        if(fullName.isEmpty())
            throw new Exception("Nome não pode ser vazio");
        this.fullName = fullName;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) throws Exception{
        if(agency <= 0)
            throw new Exception("Numero da Agência não pode ser menor que 0");
        this.agency = agency;
    }

    public int getNumberAccount() {
        return accountNumber;
    }

    public void setNumberAccount(int accountNumber) throws Exception{
        if(accountNumber <= 0)
            throw new Exception("Numero da Conta não pode ser menor que 0");
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) throws Exception{
        if(balance <= 0)
            throw new Exception("O saldo não pode ser menor que 0");
        this.balance = balance;
    }
    
    public float withdraw(float value) throws Exception{
        if(value <= 0)
            throw new Exception("O valor não pode ser menor que 0");
        if(value > balance)
                throw new Exception("O valor inserido é maior do que o saldo disponível!");
        balance -= value;
        return value;
    }
    
    public void deposit(float value) throws Exception{
        if(value <= 0)
            throw new Exception("O valor do depósito precisa ser maior do que 0");
        balance += value;
    }
    
    public String emitBalance(){
        String exit = "Banco seu Dinheiro é MEU\n";
        exit += "Agencia: " + agency + "\n";
        exit += "Número da Conta: " + accountNumber + "\n";
        exit += "Nome do Cliente " + fullName + "\n";
        exit += "Saldo: R$" + balance + "\n";
        
        return exit;
    }
}
