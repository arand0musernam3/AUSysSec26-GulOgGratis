package x2;

import a3.y1;
import android.os.Build;
import b5.o0;
import c5.x1;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.d3;
import m3.k1;
import v1.h1;
import v1.i1;
import v1.u1;
import v80.b2;
import v80.f0;
import w2.o1;
import w2.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends g implements b5.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s1 f43734q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w f43735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o1 f43736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f43737t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k1 f43738u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t1.b f43739v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h1 f43740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b2 f43741x;

    public i(s1 s1Var, w wVar, o1 o1Var, boolean z11) {
        this.f43734q = s1Var;
        this.f43735r = wVar;
        this.f43736s = o1Var;
        this.f43737t = z11;
        k1 k1VarW = m3.i.w(new z5.l(0L));
        this.f43738u = k1VarW;
        this.f43739v = new t1.b(new h4.b(f.a(this.f43734q, this.f43735r, this.f43736s, ((z5.l) k1VarW.getValue()).f47286a)), y1.f634b, new h4.b(y1.f635c), 8);
        final int i11 = 0;
        Function1 function1 = new Function1(this) { // from class: x2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f43733b;

            {
                this.f43733b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return (h4.b) this.f43733b.f43739v.d();
                    default:
                        z5.h hVar = (z5.h) obj;
                        d3 d3Var = x1.f7416h;
                        i iVar = this.f43733b;
                        z5.c cVar = (z5.c) b5.o.e(iVar, d3Var);
                        iVar.f43738u.setValue(new z5.l((((long) cVar.q0(z5.h.b(hVar.f47279a))) << 32) | (((long) cVar.q0(z5.h.a(hVar.f47279a))) & 4294967295L)));
                        return Unit.f26487a;
                }
            }
        };
        final int i12 = 1;
        Function1 function12 = new Function1(this) { // from class: x2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f43733b;

            {
                this.f43733b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        return (h4.b) this.f43733b.f43739v.d();
                    default:
                        z5.h hVar = (z5.h) obj;
                        d3 d3Var = x1.f7416h;
                        i iVar = this.f43733b;
                        z5.c cVar = (z5.c) b5.o.e(iVar, d3Var);
                        iVar.f43738u.setValue(new z5.l((((long) cVar.q0(z5.h.b(hVar.f47279a))) << 32) | (((long) cVar.q0(z5.h.a(hVar.f47279a))) & 4294967295L)));
                        return Unit.f26487a;
                }
            }
        };
        if (!i1.a()) {
            h2.a("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        h1 h1Var = new h1(function1, function12, Build.VERSION.SDK_INT == 28 ? v1.s1.f41840a : u1.f41850a);
        L0(h1Var);
        this.f43740w = h1Var;
    }

    @Override // x2.g
    public final void O0(s1 s1Var, w wVar, o1 o1Var, boolean z11) {
        s1 s1Var2 = this.f43734q;
        w wVar2 = this.f43735r;
        o1 o1Var2 = this.f43736s;
        boolean z12 = this.f43737t;
        this.f43734q = s1Var;
        this.f43735r = wVar;
        this.f43736s = o1Var;
        this.f43737t = z11;
        if (Intrinsics.areEqual(s1Var, s1Var2) && Intrinsics.areEqual(wVar, wVar2) && Intrinsics.areEqual(o1Var, o1Var2) && z11 == z12) {
            return;
        }
        P0();
    }

    public final void P0() {
        b2 b2Var = this.f43741x;
        x70.c cVar = null;
        if (b2Var != null) {
            b2Var.a(null);
        }
        this.f43741x = null;
        if (i1.a()) {
            this.f43741x = f0.B(getCoroutineScope(), null, null, new tm.d(this, cVar, 18), 3);
        }
    }

    @Override // x2.g, b5.l2
    public final void h0(j5.b0 b0Var) {
        this.f43740w.h0(b0Var);
    }

    @Override // x2.g, b5.r
    public final void n(o0 o0Var) {
        o0Var.b();
        this.f43740w.n(o0Var);
    }

    @Override // b4.s
    public final void onAttach() {
        P0();
    }

    @Override // x2.g
    public final void v(z4.z zVar) {
        this.f43740w.v(zVar);
    }
}
