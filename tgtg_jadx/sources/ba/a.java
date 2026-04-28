package ba;

import ja.b;
import u70.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6075b;

    public a(int i11, int i12) {
        this.f6074a = i11;
        this.f6075b = i12;
    }

    public void a(ha.a aVar) {
        aVar.getClass();
        if (!(aVar instanceof ka.a)) {
            throw new n("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((ka.a) aVar).f26243a);
    }

    public void b(b bVar) {
        bVar.getClass();
        throw new n("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
