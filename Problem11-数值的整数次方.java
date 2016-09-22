
/**
 * 实现函数Power（double base,int exponent）,求base的exponent的次方。不考虑大数问题。
 */
public  double Power(double base,int exponent){
		if(equal(base,0.0)&&exponent<0){
			return 0.0;
		}
		int absExponent=exponent;
		
		if(exponent<0){
			absExponent=-exponent;
		}
		double result=PowerWithExponent(base, absExponent);
		if(exponent<0){
			result=1.0/result;
		}
		return result;
		
	}
	
	public double PowerWithExponent(double base, int exponent){
		double res=1.0;
		for(int i=1;i<=exponent;i++){
			res *=base;
		}
		return res;
	}
	
	public boolean equal(double num1,double num2){
		if((num1-num2<0.0000001)&&(num1-num2>-0.0000001)){
			return true;
		}
		return false;
	}