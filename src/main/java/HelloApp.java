public class HelloApp {
    public static void main(String[] args) {

        String result;

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(name);
                first = false;
            }

            result = sb.toString();
        } else {
            result = "World";
        }

        System.out.println("Hello, " + result + "!");
    }
}