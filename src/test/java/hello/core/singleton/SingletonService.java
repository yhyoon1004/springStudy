package hello.core.singleton;

public class SingletonService {

	private static final SingletonService instance = new SingletonService();

	public static SingletonService getInstance(){
		return instance;
	}

	private SingletonService(){//외부에서 생성하는 것을 막기 위한 private 생성자
	}

	public void logic(){
		System.out.println("싱글톤 객체 로직 호출");
	}

}
