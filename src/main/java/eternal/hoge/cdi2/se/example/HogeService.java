package eternal.hoge.cdi2.se.example;

import javax.inject.*;

public class HogeService {
    @Inject
    private HogeExecuter exec;

    public void say() {
        exec.say();
    }
}
