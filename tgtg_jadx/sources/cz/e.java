package cz;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import zw.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements ez.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz.g f13616b;

    public /* synthetic */ e(dz.g gVar, int i11) {
        this.f13615a = i11;
        this.f13616b = gVar;
    }

    @Override // ez.a
    public final Object e() {
        SQLiteDatabase sQLiteDatabaseA;
        int i11 = this.f13615a;
        dz.g gVar = this.f13616b;
        switch (i11) {
            case 0:
                gVar.getClass();
                int i12 = zy.a.f48410e;
                x xVar = new x();
                xVar.f48378a = null;
                xVar.f48379b = new ArrayList();
                xVar.f48380c = null;
                xVar.f48381d = "";
                HashMap map = new HashMap();
                sQLiteDatabaseA = gVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    zy.a aVar = (zy.a) dz.g.A(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new b40.a(gVar, map, xVar, 6));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            default:
                long jC = gVar.f15256b.c() - gVar.f15258d.f15243d;
                sQLiteDatabaseA = gVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jC)};
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            gVar.r(cursorRawQuery.getInt(0), zy.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
        }
    }
}
