package b0;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f5194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o2 f5195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f2 f5197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.o0 f5198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.o0 f5201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v80.q f5202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v80.q f5203j;

    public g2(n nVar, w1 w1Var, k3 k3Var) {
        nVar.getClass();
        w1Var.getClass();
        k3Var.getClass();
        this.f5194a = w1Var;
        this.f5196c = u00.d.E(nVar);
        boolean z11 = false;
        this.f5198e = new androidx.lifecycle.o0(0);
        e0.u uVar = e0.v.f15412i0;
        e0.v vVar = nVar.f5321b;
        uVar.getClass();
        vVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && f0.c0.d(vVar)) {
            z11 = true;
        }
        this.f5199f = z11;
        int iB = i11 >= 35 ? f0.c0.b(vVar) : 1;
        this.f5200g = iB;
        if (i11 >= 35) {
            f0.c0.c(vVar);
        }
        this.f5201h = new androidx.lifecycle.o0(Integer.valueOf(iB));
    }

    public static v80.q b(g2 g2Var, boolean z11, int i11) {
        return g2Var.c(z11 ? 1 : 0, (i11 & 2) != 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // b0.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(b0.o2 r2) {
        /*
            r1 = this;
            r1.f5195b = r2
            b0.f2 r2 = r1.f5197d
            if (r2 == 0) goto L1e
            androidx.lifecycle.o0 r2 = r1.f5198e
            java.lang.Object r2 = r2.d()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L11
            goto L19
        L11:
            int r2 = r2.intValue()
            r0 = 1
            if (r2 != r0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            r2 = 4
            b(r1, r0, r2)
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g2.a(b0.o2):void");
    }

    public final v80.q c(int i11, boolean z11, boolean z12) {
        int i12;
        Object objE;
        w1 w1Var = this.f5194a;
        if (wd.a.B(3, "CXCP")) {
            StringBuilder sb2 = new StringBuilder("TorchControl#setTorchAsync: torch mode = ");
            sb2.append((Object) ("TorchMode(value=" + i11 + ')'));
            Log.d("CXCP", sb2.toString());
        }
        v80.q qVar = new v80.q();
        if (!z12 && !this.f5196c) {
            qVar.h0(new IllegalStateException("No flash unit"));
            return qVar;
        }
        o2 o2Var = this.f5195b;
        if (o2Var == null) {
            w2.l1.k("Camera is not active.", qVar);
            return qVar;
        }
        e(i11);
        v80.q qVar2 = this.f5202i;
        if (z11) {
            if (qVar2 != null) {
                w2.l1.k("There is a new enableTorch being set", qVar2);
            }
            this.f5202i = null;
        } else if (qVar2 != null) {
            v0.n.C(qVar, qVar2);
        }
        this.f5202i = qVar;
        Integer num = i11 == 0 ? null : 1;
        synchronized (w1Var.f5470d) {
            w1Var.f5477k = num;
        }
        w1Var.f();
        List list = e0.a.f15305b;
        e0.a aVarD0 = m0.c.d0(w1Var.e());
        if (aVarD0 != null) {
            i12 = aVarD0.f15306a;
        } else {
            if (wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + w1Var.e() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
            }
            i12 = 1;
        }
        if (i11 == 0) {
            objE = o2Var.e(i12);
        } else {
            if (i11 == 1) {
                Integer num2 = (Integer) this.f5201h.d();
                if (num2 != null) {
                    f(num2.intValue());
                }
            } else {
                f(this.f5200g);
            }
            objE = o2Var.b();
        }
        defpackage.g gVar = new defpackage.g(11);
        objE.getClass();
        ((v80.s1) objE).J(new m2.h0(objE, qVar, gVar, 21));
        return qVar;
    }

    public final void e(int i11) {
        this.f5197d = new f2(i11);
        int i12 = i11 != 1 ? 0 : 1;
        boolean zE = a.a.E();
        androidx.lifecycle.o0 o0Var = this.f5198e;
        if (zE) {
            o0Var.k(Integer.valueOf(i12));
        } else {
            o0Var.i(Integer.valueOf(i12));
        }
    }

    public final void f(int i11) {
        v80.i0 i0VarK;
        v80.q qVar = new v80.q();
        if (Build.VERSION.SDK_INT < 35 || !this.f5199f) {
            qVar.h0(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        v80.q qVar2 = this.f5203j;
        if (qVar2 != null) {
            if (qVar2 != null) {
                w2.l1.k("There is a new torch strength being set", qVar2);
            }
            this.f5203j = null;
        }
        this.f5203j = qVar;
        qVar.J(new a3.x0(this, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j7.a.b(linkedHashMap, i11);
        o2 o2Var = this.f5195b;
        if (o2Var == null || (i0VarK = o2.k(o2Var, linkedHashMap)) == null) {
            w2.l1.k("Camera is not active.", qVar);
        } else {
            v0.n.C(i0VarK, qVar);
        }
    }

    @Override // b0.h2
    public final void reset() {
        v80.q qVar = this.f5202i;
        if (qVar != null) {
            w2.l1.k("There is a new enableTorch being set", qVar);
        }
        this.f5202i = null;
        v80.q qVar2 = this.f5203j;
        if (qVar2 != null) {
            w2.l1.k("There is a new torch strength being set", qVar2);
        }
        this.f5203j = null;
        if (this.f5197d != null) {
            e(0);
            b(this, false, 6);
            this.f5197d = null;
        }
    }
}
