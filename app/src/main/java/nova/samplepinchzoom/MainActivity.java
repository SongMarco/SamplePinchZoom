package nova.samplepinchzoom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;


public class MainActivity extends AppCompatActivity {

    ImageView m_imageview;
    PhotoViewAttacher mAttacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_imageview = (ImageView) findViewById(R.id.imageView   );
        mAttacher = new PhotoViewAttacher(m_imageview);



    }
}
