package g3;

import androidx.compose.foundation.gestures.FlingCancellationException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 implements z1.q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19586c;

    public /* synthetic */ u6(int i11, Object obj, Object obj2) {
        this.f19584a = i11;
        this.f19586c = obj;
        this.f19585b = obj2;
    }

    @Override // z1.q2
    public final float a(float f11) {
        switch (this.f19584a) {
            case 0:
                z1.r rVar = ((w6) this.f19586c).f19706e;
                float fB = n80.p.b((Float.isNaN(rVar.f46655j.h()) ? 0.0f : rVar.f46655j.h()) + f11, ((z1.a0) rVar.d()).e(), ((z1.a0) rVar.d()).d());
                float fH = fB - rVar.f46655j.h();
                ((z1.q) this.f19585b).a(fB, 0.0f);
                return fH;
            case 1:
                z1.n nVar = (z1.n) this.f19586c;
                float f12 = nVar.I.f(f11);
                float fH2 = f12 - nVar.I.f46655j.h();
                ((z1.q) this.f19585b).a(f12, 0.0f);
                return fH2;
            default:
                z1.l3 l3Var = (z1.l3) this.f19586c;
                if (Math.abs(f11) == 0.0f || ((Boolean) l3Var.f46591h.invoke()).booleanValue()) {
                    return l3Var.d(l3Var.g(((z1.k3) this.f19585b).a(2, l3Var.e(l3Var.h(f11)))));
                }
                throw new FlingCancellationException("The fling animation was cancelled");
        }
    }
}
