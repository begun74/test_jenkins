package test_jenkins.main;


import java.util.Collections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({ "bvv.ldap" })
//@PropertySource(value = { "classpath:app.properties" })
public class AppMain extends SpringBootServletInitializer  implements CommandLineRunner {


	//@Autowired
    //private ApplicationContext appContext;
    

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
    	SpringApplication app = new SpringApplication(AppMain.class);
    	
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8800"));
        app.run(args);
    }

    
    @Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
    	//String[] beans = appContext.getBeanDefinitionNames();
        //Arrays.sort(beans);
        //for (String bean : beans) {
          //  System.out.println(bean);
        //}
	}
    
}
