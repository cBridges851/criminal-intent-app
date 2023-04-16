package uk.ac.wlv.criminalintent;

import java.util.ArrayList;
import java.util.List;

public class SearchHelper {
    public List<Crime> getResults(String query, List<Crime> crimes) {
        List<Crime> results = new ArrayList<>();
        for (Crime crime : crimes) {
            if (crime.getTitle().contains(query)) {
                results.add(crime);
            }
        }
        
        return results;
    }
}
