package testing;

public class TestRocker {

    public static void main(String[] args) {
        String output = views.index.template("World")
                .render()
                .toString();

        System.out.println(output);
    }

}
