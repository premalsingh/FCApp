package com.example.premal2.frequencyclub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class aboutpg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_aboutpg);
        ImageView fb=(ImageView) findViewById(R.id.facebookbtn);
        ImageView linkedinbtn=findViewById(R.id.linkedinbtn);
        ImageView github=(ImageView) findViewById(R.id.githubbtn);
        ImageView browserbtn=findViewById(R.id.webbtn);
        ImageView mailbtn=(ImageView) findViewById(R.id.emailbtn);
        TextView userfull=(TextView) findViewById(R.id.userfullname);
        TextView userpost=(TextView) findViewById(R.id.userpost);
        userfull.setText(Accountpage.name);
        userpost.setText(Accountpage.post);
        TextView events=(TextView) findViewById(R.id.eventbtn);
        ImageView instabtn=(ImageView) findViewById(R.id.instabtn);
        instabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String facebookPageUrl = "https://instagram.com/frequencyclub_rv?utm_source=ig_profile_share&igshid=1fbgxx82k06c0";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookPageUrl));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(aboutpg.this,Projects.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                //  Toast.makeText(aboutpg.this, "This feature will be available in later updates.", Toast.LENGTH_SHORT).show();
            }
        });
        TextView homepage=(TextView) findViewById(R.id.hometext);
        TextView notificationbtn=(TextView) findViewById(R.id.notifcationbtn);
        notificationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aboutpg.this,Notificationspage.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aboutpg.this,mainpage.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        TextView accountbtn=(TextView) findViewById(R.id.accountbtn);
        accountbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aboutpg.this,Accountpage.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        ImageView maplink=(ImageView) findViewById(R.id.maplink);
        maplink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Frequency+Club+RVCE/@12.9236525,77.5012081,15z/data=!4m5!3m4!1s0x0:0x6630a4d79ed10282!8m2!3d12.9236525!4d77.5012081"));
                startActivity(intent);
            }
        });


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String facebookPageUrl = "https://www.facebook.com/rvcefrequency";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookPageUrl));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        linkedinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String facebookPageUrl = "https://www.linkedin.com/company/frequency-club-rvce/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookPageUrl));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String facebookPageUrl = "https://github.com/Frequency-Club-RVCE";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookPageUrl));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        browserbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String facebookPageUrl = "http://frequencyclub.azurewebsites.net/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookPageUrl));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        mailbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto: frequencyclub@rvce.edu.in"));
                startActivity(Intent.createChooser(emailIntent, "Send feedback"));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        ImageView whatsapp=findViewById(R.id.whatsappbtn);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent sendIntent = new Intent("android.intent.action.MAIN");
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "Download the Frequency Club App From frequencyclub.azurewebsite.net");
                    sendIntent.putExtra("jid", "8982625174" + "@s.whatsapp.net"); //phone number without "+" prefix
                    sendIntent.setPackage("com.whatsapp");
                    startActivity(sendIntent);
                } catch(Exception e) {
                    Log.d("e","error");
                }

            }
        });
    }
}
