package uk.ac.wlv.criminalintent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class SearchActivity extends Activity {
    public static Intent newIntent(Context packageContext) {
        return new Intent(packageContext, SearchActivity.class);
    }
}
