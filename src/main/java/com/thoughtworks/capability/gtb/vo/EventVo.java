package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author itutry
 * @create 2020-05-21_16:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;

  private String name;

  private EventType type;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.[SSS]")
  @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
  private LocalDateTime time;

  @JsonUnwrapped
  private UserVo user;
}
