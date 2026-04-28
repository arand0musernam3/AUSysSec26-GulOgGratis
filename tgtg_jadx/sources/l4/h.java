package l4;

import a3.a3;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.r;
import i4.g0;
import i4.t;
import i4.u;
import i4.v;
import i4.w;
import z5.l;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {
    public static final g B = new g();
    public float A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.a f27346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f27347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f27348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f27349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f27350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f27351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f27354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27355k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f27360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f27361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f27362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f27363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f27364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f27365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f27366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f27367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f27368y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f27369z;

    public h(m4.a aVar) {
        u uVar = new u();
        k4.b bVar = new k4.b();
        this.f27346b = aVar;
        this.f27347c = uVar;
        k kVar = new k(aVar, uVar, bVar);
        this.f27348d = kVar;
        this.f27349e = aVar.getResources();
        this.f27350f = new Rect();
        aVar.addView(kVar);
        kVar.setClipBounds(null);
        this.f27354j = 0L;
        View.generateViewId();
        this.f27357n = 3;
        this.f27358o = 0;
        this.f27359p = 1.0f;
        this.f27361r = 1.0f;
        this.f27362s = 1.0f;
        long j9 = v.f23309b;
        this.f27366w = j9;
        this.f27367x = j9;
    }

    @Override // l4.d
    public final float A() {
        return this.f27348d.getCameraDistance() / this.f27349e.getDisplayMetrics().densityDpi;
    }

    @Override // l4.d
    public final float B() {
        return this.f27363t;
    }

    @Override // l4.d
    public final void C(boolean z11) {
        boolean z12 = false;
        this.f27356m = z11 && !this.l;
        this.f27355k = true;
        if (z11 && this.l) {
            z12 = true;
        }
        this.f27348d.setClipToOutline(z12);
    }

    @Override // l4.d
    public final float D() {
        return this.f27368y;
    }

    @Override // l4.d
    public final void E(int i11) {
        this.f27358o = i11;
        P();
    }

    @Override // l4.d
    public final void F(float f11) {
        this.f27363t = f11;
        this.f27348d.setTranslationX(f11);
    }

    @Override // l4.d
    public final void G(long j9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27367x = j9;
            a3.F(g0.C(j9), this.f27348d);
        }
    }

    @Override // l4.d
    public final Matrix H() {
        return this.f27348d.getMatrix();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l4.d
    public final void I(z5.c cVar, m mVar, b bVar, r rVar) {
        k kVar = this.f27348d;
        ViewParent parent = kVar.getParent();
        m4.a aVar = this.f27346b;
        if (parent == null) {
            aVar.addView(kVar);
        }
        kVar.setDrawParams(cVar, mVar, bVar, rVar);
        if (kVar.isAttachedToWindow()) {
            kVar.setVisibility(4);
            kVar.setVisibility(0);
            try {
                u uVar = this.f27347c;
                g gVar = B;
                i4.c cVar2 = uVar.f23304a;
                Canvas canvas = cVar2.f23230a;
                cVar2.f23230a = gVar;
                aVar.a(cVar2, kVar, kVar.getDrawingTime());
                uVar.f23304a.f23230a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // l4.d
    public final void J(float f11) {
        this.f27348d.setCameraDistance(f11 * this.f27349e.getDisplayMetrics().densityDpi);
    }

    @Override // l4.d
    public final float K() {
        return this.f27365v;
    }

    @Override // l4.d
    public final float L() {
        return this.f27362s;
    }

    @Override // l4.d
    public final void M(float f11) {
        this.f27368y = f11;
        this.f27348d.setRotationX(f11);
    }

    @Override // l4.d
    public final int N() {
        return this.f27357n;
    }

    public final void O(int i11) {
        k kVar = this.f27348d;
        boolean z11 = true;
        if (i11 == 1) {
            kVar.setLayerType(2, this.f27351g);
        } else {
            Paint paint = this.f27351g;
            if (i11 == 2) {
                kVar.setLayerType(0, paint);
                z11 = false;
            } else {
                kVar.setLayerType(0, paint);
            }
        }
        kVar.setCanUseCompositingLayer$ui_graphics(z11);
    }

    public final void P() {
        int i11 = this.f27358o;
        if (i11 != 1 && this.f27357n == 3) {
            O(i11);
        } else {
            O(1);
        }
    }

    @Override // l4.d
    public final float a() {
        return this.f27359p;
    }

    @Override // l4.d
    public final void b(float f11) {
        this.f27369z = f11;
        this.f27348d.setRotationY(f11);
    }

    @Override // l4.d
    public final float c() {
        return this.f27361r;
    }

    @Override // l4.d
    public final void d(float f11) {
        this.f27365v = f11;
        this.f27348d.setElevation(f11);
    }

    @Override // l4.d
    public final void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            b7.a.p(this.f27348d);
        }
    }

    @Override // l4.d
    public final void f(float f11) {
        this.A = f11;
        this.f27348d.setRotation(f11);
    }

    @Override // l4.d
    public final void g(float f11) {
        this.f27364u = f11;
        this.f27348d.setTranslationY(f11);
    }

    @Override // l4.d
    public final void h(Outline outline, long j9) {
        k kVar = this.f27348d;
        kVar.f27375e = outline;
        kVar.invalidateOutline();
        if ((this.f27356m || kVar.getClipToOutline()) && outline != null) {
            kVar.setClipToOutline(true);
            if (this.f27356m) {
                this.f27356m = false;
                this.f27355k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // l4.d
    public final void i(t tVar) {
        Rect rect;
        boolean z11 = this.f27355k;
        k kVar = this.f27348d;
        if (z11) {
            if ((this.f27356m || kVar.getClipToOutline()) && !this.l) {
                rect = this.f27350f;
                rect.left = 0;
                rect.top = 0;
                rect.right = kVar.getWidth();
                rect.bottom = kVar.getHeight();
            } else {
                rect = null;
            }
            kVar.setClipBounds(rect);
        }
        Canvas canvas = i4.d.f23233a;
        if (((i4.c) tVar).f23230a.isHardwareAccelerated()) {
            this.f27346b.a(tVar, kVar, kVar.getDrawingTime());
        }
    }

    @Override // l4.d
    public final void j(int i11) {
        this.f27357n = i11;
        Paint paint = this.f27351g;
        if (paint == null) {
            paint = new Paint();
            this.f27351g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(i4.b.e(i11)));
        P();
    }

    @Override // l4.d
    public final void k() {
        this.f27346b.removeViewInLayout(this.f27348d);
    }

    @Override // l4.d
    public final int l() {
        return this.f27358o;
    }

    @Override // l4.d
    public final w m() {
        return null;
    }

    @Override // l4.d
    public final void n(float f11) {
        this.f27362s = f11;
        this.f27348d.setScaleY(f11);
    }

    @Override // l4.d
    public final void o(int i11, int i12, long j9) {
        boolean zA = l.a(this.f27354j, j9);
        k kVar = this.f27348d;
        if (zA) {
            int i13 = this.f27352h;
            if (i13 != i11) {
                kVar.offsetLeftAndRight(i11 - i13);
            }
            int i14 = this.f27353i;
            if (i14 != i12) {
                kVar.offsetTopAndBottom(i12 - i14);
            }
        } else {
            if (this.f27356m || kVar.getClipToOutline()) {
                this.f27355k = true;
            }
            int i15 = (int) (j9 >> 32);
            int i16 = (int) (4294967295L & j9);
            kVar.layout(i11, i12, i11 + i15, i12 + i16);
            this.f27354j = j9;
            if (this.f27360q) {
                kVar.setPivotX(i15 / 2.0f);
                kVar.setPivotY(i16 / 2.0f);
            }
        }
        this.f27352h = i11;
        this.f27353i = i12;
    }

    @Override // l4.d
    public final float p() {
        return this.f27369z;
    }

    @Override // l4.d
    public final float r() {
        return this.A;
    }

    @Override // l4.d
    public final void s(long j9) {
        long j11 = 9223372034707292159L & j9;
        k kVar = this.f27348d;
        if (j11 != 9205357640488583168L) {
            this.f27360q = false;
            kVar.setPivotX(Float.intBitsToFloat((int) (j9 >> 32)));
            kVar.setPivotY(Float.intBitsToFloat((int) (j9 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                a3.x(kVar);
                return;
            }
            this.f27360q = true;
            kVar.setPivotX(((int) (this.f27354j >> 32)) / 2.0f);
            kVar.setPivotY(((int) (this.f27354j & 4294967295L)) / 2.0f);
        }
    }

    @Override // l4.d
    public final long t() {
        return this.f27366w;
    }

    @Override // l4.d
    public final void u(float f11) {
        this.f27359p = f11;
        this.f27348d.setAlpha(f11);
    }

    @Override // l4.d
    public final float v() {
        return this.f27364u;
    }

    @Override // l4.d
    public final long w() {
        return this.f27367x;
    }

    @Override // l4.d
    public final void x(long j9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27366w = j9;
            a3.E(g0.C(j9), this.f27348d);
        }
    }

    @Override // l4.d
    public final void y() {
        Paint paint = this.f27351g;
        if (paint == null) {
            paint = new Paint();
            this.f27351g = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // l4.d
    public final void z(float f11) {
        this.f27361r = f11;
        this.f27348d.setScaleX(f11);
    }
}
