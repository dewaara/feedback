 package com.cdac.feedback;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

 public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"Mkavach","Design","Android","CDAC","Halim"};

        AutoCompleteTextView autoCompleteTxt;
        ArrayAdapter<String> adapterItems;

        autoCompleteTxt = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(this,R.layout.list_item,items);
        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*
                if (0==position) {
                    return;

                }
                */
                if (0==position) {

                    FragmentManager managerOne = getSupportFragmentManager();
                    FragmentTransaction transactionOne = managerOne.beginTransaction();
                    OneFragment oneFragment = new OneFragment();
                    transactionOne.replace(R.id.linear_test,oneFragment);
                    transactionOne.commit();

                }
                else if (1==position){

                    FragmentManager managerTwo = getSupportFragmentManager();
                    FragmentTransaction transactionTwo = managerTwo.beginTransaction();
                    TwoFragment twoFragment = new TwoFragment();
                    transactionTwo.replace(R.id.linear_test,twoFragment);
                    transactionTwo.commit();

                } else if (2==position){

                    FragmentManager managerThree = getSupportFragmentManager();
                    FragmentTransaction transactionThree = managerThree.beginTransaction();
                    ThreeFragment threeFragment = new ThreeFragment();
                    transactionThree.replace(R.id.linear_test,threeFragment);
                    transactionThree.commit();

                } else if (3==position) {

                    FragmentManager managerFour = getSupportFragmentManager();
                    FragmentTransaction transactionFour = managerFour.beginTransaction();
                    FourFragment fourFragment = new FourFragment();
                    transactionFour.replace(R.id.linear_test,fourFragment);
                    transactionFour.commit();

                }

                else if (4==position) {

                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction=manager.beginTransaction();
                    BlankFragment blankFragment=new BlankFragment();
                    transaction.replace(R.id.linear_test,blankFragment);
                    transaction.commit();
                }

                else {
                    String item = parent.getItemAtPosition(position).toString();
                      Toast.makeText(getApplicationContext(),"Item: "+item, Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}