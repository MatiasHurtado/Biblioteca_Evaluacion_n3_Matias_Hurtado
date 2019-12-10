package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Base_Act extends AppCompatActivity {

    private EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_);


        et1=(EditText)findViewById(R.id.editCodigo);
        et2=(EditText)findViewById(R.id.editNombre);
        et3=(EditText)findViewById(R.id.editPrecio);
    }


    public  void  añadirLibro(View v)
    {

        AdminSqlLiteOpenHelper admin = new AdminSqlLiteOpenHelper(this,"Biblioteca",null,1 );
        SQLiteDatabase BaseDatosLibros = admin.getWritableDatabase();


        if(!et1.getText().toString().isEmpty())
        {

            ContentValues registro = new ContentValues();
            registro.put("Codigo",et1.getText().toString());
            registro.put("Nombre",et2.getText().toString());
            registro.put("Precio",et3.getText().toString());


            BaseDatosLibros.insert("libros",null,registro);
            BaseDatosLibros.close();

            Toast.makeText(this,"Se ah ingresado un nuevo libro",Toast.LENGTH_SHORT).show();

        }
    }


    public void Eliminar (View vi){
        AdminSqlLiteOpenHelper admin = new AdminSqlLiteOpenHelper(this,"Biblioteca",null,1 );
        SQLiteDatabase BaseDatosLibros = admin.getWritableDatabase();

            String Codigo = et1.getText().toString();


        BaseDatosLibros.delete("libros" ,"Codigo="+Codigo,null);
        BaseDatosLibros.close();


        Toast.makeText(this,"Se ah Eliminado un  libro",Toast.LENGTH_SHORT).show();


    }
    public void Modiicar (View vi){
        AdminSqlLiteOpenHelper admin = new AdminSqlLiteOpenHelper(this,"Biblioteca",null,1 );
        SQLiteDatabase BaseDatosLibros = admin.getWritableDatabase();

        ContentValues Camb = new ContentValues();
        Camb.put("Codigo",et1.getText().toString());
        Camb.put("Nombre",et2.getText().toString());
        Camb.put("Precio",et3.getText().toString());
        String codigo = et1.getText().toString();




        if(!et1.getText().toString().isEmpty())
        {
            BaseDatosLibros.update("libros",Camb,"codigo="+codigo,null);
            Toast.makeText(this,"Se ah Modificado un libro un  libro",Toast.LENGTH_SHORT).show();
        }
    }

}
