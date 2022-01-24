package Generic;

public class Generic {
    public <T> void Test(T data){
        System.out.println(data.getClass().getSimpleName());
        System.out.println(data + "\n");
    }
}
