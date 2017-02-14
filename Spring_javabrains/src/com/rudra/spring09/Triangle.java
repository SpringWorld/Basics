package com.rudra.spring09;
import java.util.List;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// these implementations are done for the initialize_callbacks and disposable_callbacks 
public class Triangle {
	private List<Point> points;
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw(){
		for(Point point : points)
		{	
			System.out.println("Point ( x :"+point.getX()+", y : "+point.getY()+")");
		}
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
