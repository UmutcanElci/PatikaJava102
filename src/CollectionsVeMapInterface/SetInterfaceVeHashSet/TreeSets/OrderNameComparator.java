package CollectionsVeMapInterface.SetInterfaceVeHashSet.TreeSets;

import java.util.Comparator;

public class OrderNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote() - o2.getNote();
    }
}
