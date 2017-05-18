package cn.forest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Created by songlin on 17/05/2017.
 */
@Configuration
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("MyCommandLineRunner1.run()");
    }
}
