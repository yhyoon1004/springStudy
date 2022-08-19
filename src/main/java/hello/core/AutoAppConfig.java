package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
		basePackages = "hello.core.member",//해당 패키지부터 하위패키지를 조회
		basePackageClasses = AutoAppConfig.class,//해당 클래스의 패키지 부터 하위패키지를 조회
		excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
		//ComponentScan하는 데  해당 타입의 어노테이션은 스캔안함, 제외
)      //Component라는 어노테이션이 붙은 것을 전부 스캔해 줌
public class AutoAppConfig {

}
