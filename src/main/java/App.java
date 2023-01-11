import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HelloWorld bean: ? bean2 = " + (bean == bean2));

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Cat: bean ? bean2 = " + (catBean == catBean2));

    }
}