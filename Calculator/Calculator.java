

class Calculator{
	/*
	*Method that preform Arithmetic operation based on parameters
	*@param number1
	*@param number2
	*@param operator
	*/

	public int operation(int number1,int number2,String operator)
		switch(operator){
			case "Addition":{
				Addition(number1,number2);
				break;
			}
			case "Subtraction":{
				Subtraction(number1,number2);
				break;
			}
			case "Multiplication":{
				Multiplication(number1,number2);
				break;
			}
			case "Division":{
				Division(number1,number2);
				break;
			}
			default:{
				return -1;
			}
		}
		int Addition(int number1,int number2){
			return number1+number2;
		}
		int Subtraction(int number1,int number2){
			return number1-number2;
		}
		int Multiplication(int number1,int number2){
			return number1*number2;
		}
		int Division(int number1,int number2){
			if(number2!=0){
				return number1/number2;
			}
		}
	}