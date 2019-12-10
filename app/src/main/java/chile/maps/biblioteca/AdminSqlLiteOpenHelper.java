package chile.maps.biblioteca;
import android.content.Context;
import  android.database.sqlite.SQLiteDatabase;
import  android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSqlLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSqlLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDatosLibros) {

        BaseDatosLibros.execSQL("CREATE TABLE libros (codigo int primary key ,nombre text,precio float)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase UpdateBasedatosLibros, int oldVersion, int newVersion) {


    }
}
