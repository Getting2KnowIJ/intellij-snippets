package com.getting2knowij.suggest;

import java.time.LocalDateTime;

public record Agenda() {
  public boolean isInMeeting(LocalDateTime now) {
    return false;
  }
}
