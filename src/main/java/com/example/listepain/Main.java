package com.example.listepain;

import com.example.listepain.models.Bread;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criar a lista de pães
    List<Bread> breadList = createBreadList();

    // Exibir a tabela de pães
    displayBreadTable(breadList);
  }

  // Aqui cria a lista de pães com suas quantidades ideais
  private static List<Bread> createBreadList() {
    List<Bread> breadList = new ArrayList<>();

    // Aqui é adicionado cada tipo de pao e suas quantidades ideais
    breadList.add(new Bread("Pain clair", 10));
    breadList.add(new Bread("Pagnol clair", 3));
    breadList.add(new Bread("Pagnol rustique", 3));
    breadList.add(new Bread("Paysan", 3));
    breadList.add(new Bread("Epautre", 3));
    breadList.add(new Bread("Gottardo", 4));
    breadList.add(new Bread("Baguette", 8));
    breadList.add(new Bread("Courrone", 8));
    breadList.add(new Bread("Courrone Sils", 3));
    breadList.add(new Bread("Tessinois", 6));
    breadList.add(new Bread("Tessinois Sils", 3));
    breadList.add(new Bread("Tresse", 2));
    breadList.add(new Bread("Pain de mois", 2));
    breadList.add(new Bread("Pain fonce feu de bois", 2));
    breadList.add(new Bread("Pain clair feu de bois", 2));
    breadList.add(new Bread("Pain cuit feu de bois", 2));

    return breadList;
  }

  // Método para exibir a tabela de pães
  private static void displayBreadTable(List<Bread> breadList) {
    System.out.println("Paes\t\tQtd ideal\tQtd no Rayon\tQuanto assar");

    Scanner scanner = new Scanner(System.in);
    for (Bread bread : breadList) {
      System.out.print(bread.getName() + "\t\t" + bread.getIdealQuantity() + "\t\t");

      // Exibir a quantidade no Rayon (vitrine)
      System.out.print("\t\t");
      int currentQuantity = scanner.nextInt(); // Lê a quantidade no Rayon informada pelo usuário

      // Calcular e exibir a quantidade a ser assada
      int quantityToBake = Math.max(0, bread.getIdealQuantity() - currentQuantity);
      System.out.println(quantityToBake);
    }

    scanner.close();
  }
}
