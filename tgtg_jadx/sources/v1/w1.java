package v1;

import b5.l2;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends b4.s implements b5.c0, l2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y1 f41866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41867p;

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        j5.z.q(b0Var);
        final int i11 = 0;
        final int i12 = 1;
        j5.k kVar = new j5.k(new Function0(this) { // from class: v1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f41859b;

            {
                this.f41859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iH;
                switch (i11) {
                    case 0:
                        iH = this.f41859b.f41866o.f41888a.h();
                        break;
                    default:
                        iH = this.f41859b.f41866o.f41892e.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        }, new Function0(this) { // from class: v1.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f41859b;

            {
                this.f41859b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iH;
                switch (i12) {
                    case 0:
                        iH = this.f41859b.f41866o.f41888a.h();
                        break;
                    default:
                        iH = this.f41859b.f41866o.f41892e.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        }, false);
        if (this.f41867p) {
            j5.a0 a0Var = j5.x.f24727v;
            KProperty kProperty = j5.z.f24734a[13];
            b0Var.b(a0Var, kVar);
        } else {
            j5.a0 a0Var2 = j5.x.f24726u;
            KProperty kProperty2 = j5.z.f24734a[12];
            b0Var.b(a0Var2, kVar);
        }
    }

    @Override // b5.c0
    public final int maxIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        if (!this.f41867p) {
            i11 = Integer.MAX_VALUE;
        }
        return tVar.b(i11);
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        if (this.f41867p) {
            i11 = Integer.MAX_VALUE;
        }
        return tVar.y(i11);
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        n.m(j9, this.f41867p ? h2.Vertical : h2.Horizontal);
        z4.m1 m1VarD = t0Var.D(z5.a.b(j9, 0, this.f41867p ? z5.a.i(j9) : Integer.MAX_VALUE, 0, this.f41867p ? Integer.MAX_VALUE : z5.a.h(j9), 5));
        int i11 = m1VarD.f47183a;
        int i12 = z5.a.i(j9);
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = m1VarD.f47184b;
        int iH = z5.a.h(j9);
        if (i13 > iH) {
            i13 = iH;
        }
        int i14 = m1VarD.f47184b - i13;
        int i15 = m1VarD.f47183a - i11;
        if (!this.f41867p) {
            i14 = i15;
        }
        this.f41866o.f(i14);
        this.f41866o.f41889b.i(this.f41867p ? i13 : i11);
        this.f41866o.f41890c.i(this.f41867p ? m1VarD.f47184b : m1VarD.f47183a);
        return z4.w0.f(w0Var, i11, i13, new cg.i0(this, i14, m1VarD, 4));
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        if (!this.f41867p) {
            i11 = Integer.MAX_VALUE;
        }
        return tVar.V(i11);
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        if (this.f41867p) {
            i11 = Integer.MAX_VALUE;
        }
        return tVar.w(i11);
    }
}
