package com.tlglearning.fizzbuzz.model;

import org.junit.jupiter.api.function.Executable;

class InvalidInvocation implements Executable {

  private final Analysis analysis;
  private final int value;

  public InvalidInvocation(int value, Analysis analysis) {
    this.value = value;
    this.analysis = analysis;
  }

  @Override
  public void execute() throws Throwable {
    analysis.analyze(value);
  }

}
