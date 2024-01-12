package odevReplace;

public class OdevReplace {
    public static void main(String[] args) {
        String text = " karaaslan";

        // "an" yerine "--" ile değiştirme
        String result1 = text.replace("an", "--");
        System.out.println(result1);

        // "kara" yerine "x" ile değiştirme
        String result2 = text.replace("kara", "x");
        System.out.println(result2);

        // "as" yerine "12345" ile değiştirme
        String result3 = text.replace("as", "12345");
        System.out.println(result3);
    }
    }