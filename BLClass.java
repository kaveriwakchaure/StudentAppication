package Application2;

import java.util.ArrayList;
import java.util.List;

public class BLClass {
    private static List<Student> data = new ArrayList<>();

    private static List<Subject>data2=new ArrayList<>();

    {
        data.add(new Student(101, "abc", 16));
        data.add(new Student(102, "pqr", 17));
        data.add(new Student(103, "mnp", 18));
        data.add(new Student(104, "xyz", 19));
    }

    {
        data2.add(new Subject(1, "abc", 216));
        data2.add(new Subject(2, "pqr", 317));
        data2.add(new Subject(3, "mnp", 318));
        data2.add(new Subject(4, "xyz", 319));
    }


    public void addData(Student s) {
        data.add(s);
    }

    public void removeStudent(int id) {
        for (int i = 0; i < data.size(); i++) {
            if (id == data.get(i).getcId()) {
                data.remove(i);
            }
        }

    }
    public void update(int rollNo,String name,double marks){
        for (int i=0;i<data.size();i++){
            if(rollNo==data.get(i).getrollNo()){
                data.get(i).setName(name);
                data.get(i).setMark(marks);
            }

        }
    }
    public void displayStudent(int id, String subject, Double fees) {
        for (Student c : data) {
            System.out.println(c.getcId());
            System.out.println(c.getName());
            System.out.println(c.getcAge());

        }
    }
    public  void Search(int id){
        for (int i=0;i<data.size();i++){
            boolean status=true;
            if(status){
                if(id==data.get(i).getrollNo()){
                    data.contains(i);
                    for(Student c:data){
                        System.out.println(c.getName());
                        System.out.println(id==c.getrollNo());
                        System.out.println(c.getmark());
                    }
                }
            }
        }
    }


}
