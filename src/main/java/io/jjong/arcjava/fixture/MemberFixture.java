package io.jjong.arcjava.fixture;

import io.jjong.arcjava.dto.MemberDto;
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
