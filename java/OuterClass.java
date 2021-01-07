public class OuterClass { 

	innerClass in = new innerClass();
	
	public void out(){
		in.inf();
	}
	
	/*****************innerClass********************/
	/**/		class innerClass{
	/**/			innerClass(){
	/**/			}
	/**/			public void inf(){
	/**/			}
	/**/			int y = 0;
	/**/		}
   /*******************innerClass******************/	
	
	public innerClass doit(){
		//y = 4;
		in.y = 4;
		return new innerClass();
	}
	
	public static void main(String[] args){
		OuterClass out = new OuterClass();
		//内部类的对象实例化必须在外部类或者外部类的非静态方法中实现
		OuterClass.innerClass in = out.doit();
		OuterClass.innerClass in2 = out.new innerClass();
		
	}
}