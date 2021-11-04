package com.nsb.recyclerview.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nsb.recyclerview.Model.Menu;
import com.nsb.recyclerview.R;
import java.util.List;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.ViewHolderrrr> {

    private Context context;
    private List<Menu> menus;
    private int layoutRes;
    private  OnItemClickListener onItemClickListener;

    public SettingsAdapter(Context context, List<Menu> menus, int layoutRes) {
        this.context = context;
        this.menus = menus;
        this.layoutRes = layoutRes;
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolderrrr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutRes,parent,false);

        ViewHolderrrr viewHolderrrr = new ViewHolderrrr(view);
        return viewHolderrrr;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderrrr holder, @SuppressLint("RecyclerView") int position) {
        Menu menu = menus.get(position);

        holder.imvIcon.setImageResource(menu.getImvRes());
        holder.txtTitle.setText(menu.getTitle());
        holder.txtDetail.setText(menu.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onItemClickListener != null){
                    onItemClickListener.onItemClick(position);
                }
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(onItemClickListener != null){
                    onItemClickListener.onItemLongClick(position);
                }

                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    class ViewHolderrrr extends RecyclerView.ViewHolder{
        private ImageView imvIcon;
        private TextView txtTitle;
        private TextView txtDetail;

        public ViewHolderrrr(@NonNull View itemView) {
            super(itemView);

            imvIcon = itemView.findViewById(R.id.imvIcon);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDetail = itemView.findViewById(R.id.txtDetail);


        }
    }
   public interface OnItemClickListener{
        void onItemClick( int position);
        void onItemLongClick( int position);
    }
}
