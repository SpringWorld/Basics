package com.rudra.spring08;
import java.util.List;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import com.rudra.spring08.Point;
// these implementations are done for the initialize_callbacks and disposable_callbacks 
public class Triangle implements InitializingBean ,DisposableBean{
	private List<Point> points;
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw()	{
		for(Point point : points)
		{
			System.out.println("Point ( x :"+point.getX()+", y : "+point.getY()+")");
		}
	}
	public void afterPropertiesSet() throws Exception {
		// this methods is called when the bean is initialized
		System.out.println("Initializing beans afterPropertiesSet method() for triangle");
	}
	public void destroy() throws Exception {
		// this methods is called when the bean is Disposed(destroyed)
		System.out.println("Destroying beans destroy method() for triangle");
	}
}
