package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

/**
 * @author itutry
 * @create 2020-05-21_16:26
 */
public enum EventType {
  UPLOAD("U"),
  DOWNLOAD("D");

  private String code;

  EventType(String code) {
    this.code = code;
  }

  @JsonValue
  public String serialize() {
    return this.code;
  }

  @JsonCreator
  public static EventType deserialize(String value) {
    return Arrays.stream(EventType.values()).filter(type -> value.equals(type.code)).findAny().get();
  }
}
