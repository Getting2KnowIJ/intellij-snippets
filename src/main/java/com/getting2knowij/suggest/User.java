package com.getting2knowij.suggest;

public record User() {
  public boolean onVacation() {
    return false;
  }

  public boolean isOffsite() {
    return false;
  }

  public Agenda getAgenda() {
    return new Agenda();
  }
}
