package reactorex1;

public class MainApp {

	public static void main(String[] args) {
		MyPublisher myPublisher = new MyPublisher();
		MySubscriber mySubscriber = new MySubscriber();

		myPublisher.subscribe(mySubscriber);
		
	}

}
