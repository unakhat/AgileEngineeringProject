package edu.berkeley.aep;

public class Calculator {

    public double a;
    public double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double add() {
        double answer = a+b;
        return answer;
    }

    double subtract() {
        double answer = a-b;
        return answer;
    }

    double multiply() {
        double answer = a*b;
        return answer;
    }

    double divide() {
        double answer = a/b;
        return answer;
    }

    double power(){
         if(b==0)
            return 1;
        double answer =a;

        for (int x=2; x<=b; x++){
            answer *= a;
        }

        return answer;
    }
    
     double modulus()

    {
       double ret = a % b;
        if(ret < 0)
            ret+=b;
        return ret;

    }

}
