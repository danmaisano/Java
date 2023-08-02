import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return ("Hello " + name + ", it is lovely to see you today. How are you?");
    }

    public String guestGreeting() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        LocalTime time = LocalTime.now();
        int hour = Integer.parseInt(dtf.format(time));
        if (hour >= 5 && hour < 12) {
            return ("Good Morning!");
        }
        else if (hour >= 12 && hour < 17){
            return ("Good Afternoon!");
        }
        else {
            return ("Good Evening!");
        }
    }
    
    // public String dateAnnouncement() {  // Combined this with the Guest Greeting.
    // }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")){
            return "Right away, sir. Allow a real robot to assist you.";
        }
        else if (conversation.contains("Alfred")){
            return "At your service, always sir.";
        }
        else {
            return "I think it's past my bed time. Good night!";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
