package uk.ac.wlv.criminalintent;

import android.content.Intent;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Sharer {
    public void shareToLinkedIn(Fragment fragment, String textContent) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setPackage("com.linkedin.android");
        shareIntent.setType("text/*");
        shareIntent.putExtra(Intent.EXTRA_TEXT, textContent);

        try {
            fragment.startActivity(shareIntent);
        } catch (Exception exception) {
            Toast.makeText(fragment.getActivity(), "Yo you don't have LinkedIn installed", Toast.LENGTH_SHORT).show();
        }
    }
}
