package co.datadome.sdk;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.braze.h2;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import s0.k2;
import y00.n1;
import y00.n4;
import y00.w0;
import zendesk.faye.internal.Bayeux;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: loaded from: classes.dex */
public final class x implements s0.y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile x f8717d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8720c;

    public x() {
        this.f8720c = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = s.f8707a;
        r rVar = r.f8703a;
        rVar.getClass();
        this.f8718a = Intrinsics.areEqual(s.f8707a.get(rVar), Boolean.TRUE) ? 600000L : ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS;
    }

    public static x a() {
        if (f8717d == null) {
            synchronized (x.class) {
                try {
                    if (f8717d == null) {
                        f8717d = new x();
                    }
                } finally {
                }
            }
        }
        return f8717d;
    }

    @Override // s0.y
    public k2 b() {
        return (k2) this.f8720c;
    }

    @Override // s0.y
    public s0.x c() {
        s0.y yVar = (s0.y) this.f8719b;
        return yVar != null ? yVar.c() : s0.x.UNKNOWN;
    }

    public void e(od.a aVar, fd.l lVar, Map map, long j9) {
        od.f fVar = (od.f) this.f8720c;
        long j11 = fVar.f32440a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f32442c;
        if (j9 > j11) {
            Object objRemove = linkedHashMap.remove(aVar);
            if (objRemove != null) {
                fVar.f32441b = fVar.i() - fVar.o(aVar, objRemove);
                fVar.c(aVar, objRemove, null);
            }
            ((od.h) this.f8719b).f(aVar, lVar, map, j9);
            return;
        }
        od.e eVar = new od.e(lVar, map, j9);
        Object objPut = linkedHashMap.put(aVar, eVar);
        fVar.f32441b = fVar.o(aVar, eVar) + fVar.i();
        if (objPut != null) {
            fVar.f32441b = fVar.i() - fVar.o(aVar, objPut);
            fVar.c(aVar, objPut, eVar);
        }
        fVar.p(fVar.f32440a);
    }

    @Override // s0.y
    public s0.w f() {
        s0.y yVar = (s0.y) this.f8719b;
        return yVar != null ? yVar.f() : s0.w.UNKNOWN;
    }

    public List g() {
        List list;
        y00.m mVar = (y00.m) this.f8720c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f8719b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar.g0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", Bayeux.KEY_DATA, "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f8718a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j9 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z11 = cursorQuery.getLong(5) == 1;
                        long j12 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j9 > this.f8718a) {
                            this.f8718a = j9;
                        }
                        try {
                            s8 s8Var = (s8) n4.a0(t8.J(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            s8Var.q(string);
                            long j13 = cursorQuery.getLong(2);
                            s8Var.b();
                            ((t8) s8Var.f11483b).Q(j13);
                            s8Var.b();
                            ((t8) s8Var.f11483b).t(j12);
                            arrayList.add(new y00.k(j9, j11, z11, (t8) s8Var.d()));
                        } catch (IOException e5) {
                            w0 w0Var = ((n1) mVar.f21216b).f44987f;
                            n1.m(w0Var);
                            w0Var.f45260g.c("Data loss. Failed to merge raw event. appId", w0.x(str), e5);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    list = Collections.EMPTY_LIST;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e11) {
            w0 w0Var2 = ((n1) mVar.f21216b).f44987f;
            n1.m(w0Var2);
            w0Var2.f45260g.c("Data loss. Error querying raw events batch. appId", w0.x(str), e11);
            list = arrayList;
        }
        return list;
    }

    @Override // s0.y
    public long getTimestamp() {
        s0.y yVar = (s0.y) this.f8719b;
        if (yVar != null) {
            return yVar.getTimestamp();
        }
        long j9 = this.f8718a;
        if (j9 != -1) {
            return j9;
        }
        h2.b("No timestamp is available.");
        return 0L;
    }

    @Override // s0.y
    public s0.s h() {
        s0.y yVar = (s0.y) this.f8719b;
        return yVar != null ? yVar.h() : s0.s.UNKNOWN;
    }

    @Override // s0.y
    public s0.u l() {
        s0.y yVar = (s0.y) this.f8719b;
        return yVar != null ? yVar.l() : s0.u.UNKNOWN;
    }

    public x(y00.m mVar, String str) {
        this.f8720c = mVar;
        i0.e(str);
        this.f8719b = str;
        this.f8718a = -1L;
    }

    public x(y00.m mVar, String str, long j9) {
        this.f8720c = mVar;
        i0.e(str);
        this.f8719b = str;
        this.f8718a = mVar.M("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j9)}, -1L);
    }

    public x(long j9, od.h hVar) {
        this.f8718a = j9;
        this.f8719b = hVar;
        this.f8720c = new od.f(this, j9);
    }

    public x(s0.y yVar, k2 k2Var, long j9) {
        this.f8719b = yVar;
        this.f8720c = k2Var;
        this.f8718a = j9;
    }
}
