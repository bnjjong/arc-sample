package io.jjong.arcjava.api;

import io.jjong.arcjava.dto.MemberDto;
import io.jjong.arcjava.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@Slf4j
@RequiredArgsConstructor
public class SampleApi {
  private final MemberService service;

  @GetMapping("/members")
  public ResponseEntity<List<MemberDto>> getMembers() {
    return new ResponseEntity<>(service.retrieveMembers(), HttpStatus.OK);
  }
}
