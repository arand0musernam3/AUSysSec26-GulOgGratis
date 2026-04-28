package cz;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements ez.a, v30.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13627e;

    public /* synthetic */ h(j jVar, Iterable iterable, wy.i iVar, long j9) {
        this.f13623a = 0;
        this.f13625c = jVar;
        this.f13626d = iterable;
        this.f13627e = iVar;
        this.f13624b = j9;
    }

    @Override // v30.g
    public ScheduledFuture a(m1.a aVar) {
        switch (this.f13623a) {
            case 1:
                v30.f fVar = (v30.f) this.f13625c;
                Runnable runnable = (Runnable) this.f13626d;
                return fVar.f41967b.schedule(new v30.e(fVar, runnable, aVar, 1), this.f13624b, (TimeUnit) this.f13627e);
            default:
                v30.f fVar2 = (v30.f) this.f13625c;
                Callable callable = (Callable) this.f13626d;
                return fVar2.f41967b.schedule(new jb.e(fVar2, callable, aVar, 1), this.f13624b, (TimeUnit) this.f13627e);
        }
    }

    @Override // ez.a
    public Object e() {
        j jVar = (j) this.f13625c;
        Iterable iterable = (Iterable) this.f13626d;
        wy.i iVar = (wy.i) this.f13627e;
        dz.g gVar = (dz.g) jVar.f13633c;
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(dz.g.u(iterable));
            SQLiteDatabase sQLiteDatabaseA = gVar.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        gVar.r(cursorRawQuery.getInt(0), zy.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseA.endTransaction();
            }
        }
        gVar.g(new dz.d(((fz.a) jVar.f13638h).c() + this.f13624b, iVar));
        return null;
    }

    public /* synthetic */ h(v30.f fVar, Object obj, long j9, TimeUnit timeUnit, int i11) {
        this.f13623a = i11;
        this.f13625c = fVar;
        this.f13626d = obj;
        this.f13624b = j9;
        this.f13627e = timeUnit;
    }
}
