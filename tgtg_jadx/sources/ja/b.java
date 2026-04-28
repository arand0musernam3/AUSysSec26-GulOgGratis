package ja;

import a3.z1;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f24766b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f24767c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f24768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f24769e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f24770a;

    static {
        m mVar = m.PUBLICATION;
        f24768d = l.a(mVar, new iu.a(21));
        f24769e = l.a(mVar, new iu.a(22));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.f24770a = sQLiteDatabase;
    }

    public final void A() {
        this.f24770a.setTransactionSuccessful();
    }

    public final void a() {
        this.f24770a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24770a.close();
    }

    public final void e() {
        this.f24770a.beginTransactionNonExclusive();
    }

    public final boolean e0() {
        return this.f24770a.inTransaction();
    }

    public final j g(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.f24770a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new j(sQLiteStatementCompileStatement);
    }

    public final boolean isOpen() {
        return this.f24770a.isOpen();
    }

    public final void p() {
        this.f24770a.endTransaction();
    }

    public final void r(String str) {
        this.f24770a.execSQL(str);
    }

    public final void t(Object[] objArr) {
        this.f24770a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final Cursor u(ia.d dVar) {
        final z1 z1Var = new z1(dVar, 7);
        Cursor cursorRawQueryWithFactory = this.f24770a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ja.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) z1Var.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.l(), f24767c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }
}
