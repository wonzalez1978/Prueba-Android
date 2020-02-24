package cl.desafiolatam.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        Button buttonHome = findViewById(R.id.button);
        Button buttonRename = findViewById(R.id.button2);

        Picasso.get().load("http://blog.desafiolatam.com/wp-content/uploads/2019/02/logo.png").into(imageView);

    buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast toast1 = Toast.makeText(getApplicationContext(),
                                "Usuario ingresado con exito", Toast.LENGTH_SHORT);

                toast1.show();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);


            }
        });
            buttonRename.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, RegistroUsuario.class);
                    startActivity(intent);

                }
            });

    }

}

