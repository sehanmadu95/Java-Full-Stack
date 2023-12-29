package AutoBoxUnbox;

import java.util.ArrayList;

public class Boxing {
    public static void main(String[] args) {
        ArrayList<Integer> studentNumber=new ArrayList<>();

        studentNumber.add(25); //AutoBoxing
        System.out.println(studentNumber.get(0));  //AutoUnboxing


        //user defind wrapper class

        ArrayList<intWrapper> useDefine=new ArrayList<>();

        useDefine.add(new intWrapper(25));  //boxing
        System.out.println(useDefine.get(0).getIntValue()); //unboxing


        //***************************************

        ArrayList<Double> dblArray=new ArrayList<>();

        dblArray.add(Double.valueOf(10.25));//done while autoboxing java inside
        System.out.println(dblArray.get(0).doubleValue());//done while unboxing
    }
}


class intWrapper{
    public int intValue;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}