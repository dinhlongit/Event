package com.englishit.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /// Khai báo biến
    EditText tv1,tv2;
    TextView tvketqua;
    Button btnKQ2 ;
    Button btnKQ3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls(); // Dùng để chứa các findViewById ánh xạ đến các id của view

        // Anonymous listener đăng ký sự kiện cho button btnKQ2 -> Lắng nghe sự kiện để xử lý
        btnKQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(tv1.getText()+"");
                int b = Integer.parseInt(tv2.getText()+"");
                tvketqua.setText((a+b)+"");
            }
        });
    }

    // Ánh xạ đến các view thông qua id
    private void addControls() {
        tv1 = (EditText) findViewById(R.id.tv1);
        tv2 = (EditText) findViewById(R.id.tv2);
        tvketqua = (TextView) findViewById(R.id.tvketqua);
        btnKQ2 = (Button) findViewById(R.id.btnKQ2);
        btnKQ3 = (Button) findViewById(R.id.btnKQ3);
    }

    // Onclick in XML đăng ký sự kiện cho button btnKQ2 -> Lắng nghe sự kiện để xử lý
    public void xuLyKetQua(View view) {
       int a = Integer.parseInt(tv1.getText()+"");
        int b = Integer.parseInt(tv2.getText()+"");
        tvketqua.setText((a+b)+"");
    }


   // Activity is listener đăng ký sự kiện cho button btnKQ3 -> Lắng nghe sự kiện
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnKQ3){
            int a = Integer.parseInt(tv1.getText()+"");
            int b = Integer.parseInt(tv2.getText()+"");
            tvketqua.setText((a+b)+"");
        }
    }
}
