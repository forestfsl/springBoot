import com.forest.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * Created by songlin on 03/06/2017.
 */
// SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
//指定我们SpringBoot工程的Application启动类
@SpringApplicationConfiguration(classes = Application.class)
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class AppTest {
    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void sendSimpleEmail(){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("438864519@qq.com");//发送者
        message.setTo("756613301@qq.com");//接受者
        message.setSubject("测试邮件(邮件主题)");//邮件主题
        message.setText("这是邮件内容");//邮件内容

        mailSender.send(message); //发送邮件
        System.out.println("邮件已发送");
    }

    /**
     * 测试发送附件
     */
    @Test
    public void sendAttachmentsEmail() throws MessagingException {
        //这个是javax.mail.internet.MimeMessage下的
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        //基本设置
        helper.setFrom("438864519@qq.com");
        helper.setTo("756613301@qq.com");
        helper.setSubject("测试邮件(邮件主题)");
        helper.setTo("这是测试邮件(有附件)");

        //org.springframework.core.io.FileSystemResource
        //附件1,获取文件对象
        FileSystemResource file1 = new FileSystemResource(new File("/Users/songlin/Picture/a.jpg"));
        //添加附件:这里第一个参数是在邮件中显示的名称,也可以直接是head.jpg,但是一定要有文件后缀,不然无法显示图片
        helper.addAttachment("头像1.jpg",file1);
        //附件2
        FileSystemResource file2 = new FileSystemResource(new File("/Users/songlin/Picture/a.jpg"));
        helper.addAttachment("头像2.jpg",file2);
        mailSender.send(mimeMessage);
    }

    /**
     * 使用静态资源
     */
    @Test
    public void sendInlineMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        //基本设置
        helper.setFrom("438864519@qq.com");
        helper.setTo("756613301@qq.com");
        helper.setSubject("测试邮件(邮件主题)");
        helper.setTo("这是测试静态资源邮件(有附件)");

        //邮件内容,第二个参数指定发送的是html格式
        //说明:嵌入图片<img src='cid"head'/>其中cid:是固定的写法,而aaa是一个contentId
        helper.setText("<body>这是图片:<img src='cid:head' /><body>",true);
        FileSystemResource file2 = new FileSystemResource(new File("/Users/songlin/Picture/a.jpg"));
        helper.addAttachment("head",file2);
        mailSender.send(mimeMessage);
    }
}
