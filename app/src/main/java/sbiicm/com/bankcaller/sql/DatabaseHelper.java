package sbiicm.com.bankcaller.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by praneeth on 1/10/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "ContactDirectory.db";

    // User table name
    private static final String TABLE_USER = "contact";



    // User Table Columns names
    private static final String COLUMN_USER_ID = "id";
    private static final String COLUMN_PF_ID = "pfId";
    private static final String COLUMN_USER_EMAIL = "email";
    private static final String COLUMN_USER_PASSWORD = "pwd";
    private static final String COLUMN_USER_NAME ="name";
    private static final String COLUMN_USER_PHONE_1 = "phone1";
    private static final String COLUMN_USER_PHONE_2="phone2";
    private static final String COLUMN_USER_DEPT ="dept";

    private String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_USER + "("
            + COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_PF_ID +"INTEGER UNIQUE,"+COLUMN_USER_NAME + " TEXT,"
            + COLUMN_USER_EMAIL + " TEXT," + COLUMN_USER_PASSWORD + " TEXT," + COLUMN_USER_PHONE_1+"NUMBER,"+COLUMN_USER_PHONE_2+"NUMBER,"+ COLUMN_USER_DEPT +"TEXT"+")";



    private String DROP_USER_TABLE = "DROP TABLE IF EXISTS " + TABLE_USER;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    SQLiteDatabase db = this.getReadableDatabase();




    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL(CREATE_USER_TABLE); }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        db.execSQL(DROP_USER_TABLE);

        // Create tables again
        onCreate(db);

    }
}
