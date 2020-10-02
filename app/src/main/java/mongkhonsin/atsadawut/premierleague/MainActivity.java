package mongkhonsin.atsadawut.premierleague;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import mongkhonsin.atsadawut.premierleague.model.TeamList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter myAdapter = new MyAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        RecyclerView recyclerView = findViewById(R.id.team_list_recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }
}
class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    TeamList teamLists[] = {
            new TeamList(R.drawable.arsenal, "Arsenal", "London"),
            new TeamList(R.drawable.aston_villa, "Aston Villa", "London"),
            new TeamList(R.drawable.brighton, "Brighton", "Brighton"),
            new TeamList(R.drawable.burnley, "Burnley", "Burnley"),
            new TeamList(R.drawable.chelsea, "Chelsea", "London"),
            new TeamList(R.drawable.crystal_palace, "Crystal Palace", "London"),
            new TeamList(R.drawable.everton, "Everton", "Liverpool"),
            new TeamList(R.drawable.fulham, "Fulham", "London"),
            new TeamList(R.drawable.leeds, "Leeds", "Leeds"),
            new TeamList(R.drawable.leicester, "Leicester", "Leicester"),
            new TeamList(R.drawable.liverpool, "Liverpool", "Liverpool"),
            new TeamList(R.drawable.manchester_city, "Manchester City", "Manchester"),
            new TeamList(R.drawable.manchester_united, "Manchester United", "Manchester"),
            new TeamList(R.drawable.newcastle, "Newcastle", "Newcastle"),
            new TeamList(R.drawable.sheffield, "Sheffield Utd", "Sheffield"),
            new TeamList(R.drawable.southampton, "Southampton", "Southampton"),
            new TeamList(R.drawable.tottenham_hotspur, "Tottenham Hotspur", "London"),
            new TeamList(R.drawable.west_bromwich, "West Bromwich", "West Bromwich"),
            new TeamList(R.drawable.west_ham, "West Ham Utd", "London"),
            new TeamList(R.drawable.wolverhampton, "Wolverhamton", "Wolverhamton")
    };
    public MyAdapter() {  }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public int getItemCount(){
        return teamLists.length;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.teamLogo.setImageResource(teamLists[position].imageResId);
            holder.teamName.setText(teamLists[position].name);
            holder.teamAddress.setText(teamLists[position].address);
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView teamLogo;
        TextView teamName, teamAddress;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            teamLogo = itemView.findViewById(R.id.team_logo);
            teamName = itemView.findViewById(R.id.team_name);
            teamAddress = itemView.findViewById(R.id.team_address);
        }
    }
}