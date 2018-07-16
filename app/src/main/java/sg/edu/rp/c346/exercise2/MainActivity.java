package sg.edu.rp.c346.exercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employeeitem> alEmployeeList;
    CustomAdapter caemploy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);

        alEmployeeList = new ArrayList<>();

        Employeeitem employee1 = new Employeeitem("John","Software Technical Leader", 3400.0f);
        Employeeitem employee2 = new Employeeitem("May","Programmer",2200.0f);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee2);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);
        alEmployeeList.add(employee1);





        caemploy = new CustomAdapter(this,R.layout.employee_item, alEmployeeList);

        lvEmployee.setAdapter(caemploy);
    }
}
