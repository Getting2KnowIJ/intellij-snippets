package com.getting2knowij.vcs;

public class Log {
  private Out out;

  public Log(Out out) {
    this.out = out;
  }

  public void info(String message) {

  }

  private interface Out {
  }
}
