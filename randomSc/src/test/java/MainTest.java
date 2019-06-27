import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengjunbang.fbs.service.RandomService;

public class MainTest {
	
	public static void main(String[] args) throws IOException {
		
		//直接连接
		String [] conf = {"classpath:spring/spring-mybatis.xml","classpath:spring/spring-dubbo1.xml"};
		//zk连接
		//String [] conf = {"classpath:spring/spring-mybatis.xml","classpath:spring/spring-dubbo1.xml"};
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
		RandomService demoService=(RandomService) applicationContext.getBean("randomService");
		//打印代理类型 底层dubbo使用NIO的RCP做远程调度
		System.out.println("打印rpc信息:"+demoService.random());		
		applicationContext.start();
		System.in.read();
//		
	}

}
