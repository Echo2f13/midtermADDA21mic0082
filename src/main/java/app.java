package my-response;
import java.util.ResourceBundle;
public class App {
	public int login(String userid,String id)
	{
			ResourceBundle rb= ResourceBundle.getBundle("config");
			String user=rb.getString("username");
			String id=rb.getString("id");
			if(userid.equals(user)&& password.equals(pass))
				return 1;
			else
				return 0;
	}
}
