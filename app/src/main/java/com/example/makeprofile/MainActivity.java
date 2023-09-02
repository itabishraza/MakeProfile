package com.example.makeprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtName,edtSkill,edtEmail,edtPhone,edtLocation,edtGithub,edtLinkedin,edtTwitter,edtInstagram,edtLanguage;
    Button btnGetProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       findId();
        btnGetProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  userName,skill,email,phone,location,github,linkedin,twitter,instagram,language ;
                Intent i=new Intent(MainActivity.this,Profile_Detail.class);
                userName=edtName.getText().toString();
                i.putExtra("name",userName);
                skill=edtSkill.getText().toString();
                i.putExtra("skill",skill);
                email=edtEmail.getText().toString();
                i.putExtra("email",email);
                phone=edtPhone.getText().toString();
                i.putExtra("phone",phone);
                location=edtLocation.getText().toString();
                i.putExtra("location",location);
                github=edtGithub.getText().toString();
                i.putExtra("github",github);
                linkedin=edtLinkedin.getText().toString();
                i.putExtra("linkedin",linkedin);
                twitter=edtTwitter.getText().toString();
                i.putExtra("twitter",twitter);
                instagram=edtInstagram.getText().toString();
                i.putExtra("instagram",instagram);
                language=edtLanguage.getText().toString();
                i.putExtra("language",language);
                startActivity(i);
            }
        });

    }

    public void findId() {
        edtName=findViewById(R.id.edtEnterName);
        edtSkill=findViewById(R.id.edtEnterSkill);
        edtEmail=findViewById(R.id.edtEnterEmailId);
        edtPhone=findViewById(R.id.edtEnterPhoneNumber);
        edtLocation=findViewById(R.id.edtEnterLocation);
        edtGithub=findViewById(R.id.edtEnterGithub);
        edtLinkedin=findViewById(R.id.edtEnterLinkedin);
        edtTwitter=findViewById(R.id.edtEnterTwitter);
        edtInstagram=findViewById(R.id.edtEnterInstagram);
        edtLanguage=findViewById(R.id.edtEnterLanguage);
        btnGetProfile=findViewById(R.id.btnTransferInfo);
    }
}