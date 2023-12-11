package io.df.henry.arc.sample.fixture;

import io.df.henry.arc.sample.dto.MemberDto;
import java.util.List;

public class MemberFixture {
  public static List<MemberDto> retrieveSampleMembers() {
    return List.of(
        new MemberDto("Henry", 22, "Seoul", "henry@sample.com"),
        new MemberDto("King", 52, "Busan", "king@google.com"),
        new MemberDto("Ken", 22, "Seoul", "ken@sample.com")
    );
  }
}
