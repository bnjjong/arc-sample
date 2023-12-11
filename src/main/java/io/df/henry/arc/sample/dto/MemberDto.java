package io.df.henry.arc.sample.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class MemberDto {
  private String name;
  private int age;
  private String city;
  private String email;

  public MemberDto(
      @NonNull String name,
      int age,
      @NonNull String city,
      @NonNull String email) {
    this.name = name;
    this.age = age;
    this.city = city;
    this.email = email;
  }
}
