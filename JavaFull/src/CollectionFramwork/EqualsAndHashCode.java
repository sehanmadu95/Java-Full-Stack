package CollectionFramwork;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class  Code2 implements Comparable<Code2>{
    private String section;
    private String lecture;

    public Code2(String section, String lecture) {
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
    public int compareTo(Code2 o) {
        String code=getSection().concat(getLecture());
        String code2=o.getSection()+o.getLecture();

        return code.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code2 code2 = (Code2) o;
        return Objects.equals(section, code2.section) && Objects.equals(lecture, code2.lecture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(section, lecture);
    }
}
public class EqualsAndHashCode {
    public static void main(String[] args) {
        Map<Code,String> student=new TreeMap<>();
       // student.put(new Code("S01","L01"),"Name");




        Iterator<Map.Entry<Code,String>> entry=student.entrySet().iterator();

        while (entry.hasNext()){
            System.out.println(entry.next());
            //entry.next().getKey()
        }

        String name1=new String("SHEHAN");
        String name2=new String("SHEHAN");

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

        System.out.println(name1==name2);


        System.out.println("======================");

        Code2 c1=new Code2("S01","L01");
        Code2 c2=new Code2("S01","L01");

        System.out.println("C1: "+c1.hashCode());
        System.out.println("C2: "+c2.hashCode());
        System.out.println(c1.equals(c2));



    }
}
