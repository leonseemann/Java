package Generic;

public class Generic {
    public <T> void Test(T data){
        System.out.println(data.getClass());
        System.out.println(data);
    }
}
