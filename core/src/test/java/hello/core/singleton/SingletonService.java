package hello.core.singleton;

public class SingletonService {
    // static 영역에 객체를 딱 1개만 생성
    private static final SingletonService instance = new SingletonService();
    // public으로 객체 인스턴스가 필요하면 이 static 메서드를 통해 호출
    public static SingletonService getInstance() {
        return instance;
    }
    // private 생성자를 통해 외부에서 생성을 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
