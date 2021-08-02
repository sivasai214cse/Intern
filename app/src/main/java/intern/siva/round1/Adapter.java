package intern.siva.round1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.*;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder>{

    public List<Model> userlist ;
    public Adapter(List<Model>userList) {
        this.userlist=userList;
    }

    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.img,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adapter.viewHolder holder, int position) {
        int resource = userlist.get(position).getImageview();
        String count =userlist.get(position).getNo();
        holder.setData(resource,count);


    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class viewHolder extends  RecyclerView.ViewHolder{


        private ImageView imageView;
        private TextView no;

        public viewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imagef);
            no=itemView.findViewById(R.id.no);
}

        public void setData(int resource, String count) {
            imageView.setImageResource(resource);
            no.setText(count);
        }
    }
}
