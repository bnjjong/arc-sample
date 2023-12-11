package io.df.henry.arc.sample.service;


import io.df.henry.arc.sample.dto.MemberDto;
import io.df.henry.arc.sample.fixture.MemberFixture;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberServiceImpl
    implements MemberService {

  @Override
  public List<MemberDto> retrieveMembers() {
    return MemberFixture.retrieveSampleMembers();
  }
}
