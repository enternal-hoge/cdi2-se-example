package eternal.hoge.cdi2.se.example;

import javax.enterprise.inject.se.*;

public class Main {
	public static void main(String... args) {
		SeContainerInitializer containerInit = SeContainerInitializer.newInstance();
		SeContainer container = containerInit.initialize();

		// Fire synchronous event that triggers the code in Hoge class.
		container.getBeanManager().fireEvent(new HogeEvent());

		container.close();
	}
}
