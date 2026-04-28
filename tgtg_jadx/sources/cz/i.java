package cz;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import c50.w;
import d40.k1;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements ez.a, dz.e, t40.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13630c;

    public /* synthetic */ i(long j9, Object obj, Object obj2) {
        this.f13629b = obj;
        this.f13630c = obj2;
        this.f13628a = j9;
    }

    @Override // dz.e, x0.a
    public Object apply(Object obj) {
        String str = (String) this.f13629b;
        zy.c cVar = (zy.c) this.f13630c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        boolean zBooleanValue = ((Boolean) dz.g.A(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(cVar.getNumber())}), new w(22))).booleanValue();
        long j9 = this.f13628a;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL(l1.e("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j9, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(cVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(cVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j9));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // ez.a
    public Object e() {
        j jVar = (j) this.f13629b;
        wy.i iVar = (wy.i) this.f13630c;
        dz.g gVar = (dz.g) jVar.f13633c;
        long jC = ((fz.a) jVar.f13638h).c() + this.f13628a;
        gVar.getClass();
        gVar.g(new dz.d(jC, iVar));
        return null;
    }

    @Override // t40.a
    public void f(t40.b bVar) {
        ((x30.a) bVar.get()).d((String) this.f13629b, this.f13628a, (k1) this.f13630c);
    }

    public /* synthetic */ i(String str, long j9, k1 k1Var) {
        this.f13629b = str;
        this.f13628a = j9;
        this.f13630c = k1Var;
    }
}
