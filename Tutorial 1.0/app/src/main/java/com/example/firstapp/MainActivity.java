package com.example.firstapp;

import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    TextView textView;
    ScrollView scrollView;
    ArrayList<Student> studentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linearLayout = new LinearLayout(this);
        textView = new TextView(this);
        studentsList = new ArrayList<Student>();
        showSomeStudents();
        showStudentAverage();
        linearLayout.addView(textView);
        setContentView(linearLayout);

    }

    private void showStudentAverage() {
        double sumHeight = 0;
        double sumGrades = 0;
        for (Student student: studentsList)
        {
            sumHeight += student.getHeight();
            sumGrades += student.getGrade();
        }

        double averageHeight = sumHeight / studentsList.size();
        double averageGrades = sumGrades / studentsList.size();

        textView.setText(textView.getText()+ "\n" + "Average Grades: " + averageGrades + "Average Height:" + averageHeight);
    }

    private void setText(TextView textView, String number) {
        textView.setText(number);
        textView.setTextSize(50);
        textView.setTypeface(Typeface.MONOSPACE);
        textView.setHighlightColor(Color.rgb(250, 0, 255));
    }

    private void showSomeNumbers(TextView textView)
    {
        int i;
        String str="";
        for(i=1;i<20;i++)
            str=str+"Number " + i + "\n";
        setText(textView, str);
    }

    private void showSomeStudents()
    {
        studentsList.add(new Student("Bob",21, 55.5, 10, true, 11));
        studentsList.add(new Student("Mary",19, 70.3, 11, false, 80.5));
        studentsList.add(new Student("Fred",35, 66.0, 6, false, 65.5));

        String str="";
        for(Student s:studentsList)
            str=str+"Name " + s.getName() + " age " + s.getAge() + " height " + s.getHeight() + "\n";

        textView.setText(str);
    }
}