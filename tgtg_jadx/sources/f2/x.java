package f2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import z1.h3;
import z1.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f17230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3 f17231c;

    public /* synthetic */ x(q2 q2Var, h3 h3Var, int i11) {
        this.f17229a = i11;
        this.f17231c = h3Var;
        this.f17230b = q2Var;
    }

    @Override // z1.q2
    public final float a(float f11) {
        switch (this.f17229a) {
        }
        return this.f17230b.a(f11);
    }

    public final int b(int i11) {
        Object obj;
        switch (this.f17229a) {
            case 0:
                c0 c0Var = (c0) this.f17231c;
                s sVarJ = c0Var.j();
                if (sVarJ.f17192k.isEmpty()) {
                    return 0;
                }
                int iH = c0Var.h();
                if (i11 > e() || iH > i11) {
                    return ((i11 - c0Var.h()) * pd.g.M(sVarJ)) - c0Var.i();
                }
                List list = sVarJ.f17192k;
                int size = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        obj = list.get(i12);
                        if (((t) ((m) obj)).f17199a != i11) {
                            i12++;
                        }
                    } else {
                        obj = null;
                    }
                }
                m mVar = (m) obj;
                if (mVar != null) {
                    return ((t) mVar).f17213p;
                }
                return 0;
            default:
                i2.e0 e0Var = (i2.e0) this.f17231c;
                return (int) (n80.p.d(w0.e.q(e0Var) + ((long) j80.c.b(((e0Var.q() * (i11 - e0Var.l())) - (e0Var.m() * e0Var.q())) + 0)), e0Var.f22826h, e0Var.f22825g) - w0.e.q(e0Var));
        }
    }

    public final int c() {
        switch (this.f17229a) {
            case 0:
                return ((c0) this.f17231c).h();
            default:
                return ((i2.e0) this.f17231c).f22823e;
        }
    }

    public final int d() {
        switch (this.f17229a) {
            case 0:
                return ((c0) this.f17231c).i();
            default:
                return ((i2.e0) this.f17231c).f22824f;
        }
    }

    public final int e() {
        switch (this.f17229a) {
            case 0:
                m mVar = (m) CollectionsKt.X(((c0) this.f17231c).j().f17192k);
                if (mVar != null) {
                    return ((t) mVar).f17199a;
                }
                return 0;
            default:
                return ((i2.g) ((i2.h) CollectionsKt.W(((i2.e0) this.f17231c).n().f22906a))).f22846a;
        }
    }

    public final void f(int i11, int i12) {
        switch (this.f17229a) {
            case 0:
                ((c0) this.f17231c).m(i11, i12);
                break;
            default:
                ((i2.e0) this.f17231c).v(i11, i12 / r0.q(), true);
                break;
        }
    }
}
