package fm.ua.afv.myreminder.fragment;

import android.app.Fragment;
import android.support.v7.widget.RecyclerView;

import fm.ua.afv.myreminder.adapter.CurrentTasksAdapter;
import fm.ua.afv.myreminder.model.ModelTask;

/**
 * Created by afv on 05.08.2016.
 */
public abstract class TaskFragment extends Fragment{
    protected RecyclerView recyclerView;
    protected RecyclerView.LayoutManager layoutManager;

    protected CurrentTasksAdapter adapter;



    public void addTask(ModelTask newTask){
        int position = -1;
        for(int i = 0; i < adapter.getItemCount(); i++){
            if (adapter.getItem(i).isTask()){
                ModelTask task = (ModelTask) adapter.getItem(i);
                if(newTask.getDate() < task.getDate()){
                    position = i;
                    break;
                }
            }
        }
        if (position != -1){
            adapter.addItem(position, newTask);
        }else {
            adapter.addItem(newTask);
        }
    }
}
