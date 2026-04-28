package ja;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class i implements ia.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f24790a;

    public i(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.f24790a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24790a.close();
    }

    @Override // ia.c
    public final void f(int i11, double d3) {
        this.f24790a.bindDouble(i11, d3);
    }

    @Override // ia.c
    public final void j(int i11, long j9) {
        this.f24790a.bindLong(i11, j9);
    }

    @Override // ia.c
    public final void k(int i11, byte[] bArr) {
        bArr.getClass();
        this.f24790a.bindBlob(i11, bArr);
    }

    @Override // ia.c
    public final void m(int i11) {
        this.f24790a.bindNull(i11);
    }

    @Override // ia.c
    public final void n() {
        this.f24790a.clearBindings();
    }

    @Override // ia.c
    public final void s(int i11, String str) {
        str.getClass();
        this.f24790a.bindString(i11, str);
    }
}
