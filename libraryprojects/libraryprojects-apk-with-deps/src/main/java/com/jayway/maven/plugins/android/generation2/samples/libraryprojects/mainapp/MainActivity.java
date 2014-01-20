package com.jayway.maven.plugins.android.generation2.samples.libraryprojects.mainapp;

import android.os.Bundle;
import android.widget.TextView;
import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.aar1.AbstractActivityUsingResources;
import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.aar1.Aar1Class;
import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.apklibFromApklib.ApklibFromApklibClass;
import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.lib1.Lib1Class;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AbstractActivityUsingResources
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        setTextFromClass(R.id.aar1javaclass, Aar1Class.getString());
        setTextFromClass(R.id.lib1javaclass, Lib1Class.getString());
        setTextFromClass(R.id.lib2javaclass, ApklibFromApklibClass.getString());

        setTextFromAsset(R.id.aar1asset, "aar1asset.txt");
        setTextFromAsset(R.id.lib1asset, "lib1asset.txt");
        setTextFromAsset(R.id.lib2asset, "lib2asset.txt");
        
        setTextFromResource(R.id.aar1javaresource, "/aar1javaresource.txt");
        setTextFromResource(R.id.lib1javaresource, "/lib1javaresource.txt");
        setTextFromResource(R.id.lib2javaresource, "/lib2javaresource.txt");
    }
    
    private void setTextFromClass(int id, String text) {
        final TextView view = (TextView) findViewById(id);
        view.setText(text);
    }
    
    private void setTextFromAsset(int id, String assetfilename) {
        final TextView view = (TextView) findViewById(id);
        try {
            final InputStream inputStream = getAssets().open(assetfilename);
            view.setText(IOUtils.toString(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void setTextFromResource(int id, String resourcePath) {
      final TextView view = (TextView) findViewById(id);
      try {
          final InputStream inputStream = this.getClass().getResourceAsStream(resourcePath);
          view.setText(IOUtils.toString(inputStream));
      } catch (IOException e) {
          e.printStackTrace();
      }
    }

}
