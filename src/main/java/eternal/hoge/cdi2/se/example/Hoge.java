package eternal.hoge.cdi2.se.example;

import javax.enterprise.event.*;


public class Hoge {
    public void onEvent(@Observes HogeEvent ignored, HogeService service) {
        service.say();
    }
}
