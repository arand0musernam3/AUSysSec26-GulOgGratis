package ke;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f26303c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ub.a f26305e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26301a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26302b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26304d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f26306f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26307g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26308h = -1.0f;

    public e(List list) {
        b dVar;
        if (list.isEmpty()) {
            dVar = new qb.e();
        } else {
            dVar = list.size() == 1 ? new d(list) : new c(list);
        }
        this.f26303c = dVar;
    }

    public final void a(a aVar) {
        this.f26301a.add(aVar);
    }

    public final we.a b() {
        he.a aVar = he.e.f21898a;
        return this.f26303c.c();
    }

    public float c() {
        if (this.f26308h == -1.0f) {
            this.f26308h = this.f26303c.g();
        }
        return this.f26308h;
    }

    public final float d() {
        Interpolator interpolator;
        we.a aVarB = b();
        if (aVarB == null || aVarB.c() || (interpolator = aVarB.f43390d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    public final float e() {
        if (this.f26302b) {
            return 0.0f;
        }
        we.a aVarB = b();
        if (aVarB.c()) {
            return 0.0f;
        }
        return (this.f26304d - aVarB.b()) / (aVarB.a() - aVarB.b());
    }

    public Object f() {
        float fE = e();
        if (this.f26305e == null && this.f26303c.b(fE) && !l()) {
            return this.f26306f;
        }
        we.a aVarB = b();
        Interpolator interpolator = aVarB.f43391e;
        Interpolator interpolator2 = aVarB.f43392f;
        Object objG = (interpolator == null || interpolator2 == null) ? g(aVarB, d()) : h(aVarB, fE, interpolator.getInterpolation(fE), interpolator2.getInterpolation(fE));
        this.f26306f = objG;
        return objG;
    }

    public abstract Object g(we.a aVar, float f11);

    public Object h(we.a aVar, float f11, float f12, float f13) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        he.a aVar = he.e.f21898a;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f26301a;
            if (i11 >= arrayList.size()) {
                he.a aVar2 = he.e.f21898a;
                return;
            } else {
                ((a) arrayList.get(i11)).a();
                i11++;
            }
        }
    }

    public void j(float f11) {
        he.a aVar = he.e.f21898a;
        b bVar = this.f26303c;
        if (bVar.isEmpty()) {
            return;
        }
        if (this.f26307g == -1.0f) {
            this.f26307g = bVar.l();
        }
        float f12 = this.f26307g;
        if (f11 < f12) {
            if (f12 == -1.0f) {
                this.f26307g = bVar.l();
            }
            f11 = this.f26307g;
        } else if (f11 > c()) {
            f11 = c();
        }
        if (f11 == this.f26304d) {
            return;
        }
        this.f26304d = f11;
        if (bVar.d(f11)) {
            i();
        }
    }

    public final void k(ub.a aVar) {
        ub.a aVar2 = this.f26305e;
        if (aVar2 != null) {
            aVar2.getClass();
        }
        this.f26305e = aVar;
    }

    public boolean l() {
        return false;
    }
}
