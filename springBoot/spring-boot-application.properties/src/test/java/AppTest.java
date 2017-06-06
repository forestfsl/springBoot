import com.forest.Application;
import com.forest.config.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by songlin on 03/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)

public class AppTest {
    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void testBlog() throws Exception {
        System.out.println("AppTest.testBlog()="+blogProperties);
        Assert.assertEquals("forest",blogProperties.getName());
        Assert.assertEquals("application.properties", blogProperties.getTitle());
    }
}
