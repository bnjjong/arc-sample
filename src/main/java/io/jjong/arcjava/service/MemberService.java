package io.jjong.arcjava.service;

import io.jjong.arcjava.dto.MemberDto;
import java.util.List;

public interface MemberService {
  List<MemberDto> retrieveMembers();
}
