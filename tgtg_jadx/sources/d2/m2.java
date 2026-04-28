package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f13848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f13849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f13850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a3 f13851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a3 f13852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a3 f13853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a3 f13854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a3 f13855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a3 f13856i;

    static {
        e0 e0Var = e0.Horizontal;
        f13848a = new g0(e0Var, 1.0f, "fillMaxWidth");
        e0 e0Var2 = e0.Vertical;
        f13849b = new g0(e0Var2, 1.0f, "fillMaxHeight");
        e0 e0Var3 = e0.Both;
        f13850c = new g0(e0Var3, 1.0f, "fillMaxSize");
        b4.i iVar = b4.d.f5695n;
        f13851d = new a3(e0Var, new a3.f1(iVar, 19), iVar, "wrapContentWidth");
        b4.i iVar2 = b4.d.f5694m;
        f13852e = new a3(e0Var, new a3.f1(iVar2, 19), iVar2, "wrapContentWidth");
        b4.j jVar = b4.d.f5693k;
        f13853f = new a3(e0Var2, new a3.f1(jVar, 20), jVar, "wrapContentHeight");
        b4.j jVar2 = b4.d.f5692j;
        f13854g = new a3(e0Var2, new a3.f1(jVar2, 20), jVar2, "wrapContentHeight");
        b4.k kVar = b4.d.f5687e;
        f13855h = new a3(e0Var3, new a3.f1(kVar, 21), kVar, "wrapContentSize");
        b4.k kVar2 = b4.d.f5683a;
        f13856i = new a3(e0Var3, new a3.f1(kVar2, 21), kVar2, "wrapContentSize");
    }

    public static final b4.t a(b4.t tVar, float f11, float f12) {
        return tVar.then(new t2(f11, f12));
    }

    public static /* synthetic */ b4.t b(b4.t tVar, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f12 = Float.NaN;
        }
        return a(tVar, f11, f12);
    }

    public static final b4.t c(b4.t tVar, float f11) {
        return tVar.then(f11 == 1.0f ? f13849b : new g0(e0.Vertical, f11, "fillMaxHeight"));
    }

    public static final b4.t d(b4.t tVar, float f11) {
        return tVar.then(f11 == 1.0f ? f13848a : new g0(e0.Horizontal, f11, "fillMaxWidth"));
    }

    public static final b4.t e(b4.t tVar, float f11) {
        return tVar.then(new l2(0.0f, f11, 0.0f, f11, true, c5.m2.f7291a, 5));
    }

    public static final b4.t f(b4.t tVar, float f11, float f12) {
        return tVar.then(new l2(0.0f, f11, 0.0f, f12, true, c5.m2.f7291a, 5));
    }

    public static /* synthetic */ b4.t g(b4.t tVar, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f12 = Float.NaN;
        }
        return f(tVar, f11, f12);
    }

    public static final b4.t h(b4.t tVar, float f11) {
        return tVar.then(new l2(0.0f, f11, 0.0f, f11, false, c5.m2.f7291a, 5));
    }

    public static final b4.t i(b4.t tVar, float f11) {
        return tVar.then(new l2(f11, f11, f11, f11, false, c5.m2.f7291a));
    }

    public static final b4.t j(b4.t tVar, float f11, float f12) {
        return tVar.then(new l2(f11, f12, f11, f12, false, c5.m2.f7291a));
    }

    public static b4.t k(b4.t tVar, float f11, float f12, float f13, float f14, int i11) {
        return tVar.then(new l2(f11, (i11 & 2) != 0 ? Float.NaN : f12, (i11 & 4) != 0 ? Float.NaN : f13, (i11 & 8) != 0 ? Float.NaN : f14, false, c5.m2.f7291a));
    }

    public static final b4.t l(b4.t tVar, float f11) {
        return tVar.then(new l2(f11, 0.0f, f11, 0.0f, false, c5.m2.f7291a, 10));
    }

    public static final b4.t m(b4.t tVar, float f11) {
        return tVar.then(new l2(f11, f11, f11, f11, true, c5.m2.f7291a));
    }

    public static final b4.t n(b4.t tVar, float f11, float f12) {
        return tVar.then(new l2(f11, f12, f11, f12, true, c5.m2.f7291a));
    }

    public static final b4.t o(b4.t tVar, float f11, float f12, float f13, float f14) {
        return tVar.then(new l2(f11, f12, f13, f14, true, c5.m2.f7291a));
    }

    public static /* synthetic */ b4.t p(b4.t tVar, float f11, float f12, float f13, float f14, int i11) {
        if ((i11 & 1) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f12 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            f13 = Float.NaN;
        }
        if ((i11 & 8) != 0) {
            f14 = Float.NaN;
        }
        return o(tVar, f11, f12, f13, f14);
    }

    public static final b4.t q(b4.t tVar, float f11) {
        return tVar.then(new l2(f11, 0.0f, f11, 0.0f, true, c5.m2.f7291a, 10));
    }

    public static final b4.t r(b4.t tVar, float f11, float f12) {
        return tVar.then(new l2(f11, 0.0f, f12, 0.0f, true, c5.m2.f7291a, 10));
    }

    public static /* synthetic */ b4.t s(b4.t tVar, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 2) != 0) {
            f12 = Float.NaN;
        }
        return r(tVar, f11, f12);
    }

    public static b4.t t(b4.t tVar, int i11) {
        b4.j jVar = b4.d.f5693k;
        return tVar.then(Intrinsics.areEqual(jVar, jVar) ? f13853f : Intrinsics.areEqual(jVar, b4.d.f5692j) ? f13854g : new a3(e0.Vertical, new a3.f1(jVar, 20), jVar, "wrapContentHeight"));
    }

    public static b4.t u(b4.t tVar, b4.k kVar, int i11) {
        b4.k kVar2 = b4.d.f5687e;
        if ((i11 & 1) != 0) {
            kVar = kVar2;
        }
        return tVar.then(Intrinsics.areEqual(kVar, kVar2) ? f13855h : Intrinsics.areEqual(kVar, b4.d.f5683a) ? f13856i : new a3(e0.Both, new a3.f1(kVar, 21), kVar, "wrapContentSize"));
    }

    public static b4.t v(b4.t tVar, int i11) {
        b4.i iVar = b4.d.f5694m;
        b4.i iVar2 = b4.d.f5695n;
        b4.i iVar3 = (i11 & 1) != 0 ? iVar2 : iVar;
        return tVar.then(Intrinsics.areEqual(iVar3, iVar2) ? f13851d : Intrinsics.areEqual(iVar3, iVar) ? f13852e : new a3(e0.Horizontal, new a3.f1(iVar3, 19), iVar3, "wrapContentWidth"));
    }
}
