package com.marcmeller.myapplication2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class PruebasBD extends SQLiteOpenHelper {

    private static final String nombreBD = "pruebasBD";
    private static final int versionBD =1;
    private static final String tabla_curso = "CREATE TABLE cursos(cursoCodigo TEXT PRIMARY KEY, cursoNombre TEXT, cursoCarrera TEXT) ";

    public PruebasBD(Context context) {
        super(context, nombreBD, null, versionBD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla_curso);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+tabla_curso);
        db.execSQL(tabla_curso);
    }

    public void agregarCursos(String cursocodigo, String cursonombre, String cursocarrera){
        SQLiteDatabase bd = getWritableDatabase();
        if (bd!=null){
            bd.execSQL("INSERT INTO cursos VALUES('"+cursocodigo+"','"+cursonombre+"','"+cursocarrera+"')");
            bd.close();
        }
    }
}
