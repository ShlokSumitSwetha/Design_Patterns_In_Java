package Complete_Design_Patterns.without_bridge_pattern;

public class TextMessageSender extends TextMessage{

	@Override
	public void send() {
		System.out.println("sending text message");		
	}

}
