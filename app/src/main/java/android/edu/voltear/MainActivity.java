package android.edu.voltear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private EditText et;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        et=findViewById(R.id.editText);
        bt=findViewById(R.id.boton);
        bt.setGravity(Gravity.CENTER_VERTICAL); //desde codigo



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoIni=et.getText().toString();
                StringBuilder builder=new StringBuilder(textoIni);
                String textoFin=builder.reverse().toString();
                tv.setText(textoFin);

            }
        });
    }
}
