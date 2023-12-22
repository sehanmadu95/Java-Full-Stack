package AbstractCocept;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class absCheck {

    String name;
    String dob;

    public absCheck(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public absCheck() {

    }

    public abstract  void print();


    public String print2(){

        System.out.println("Print 2 Method.....");
        return "";
    }



    //abs check
}

/**
 * abs clas can declrae constructor
   not must need abs method
   can both abs and normal method

 */
