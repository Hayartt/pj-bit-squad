import java.util.Scanner;

/**
 * Created by Haya on 12/03/2018.
 */
public class InternetSpam {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (in.hasNext()) {
            String link =  in.nextLine();
            String[] tmp = link.split("rel=\"");
            String s;
            if(tmp.length > 1) {
                int index = tmp[1].indexOf('"');
                s = (index > 0)? tmp[1].substring(0, index) + " ": "";
                s = tmp[0] + "rel=\"" + s + "nofollow" + tmp[1].substring(index, tmp[1].length());
            } else {
                tmp = new String[2];
                tmp[0] = link.substring(0, link.indexOf('>'));
                tmp[1] = "\"" + link.substring(link.indexOf('>'), link.length());
                s = tmp[0] + " rel=\"nofollow" + tmp[1];
            }
            System.out.println(s.substring(s.indexOf('<'), s.lastIndexOf('>') + 1));
        }
    }
}