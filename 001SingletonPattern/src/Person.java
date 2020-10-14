public class Person {
    private static Person instance;
    public static Person getInstance(){
        if(instance==null) {
            instance = new Person();
        }
        return instance;
    }
}
