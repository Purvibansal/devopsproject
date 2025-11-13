public class App {

    public static void main(String[] args) {
        System.out.println("Hello from Jenkins CI Test!");
        
        App app = new App();
        int result = app.add(10, 20);
        System.out.println("Addition Result: " + result);
    }

    public int add(int a, int b) {
        return a + b;
    }
}
