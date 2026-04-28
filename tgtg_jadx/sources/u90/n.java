package u90;

import com.braze.h2;
import com.google.firebase.messaging.a0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import q90.d0;
import q90.g0;
import q90.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements q90.h, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f40923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f40924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f40926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f40927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f40928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f40929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f40930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f40931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f40932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e20.a f40933k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f40934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f40936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f40937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f40938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile e20.a f40939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f40940s;

    public n(d0 d0Var, g0 g0Var, boolean z11) {
        d0Var.getClass();
        g0Var.getClass();
        this.f40923a = d0Var;
        this.f40924b = g0Var;
        this.f40925c = z11;
        this.f40926d = (p) d0Var.E.f28697a;
        d0Var.f36466d.getClass();
        m mVar = new m(this);
        mVar.g(d0Var.f36484w, TimeUnit.MILLISECONDS);
        this.f40927e = mVar;
        this.f40928f = new AtomicBoolean();
        this.f40937p = true;
        this.f40940s = new CopyOnWriteArrayList();
        new AtomicReference(g0Var.f36509e);
    }

    public static final String a(n nVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(nVar.f40938q ? "canceled " : "");
        sb2.append(nVar.f40925c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(nVar.f40924b.f36505a.h());
        return sb2.toString();
    }

    public final void b(o oVar) {
        oVar.getClass();
        TimeZone timeZone = r90.g.f37815a;
        if (this.f40931i != null) {
            h2.b("Check failed.");
        } else {
            this.f40931i = oVar;
            oVar.f40954p.add(new l(this, this.f40929g));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketL;
        TimeZone timeZone = r90.g.f37815a;
        o oVar = this.f40931i;
        if (oVar != null) {
            synchronized (oVar) {
                socketL = l();
            }
            if (this.f40931i == null) {
                if (socketL != null) {
                    r90.g.c(socketL);
                }
            } else if (socketL != null) {
                h2.b("Check failed.");
                return null;
            }
        }
        if (!this.f40932j && this.f40927e.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final void cancel() {
        if (this.f40938q) {
            return;
        }
        this.f40938q = true;
        e20.a aVar = this.f40939r;
        if (aVar != null) {
            ((v90.e) aVar.f15581e).cancel();
        }
        Iterator it = this.f40940s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((t) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new n(this.f40923a, this.f40924b, this.f40925c);
    }

    public final void d(q90.i iVar) {
        if (!this.f40928f.compareAndSet(false, true)) {
            h2.b("Already Executed");
            return;
        }
        aa0.e eVar = aa0.e.f1191a;
        this.f40929g = aa0.e.f1191a.g();
        a0 a0Var = this.f40923a.f36463a;
        k kVar = new k(this, iVar);
        a0Var.getClass();
        a0.T(a0Var, kVar, null, null, 6);
    }

    public final p0 f() {
        if (!this.f40928f.compareAndSet(false, true)) {
            h2.b("Already Executed");
            return null;
        }
        this.f40927e.i();
        aa0.e eVar = aa0.e.f1191a;
        this.f40929g = aa0.e.f1191a.g();
        try {
            a0 a0Var = this.f40923a.f36463a;
            synchronized (a0Var) {
                ((ArrayDeque) a0Var.f12781d).add(this);
            }
            return i();
        } finally {
            a0 a0Var2 = this.f40923a.f36463a;
            a0Var2.getClass();
            a0.T(a0Var2, null, this, null, 5);
        }
    }

    public final void h(boolean z11) {
        e20.a aVar;
        synchronized (this) {
            if (!this.f40937p) {
                throw new IllegalStateException("released");
            }
        }
        if (z11 && (aVar = this.f40939r) != null) {
            ((v90.e) aVar.f15581e).cancel();
            ((n) aVar.f15579c).j(aVar, true, true, true, true, null);
        }
        this.f40933k = null;
    }

    public final p0 i() {
        ArrayList arrayList = new ArrayList();
        i0.s(this.f40923a.f36464b, arrayList);
        arrayList.add(new s90.b(this.f40923a));
        arrayList.add(new s90.b(this.f40923a.f36472j));
        arrayList.add(new s90.b(this.f40923a.f36473k));
        arrayList.add(a.f40873a);
        if (!this.f40925c) {
            i0.s(this.f40923a.f36465c, arrayList);
        }
        arrayList.add(v90.b.f42182a);
        g0 g0Var = this.f40924b;
        d0 d0Var = this.f40923a;
        try {
            try {
                p0 p0VarB = new v90.g(this, arrayList, 0, null, g0Var, d0Var.f36485x, d0Var.f36486y, d0Var.f36487z).b(this.f40924b);
                if (this.f40938q) {
                    r90.e.b(p0VarB);
                    throw new IOException("Canceled");
                }
                k(null);
                return p0VarB;
            } catch (IOException e5) {
                IOException iOExceptionK = k(e5);
                iOExceptionK.getClass();
                throw iOExceptionK;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                k(null);
            }
            throw th2;
        }
    }

    public final IOException j(e20.a aVar, boolean z11, boolean z12, boolean z13, boolean z14, IOException iOException) {
        boolean z15;
        boolean z16;
        aVar.getClass();
        if (Intrinsics.areEqual(aVar, this.f40939r)) {
            synchronized (this) {
                z15 = false;
                if (z11) {
                    try {
                        if (!this.l) {
                            if ((z12 || !this.f40934m) && ((!z14 || !this.f40935n) && (!z13 || !this.f40936o))) {
                            }
                        }
                        if (z11) {
                            this.l = false;
                        }
                        if (z12) {
                            this.f40934m = false;
                        }
                        if (z14) {
                            this.f40935n = false;
                        }
                        if (z13) {
                            this.f40936o = false;
                        }
                        boolean z17 = (this.l || this.f40934m || this.f40935n || this.f40936o) ? false : true;
                        if (z17) {
                            if (!this.f40937p) {
                                z15 = true;
                            }
                        }
                        boolean z18 = z15;
                        z15 = z17;
                        z16 = z18;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    z16 = z12 ? false : false;
                }
            }
            if (z15) {
                this.f40939r = null;
                o oVar = this.f40931i;
                if (oVar != null) {
                    synchronized (oVar) {
                        oVar.f40951m++;
                    }
                }
            }
            if (z16) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException k(IOException iOException) {
        boolean z11;
        synchronized (this) {
            z11 = false;
            if (this.f40937p) {
                this.f40937p = false;
                if (!this.l && !this.f40934m && !this.f40935n) {
                    if (!this.f40936o) {
                        z11 = true;
                    }
                }
            }
        }
        return z11 ? c(iOException) : iOException;
    }

    public final Socket l() {
        o oVar = this.f40931i;
        oVar.getClass();
        TimeZone timeZone = r90.g.f37815a;
        ArrayList arrayList = oVar.f40954p;
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            h2.b("Check failed.");
            return null;
        }
        arrayList.remove(i11);
        this.f40931i = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        oVar.f40955q = System.nanoTime();
        p pVar = this.f40926d;
        ConcurrentLinkedQueue concurrentLinkedQueue = pVar.f40959d;
        TimeZone timeZone2 = r90.g.f37815a;
        if (!oVar.f40949j) {
            pVar.f40957b.c(pVar.f40958c, 0L);
            return null;
        }
        oVar.f40949j = true;
        concurrentLinkedQueue.remove(oVar);
        if (concurrentLinkedQueue.isEmpty()) {
            t90.c cVar = pVar.f40957b;
            synchronized (cVar.f39869a) {
                if (cVar.a()) {
                    cVar.f39869a.c(cVar);
                }
            }
        }
        return oVar.f40944e;
    }
}
