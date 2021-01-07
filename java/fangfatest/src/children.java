public class children extends father{
	
	private double va;
	
	public children () {
		System.out.println("this is children's gzff.wc");
	}
	
	public children(double va) {
		this.va = va;
		System.out.println("this is children's gzff.yc");
	}
	
	public children(double va,String color) {
		this.va = va;
		setColor(color);
		System.out.println("this is children's gzff.2c");
	}
	
	public double getVa() {
		return va;
	}
	
	
	public void childrenfangfa() {
		System.out.println("this children has created:  " + getDatecreated() + "color is:  " + getColor());
	}
	
	
}