package mx.com.juca;

import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

/**
 * @author jcruz
 *
 */
public class ApplicationExample {
	// Find your Account Sid and Token at twilio.com/user/account
	  public static final String ACCOUNT_SID = "AC6c86dea193faed598a9fa941023acbd1";
	  public static final String AUTH_TOKEN = "2ae0f1d455f8808274de7e4303c75f90";

	  public static void main(String[] args) throws URISyntaxException {
	    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

	    Call call = Call.creator(new PhoneNumber("+17326485285"),new PhoneNumber("+16097853142"),
	        new URI("http://demo.twilio.com/docs/voice.xml")).create();

	    System.out.println(call.getSid());
	    System.out.println(call);
	  }
}
