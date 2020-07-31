import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatching {

    public static void main(String[] args) {
        String html = "<div class=\"image\"> <img src=\"http://cdn.posh24.se/images/:profile/035cef1d44643a16848db29cf8a010e87\" alt=\"Snoop Dogg\"/> </div>";
        Pattern p = Pattern.compile("img src=\"(.*?)\"");
        Matcher m = p.matcher(html);

        Pattern p1 = Pattern.compile("alt=\"(.*?)\"");
        Matcher m1 = p1.matcher(html);

        while(m.find()){
            System.out.println(m.group(1));
        }

        while(m1.find()){
            System.out.println(m1.group(1));
        }
    }
}
