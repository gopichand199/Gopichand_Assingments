package JavaA4;

public class Question1 {

	public static void main(String[] args) {
		LambdaFunction lambdaFunction1=(int a,int b) -> a+b;
		LambdaFunction lambdaFunction2=(int a,int b) -> a-b;
		LambdaFunction lambdaFunction3=(int a,int b) -> a*b;
		LambdaFunction lambdaFunction4=(int a,int b) -> a/b;

		System.out.println(lambdaFunction1.lambda(14,22));
		System.out.println(lambdaFunction2.lambda(43,23));
		System.out.println(lambdaFunction3.lambda(5,5));
		System.out.println(lambdaFunction4.lambda(10,2));

	}

}
interface LambdaFunction{
	int lambda(int x,int y);
	}


