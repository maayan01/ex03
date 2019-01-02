package GameTools;

import Geom.Point3D;

public class Packman 
{
	//----------Fields--------------
	private Point3D p ;
	private double speed;
	private double radius;
	
	
	//-----------------------constructor------------------------------
	public Packman (Point3D p, double speed, double radius)
	{
		this.p = new Point3D(p);
		this.speed = speed;
		this.radius = radius;
	}
}
