package CollectionFramwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class  Code implements Comparable<Code>{
    private String section;
    private String lecture;

    public Code(String section, String lecture) {
        this.section = section;
        this.lecture = lecture;
    }

    public String getSection() {
        return section;
    }

    public String getLecture() {
        return lecture;
    }

    @Override
    public String toString() {
        return "Code{" +
                "section='" + section + '\'' +
                ", lecture='" + lecture + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code=getSection().concat(getLecture());
        String code2=o.getSection()+o.getLecture();

        return code.compareTo(code2);
    }
}
public class TreeMaps {
    public static void main(String[]   args) {
        Map<Code,String> student=new TreeMap<>();
        student.put(new Code("S01","L01"),"Name");


        /*for (Map.Entry<Integer,String> data: student.entrySet()
        ) {
            System.out.println(data);
            //System.out.println("Key: "+data.getKey()+ "  Value: "+data.getValue());
        }

        for (Integer i: student.keySet()
        ) {

            System.out.println("Key: "+i+ "  Value: "+student.get(i));
        }*/

        Iterator<Map.Entry<Code,String>> entry=student.entrySet().iterator();

        while (entry.hasNext()){
            System.out.println(entry.next());
            //entry.next().getKey()
        }
    }
}
