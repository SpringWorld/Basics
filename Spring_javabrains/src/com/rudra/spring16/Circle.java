package com.rudra.spring16;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//@Service
//@Controller      => these annotations(Stereotypes annotation) too work same as the @Component   =>  but these annotations let the spring know that what role the bean is doing in MVC
//@Repository
@Component // generic annotation for bean
public class Circle implements Shape {
	private Point center;
	@Autowired
	private MessageSource messageSource;
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public Point getCenter() {
		return center;
	}
	// now we will start to use spring-annotations for more functionality
	/*here we are using the required annotation which just make sure that the beans variable has been set before its execution ,in presence of the @Required .. if the particular function don't invoke then a exception will be thrown out.
	 if simple the @Resource is used without the name attribute then by default it searches for the same name as the member variable("center")*/
	@Override
	public void draw() {
System.out.println(this.messageSource.getMessage("drawing.point",new Object[]{center.getX(),center.getY()}
,"default point drawing",null));
System.out.println(this.messageSource.getMessage("greeting",null,"default greeting",null));
	}
	@Resource(name="Point2")
	public void setCenter(Point center) {
		this.center = center;
	}
	@PostConstruct
	public void initializeCircle(){
		System.out.println("init of circle");
	}
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("destruction of circle");
	}
}
