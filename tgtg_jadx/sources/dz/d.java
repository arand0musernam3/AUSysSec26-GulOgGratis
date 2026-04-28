package dz;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f15250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wy.i f15251b;

    public /* synthetic */ d(long j9, wy.i iVar) {
        this.f15250a = j9;
        this.f15251b = iVar;
    }

    @Override // dz.e, x0.a
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f15250a));
        wy.i iVar = this.f15251b;
        String str = iVar.f43571a;
        ty.d dVar = iVar.f43573c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(gz.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(gz.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
