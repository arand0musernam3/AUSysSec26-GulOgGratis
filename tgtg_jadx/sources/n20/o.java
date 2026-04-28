package n20;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l f30387m = new l(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jf.e f30388a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jf.e f30389b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jf.e f30390c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jf.e f30391d = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f30392e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f30393f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f30394g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f30395h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f30396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f30397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f30398k;
    public f l;

    public o() {
        int i11 = 0;
        this.f30396i = new f(i11);
        this.f30397j = new f(i11);
        this.f30398k = new f(i11);
        this.l = new f(i11);
    }

    public static n a(Context context, int i11, int i12) {
        return b(context, i11, i12, new a(0));
    }

    public static n b(Context context, int i11, int i12, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
        if (i12 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i12, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(j10.a.T);
        try {
            int i13 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i14 = typedArrayObtainStyledAttributes.getInt(3, i13);
            int i15 = typedArrayObtainStyledAttributes.getInt(4, i13);
            int i16 = typedArrayObtainStyledAttributes.getInt(2, i13);
            int i17 = typedArrayObtainStyledAttributes.getInt(1, i13);
            d dVarE = e(typedArrayObtainStyledAttributes, 5, dVar);
            d dVarE2 = e(typedArrayObtainStyledAttributes, 8, dVarE);
            d dVarE3 = e(typedArrayObtainStyledAttributes, 9, dVarE);
            d dVarE4 = e(typedArrayObtainStyledAttributes, 7, dVarE);
            d dVarE5 = e(typedArrayObtainStyledAttributes, 6, dVarE);
            n nVar = new n();
            nVar.f30376a = lx.u.x(i14);
            nVar.f30380e = dVarE2;
            nVar.f30377b = lx.u.x(i15);
            nVar.f30381f = dVarE3;
            nVar.f30378c = lx.u.x(i16);
            nVar.f30382g = dVarE4;
            nVar.f30379d = lx.u.x(i17);
            nVar.f30383h = dVarE5;
            return nVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static n c(Context context, AttributeSet attributeSet, int i11, int i12) {
        return d(context, attributeSet, i11, i12, new a(0));
    }

    public static n d(Context context, AttributeSet attributeSet, int i11, int i12, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.F, i11, i12);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, dVar);
    }

    public static d e(TypedArray typedArray, int i11, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        if (typedValuePeekValue != null) {
            int i12 = typedValuePeekValue.type;
            if (i12 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i12 == 6) {
                return new l(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean f() {
        return (this.f30389b instanceof m) && (this.f30388a instanceof m) && (this.f30390c instanceof m) && (this.f30391d instanceof m);
    }

    public final boolean g(RectF rectF) {
        boolean z11 = this.l.getClass().equals(f.class) && this.f30397j.getClass().equals(f.class) && this.f30396i.getClass().equals(f.class) && this.f30398k.getClass().equals(f.class);
        float fA = this.f30392e.a(rectF);
        return z11 && ((this.f30393f.a(rectF) > fA ? 1 : (this.f30393f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f30395h.a(rectF) > fA ? 1 : (this.f30395h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f30394g.a(rectF) > fA ? 1 : (this.f30394g.a(rectF) == fA ? 0 : -1)) == 0) && f();
    }

    public final n h() {
        n nVar = new n();
        nVar.f30376a = this.f30388a;
        nVar.f30377b = this.f30389b;
        nVar.f30378c = this.f30390c;
        nVar.f30379d = this.f30391d;
        nVar.f30380e = this.f30392e;
        nVar.f30381f = this.f30393f;
        nVar.f30382g = this.f30394g;
        nVar.f30383h = this.f30395h;
        nVar.f30384i = this.f30396i;
        nVar.f30385j = this.f30397j;
        nVar.f30386k = this.f30398k;
        nVar.l = this.l;
        return nVar;
    }

    public final String toString() {
        return "[" + this.f30392e + ", " + this.f30393f + ", " + this.f30394g + ", " + this.f30395h + "]";
    }
}
