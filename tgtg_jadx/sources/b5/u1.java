package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements z4.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4.t f6001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum f6002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enum f6003d;

    public /* synthetic */ u1(z4.t tVar, Enum r22, Enum r32, int i11) {
        this.f6000a = i11;
        this.f6001b = tVar;
        this.f6002c = r22;
        this.f6003d = r32;
    }

    @Override // z4.t0
    public final z4.m1 D(long j9) {
        switch (this.f6000a) {
            case 0:
                x1 x1Var = (x1) this.f6003d;
                x1 x1Var2 = x1.Width;
                w1 w1Var = (w1) this.f6002c;
                z4.t tVar = this.f6001b;
                if (x1Var == x1Var2) {
                    return new v1(w1Var == w1.Max ? tVar.y(z5.a.h(j9)) : tVar.w(z5.a.h(j9)), z5.a.d(j9) ? z5.a.h(j9) : 32767, 0);
                }
                return new v1(z5.a.e(j9) ? z5.a.i(j9) : 32767, w1Var == w1.Max ? tVar.b(z5.a.i(j9)) : tVar.V(z5.a.i(j9)), 0);
            case 1:
                z4.w wVar = (z4.w) this.f6003d;
                z4.w wVar2 = z4.w.Width;
                z4.v vVar = (z4.v) this.f6002c;
                z4.t tVar2 = this.f6001b;
                if (wVar == wVar2) {
                    return new v1(vVar == z4.v.Max ? tVar2.y(z5.a.h(j9)) : tVar2.w(z5.a.h(j9)), z5.a.d(j9) ? z5.a.h(j9) : 32767, 1);
                }
                return new v1(z5.a.e(j9) ? z5.a.i(j9) : 32767, vVar == z4.v.Max ? tVar2.b(z5.a.i(j9)) : tVar2.V(z5.a.i(j9)), 1);
            default:
                z4.y0 y0Var = (z4.y0) this.f6003d;
                z4.y0 y0Var2 = z4.y0.Width;
                z4.x0 x0Var = (z4.x0) this.f6002c;
                z4.t tVar3 = this.f6001b;
                if (y0Var == y0Var2) {
                    return new v1(x0Var == z4.x0.Max ? tVar3.y(z5.a.h(j9)) : tVar3.w(z5.a.h(j9)), z5.a.d(j9) ? z5.a.h(j9) : 32767, 2);
                }
                return new v1(z5.a.e(j9) ? z5.a.i(j9) : 32767, x0Var == z4.x0.Max ? tVar3.b(z5.a.i(j9)) : tVar3.V(z5.a.i(j9)), 2);
        }
    }

    @Override // z4.t
    public final Object G() {
        switch (this.f6000a) {
        }
        return this.f6001b.G();
    }

    @Override // z4.t
    public final int V(int i11) {
        switch (this.f6000a) {
        }
        return this.f6001b.V(i11);
    }

    @Override // z4.t
    public final int b(int i11) {
        switch (this.f6000a) {
        }
        return this.f6001b.b(i11);
    }

    @Override // z4.t
    public final int w(int i11) {
        switch (this.f6000a) {
        }
        return this.f6001b.w(i11);
    }

    @Override // z4.t
    public final int y(int i11) {
        switch (this.f6000a) {
        }
        return this.f6001b.y(i11);
    }
}
