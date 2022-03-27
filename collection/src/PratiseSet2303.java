import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class PratiseSet2303 {
   public static HashSet<User> userNames = new HashSet<>();
    public static void main(String[] args) throws IOException {
            while (true) {
            BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
            String userName = reader.readLine();
            String password = reader.readLine();
          if ( userNames.add (new User(userName, password))) {
              System.out.println("Пользователь успешно добавлен");
            } else {
              System.out.println("Имя пользователя существует");
          }
          userNames.removeIf(x -> "".equals(x.getName()));


        }

    }

}
