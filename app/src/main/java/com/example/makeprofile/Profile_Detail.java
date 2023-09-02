package com.example.makeprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile_Detail extends AppCompatActivity {
    TextView txtName,txtSkill,txtEmail,txtPhone,txtLocation,txtGithub,txtLinkedin,txtTwitter,txtInstagram,txtLanguage ;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_detail);

        findId();

        Intent i=getIntent();
        String  Name,skill,email,phone,location,github,linkedin,twitter,instagram,language ;
        Name=i.getStringExtra("name");
        skill=i.getStringExtra("skill");
        email=i.getStringExtra("email");
        phone=i.getStringExtra("phone");
        location=i.getStringExtra("location");
        github=i.getStringExtra("github");
        linkedin=i.getStringExtra("linkedin");
        twitter=i.getStringExtra("twitter");
        instagram=i.getStringExtra("instagram");
        language=i.getStringExtra("language");

        txtName.setText(Name);
        txtSkill.setText(skill);
        txtEmail.setText(email);
        txtPhone.setText(phone);
        txtLocation.setText(location);
        txtGithub.setText(github);
        txtLinkedin.setText(linkedin);
        txtTwitter.setText(twitter);
        txtInstagram.setText(instagram);
        txtLanguage.setText(language);


        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(Name,skill,email,phone,location,github,linkedin,twitter,instagram,language);

            }
        });



    }
    public void shareData(String Name,String skill,String email,String phone,String location,String github,String linkedin,
                          String twitter,String instagram,String language){
        Intent i =new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        // Additional info
        i.putExtra(Intent.EXTRA_TEXT,"Name : "+Name+'\n'+"Skill :"+skill +'\n'+"Email id : "+email +'\n'+"Phone No. : "+phone +'\n'+"Location : "+location +'\n'+"GitHub : "+github +'\n'+"Linkedin : "+linkedin +'\n'+"Twitter : "+twitter +'\n'+"Instagram : "+instagram +'\n'+" Language : "+language);

        startActivity(Intent.createChooser(i,"choose a platform"));
    }

    public void findId() {
        txtName=findViewById(R.id.txtName);
        txtSkill=findViewById(R.id.txtbio);
        txtEmail=findViewById(R.id.txtEnterEmail);
        txtPhone=findViewById(R.id.txtEnterPhoneNo);
        txtLocation=findViewById(R.id.txtEnterLocation);
        txtGithub=findViewById(R.id.txtEnterGitHub);
        txtLinkedin=findViewById(R.id.txtEnterLinkedin);
        txtTwitter=findViewById(R.id.txtEnterTwitter);
        txtInstagram=findViewById(R.id.txtEnterInstagram);
        txtLanguage=findViewById(R.id.txtEnterlanguage);
        btnShare=findViewById(R.id.btnShare);
    }
}