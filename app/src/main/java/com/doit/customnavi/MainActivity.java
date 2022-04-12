package com.doit.customnavi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/*
사이드바 네비게이션메뉴 만들기 예제

 */
public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout; // 사용할 레이아웃 변수 선언
    private View drawView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawLayout); // drawer레이아웃을 연결
        drawView = findViewById(R.id.drawView);       // 리니어레이아웃을 연결


        Button btn_open = findViewById(R.id.btn_open);  // 오픈 버튼 연결
        btn_open.setOnClickListener(new View.OnClickListener() { // 버튼클릭시 메서드
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(drawView); //버튼클릭시 drawerLayout에 네이게이션뷰를  활성화
            }
        });
        Button btn_close = findViewById(R.id.btn_close); //버튼연결
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawers(); // 버튼클릭시 drawerLayout에 네비게이션뷰를 비활성화
            }
        });

        drawerLayout.setDrawerListener(listener); // 네이비게이션 메뉴 이벤트 메서드
        drawView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });


    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
            //사이드바를 슬라이드 했을때
        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
            // 사이드바가 활성화 됬을때
        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {
            //사이드바가 닫혔을때
        }

        @Override
        public void onDrawerStateChanged(int newState) {
            // 상태가 변경될때
        }
    };
}