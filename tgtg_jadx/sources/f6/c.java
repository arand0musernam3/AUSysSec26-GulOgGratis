package f6;

import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f17372j = {j4.s.t(c.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0), j4.s.t(c.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0), j4.s.t(c.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), j4.s.t(c.class, "scaleX", "getScaleX()F", 0), j4.s.t(c.class, "scaleY", "getScaleY()F", 0), j4.s.t(c.class, "rotationX", "getRotationX()F", 0), j4.s.t(c.class, "rotationY", "getRotationY()F", 0), j4.s.t(c.class, "rotationZ", "getRotationZ()F", 0), j4.s.t(c.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), j4.s.t(c.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), j4.s.t(c.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), j4.s.t(c.class, "pivotX", "getPivotX()F", 0), j4.s.t(c.class, "pivotY", "getPivotY()F", 0), j4.s.t(c.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), j4.s.t(c.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j6.f f17374b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f17376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f17377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f17378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f17379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final se.d f17380h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17375c = new d("parent");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f17381i = new a(this, new o("wrap"));

    public c(Object obj, j6.f fVar) {
        this.f17373a = obj;
        this.f17374b = fVar;
        this.f17376d = new e(-2, fVar, 1);
        this.f17377e = new e(0, fVar, 0);
        this.f17378f = new e(-1, fVar, 1);
        this.f17379g = new e(1, fVar, 0);
        this.f17380h = new se.d(fVar, 17);
        new b(this, 1.0f, null);
        new b(this, 1.0f, null);
        new b(this, 0.0f, null);
        new b(this, 0.0f, null);
        new b(this, 0.0f, null);
        float f11 = 0;
        new a(this, f11);
        new a(this, f11);
        new a(this, f11);
        new b(this, 0.5f, null);
        new b(this, 0.5f, null);
        new b(this, Float.NaN, "hWeight");
        new b(this, Float.NaN, "vWeight");
    }

    public final void a() {
        if (Float.isNaN(1.0f)) {
            return;
        }
        this.f17374b.A("vBias", new j6.e(1.0f));
    }
}
