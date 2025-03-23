package Foundation.Collections.Iterables;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    // maintains order if o1 and o2 are same
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
