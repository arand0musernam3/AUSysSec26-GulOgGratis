package xb;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f44216a;

    public final synchronized SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.f44216a;
        if (sQLiteDatabase2 == null || !sQLiteDatabase2.isOpen()) {
            this.f44216a = getWritableDatabase();
            Log.d("AnalyticsSQLiteHelper", "database opened.");
        }
        sQLiteDatabase = this.f44216a;
        sQLiteDatabase.getClass();
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("CREATE TABLE 'entries' ('id' INTEGER NOT NULL,'type' TEXT,'content' TEXT,'state' INTEGER,'meta_data' TEXT,'process_id' TEXT,'version' TEXT, PRIMARY KEY ('id'));");
        sQLiteDatabase.execSQL("CREATE INDEX 'state_index' ON entries ('state');");
        sQLiteDatabase.execSQL("CREATE INDEX 'type_index' ON entries ('type');");
        sQLiteDatabase.execSQL("CREATE INDEX 'process_id_index' ON entries ('process_id');");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.getClass();
    }
}
