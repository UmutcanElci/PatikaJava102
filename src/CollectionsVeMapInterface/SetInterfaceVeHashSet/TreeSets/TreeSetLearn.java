package CollectionsVeMapInterface.SetInterfaceVeHashSet.TreeSets;

import java.util.TreeSet;

public class TreeSetLearn {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparable());
        students.add(new Student("Adam",30));
        students.add(new Student("Ahmet",60));
        students.add(new Student("Damla",100));
        students.add(new Student("Mehmet",80));
        students.add(new Student("Adam",30));

        for (Student student:students){
            System.out.println(student.getName());
        }
    }
}
