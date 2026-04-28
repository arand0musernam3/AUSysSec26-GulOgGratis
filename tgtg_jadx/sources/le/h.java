package le;

import m3.c3;
import m3.i0;
import m3.k1;
import v1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f27677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f27678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f27679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f27680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f27681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f27682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f27683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f27684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f27685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f27686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k1 f27687k;
    public final k1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f27688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l1 f27689n;

    public h() {
        Boolean bool = Boolean.FALSE;
        this.f27677a = m3.i.w(bool);
        this.f27678b = m3.i.w(1);
        this.f27679c = m3.i.w(1);
        this.f27680d = m3.i.w(bool);
        this.f27681e = m3.i.w(null);
        this.f27682f = m3.i.w(Float.valueOf(1.0f));
        this.f27683g = m3.i.w(bool);
        this.f27684h = m3.i.q(new f(this, 1));
        this.f27685i = m3.i.w(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f27686j = m3.i.w(fValueOf);
        this.f27687k = m3.i.w(fValueOf);
        this.l = m3.i.w(Long.MIN_VALUE);
        this.f27688m = m3.i.q(new f(this, 0));
        m3.i.q(new f(this, 2));
        this.f27689n = new l1();
    }

    public static final boolean b(h hVar, int i11, long j9) {
        k1 k1Var = hVar.f27685i;
        k1 k1Var2 = hVar.f27686j;
        k1 k1Var3 = hVar.f27681e;
        i0 i0Var = hVar.f27684h;
        k1 k1Var4 = hVar.l;
        he.k kVar = (he.k) k1Var.getValue();
        if (kVar == null) {
            return true;
        }
        long jLongValue = ((Number) k1Var4.getValue()).longValue() == Long.MIN_VALUE ? 0L : j9 - ((Number) k1Var4.getValue()).longValue();
        k1Var4.setValue(Long.valueOf(j9));
        if (k1Var3.getValue() != null) {
            org.bouncycastle.jce.provider.a.c();
            return false;
        }
        if (k1Var3.getValue() != null) {
            org.bouncycastle.jce.provider.a.c();
            return false;
        }
        float fFloatValue = ((Number) i0Var.getValue()).floatValue() * ((jLongValue / ((long) 1000000)) / kVar.b());
        float fFloatValue2 = ((Number) i0Var.getValue()).floatValue() < 0.0f ? 0.0f - (((Number) k1Var2.getValue()).floatValue() + fFloatValue) : (((Number) k1Var2.getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue2 < 0.0f) {
            hVar.h(n80.p.b(((Number) k1Var2.getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i12 = (int) (fFloatValue2 / 1.0f);
        int i13 = i12 + 1;
        if (hVar.f() + i13 > i11) {
            hVar.h(hVar.e());
            hVar.g(i11);
            return false;
        }
        hVar.g(hVar.f() + i13);
        float f11 = fFloatValue2 - (i12 * 1.0f);
        hVar.h(((Number) i0Var.getValue()).floatValue() < 0.0f ? 1.0f - f11 : 0.0f + f11);
        return true;
    }

    public static final void d(h hVar, boolean z11) {
        hVar.f27677a.setValue(Boolean.valueOf(z11));
    }

    public final float e() {
        return ((Number) this.f27688m.getValue()).floatValue();
    }

    public final int f() {
        return ((Number) this.f27678b.getValue()).intValue();
    }

    public final void g(int i11) {
        this.f27678b.setValue(Integer.valueOf(i11));
    }

    @Override // m3.c3
    public final Object getValue() {
        return Float.valueOf(((Number) this.f27687k.getValue()).floatValue());
    }

    public final void h(float f11) {
        he.k kVar;
        this.f27686j.setValue(Float.valueOf(f11));
        if (((Boolean) this.f27683g.getValue()).booleanValue() && (kVar = (he.k) this.f27685i.getValue()) != null) {
            f11 -= f11 % (1 / kVar.f21938n);
        }
        this.f27687k.setValue(Float.valueOf(f11));
    }
}
