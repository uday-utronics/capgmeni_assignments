package lamdaLearning;

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this is lambda function
		lambdainter fun = (String k) -> k.length();
		
		//here we are calling lambda function we just created
		//so naming something inside interface should be logical
		int k = fun.name("uday kumar");
		
		//it works this way bcaz "lambdainter" kindof tells what to expect as input and what will the out put as well;
		lambdainter fun1 = s -> s.length();
		
		int m = fun1.name("hamari adhuri kahani....");
		
		System.out.println(k);
		System.out.println(m);
		
	}

	
interface lambdainter{
	int name(String s);
}
}
