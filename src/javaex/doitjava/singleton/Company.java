package javaex.doitjava.singleton;

public class Company {

    private static Company instance = new Company(); //유일하게 생성한 인스턴스
    private Company(){}

    public static Company getInstance(){    //인스턴스 외부에서 참조 가능하도록 public get()구현
        if(instance == null){
            instance = new Company();
        }
        return instance;    // 유일하게 생성한 instance 반환
    }
}
