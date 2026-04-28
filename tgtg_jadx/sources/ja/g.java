package ja;

import a40.x;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.constraintlayout.widget.z;
import j4.s;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f24775h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lz.i f24777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f24778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final la.a f24781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final lz.i iVar, final z zVar, boolean z11) {
        super(context, str, null, zVar.f2542b, new DatabaseErrorHandler() { // from class: ja.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i11 = g.f24775h;
                sQLiteDatabase.getClass();
                b bVarF = ox.h.F(iVar, sQLiteDatabase);
                zVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVarF + ".path");
                SQLiteDatabase sQLiteDatabase2 = bVarF.f24770a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        z.h(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                z.h((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                z.h(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    bVarF.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        context.getClass();
        zVar.getClass();
        this.f24776a = context;
        this.f24777b = iVar;
        this.f24778c = zVar;
        this.f24779d = z11;
        this.f24781f = new la.a(str == null ? s.e() : str, context.getCacheDir(), false);
    }

    public final b a(boolean z11) {
        la.a aVar = this.f24781f;
        try {
            aVar.a((this.f24782g || getDatabaseName() == null) ? false : true);
            this.f24780e = false;
            SQLiteDatabase sQLiteDatabaseE = e(z11);
            if (!this.f24780e) {
                b bVarF = ox.h.F(this.f24777b, sQLiteDatabaseE);
                aVar.b();
                return bVarF;
            }
            close();
            b bVarA = a(z11);
            aVar.b();
            return bVarA;
        } catch (Throwable th2) {
            aVar.b();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        la.a aVar = this.f24781f;
        try {
            aVar.a(aVar.f27570a);
            super.close();
            this.f24777b.f28446b = null;
            this.f24782g = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase e(boolean z11) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z12 = this.f24782g;
        Context context = this.f24776a;
        if (databaseName != null && !z12 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z11) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z11) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int i11 = f.$EnumSwitchMapping$0[dVar.f24773a.ordinal()];
                    th = dVar.f24774b;
                    if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                        throw th;
                    }
                    if (i11 != 5) {
                        e40.a.f();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f24779d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z11) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (d e5) {
                    throw e5.f24774b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z11 = this.f24780e;
        z zVar = this.f24778c;
        if (!z11 && zVar.f2542b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            ox.h.F(this.f24777b, sQLiteDatabase);
            zVar.getClass();
        } catch (Throwable th2) {
            throw new d(e.ON_CONFIGURE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((x) this.f24778c.f2543c).l(new ka.a(ox.h.F(this.f24777b, sQLiteDatabase)));
        } catch (Throwable th2) {
            throw new d(e.ON_CREATE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.getClass();
        this.f24780e = true;
        try {
            this.f24778c.l(ox.h.F(this.f24777b, sQLiteDatabase), i11, i12);
        } catch (Throwable th2) {
            throw new d(e.ON_DOWNGRADE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.f24780e) {
            try {
                z zVar = this.f24778c;
                b bVarF = ox.h.F(this.f24777b, sQLiteDatabase);
                x xVar = (x) zVar.f2543c;
                xVar.n(new ka.a(bVarF));
                xVar.f811i = bVarF;
            } catch (Throwable th2) {
                throw new d(e.ON_OPEN, th2);
            }
        }
        this.f24782g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.getClass();
        this.f24780e = true;
        try {
            this.f24778c.l(ox.h.F(this.f24777b, sQLiteDatabase), i11, i12);
        } catch (Throwable th2) {
            throw new d(e.ON_UPGRADE, th2);
        }
    }
}
