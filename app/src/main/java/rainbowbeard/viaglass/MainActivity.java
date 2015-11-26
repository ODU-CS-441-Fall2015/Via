package rainbowbeard.viaglass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCameraClick(View v) {
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

    public void onRetrieverClick(View view) {
        Intent intent = new Intent(this, ImageSearchActivity.class);
        startActivity(intent);
    }
}
