package models;

public class MaquinaBanho {
    private int nivelAgua;
    private int nivelShampoo;
    private boolean temPet;
    private boolean precisaLimpeza;
    private static final int CAPACIDADE_MAX_AGUA = 30;
    private static final int CAPACIDADE_MAX_SHAMPOO = 10;
    
    public MaquinaBanho() {
        this.nivelAgua = CAPACIDADE_MAX_AGUA;
        this.nivelShampoo = CAPACIDADE_MAX_SHAMPOO;
        this.temPet = false;
        this.precisaLimpeza = false;
    }
    
    public void colocarPet() {
        if (temPet) {
            System.out.println("Já tem um pet na máquina!");
        } else if (precisaLimpeza) {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet!");
        } else {
            temPet = true;
            System.out.println("Pet colocado na máquina.");
        }
    }
    
    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina para retirar!");
        } else {
            temPet = false;
            precisaLimpeza = true;
            System.out.println("Pet retirado. A máquina precisa ser limpa.");
        }
    }
    
    public void darBanho() {
        if (!temPet) {
            System.out.println("Nenhum pet na máquina para tomar banho!");
        } else if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Não há recursos suficientes para o banho!");
        } else {
            nivelAgua -= 10;
            nivelShampoo -= 2;
            precisaLimpeza = false;
            System.out.println("Banho realizado com sucesso!");
        }
    }
    
    public void limparMaquina() {
        if (nivelAgua < 3 || nivelShampoo < 1) {
            System.out.println("Não há recursos suficientes para limpar a máquina!");
        } else {
            nivelAgua -= 3;
            nivelShampoo -= 1;
            precisaLimpeza = false;
            System.out.println("Máquina limpa e pronta para o próximo pet.");
        }
    }
    
    public void abastecerAgua() {
        if (nivelAgua + 2 > CAPACIDADE_MAX_AGUA) {
            System.out.println("Tanque de água cheio!");
        } else {
            nivelAgua += 2;
            System.out.println("Água abastecida. Nível atual: " + nivelAgua + " litros.");
        }
    }
    
    public void abastecerShampoo() {
        if (nivelShampoo + 2 > CAPACIDADE_MAX_SHAMPOO) {
            System.out.println("Tanque de shampoo cheio!");
        } else {
            nivelShampoo += 2;
            System.out.println("Shampoo abastecido. Nível atual: " + nivelShampoo + " litros.");
        }
    }
    
    public void verificarNiveis() {
        System.out.println("Nível de água: " + nivelAgua + " litros.");
        System.out.println("Nível de shampoo: " + nivelShampoo + " litros.");
    }
    
    public void verificarPetNaMaquina() {
        if (temPet) {
            System.out.println("Tem um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }
}




