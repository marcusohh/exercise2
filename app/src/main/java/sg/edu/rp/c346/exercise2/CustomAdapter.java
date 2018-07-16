package sg.edu.rp.c346.exercise2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16020089 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Employeeitem> EmployeeList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Employeeitem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        EmployeeList = objects;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout_id, parent, false);

        }
        TextView tvname = convertView.findViewById(R.id.textViewName);
        TextView tvjob = convertView.findViewById(R.id.textViewjob);
        TextView tvpay = convertView.findViewById(R.id.textViewpay);

        Employeeitem currentItem = EmployeeList.get(position);

        String name = currentItem.getName();
        String job = currentItem.getJob();
        float pay = currentItem.getPay();
        tvname.setText(name);
        tvjob.setText(job);
        tvpay.setText(Float.toString(pay));
        return convertView;

    }


}
