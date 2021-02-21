package io.niceseason.gulimall.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.niceseason.gulimall.member.entity.MemberEntity;
import io.niceseason.gulimall.member.service.MemberService;

@SpringBootTest
class GulimallMemberApplicationTests {

	@Autowired
	private MemberService memberService;

	@Test
	void contextLoads() {
		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setEmail("test@gmail.com");
		memberEntity.setUsername("小胜");
		memberService.save(memberEntity);
	}

}
