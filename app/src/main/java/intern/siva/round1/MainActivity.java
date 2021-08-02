package intern.siva.round1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button list,grid;
    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<Model> userList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();
    }



    private void initRecyclerView() {
        mrecyclerView=findViewById(R.id.recycle);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        adapter=new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        mrecyclerView.setLayoutManager(layoutManager);
    }
    private void initData() {
        int i=1;
        userList = new ArrayList<>();
        userList.add(new Model(R.drawable.number1,"1"));
        userList.add(new Model(R.drawable.number2,"2"));
        userList.add(new Model(R.drawable.number3,"3"));
        userList.add(new Model(R.drawable.number4,"4"));
        userList.add(new Model(R.drawable.number5,"5"));
        userList.add(new Model(R.drawable.number6,"6"));
        userList.add(new Model(R.drawable.number7,"7"));
        userList.add(new Model(R.drawable.number8,"8"));





    }
}