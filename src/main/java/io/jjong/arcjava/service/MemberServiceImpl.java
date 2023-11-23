package io.jjong.arcjava.service;

import io.jjong.arcjava.dto.MemberDto;
import io.jjong.arcjava.fixture.MemberFixture;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

  @Override
  public List<MemberDto> retrieveMembers() {
    return MemberFixture.retrieveSampleMembers();
  }
}
