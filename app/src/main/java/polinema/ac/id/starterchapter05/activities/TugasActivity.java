package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandStandFragment;
import polinema.ac.id.starterchapter05.fragments.PushUpFragment;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }

    public void handlerClickLoadHandStandFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);

        if (fragment == null || fragment instanceof DipsFragment || fragment instanceof PushUpFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .replace(R.id.dynamic_fragment_placeholder,new HandStandFragment(),"HANDSTAND_FRAGMENT")
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void handlerClickLoadDipsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);

        if (fragment == null || fragment instanceof HandStandFragment || fragment instanceof PushUpFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .replace(R.id.dynamic_fragment_placeholder,new DipsFragment(),"DIPS_FRAGMENT")
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void handlerClickLoadPushUpFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);

        if (fragment == null || fragment instanceof DipsFragment || fragment instanceof HandStandFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .replace(R.id.dynamic_fragment_placeholder,new PushUpFragment(),"PUSHUPS_FRAGMENT")
                    .addToBackStack(null)
                    .commit();
        }
    }
}
