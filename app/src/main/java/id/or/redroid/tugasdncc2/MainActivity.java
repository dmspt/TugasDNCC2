package id.or.redroid.tugasdncc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dmspt on 09/12/2018
 */

public class MainActivity extends AppCompatActivity {

    Button hitung;
    EditText edtSisi1, edtSisi2;
    TextView txtHasil, txtSisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSisi1 = (EditText) findViewById(R.id.edt_sisi1);
        edtSisi2 = (EditText) findViewById(R.id.edt_sisi2);
        hitung = (Button) findViewById(R.id.btn_hitung);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        txtSisi = (TextView) findViewById(R.id.txt_sisi);


    }


    public void hitungluas(View view) {
        try {

            validasi();
            int sisi1 = Integer.parseInt(edtSisi1.getText().toString());
            int sisi2 = Integer.parseInt(edtSisi2.getText().toString());
            int luas = 6 * sisi1 * sisi2;

            txtHasil.setText(String.valueOf(luas));
            txtSisi.setText(edtSisi1.getText());
            clear();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void validasi() {
        if(edtSisi1.getText().toString().length()==0) {
            edtSisi1.setError("Sisi 1 Tidak Boleh Kosong!");
        } else if (edtSisi2.getText().toString().length()==0) {
            edtSisi2.setError("Sisi 2 Tidak Boleh Kosong!");
        } else {
            Toast.makeText(getApplicationContext(), "Kubus Dihitung!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void clear() {
        edtSisi1.setText("");
        edtSisi2.setText("");
    }
}
