package Complete_Design_Patterns.bridge_pattern3;
public class TextMessage extends Message{
	 
    public TextMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(){
      messageSender.sendMessage();
    }
 
}