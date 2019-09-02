package com.example.intellectual_awareness;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Display extends AppCompatActivity
{

    TextView textView;
    Button button;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        getSupportActionBar().hide();
        textView =findViewById(R.id.messageText);
        Bundle extras = getIntent().getExtras();
        int path = extras.getInt("body");

        textView.setMovementMethod(new ScrollingMovementMethod());
        if(String.valueOf(path).length()==1)
        {
            return;
        }
        String data="";
        StringBuffer sBuffer=new StringBuffer();
        InputStream is =this.getResources().openRawResource(path);
        BufferedReader reader=new BufferedReader(new InputStreamReader(is));

        if(is!=null)
        {
            try
            {
                while((data=reader.readLine())!=null)
                {
                    sBuffer.append(data+"\n");

                }
                textView.setText(sBuffer);
                is.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        final String link=extras.getString("link");
        if(link!=null) {
         button=findViewById(R.id.download);
         button.setVisibility(View.VISIBLE);
         button.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(link));
            startActivity(intent);
        }
    });

}

    }
}
