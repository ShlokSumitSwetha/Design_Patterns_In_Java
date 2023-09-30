package Complete_Design_Patterns.observer_pattern2;


public class ObserverTest {

	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();

		//create observers
		Observer obj1 = new MyTopicSubscriber("Obj1");
		Observer obj2 = new MyTopicSubscriber("Obj2");
		Observer obj3 = new MyTopicSubscriber("Obj3");

		//attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);

		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);



		//check if any update is available
		obj1.update();

		//now send message to subject
		topic.postMessage("New Message1");
		topic.postMessage("New Message2");
		topic.postMessage("New Message3");
	}

}