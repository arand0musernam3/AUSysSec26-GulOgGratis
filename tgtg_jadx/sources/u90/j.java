package u90;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.i0;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import y00.e1;
import y00.l4;
import y00.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f40914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f40915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f40916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f40917e;

    public /* synthetic */ j(e1 e1Var, long j9) {
        this.f40917e = e1Var;
        i0.e("health_monitor");
        i0.b(j9 > 0);
        this.f40914b = "health_monitor:start";
        this.f40915c = "health_monitor:count";
        this.f40916d = "health_monitor:value";
        this.f40913a = j9;
    }

    @Override // u90.g
    public o a() throws IOException {
        s sVarD;
        long j9;
        s sVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f40916d).isEmpty() && !((q) this.f40914b).a(null)) {
                    c();
                    iOException.getClass();
                    throw iOException;
                }
                if (((q) this.f40914b).f40970k.f40938q) {
                    throw new IOException("Canceled");
                }
                ky.o oVar = ((t90.e) this.f40915c).f39877a;
                long jNanoTime = System.nanoTime();
                long j11 = this.f40913a - jNanoTime;
                if (((CopyOnWriteArrayList) this.f40916d).isEmpty() || j11 <= 0) {
                    sVarD = d();
                    j9 = 250000000;
                    this.f40913a = jNanoTime + 250000000;
                } else {
                    j9 = j11;
                    sVarD = null;
                }
                if (sVarD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f40916d;
                    if (copyOnWriteArrayList.isEmpty() || (sVar = (s) ((LinkedBlockingDeque) this.f40917e).poll(j9, timeUnit)) == null) {
                        sVarD = null;
                    } else {
                        copyOnWriteArrayList.remove(sVar.f40976a);
                        sVarD = sVar;
                    }
                    if (sVarD == null) {
                    }
                }
                boolean z11 = false;
                if (sVarD.f40977b == null && sVarD.f40978c == null) {
                    c();
                    if (!sVarD.f40976a.isReady()) {
                        sVarD = sVarD.f40976a.f();
                    }
                    if (sVarD.f40977b == null && sVarD.f40978c == null) {
                        z11 = true;
                    }
                    if (z11) {
                        return sVarD.f40976a.b();
                    }
                }
                Throwable th2 = sVarD.f40978c;
                if (th2 != null) {
                    if (!(th2 instanceof IOException)) {
                        throw th2;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th2;
                    } else {
                        u70.e.a(iOException, th2);
                    }
                }
                t tVar = sVarD.f40977b;
                if (tVar != null) {
                    ((q) this.f40914b).f40974p.addFirst(tVar);
                }
            } finally {
                c();
            }
        }
    }

    @Override // u90.g
    public u b() {
        return (q) this.f40914b;
    }

    public void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f40916d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            tVar.cancel();
            t tVarA = tVar.a();
            if (tVarA != null) {
                ((q) this.f40914b).f40974p.addLast(tVarA);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public s d() {
        t hVar;
        q qVar = (q) this.f40914b;
        if (qVar.a(null)) {
            try {
                hVar = qVar.b();
            } catch (Throwable th2) {
                hVar = new h(th2);
            }
            if (hVar.isReady()) {
                return new s(hVar, null, null, 6);
            }
            if (hVar instanceof h) {
                return ((h) hVar).f40910a;
            }
            ((CopyOnWriteArrayList) this.f40916d).add(hVar);
            ((t90.e) this.f40915c).d().c(new i(r90.g.f37816b + " connect " + qVar.f40968i.f36408h.h(), hVar, this), 0L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(long r11, com.google.android.gms.internal.measurement.t8 r13) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.j.e(long, com.google.android.gms.internal.measurement.t8):boolean");
    }

    public void f() {
        e1 e1Var = (e1) this.f40917e;
        e1Var.p();
        ((n1) e1Var.f21216b).f44992k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = e1Var.t().edit();
        editorEdit.remove((String) this.f40915c);
        editorEdit.remove((String) this.f40916d);
        editorEdit.putLong((String) this.f40914b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public /* synthetic */ j(l4 l4Var) {
        this.f40917e = l4Var;
    }

    public j(q qVar, t90.e eVar) {
        eVar.getClass();
        this.f40914b = qVar;
        this.f40915c = eVar;
        this.f40913a = Long.MIN_VALUE;
        this.f40916d = new CopyOnWriteArrayList();
        this.f40917e = new LinkedBlockingDeque();
    }
}
