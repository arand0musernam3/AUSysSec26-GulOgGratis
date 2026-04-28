package f4;

import b0.z;
import b4.s;
import b5.o0;
import b5.r;
import b5.r1;
import b5.y1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends s implements y1, a, r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f17288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n f17290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f17291r;

    public b(c cVar, Function1 function1) {
        this.f17288o = cVar;
        this.f17291r = function1;
        cVar.f17292a = this;
        new defpackage.a(this, 14);
    }

    @Override // b5.r
    public final void K() {
        L0();
    }

    public final void L0() {
        n nVar = this.f17290q;
        if (nVar != null) {
            nVar.d();
        }
        this.f17289p = false;
        this.f17288o.f17293b = null;
        b5.o.h(this);
    }

    @Override // f4.a
    public final z5.c a() {
        return b5.m.g(this).f5889z;
    }

    @Override // f4.a
    public final long d() {
        return z.z(b5.m.e(this, 4).f47185c);
    }

    @Override // f4.a
    public final z5.m getLayoutDirection() {
        return b5.m.g(this).A;
    }

    @Override // b5.y1
    public final void l0() {
        L0();
    }

    @Override // b5.r
    public final void n(o0 o0Var) {
        boolean z11 = this.f17289p;
        c cVar = this.f17288o;
        if (!z11) {
            cVar.f17293b = null;
            b5.o.m(this, new r1(8, this, cVar));
            if (cVar.f17293b == null) {
                throw b3.i.D("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f17289p = true;
        }
        lz.i iVar = cVar.f17293b;
        iVar.getClass();
        ((Function1) iVar.f28446b).invoke(o0Var);
    }

    @Override // b5.l, b5.i2
    public final void onDensityChange() {
        L0();
    }

    @Override // b4.s
    public final void onDetach() {
        super.onDetach();
        n nVar = this.f17290q;
        if (nVar != null) {
            nVar.d();
        }
    }

    @Override // b5.l
    public final void onLayoutDirectionChange() {
        L0();
    }

    @Override // b4.s
    public final void onReset() {
        super.onReset();
        L0();
    }
}
