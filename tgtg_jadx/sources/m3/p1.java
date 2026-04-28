package m3;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f29363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f29364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f29365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function2 f29366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b5.r2 f29368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f29369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f29370h = new AtomicReference(q1.InitialPending);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f29371i = u3.e.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q1.i1 f29372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g0.c f29373k;
    public final c2 l;

    public p1(a0 a0Var, x xVar, s sVar, q1.w0 w0Var, Function2 function2, boolean z11, b5.r2 r2Var, Object obj) {
        this.f29363a = a0Var;
        this.f29364b = xVar;
        this.f29365c = sVar;
        this.f29366d = function2;
        this.f29367e = z11;
        this.f29368f = r2Var;
        this.f29369g = obj;
        q1.u0 u0Var = q1.j1.f35777a;
        u0Var.getClass();
        this.f29372j = u0Var;
        g0.c cVar = new g0.c();
        cVar.g(w0Var, sVar.A());
        this.f29373k = cVar;
        this.l = new c2(r2Var.f5961c);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.f29370h;
        try {
            switch (o1.$EnumSwitchMapping$0[((q1) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    q1 q1Var = q1.ApplyPending;
                    q1 q1Var2 = q1.Applied;
                    while (!atomicReference.compareAndSet(q1Var, q1Var2)) {
                        if (atomicReference.get() != q1Var) {
                            s1.b("Unexpected state change from: " + q1Var + " to: " + q1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e5) {
            atomicReference.set(q1.Invalid);
            throw e5;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f29369g) {
                try {
                    this.l.a(this.f29368f, this.f29373k);
                    this.f29373k.c();
                    this.f29373k.d();
                } finally {
                    this.f29373k.b();
                    this.f29363a.f29190q = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((q1) this.f29370h.get()).compareTo(q1.ApplyPending) >= 0;
    }

    public final void d() {
        boolean z11;
        q1 q1Var = q1.RecomposePending;
        q1 q1Var2 = q1.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.f29370h;
            if (atomicReference.compareAndSet(q1Var, q1Var2)) {
                z11 = true;
                break;
            } else if (atomicReference.get() != q1Var) {
                z11 = false;
                break;
            }
        }
        if (z11) {
            return;
        }
        s1.b("Unexpected state change from: " + q1Var + " to: " + q1Var2 + '.');
    }

    public final boolean e(wy.o oVar) throws Exception {
        AtomicReference atomicReference = this.f29370h;
        try {
            int i11 = o1.$EnumSwitchMapping$0[((q1) atomicReference.get()).ordinal()];
            a0 a0Var = this.f29363a;
            x xVar = this.f29364b;
            switch (i11) {
                case 1:
                    s sVar = this.f29365c;
                    boolean z11 = this.f29367e;
                    if (z11) {
                        sVar.f29441z = 0;
                        sVar.f29440y = true;
                    }
                    try {
                        this.f29372j = xVar.b(a0Var, oVar, this.f29366d);
                        q1 q1Var = q1.InitialPending;
                        q1 q1Var2 = q1.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(q1Var, q1Var2)) {
                                if (atomicReference.get() != q1Var) {
                                    s1.b("Unexpected state change from: " + q1Var + " to: " + q1Var2 + '.');
                                }
                            }
                        }
                        if (this.f29372j.b()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z11) {
                            sVar.t();
                        }
                    }
                case 2:
                    q1 q1Var3 = q1.RecomposePending;
                    q1 q1Var4 = q1.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(q1Var3, q1Var4)) {
                            if (atomicReference.get() != q1Var3) {
                                s1.b("Unexpected state change from: " + q1Var3 + " to: " + q1Var4 + '.');
                            }
                        }
                    }
                    long j9 = this.f29371i;
                    try {
                        this.f29371i = u3.e.c();
                        this.f29372j = xVar.q(a0Var, oVar, this.f29372j);
                        this.f29371i = j9;
                        q1 q1Var5 = q1.Recomposing;
                        q1 q1Var6 = q1.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(q1Var5, q1Var6)) {
                                if (atomicReference.get() != q1Var5) {
                                    s1.b("Unexpected state change from: " + q1Var5 + " to: " + q1Var6 + '.');
                                }
                            }
                        }
                        if (this.f29372j.b()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.f29371i = j9;
                        q1 q1Var7 = q1.Recomposing;
                        q1 q1Var8 = q1.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(q1Var7, q1Var8)) {
                                if (atomicReference.get() != q1Var7) {
                                    s1.b("Unexpected state change from: " + q1Var7 + " to: " + q1Var8 + '.');
                                }
                            }
                        }
                        throw th2;
                    }
                case 3:
                    v.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e5) {
            atomicReference.set(q1.Invalid);
            throw e5;
        }
    }
}
