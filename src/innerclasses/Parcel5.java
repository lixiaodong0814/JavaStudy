package innerclasses;

/*
 * 局部内部类
 * 方法内部
 */
public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {

			private String label;
			
			public PDestination(String whereTo) {
				label = whereTo;
			}
			
			@Override
			public String readLabel() {
				return label;
			}
		}
		
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tasmania");
		System.out.println(d.readLabel());
	}
}
