package blog.biswas.video.oopclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Loan> loans = new ArrayList<>();
    ArrayList<Integer> amounts = new ArrayList<>();

    Loan loan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        amounts.add(200000);
        amounts.add(300000);
        amounts.add(400000);
        amounts.add(700000);

        for(int i = 0; i <amounts.size(); i++){
            loan = new Loan();
            Log.i("address","address"+loan.toString());
            loan.setLoanAmount(amounts.get(i));
            loans.add(loan);
            Log.i("amount","onCreat: "+amounts.get(i));
        }

    }
}
