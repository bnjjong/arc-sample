package io.df.henry.arc.sample.service;

import io.df.henry.arc.sample.dto.MemberDto;
import java.util.List;

public interface MemberService {
  List<MemberDto> retrieveMembers();
}
