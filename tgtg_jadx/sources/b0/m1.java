package b0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements h2, d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f5312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f5313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o2 f5314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v80.q f5315d;

    public m1(n nVar, z.a aVar, w1 w1Var, k3 k3Var, x.k kVar) {
        Object next;
        nVar.getClass();
        w1Var.getClass();
        k3Var.getClass();
        this.f5312a = nVar;
        this.f5313b = w1Var;
        e0.v vVar = nVar.f5321b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        key.getClass();
        f0.t0 t0Var = (f0.t0) vVar;
        t0Var.getClass();
        Object objC = t0Var.c(key);
        CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        key2.getClass();
        f0.t0 t0Var2 = (f0.t0) vVar;
        t0Var2.getClass();
        Object objC2 = t0Var2.c(key2);
        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        key3.getClass();
        f0.t0 t0Var3 = (f0.t0) vVar;
        t0Var3.getClass();
        Object objC3 = t0Var3.c(key3);
        e0.v.f15412i0.getClass();
        e0.u.a(vVar);
        CameraCharacteristics.Key key4 = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key4.getClass();
        int[] iArr = (int[]) ((f0.t0) vVar).c(key4);
        if (iArr != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                List list = e0.a.f15305b;
                arrayList.add(m0.c.d0(i11));
            }
        }
        e0.v vVar2 = this.f5312a.f5321b;
        CameraCharacteristics.Key key5 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key5.getClass();
        int[] iArr2 = (int[]) ((f0.t0) vVar2).c(key5);
        if (iArr2 != null) {
            ArrayList arrayList2 = new ArrayList(iArr2.length);
            for (int i12 : iArr2) {
                Iterator it = e0.b.f15308b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((e0.b) next).f15309a == i12) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                arrayList2.add((e0.b) next);
            }
        }
    }

    @Override // b0.h2
    public final void a(o2 o2Var) {
        this.f5314c = o2Var;
    }

    @Override // b0.d3
    public final void b(LinkedHashSet linkedHashSet) {
        Size sizeC;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            m0.m1 m1Var = (m0.m1) it.next();
            if ((m1Var instanceof m0.s0) && (sizeC = ((m0.s0) m1Var).c()) != null) {
                new Rational(sizeC.getWidth(), sizeC.getHeight());
            }
        }
    }

    @Override // b0.h2
    public final void reset() {
        v80.q qVar = new v80.q();
        o2 o2Var = this.f5314c;
        if (o2Var == null) {
            w2.l1.k("Camera is not active.", qVar);
            return;
        }
        v80.q qVar2 = this.f5315d;
        if (qVar2 != null) {
            w2.l1.k("Cancelled by another cancelFocusAndMetering()", qVar2);
        }
        this.f5315d = qVar;
        w1 w1Var = this.f5313b;
        synchronized (w1Var.f5470d) {
        }
        w1Var.f();
        v0.n.C(o2Var.h(), qVar);
    }
}
