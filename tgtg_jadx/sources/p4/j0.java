package p4;

import kotlin.Unit;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends n4.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f34358f = m3.i.w(new h4.e(0));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f34359g = m3.i.w(Boolean.FALSE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f34360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f34361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f34362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i4.w f34363k;

    public j0(c cVar) {
        f0 f0Var = new f0(cVar);
        f0Var.f34310f = new ky.i(this, 9);
        this.f34360h = f0Var;
        this.f34361i = new k1(Unit.f26487a, m3.f.f29272d);
        this.f34362j = 1.0f;
    }

    @Override // n4.b
    public final boolean a(float f11) {
        this.f34362j = f11;
        return true;
    }

    @Override // n4.b
    public final boolean e(i4.w wVar) {
        this.f34363k = wVar;
        return true;
    }

    @Override // n4.b
    public final long h() {
        return ((h4.e) this.f34358f.getValue()).f21392a;
    }

    @Override // n4.b
    public final void i(k4.d dVar) {
        i4.w wVar = this.f34363k;
        f0 f0Var = this.f34360h;
        if (wVar == null) {
            wVar = (i4.w) f0Var.f34311g.getValue();
        }
        if (((Boolean) this.f34359g.getValue()).booleanValue() && dVar.getLayoutDirection() == z5.m.Rtl) {
            long jT0 = dVar.t0();
            j30.g gVarG0 = dVar.g0();
            long jO = gVarG0.o();
            gVarG0.i().e();
            try {
                ((jd.f) gVarG0.f24502b).o(-1.0f, 1.0f, jT0);
                f0Var.e(dVar, this.f34362j, wVar);
            } finally {
                r8.k.y(gVarG0, jO);
            }
        } else {
            f0Var.e(dVar, this.f34362j, wVar);
        }
        this.f34361i.getValue();
    }
}
