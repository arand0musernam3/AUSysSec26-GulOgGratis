package r0;

import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.lifecycle.n1;
import i0.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import m0.a0;
import m0.e0;
import m0.e1;
import m0.f0;
import m0.j0;
import s0.b1;
import s0.i1;
import s0.j1;
import s0.r0;
import s0.s0;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb.b f37506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n1 f37507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f37508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f37509e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f37505a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37510f = false;

    public q(jb.b bVar) {
        a.a.t();
        this.f37506b = bVar;
        this.f37509e = new ArrayList();
    }

    public final void a() {
        a.a.t();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        ArrayDeque<f> arrayDeque = this.f37505a;
        for (f fVar : arrayDeque) {
            fVar.f37452c.execute(new m0.l(fVar, imageCaptureException));
        }
        arrayDeque.clear();
        for (o oVar : new ArrayList(this.f37509e)) {
            oVar.getClass();
            a.a.t();
            if (!oVar.f37497d.f15782b.isDone()) {
                a.a.t();
                oVar.f37500g = true;
                x0.b bVar = oVar.f37502i;
                Objects.requireNonNull(bVar);
                bVar.cancel(true);
                oVar.f37498e.d(imageCaptureException);
                oVar.f37499f.b(null);
                a.a.t();
                f fVar2 = oVar.f37494a;
                fVar2.f37452c.execute(new m0.l(fVar2, imageCaptureException));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        a0 a0Var;
        s0.p pVar;
        e1 e1Var;
        a.a.t();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.f37508d != null) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f37510f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        n1 n1Var = this.f37507c;
        n1Var.getClass();
        a.a.t();
        if (((q2) n1Var.f3501c).G() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        f fVar = (f) this.f37505a.poll();
        if (fVar == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        o oVar = new o(fVar, this);
        int i11 = 0;
        boolean z11 = true;
        pd.g.n(null, !(this.f37508d != null));
        this.f37508d = oVar;
        a.a.t();
        oVar.f37496c.f15782b.a(new p(this, i11), w.b.F());
        this.f37509e.add(oVar);
        a.a.t();
        oVar.f37497d.f15782b.a(new mr.h(12, this, oVar), w.b.F());
        n1 n1Var2 = this.f37507c;
        a.a.t();
        e6.l lVar = oVar.f37496c;
        n1Var2.getClass();
        a.a.t();
        a0 a0Var2 = (a0) ((b1) n1Var2.f3499a).i(b1.f38287d, new a0(Arrays.asList(new s0())));
        Objects.requireNonNull(a0Var2);
        int i12 = n1.f3498f;
        n1.f3498f = i12 + 1;
        a aVar = (a) n1Var2.f3503e;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(a0Var2.hashCode());
        List<s0> list = a0Var2.f28461a;
        Objects.requireNonNull(list);
        for (s0 s0Var : list) {
            int i13 = i11;
            w wVar = new w(5);
            r0 r0Var = (r0) n1Var2.f3500b;
            wVar.f22745b = r0Var.f38440c;
            wVar.e(r0Var.f38439b);
            wVar.b(fVar.l);
            e1 e1Var2 = aVar.f37431c;
            int i14 = aVar.f37435g;
            ArrayList arrayList2 = aVar.f37436h;
            Objects.requireNonNull(e1Var2);
            n1 n1Var3 = n1Var2;
            ((HashSet) wVar.f22746c).add(e1Var2);
            if (arrayList2.size() > 1 && (e1Var = aVar.f37432d) != null) {
                ((HashSet) wVar.f22746c).add(e1Var);
            }
            e1 e1Var3 = aVar.f37433e;
            if ((e1Var3 != null ? 1 : i13) != 0) {
                Objects.requireNonNull(e1Var3);
                ((HashSet) wVar.f22746c).add(e1Var3);
            }
            if (zz.f.w(i14) || i14 == 32) {
                if (((ImageCaptureRotationOptionQuirk) z0.a.f46383a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    s0.g gVar = r0.f38435f;
                } else {
                    ((i1) wVar.f22747d).v(r0.f38435f, Integer.valueOf(fVar.f37457h));
                }
                a0Var = a0Var2;
                ((i1) wVar.f22747d).v(r0.f38436g, Integer.valueOf(((fVar.f37453d != null ? 1 : i13) == 0 || !v0.o.c(fVar.f37455f, aVar.f37434f)) ? fVar.f37458i : fVar.f37459j == 0 ? 100 : 95));
            } else {
                a0Var = a0Var2;
            }
            wVar.e(s0Var.f38445a.f38439b);
            ((j1) wVar.f22749f).f38373a.put(strValueOf, Integer.valueOf(i13));
            ((j1) wVar.f22749f).f38373a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i12));
            wVar.c(aVar.f37429a);
            if (arrayList2.size() > 1 && (pVar = aVar.f37430b) != null) {
                wVar.c(pVar);
            }
            arrayList.add(wVar.h());
            z11 = true;
            i11 = i13;
            n1Var2 = n1Var3;
            a0Var2 = a0Var;
        }
        boolean z12 = i11;
        boolean z13 = z11;
        oz.m mVar = new oz.m(12, arrayList, oVar);
        n nVar = new n(a0Var2, fVar, oVar, lVar, i12);
        n1 n1Var4 = this.f37507c;
        n1Var4.getClass();
        a.a.t();
        ((a) n1Var4.f3503e).f37438j.accept(nVar);
        a.a.t();
        j0 j0Var = (j0) this.f37506b.f24851a;
        synchronized (j0Var.f28537s) {
            try {
                if (j0Var.f28537s.get() == null) {
                    j0Var.f28537s.set(Integer.valueOf(j0Var.F()));
                }
            } finally {
            }
        }
        j0 j0Var2 = (j0) this.f37506b.f24851a;
        a.a.t();
        x0.b bVarF = x0.g.f(j0Var2.e().d(arrayList, j0Var2.f28536r, j0Var2.f28538t), new u6.f(new j4.d(29)), w.b.F());
        bVarF.a(new x0.f(z12 ? 1 : 0, bVarF, new oz.m(this, mVar, z12, 15)), w.b.U());
        a.a.t();
        if (oVar.f37502i != null) {
            z13 = z12 ? 1 : 0;
        }
        pd.g.n("CaptureRequestFuture can only be set once.", z13);
        oVar.f37502i = bVarF;
    }

    @Override // m0.e0
    public final void d(f0 f0Var) {
        w.b.U().execute(new p(this, 1));
    }
}
