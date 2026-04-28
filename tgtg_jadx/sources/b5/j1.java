package b5;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5852f;

    public void a(Executor executor, s0.k1 k1Var) {
        s0.b2 b2Var;
        synchronized (this.f5849c) {
            s0.b2 b2Var2 = (s0.b2) ((HashMap) this.f5851e).remove(k1Var);
            if (b2Var2 != null) {
                b2Var2.f38299c.set(false);
                ((CopyOnWriteArraySet) this.f5852f).remove(b2Var2);
            }
            b2Var = new s0.b2((AtomicReference) this.f5850d, executor, k1Var);
            ((HashMap) this.f5851e).put(k1Var, b2Var);
            ((CopyOnWriteArraySet) this.f5852f).add(b2Var);
        }
        b2Var.a(0);
    }

    public boolean b(int i11, int i12) {
        o3.e eVar = (o3.e) this.f5850d;
        int i13 = this.f5847a;
        b4.r rVar = (b4.r) eVar.f31830a[i11 + i13];
        b4.r rVar2 = (b4.r) ((o3.e) this.f5851e).f31830a[i13 + i12];
        return Intrinsics.areEqual(rVar, rVar2) || rVar.getClass() == rVar2.getClass();
    }

    public qz.p c() {
        com.google.android.gms.common.internal.i0.a("Must set register function", ((qz.q) this.f5849c) != null);
        com.google.android.gms.common.internal.i0.a("Must set unregister function", ((qz.q) this.f5850d) != null);
        com.google.android.gms.common.internal.i0.a("Must set holder", ((qz.m) this.f5851e) != null);
        qz.k kVar = ((qz.m) this.f5851e).f37368b;
        com.google.android.gms.common.internal.i0.i(kVar, "Key must not be null");
        return new qz.p(new qz.h0(this, (qz.m) this.f5851e, (pz.d[]) this.f5852f, this.f5848b, this.f5847a), new qz.i0(this, kVar));
    }

    public void d() {
        synchronized (this.f5851e) {
            try {
                if (this.f5848b) {
                    return;
                }
                this.f5848b = true;
                v80.b2 b2Var = (v80.b2) this.f5852f;
                x70.c cVar = null;
                if (b2Var != null) {
                    b2Var.a(null);
                }
                this.f5852f = null;
                v80.f0.B((v80.b0) this.f5849c, null, null, new a3.y(this, cVar, 12), 3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
