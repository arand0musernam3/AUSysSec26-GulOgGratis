package m2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import z1.h3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h3 f29124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.i0 f29125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.i0 f29126c;

    public x1(h3 h3Var, final y1 y1Var) {
        this.f29124a = h3Var;
        final int i11 = 0;
        this.f29125b = m3.i.q(new Function0() { // from class: m2.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        y1 y1Var2 = y1Var;
                        return Boolean.valueOf(y1Var2.f29139a.h() < y1Var2.f29140b.h());
                    default:
                        return Boolean.valueOf(y1Var.f29139a.h() > 0.0f);
                }
            }
        });
        final int i12 = 1;
        this.f29126c = m3.i.q(new Function0() { // from class: m2.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        y1 y1Var2 = y1Var;
                        return Boolean.valueOf(y1Var2.f29139a.h() < y1Var2.f29140b.h());
                    default:
                        return Boolean.valueOf(y1Var.f29139a.h() > 0.0f);
                }
            }
        });
    }

    @Override // z1.h3
    public final Object a(v1.j1 j1Var, Function2 function2, z70.c cVar) {
        return this.f29124a.a(j1Var, function2, cVar);
    }

    @Override // z1.h3
    public final boolean b() {
        return this.f29124a.b();
    }

    @Override // z1.h3
    public final boolean c() {
        return ((Boolean) this.f29126c.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final boolean d() {
        return ((Boolean) this.f29125b.getValue()).booleanValue();
    }

    @Override // z1.h3
    public final float e(float f11) {
        return this.f29124a.e(f11);
    }
}
