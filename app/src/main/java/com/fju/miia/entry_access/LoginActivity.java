package com.fju.miia.entry_access;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id ==R.id.action_info){
            Intent intent = new Intent(this,InfoActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void test (View view){
        EditText edUsername =(EditText)findViewById(R.id.ed_name);
        EditText edDotorid =(EditText)findViewById(R.id.ed_dotor_id);
        String name = edUsername.getText().toString();
        String dotorid = edDotorid.getText().toString();
        if(name.equals("jack") && dotorid.equals("123")) {
            new AlertDialog.Builder(this)
                    .setTitle("預約資訊")
                    .setMessage("房間編號: "+"\n"+"姓名: "+name+"\n"+"醫師編號: "+dotorid+"\n"+"預約時間:  "+"\n"+"恭喜預約成功!!!!")
                    .setPositiveButton("完成",null)
                    .show();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("資訊錯誤")
                    .setMessage("請重新輸入正確資訊!!!!!")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }
}
