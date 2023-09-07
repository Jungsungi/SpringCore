package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class NetworkClient{

    private String url;

    public NetworkClient( ) {
        System.out.println("생성자 호출, url = "+url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + " message = " + message);
    }

    //서비스 종료시 호출
    public void disconnect() {
        System.out.println("close " + url);
    }

    @PostConstruct  // DI 이후에 실행
    public void init() throws Exception {
        connect();
        call("초기화 연결 메시지");
    }

    @PreDestroy //빈이 종료되기 직전에 실행
    public void close() throws Exception {
        disconnect();
    }
}
