package com.example.listepain.models;

public class Bread {
  private String name;
  private int idealQuantity;

  public Bread(String name, int idealQuantity) {
    this.name = name;
    this.idealQuantity = idealQuantity;
  }

  public String getName() {
    return name;
  }

  public int getIdealQuantity() {
    return idealQuantity;
  }
}
