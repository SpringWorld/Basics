package com.rudra.spring10;
import java.util.List;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// here we are using both types of lifecycle callbacks
public class Triangle implements InitializingBean ,DisposableBean{
	private List<Point> points;
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw()
	{
		for(Point point : points)
		{
			System.out.println("Point ( x :"+point.getX()+", y : "+point.getY()+")");
		}
	}
	// callbacks => via implementation has higher priority in execution than the one set via beans
	public void afterPropertiesSet() throws Exception {
		// this methods is called when the bean is initialized
		System.out.println("Initializing beans afterPropertiesSet method() for triangle");
	}
	public void destroy() throws Exception {
		// this methods is called when the bean is Disposed(destroyed)
		System.out.println("Destroying beans destroy method() for triangle");
	}
	public void init() {
		// this methods is called when the bean is initialized
		System.out.println("Initializing beans init method() for triangle");
	}
	public void cleanUp(){
		// this methods is called when the bean is Disposed(destroyed)
		System.out.println("Destroying beans cleanUp method() for triangle");
	}
}
