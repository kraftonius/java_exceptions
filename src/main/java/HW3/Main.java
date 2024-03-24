package HW3;

import HW3.App.App;

public class Main {
    public static void main(String[] args) {
        try (App app = new App()) {
            app.run();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
