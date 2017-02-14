package com.rudra.spring13;
import org.springframework.beans.factory.annotation.Required;
public class Circle implements Shape {
	private Point center;
	public Point getCenter() {
		return center;
	}
	// now we will start to use spring-annotations for more functionality
	/*here we are using the required annotation which just make sure that the beans variable has been set before its execution  */
	/* in presence of the @Required .. if the particular function don't invoke then a exception will be thrown out.*/	
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw() {
		System.out.println(" Drawing the circle with center ("+center.getX()+","+center.getY()+")");
	}
}
