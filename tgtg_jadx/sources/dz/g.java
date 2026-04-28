package dz;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ty.c f15254f = new ty.c("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f15256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.a f15257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f15258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t70.a f15259e;

    public g(fz.a aVar, fz.a aVar2, a aVar3, j jVar, t70.a aVar4) {
        this.f15255a = jVar;
        this.f15256b = aVar;
        this.f15257c = aVar2;
        this.f15258d = aVar3;
        this.f15259e = aVar4;
    }

    public static Object A(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long e(SQLiteDatabase sQLiteDatabase, wy.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f43571a, String.valueOf(gz.a.a(iVar.f43573c))));
        byte[] bArr = iVar.f43572b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String u(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f15245a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public final SQLiteDatabase a() {
        j jVar = this.f15255a;
        Objects.requireNonNull(jVar);
        fz.a aVar = this.f15257c;
        long jC = aVar.c();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e5) {
                if (aVar.c() >= ((long) this.f15258d.f15242c) + jC) {
                    throw new SynchronizationException("Timed out while trying to open db.", e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15255a.close();
    }

    public final Object g(e eVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = eVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList p(SQLiteDatabase sQLiteDatabase, wy.i iVar, int i11) {
        ArrayList arrayList = new ArrayList();
        Long lE = e(sQLiteDatabase, iVar);
        if (lE == null) {
            return arrayList;
        }
        A(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lE.toString()}, null, null, null, String.valueOf(i11)), new b40.a(this, arrayList, iVar, 5));
        return arrayList;
    }

    public final void r(long j9, zy.c cVar, String str) {
        g(new cz.i(j9, str, cVar));
    }

    public final Object t(ez.a aVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        fz.a aVar2 = this.f15257c;
        long jC = aVar2.c();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objE = aVar.e();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objE;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e5) {
                if (aVar2.c() >= ((long) this.f15258d.f15242c) + jC) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
