package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
	@Test
	void AutowiredOption(){
		ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
	}

	static class TestBean{
		@Autowired(required = false)//false로 설정해주면  해당 bean이 없으면 메서드 실행을 안함
		public void setNoBean1(Member noBean1){
			System.out.println("noBean1 = " + noBean1);
		}
		@Autowired
		public void setNoBean2(@Nullable Member noBean2){// @Nullable어노테이션을 주면 값이 없을 경우 null반환
			System.out.println("noBean2 = " + noBean2);
		}
		@Autowired
		public void setNoBean3(Optional<Member> noBean3){// 값이 없으면 Optional.empty를 반환
			System.out.println("noBean3 = " + noBean3);
		}

	}
}
