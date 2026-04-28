package ff;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.amplitude.android.migration.CursorWindowAllocationException;
import java.io.File;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf.b f17632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f17633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, kf.b bVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        context.getClass();
        bVar.getClass();
        this.f17632a = bVar;
        File databasePath = context.getDatabasePath(str);
        databasePath.getClass();
        this.f17633b = databasePath;
        this.f17634c = true;
        this.f17635d = 4;
    }

    public static void e(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message == null || message.length() == 0) {
            throw runtimeException;
        }
        if (!y.p(message, "Cursor window allocation of", false) && !y.p(message, "Could not allocate CursorWindow", false)) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }

    public final synchronized void A(String str) {
        B(str);
    }

    public final void B(String str) {
        try {
            try {
                getWritableDatabase().delete("long_store", "key = ?", new String[]{str});
            } catch (SQLiteException e5) {
                lf.b.f27770c.a("remove value from long_store failed: " + e5.getMessage());
                a();
            } catch (StackOverflowError e11) {
                lf.b.f27770c.a("remove value from long_store failed: " + e11.getMessage());
                a();
            }
        } finally {
            close();
        }
    }

    public final void a() {
        try {
            close();
        } catch (Exception e5) {
            lf.b bVar = lf.b.f27770c;
            lf.b.f27770c.a("close failed: " + e5.getMessage());
        }
    }

    public final synchronized Long g(String str) {
        return (Long) p("long_store", str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.f17634c = false;
        this.f17632a.a("Attempt to re-create existing legacy database file " + this.f17633b.getAbsolutePath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        this.f17635d = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092 A[PHI: r14
      0x0092: PHI (r14v7 android.database.Cursor) = (r14v5 android.database.Cursor), (r14v6 android.database.Cursor), (r14v8 android.database.Cursor) binds: [B:54:0x00b9, B:49:0x0090, B:56:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.e.p(java.lang.String, java.lang.String):java.lang.Object");
    }

    public final void r(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (message == null || message.length() == 0 || !StringsKt.z(message, "Couldn't read", false) || !StringsKt.z(message, "CursorWindow", false)) {
            throw illegalStateException;
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7 A[PHI: r4
      0x00a7: PHI (r4v6 android.database.Cursor) = (r4v2 android.database.Cursor), (r4v5 android.database.Cursor), (r4v7 android.database.Cursor) binds: [B:60:0x00d1, B:55:0x00a5, B:62:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.AbstractList t(java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.e.t(java.lang.String):java.util.AbstractList");
    }

    public final void u(long j9, String str) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j9)});
                } catch (StackOverflowError e5) {
                    lf.b.f27770c.a("remove events from " + str + " failed: " + e5.getMessage());
                    a();
                }
            } catch (SQLiteException e11) {
                lf.b.f27770c.a("remove events from " + str + " failed: " + e11.getMessage());
                a();
            }
        } finally {
            close();
        }
    }
}
