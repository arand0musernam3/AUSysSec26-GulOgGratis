package p20;

import a40.d0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import bg.t;
import com.app.tgtg.R;
import e20.f0;
import e20.i0;
import ex.i;
import j4.s;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m0.l;
import n20.j;
import n20.n;
import uk.h;
import uk.p;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends View {

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final /* synthetic */ int f34149a2 = 0;
    public final int A;
    public boolean A1;
    public int B;
    public boolean B1;
    public int C;
    public ColorStateList C1;
    public int D;
    public ColorStateList D1;
    public int E;
    public ColorStateList E1;
    public int F;
    public ColorStateList F1;
    public int G;
    public ColorStateList G1;
    public int H;
    public final Path H1;
    public int I;
    public final RectF I1;
    public int J;
    public final RectF J1;
    public int K;
    public final RectF K1;
    public int L;
    public final RectF L1;
    public int M;
    public final Rect M1;
    public int N;
    public final RectF N1;
    public boolean O;
    public final Rect O1;
    public Drawable P;
    public final Matrix P1;
    public boolean Q;
    public final j Q1;
    public Drawable R1;
    public List S1;
    public Drawable T;
    public float T1;
    public int U1;
    public boolean V;
    public final int V1;
    public ColorStateList W;
    public final dy.g W1;
    public final h X1;
    public final l Y1;
    public boolean Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f34150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f34151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f34152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f34153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f34154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f34155f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Drawable f34156f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f34157g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f34158g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f34159h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Drawable f34160h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public ColorStateList f34161h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AccessibilityManager f34162i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f34163i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e7.a f34164j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final int f34165j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f34166k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final int f34167k1;
    public final ArrayList l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public float f34168l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f34169m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public float f34170m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f34171n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public MotionEvent f34172n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34173o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f34174o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f34175p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public float f34176p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f34177q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public float f34178q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f34179r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public ArrayList f34180r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f34181s;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f34182s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f34183t;
    public boolean t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f34184t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f34185u;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public float f34186u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f34187v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public float[] f34188v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f34189w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f34190w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f34191x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f34192x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f34193y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f34194y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f34195z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f34196z1;

    public e(Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_Slider), attributeSet, i11);
        this.l = new ArrayList();
        this.f34169m = new ArrayList();
        this.f34171n = new ArrayList();
        this.f34173o = false;
        this.J = -1;
        this.K = -1;
        this.O = false;
        this.Q = false;
        this.V = false;
        this.t0 = false;
        this.f34158g1 = false;
        this.f34174o1 = false;
        this.f34180r1 = new ArrayList();
        this.f34182s1 = -1;
        this.f34184t1 = -1;
        this.f34186u1 = 0.0f;
        this.A1 = false;
        this.H1 = new Path();
        this.I1 = new RectF();
        this.J1 = new RectF();
        this.K1 = new RectF();
        this.L1 = new RectF();
        this.M1 = new Rect();
        this.N1 = new RectF();
        this.O1 = new Rect();
        this.P1 = new Matrix();
        j jVar = new j();
        this.Q1 = jVar;
        this.S1 = Collections.EMPTY_LIST;
        this.U1 = 0;
        this.W1 = new dy.g(this, 1);
        this.X1 = new h(3, this);
        this.Y1 = new l(this, 8);
        Context context2 = getContext();
        this.Z1 = isShown();
        this.f34150a = new Paint();
        this.f34151b = new Paint();
        Paint paint = new Paint(1);
        this.f34152c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f34153d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f34154e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f34155f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f34157g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.A = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f34181s = dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.f34183t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f34185u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f34187v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f34189w = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f34191x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f34167k1 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.f34165j1 = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        i0.c(context2, attributeSet, i11, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = j10.a.W;
        i0.d(context2, attributeSet, iArr, i11, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i11, R.style.Widget_MaterialComponents_Slider);
        setOrientation(typedArrayObtainStyledAttributes.getInt(2, 0));
        this.f34166k = typedArrayObtainStyledAttributes.getResourceId(10, R.style.Widget_MaterialComponents_Tooltip);
        this.f34176p1 = typedArrayObtainStyledAttributes.getFloat(4, 0.0f);
        this.f34178q1 = typedArrayObtainStyledAttributes.getFloat(5, 1.0f);
        setValues(Float.valueOf(this.f34176p1));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(6, false));
        this.f34186u1 = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f34193y = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(11, i.H(context2)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(27);
        int i12 = zHasValue ? 27 : 29;
        int i13 = zHasValue ? 27 : 28;
        ColorStateList colorStateListP = h0.g.p(context2, typedArrayObtainStyledAttributes, i12);
        setTrackInactiveTintList(colorStateListP == null ? androidx.core.app.e.b(context2, R.color.material_slider_inactive_track_color) : colorStateListP);
        ColorStateList colorStateListP2 = h0.g.p(context2, typedArrayObtainStyledAttributes, i13);
        setTrackActiveTintList(colorStateListP2 == null ? androidx.core.app.e.b(context2, R.color.material_slider_active_track_color) : colorStateListP2);
        jVar.t(h0.g.p(context2, typedArrayObtainStyledAttributes, 12));
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setThumbStrokeColor(h0.g.p(context2, typedArrayObtainStyledAttributes, 16));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(17, 0.0f));
        ColorStateList colorStateListP3 = h0.g.p(context2, typedArrayObtainStyledAttributes, 7);
        setHaloTintList(colorStateListP3 == null ? androidx.core.app.e.b(context2, R.color.material_slider_halo_color) : colorStateListP3);
        this.f34190w1 = typedArrayObtainStyledAttributes.hasValue(25) ? typedArrayObtainStyledAttributes.getInt(25, -1) : typedArrayObtainStyledAttributes.getBoolean(26, true) ? 0 : 2;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(20);
        int i14 = zHasValue2 ? 20 : 22;
        int i15 = zHasValue2 ? 20 : 21;
        ColorStateList colorStateListP4 = h0.g.p(context2, typedArrayObtainStyledAttributes, i14);
        setTickInactiveTintList(colorStateListP4 == null ? androidx.core.app.e.b(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListP4);
        ColorStateList colorStateListP5 = h0.g.p(context2, typedArrayObtainStyledAttributes, i15);
        setTickActiveTintList(colorStateListP5 == null ? androidx.core.app.e.b(context2, R.color.material_slider_active_tick_marks_color) : colorStateListP5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(40, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(30, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(39, 0));
        setTrackIconActiveStart(h0.g.s(context2, typedArrayObtainStyledAttributes, 34));
        setTrackIconActiveEnd(h0.g.s(context2, typedArrayObtainStyledAttributes, 33));
        setTrackIconActiveColor(h0.g.p(context2, typedArrayObtainStyledAttributes, 32));
        setTrackIconInactiveStart(h0.g.s(context2, typedArrayObtainStyledAttributes, 37));
        setTrackIconInactiveEnd(h0.g.s(context2, typedArrayObtainStyledAttributes, 36));
        setTrackIconInactiveColor(h0.g.p(context2, typedArrayObtainStyledAttributes, 35));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(38, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(13, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(31, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(23, this.L / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(24, this.L / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(9, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        jVar.x(2);
        this.f34179r = ViewConfiguration.get(context2).getScaledTouchSlop();
        b bVar = new b(this);
        this.f34159h = bVar;
        ViewCompat.b0(this, bVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f34162i = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.V1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.V1 = 120000;
        }
    }

    public final void A() {
        double dRound;
        float f11 = this.T1;
        float f12 = this.f34186u1;
        if (f12 > 0.0f) {
            int i11 = (int) ((this.f34178q1 - this.f34176p1) / f12);
            dRound = ((double) Math.round(f11 * i11)) / ((double) i11);
        } else {
            dRound = f11;
        }
        if (q() || r()) {
            dRound = 1.0d - dRound;
        }
        float f13 = this.f34178q1;
        float f14 = this.f34176p1;
        z((float) ((dRound * ((double) (f13 - f14))) + ((double) f14)), this.f34182s1);
    }

    public final void B(int i11, Rect rect) {
        int iU = this.E + ((int) (u(getValues().get(i11).floatValue()) * this.f34196z1));
        int iC = c();
        int iMax = Math.max(this.F / 2, this.f34193y / 2);
        int iMax2 = Math.max(this.G / 2, this.f34193y / 2);
        RectF rectF = new RectF(iU - iMax, iC - iMax2, iU + iMax, iC + iMax2);
        if (r()) {
            this.P1.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void C() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fU = (u(((Float) this.f34180r1.get(this.f34184t1)).floatValue()) * this.f34196z1) + this.E;
            int iC = c();
            float f11 = this.H;
            float[] fArr = {fU - f11, iC - r3, fU + f11, iC + r3};
            if (r()) {
                this.P1.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    public final void D() {
        float f11;
        boolean zR = r();
        boolean zQ = q();
        float f12 = 0.5f;
        if (zR && zQ) {
            f11 = 0.5f;
            f12 = -0.2f;
        } else {
            f11 = 1.2f;
            if (zR) {
                f12 = 1.2f;
                f11 = 0.5f;
            }
        }
        for (x20.a aVar : this.l) {
            aVar.Z = f12;
            aVar.f43816h0 = f11;
            aVar.invalidateSelf();
        }
        int i11 = this.C;
        if (i11 == 0 || i11 == 1) {
            if (this.f34182s1 == -1 || !isEnabled()) {
                k();
                return;
            } else {
                j();
                return;
            }
        }
        if (i11 == 2) {
            k();
            return;
        }
        if (i11 != 3) {
            o.l(this.C, "Unexpected labelBehavior: ");
            return;
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            i0.i(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.Z1) {
                j();
                return;
            }
        }
        k();
    }

    public final void E() {
        int i11 = this.I;
        if (i11 > 0) {
            int i12 = this.F;
            this.J = i12;
            this.K = i11;
            int iRound = Math.round(i12 * 0.5f);
            int i13 = this.F - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.I - (i13 / 2));
        }
    }

    public final void F() {
        N();
        float f11 = this.f34186u1;
        int iMin = 0;
        if (f11 <= 0.0f) {
            G(0);
            return;
        }
        int i11 = this.f34190w1;
        if (i11 == 0) {
            iMin = Math.min((int) (((this.f34178q1 - this.f34176p1) / f11) + 1.0f), (this.f34196z1 / this.f34191x) + 1);
        } else if (i11 == 1) {
            int i12 = (int) (((this.f34178q1 - this.f34176p1) / f11) + 1.0f);
            if (i12 <= (this.f34196z1 / this.f34191x) + 1) {
                iMin = i12;
            }
        } else if (i11 != 2) {
            d0.d(this.f34190w1, "Unexpected tickVisibilityMode: ");
            return;
        }
        G(iMin);
    }

    public final void G(int i11) {
        if (i11 == 0) {
            this.f34188v1 = null;
            return;
        }
        float[] fArr = this.f34188v1;
        if (fArr == null || fArr.length != i11 * 2) {
            this.f34188v1 = new float[i11 * 2];
        }
        float f11 = this.f34196z1 / (i11 - 1);
        float fC = c();
        for (int i12 = 0; i12 < i11 * 2; i12 += 2) {
            float[] fArr2 = this.f34188v1;
            fArr2[i12] = ((i12 / 2.0f) * f11) + this.E;
            fArr2[i12 + 1] = fC;
        }
        if (r()) {
            this.P1.mapPoints(this.f34188v1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(android.graphics.Canvas r18, android.graphics.Paint r19, android.graphics.RectF r20, float r21, p20.c r22) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.e.H(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, float, p20.c):void");
    }

    public final void I() {
        Drawable drawable = this.T;
        if (drawable != null) {
            if (!this.V && this.W != null) {
                this.T = drawable.mutate();
                this.V = true;
            }
            if (this.V) {
                this.T.setTintList(this.W);
            }
        }
    }

    public final void J() {
        Drawable drawable = this.P;
        if (drawable != null) {
            if (!this.Q && this.W != null) {
                this.P = drawable.mutate();
                this.Q = true;
            }
            if (this.Q) {
                this.P.setTintList(this.W);
            }
        }
    }

    public final void K() {
        Drawable drawable = this.f34156f1;
        if (drawable != null) {
            if (!this.f34158g1 && this.f34161h1 != null) {
                this.f34156f1 = drawable.mutate();
                this.f34158g1 = true;
            }
            if (this.f34158g1) {
                this.f34156f1.setTintList(this.f34161h1);
            }
        }
    }

    public final void L() {
        Drawable drawable = this.f34160h0;
        if (drawable != null) {
            if (!this.t0 && this.f34161h1 != null) {
                this.f34160h0 = drawable.mutate();
                this.t0 = true;
            }
            if (this.t0) {
                this.f34160h0.setTintList(this.f34161h1);
            }
        }
    }

    public final void M(boolean z11) {
        int paddingTop;
        int paddingBottom;
        boolean z12;
        if (r()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i11 = paddingBottom + paddingTop;
        int iMax = Math.max(this.A, Math.max(this.D + i11, this.G + i11));
        boolean z13 = true;
        if (iMax == this.B) {
            z12 = false;
        } else {
            this.B = iMax;
            z12 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.F / 2) - this.f34183t, 0), Math.max((this.D - this.f34185u) / 2, 0)), Math.max(Math.max(this.f34192x1 - this.f34187v, 0), Math.max(this.f34194y1 - this.f34189w, 0))) + this.f34181s;
        if (this.E == iMax2) {
            z13 = false;
        } else {
            this.E = iMax2;
            if (isLaidOut()) {
                this.f34196z1 = Math.max((r() ? getHeight() : getWidth()) - (this.E * 2), 0);
                F();
            }
        }
        if (r()) {
            float fC = c();
            Matrix matrix = this.P1;
            matrix.reset();
            matrix.setRotate(90.0f, fC, fC);
        }
        if (z12 || z11) {
            requestLayout();
        } else if (z13) {
            postInvalidate();
        }
    }

    public final void N() {
        if (this.B1) {
            float f11 = this.f34176p1;
            float f12 = this.f34178q1;
            if (f11 >= f12) {
                throw new IllegalStateException("valueFrom(" + f11 + ") must be smaller than valueTo(" + f12 + ")");
            }
            for (Float f13 : this.f34180r1) {
                if (f13.floatValue() < this.f34176p1 || f13.floatValue() > this.f34178q1) {
                    throw new IllegalStateException("Slider value(" + f13 + ") must be greater or equal to valueFrom(" + this.f34176p1 + "), and lower or equal to valueTo(" + this.f34178q1 + ")");
                }
                if (this.f34186u1 > 0.0f && !O(f13.floatValue())) {
                    float f14 = this.f34176p1;
                    float f15 = this.f34186u1;
                    throw new IllegalStateException("Value(" + f13 + ") must be equal to valueFrom(" + f14 + ") plus a multiple of stepSize(" + f15 + ") when using stepSize(" + f15 + ")");
                }
            }
            if (this.f34186u1 > 0.0f && !O(this.f34178q1)) {
                throw new IllegalStateException("The stepSize(" + this.f34186u1 + ") must be 0, or a factor of the valueFrom(" + this.f34176p1 + ")-valueTo(" + this.f34178q1 + ") range");
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f16 = this.f34186u1;
            if (f16 > 0.0f && minSeparation > 0.0f) {
                if (this.U1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + f16 + ")");
                }
                if (minSeparation < f16 || !n(minSeparation)) {
                    float f17 = this.f34186u1;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f17 + ") when using stepSize(" + f17 + ")");
                }
            }
            float f18 = this.f34186u1;
            if (f18 != 0.0f) {
                if (((int) f18) != f18) {
                    Log.w("e", "Floating point value used for stepSize(" + f18 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f19 = this.f34176p1;
                if (((int) f19) != f19) {
                    Log.w("e", "Floating point value used for valueFrom(" + f19 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f20 = this.f34178q1;
                if (((int) f20) != f20) {
                    Log.w("e", "Floating point value used for valueTo(" + f20 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.B1 = false;
        }
    }

    public final boolean O(float f11) {
        return n(new BigDecimal(Float.toString(f11)).subtract(new BigDecimal(Float.toString(this.f34176p1)), MathContext.DECIMAL64).doubleValue());
    }

    public final float P(float f11) {
        return (u(f11) * this.f34196z1) + this.E;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.F, this.G);
        } else {
            float fMax = Math.max(this.F, this.G) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void b(Canvas canvas, RectF rectF, Drawable drawable, boolean z11) {
        if (drawable != null) {
            int i11 = this.f34163i1;
            float f11 = rectF.right - rectF.left;
            int i12 = this.f34165j1;
            float f12 = (i12 * 2) + i11;
            RectF rectF2 = this.N1;
            if (f11 >= f12) {
                float f13 = z11 ^ (q() || r()) ? rectF.left + i12 : (rectF.right - i12) - i11;
                float f14 = i11;
                float fC = c() - (f14 / 2.0f);
                rectF2.set(f13, fC, f13 + f14, f14 + fC);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (r()) {
                this.P1.mapRect(rectF2);
            }
            Rect rect = this.O1;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int c() {
        int i11 = this.B / 2;
        int i12 = this.C;
        return i11 + ((i12 == 1 || i12 == 3) ? ((x20.a) this.l.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator d(boolean z11) {
        int iP;
        TimeInterpolator timeInterpolatorQ;
        float fFloatValue = z11 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z11 ? this.f34177q : this.f34175p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z11 ? 1.0f : 0.0f);
        if (z11) {
            iP = ox.h.P(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorQ = ox.h.Q(getContext(), R.attr.motionEasingEmphasizedInterpolator, k10.a.f25734e);
        } else {
            iP = ox.h.P(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorQ = ox.h.Q(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, k10.a.f25732c);
        }
        valueAnimatorOfFloat.setDuration(iP);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorQ);
        valueAnimatorOfFloat.addUpdateListener(new t(this, 12));
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f34159h.d(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f34150a.setColor(m(this.G1));
        this.f34151b.setColor(m(this.F1));
        this.f34154e.setColor(m(this.E1));
        this.f34155f.setColor(m(this.D1));
        this.f34157g.setColor(m(this.E1));
        for (x20.a aVar : this.l) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        j jVar = this.Q1;
        if (jVar.isStateful()) {
            jVar.setState(getDrawableState());
        }
        int iM = m(this.C1);
        Paint paint = this.f34153d;
        paint.setColor(iM);
        paint.setAlpha(63);
    }

    public final void e(float f11, float f12, float f13, float f14, Canvas canvas, RectF rectF, c cVar) {
        if (f12 - f11 > getTrackCornerSize() - this.I) {
            rectF.set(f11, f13, f12, f14);
        } else {
            rectF.setEmpty();
        }
        H(canvas, this.f34150a, rectF, getTrackCornerSize(), cVar);
    }

    public final void f(Canvas canvas, float f11, float f12) {
        Iterator it = this.f34180r1.iterator();
        while (it.hasNext()) {
            float fP = P(((Float) it.next()).floatValue());
            float f13 = (this.F / 2.0f) + this.I;
            if (f11 >= fP - f13 && f11 <= fP + f13) {
                return;
            }
        }
        boolean zR = r();
        Paint paint = this.f34157g;
        if (zR) {
            canvas.drawPoint(f12, f11, paint);
        } else {
            canvas.drawPoint(f11, f12, paint);
        }
    }

    public final void g(Canvas canvas, int i11, int i12, float f11, Drawable drawable) {
        canvas.save();
        if (r()) {
            canvas.concat(this.P1);
        }
        canvas.translate((this.E + ((int) (u(f11) * i11))) - (drawable.getBounds().width() / 2.0f), i12 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f34159h.f47314h;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public abstract int getTrackCornerSize();

    public abstract float getValueFrom();

    public abstract float getValueTo();

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f34180r1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r6, int r7, android.graphics.Canvas r8, android.graphics.Paint r9) {
        /*
            r5 = this;
        L0:
            if (r6 >= r7) goto L70
            boolean r0 = r5.r()
            float[] r1 = r5.f34188v1
            if (r0 == 0) goto Lf
            int r0 = r6 + 1
            r0 = r1[r0]
            goto L11
        Lf:
            r0 = r1[r6]
        L11:
            int r1 = r5.I
            float r1 = (float) r1
            int r2 = r5.F
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r2 = r2 + r1
            java.util.ArrayList r1 = r5.f34180r1
            java.util.Iterator r1 = r1.iterator()
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r1 = r1.next()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r5.P(r1)
            float r4 = r1 - r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L41
            float r1 = r1 + r2
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L41
            goto L6d
        L41:
            boolean r1 = r5.O
            if (r1 == 0) goto L62
            int r1 = r5.I
            float r1 = (float) r1
            int r2 = r5.F
            float r2 = (float) r2
            float r2 = r2 / r3
            float r2 = r2 + r1
            int r1 = r5.f34196z1
            int r4 = r5.E
            int r4 = r4 * 2
            int r4 = r4 + r1
            float r1 = (float) r4
            float r1 = r1 / r3
            float r3 = r1 - r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L62
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L62
            goto L6d
        L62:
            float[] r0 = r5.f34188v1
            r1 = r0[r6]
            int r2 = r6 + 1
            r0 = r0[r2]
            r8.drawPoint(r1, r0, r9)
        L6d:
            int r6 = r6 + 2
            goto L0
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.e.h(int, int, android.graphics.Canvas, android.graphics.Paint):void");
    }

    public final void i(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.P == null && this.T == null && this.f34160h0 == null && this.f34156f1 == null) {
            return;
        }
        if (this.f34180r1.size() > 1) {
            Log.w("e", "Track icons can only be used when only 1 thumb is present.");
        }
        b(canvas, rectF, this.P, true);
        b(canvas, rectF2, this.f34160h0, true);
        b(canvas, rectF, this.T, false);
        b(canvas, rectF2, this.f34156f1, false);
    }

    public final void j() {
        if (!this.f34173o) {
            this.f34173o = true;
            ValueAnimator valueAnimatorD = d(true);
            this.f34175p = valueAnimatorD;
            this.f34177q = null;
            valueAnimatorD.start();
        }
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        for (int i11 = 0; i11 < this.f34180r1.size() && it.hasNext(); i11++) {
            if (i11 != this.f34184t1) {
                x((x20.a) it.next(), ((Float) this.f34180r1.get(i11)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f34180r1.size())));
        }
        x((x20.a) it.next(), ((Float) this.f34180r1.get(this.f34184t1)).floatValue());
    }

    public final void k() {
        if (this.f34173o) {
            this.f34173o = false;
            ValueAnimator valueAnimatorD = d(false);
            this.f34177q = valueAnimatorD;
            this.f34175p = null;
            valueAnimatorD.addListener(new androidx.vectordrawable.graphics.drawable.e(this, 12));
            this.f34177q.start();
        }
    }

    public final float[] l() {
        float fFloatValue = ((Float) this.f34180r1.get(0)).floatValue();
        float fFloatValue2 = ((Float) s.d(1, this.f34180r1)).floatValue();
        if (this.f34180r1.size() == 1) {
            fFloatValue = this.f34176p1;
        }
        float fU = u(fFloatValue);
        float fU2 = u(fFloatValue2);
        if (this.O) {
            float fMin = Math.min(0.5f, fU2);
            fU2 = Math.max(0.5f, fU2);
            fU = fMin;
        }
        return (this.O || !(q() || r())) ? new float[]{fU, fU2} : new float[]{fU2, fU};
    }

    public final int m(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean n(double d3) {
        double dDoubleValue = new BigDecimal(Double.toString(d3)).divide(new BigDecimal(Float.toString(this.f34186u1)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean o(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.W1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.X1);
        for (x20.a aVar : this.l) {
            ViewGroup viewGroupI = i0.i(this);
            if (viewGroupI == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                viewGroupI.getLocationOnScreen(iArr);
                aVar.W = iArr[0];
                viewGroupI.getWindowVisibleDisplayFrame(aVar.M);
                viewGroupI.addOnLayoutChangeListener(aVar.L);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        e7.a aVar = this.f34164j;
        if (aVar != null) {
            removeCallbacks(aVar);
        }
        this.f34173o = false;
        for (x20.a aVar2 : this.l) {
            ViewGroup viewGroupI = i0.i(this);
            if (viewGroupI != null) {
                viewGroupI.getOverlay().remove(aVar2);
                viewGroupI.removeOnLayoutChangeListener(aVar2.L);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.W1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.X1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.e.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        b bVar = this.f34159h;
        if (!z11) {
            this.f34182s1 = -1;
            bVar.a(this.f34184t1);
            return;
        }
        if (i11 == 1) {
            s(Integer.MAX_VALUE);
        } else if (i11 == 2) {
            s(Integer.MIN_VALUE);
        } else if (i11 == 17) {
            t(Integer.MAX_VALUE);
        } else if (i11 == 66) {
            t(Integer.MIN_VALUE);
        }
        bVar.n(this.f34184t1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i11, KeyEvent keyEvent) {
        this.A1 = false;
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13 = this.C;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.B + ((i13 == 1 || i13 == 3) ? ((x20.a) this.l.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (r()) {
            super.onMeasure(iMakeMeasureSpec, i12);
        } else {
            super.onMeasure(i11, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f34176p1 = dVar.f34144a;
        this.f34178q1 = dVar.f34145b;
        y(dVar.f34146c);
        this.f34186u1 = dVar.f34147d;
        if (dVar.f34148e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f34144a = this.f34176p1;
        dVar.f34145b = this.f34178q1;
        dVar.f34146c = new ArrayList(this.f34180r1);
        dVar.f34147d = this.f34186u1;
        dVar.f34148e = hasFocus();
        return dVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (r()) {
            i11 = i12;
        }
        this.f34196z1 = Math.max(i11 - (this.E * 2), 0);
        F();
        C();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z11) {
        super.onVisibilityAggregated(z11);
        this.Z1 = z11;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 != 0) {
            ViewGroup viewGroupI = i0.i(this);
            ViewOverlay overlay = viewGroupI == null ? null : viewGroupI.getOverlay();
            if (overlay == null) {
                return;
            }
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                overlay.remove((x20.a) it.next());
            }
        }
    }

    public final boolean p(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        return getLayoutDirection() == 1;
    }

    public final boolean r() {
        return this.f34195z == 1;
    }

    public final boolean s(int i11) {
        int i12 = this.f34184t1;
        long j9 = ((long) i12) + ((long) i11);
        long size = this.f34180r1.size() - 1;
        if (j9 < 0) {
            j9 = 0;
        } else if (j9 > size) {
            j9 = size;
        }
        int i13 = (int) j9;
        this.f34184t1 = i13;
        if (i13 == i12) {
            return false;
        }
        if (this.f34182s1 != -1) {
            this.f34182s1 = i13;
        }
        C();
        postInvalidate();
        return true;
    }

    public void setActiveThumbIndex(int i11) {
        this.f34182s1 = i11;
    }

    public void setCentered(boolean z11) {
        if (this.O == z11) {
            return;
        }
        this.O = z11;
        float f11 = this.f34176p1;
        if (z11) {
            setValues(Float.valueOf((f11 + this.f34178q1) / 2.0f));
        } else {
            setValues(Float.valueOf(f11));
        }
        M(true);
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.R1 = null;
        this.S1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.S1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        setLayerType(z11 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i11) {
        if (i11 < 0 || i11 >= this.f34180r1.size()) {
            i4.a.f("index out of range");
            return;
        }
        this.f34184t1 = i11;
        this.f34159h.n(i11);
        postInvalidate();
    }

    public void setHaloRadius(int i11) {
        if (i11 == this.H) {
            return;
        }
        this.H = i11;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.H);
        } else {
            postInvalidate();
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.C1)) {
            return;
        }
        this.C1 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iM = m(colorStateList);
        Paint paint = this.f34153d;
        paint.setColor(iM);
        paint.setAlpha(63);
        invalidate();
    }

    public abstract void setLabelBehavior(int i11);

    public abstract void setOrientation(int i11);

    public void setSeparationUnit(int i11) {
        this.U1 = i11;
        this.B1 = true;
        postInvalidate();
    }

    public void setStepSize(float f11) {
        if (f11 >= 0.0f) {
            if (this.f34186u1 != f11) {
                this.f34186u1 = f11;
                this.B1 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f11 + ") must be 0, or a factor of the valueFrom(" + this.f34176p1 + ")-valueTo(" + this.f34178q1 + ") range");
    }

    public abstract void setThumbElevation(float f11);

    public void setThumbHeight(int i11) {
        if (i11 == this.G) {
            return;
        }
        this.G = i11;
        this.Q1.setBounds(0, 0, this.F, i11);
        Drawable drawable = this.R1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.S1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        M(false);
    }

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f11);

    public abstract void setThumbTrackGapSize(int i11);

    public void setThumbWidth(int i11) {
        if (i11 == this.F) {
            return;
        }
        this.F = i11;
        n nVar = new n();
        nVar.c(this.F / 2.0f);
        n20.o oVarA = nVar.a();
        j jVar = this.Q1;
        jVar.setShapeAppearanceModel(oVarA);
        jVar.setBounds(0, 0, this.F, this.G);
        Drawable drawable = this.R1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.S1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        M(false);
    }

    public abstract void setTickActiveRadius(int i11);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i11);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackCornerSize(int i11);

    public abstract void setTrackHeight(int i11);

    public abstract void setTrackIconActiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconActiveEnd(Drawable drawable);

    public abstract void setTrackIconActiveStart(Drawable drawable);

    public abstract void setTrackIconInactiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconInactiveEnd(Drawable drawable);

    public abstract void setTrackIconInactiveStart(Drawable drawable);

    public abstract void setTrackIconSize(int i11);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i11);

    public abstract void setTrackStopIndicatorSize(int i11);

    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        y(arrayList);
    }

    public final void t(int i11) {
        if (q() || r()) {
            i11 = i11 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i11;
        }
        s(i11);
    }

    public final float u(float f11) {
        float f12 = this.f34176p1;
        float f13 = (f11 - f12) / (this.f34178q1 - f12);
        return (q() || r()) ? 1.0f - f13 : f13;
    }

    public final void v() {
        Iterator it = this.f34171n.iterator();
        while (it.hasNext()) {
            switch (((p) it.next()).f41345a) {
                case 0:
                    break;
                default:
                    break;
            }
        }
    }

    public boolean w() {
        if (this.f34182s1 != -1) {
            return true;
        }
        float f11 = this.T1;
        if (q() || r()) {
            f11 = 1.0f - f11;
        }
        float f12 = this.f34178q1;
        float f13 = this.f34176p1;
        float fA = s.a(f12, f13, f11, f13);
        float fP = P(fA);
        this.f34182s1 = 0;
        float fAbs = Math.abs(((Float) this.f34180r1.get(0)).floatValue() - fA);
        for (int i11 = 1; i11 < this.f34180r1.size(); i11++) {
            float fAbs2 = Math.abs(((Float) this.f34180r1.get(i11)).floatValue() - fA);
            float fP2 = P(((Float) this.f34180r1.get(i11)).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z11 = q() || r() ? fP2 - fP > 0.0f : fP2 - fP < 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f34182s1 = i11;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fP2 - fP) < this.f34179r) {
                        this.f34182s1 = -1;
                        return false;
                    }
                    if (z11) {
                        this.f34182s1 = i11;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f34182s1 != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(x20.a r5, float r6) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p20.e.x(x20.a, float):void");
    }

    public final void y(ArrayList arrayList) {
        ViewGroup viewGroupI;
        int resourceId;
        ViewGroup viewGroupI2;
        if (arrayList.isEmpty()) {
            i4.a.f("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.f34180r1.size() == arrayList.size() && this.f34180r1.equals(arrayList)) {
            return;
        }
        this.f34180r1 = arrayList;
        this.B1 = true;
        this.f34184t1 = 0;
        C();
        ArrayList arrayList2 = this.l;
        if (arrayList2.size() > this.f34180r1.size()) {
            List<x20.a> listSubList = arrayList2.subList(this.f34180r1.size(), arrayList2.size());
            for (x20.a aVar : listSubList) {
                if (isAttachedToWindow() && (viewGroupI2 = i0.i(this)) != null) {
                    viewGroupI2.getOverlay().remove(aVar);
                    viewGroupI2.removeOnLayoutChangeListener(aVar.L);
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f34180r1.size()) {
            Context context = getContext();
            int i11 = this.f34166k;
            x20.a aVar2 = new x20.a(context, i11);
            TypedArray typedArrayM = i0.m(aVar2.I, null, j10.a.f24412e0, 0, i11, new int[0]);
            Context context2 = aVar2.I;
            aVar2.V = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z11 = typedArrayM.getBoolean(8, true);
            aVar2.T = z11;
            if (z11) {
                n nVarH = aVar2.f30345b.f30318a.h();
                nVarH.f30386k = aVar2.G();
                aVar2.setShapeAppearanceModel(nVarH.a());
            } else {
                aVar2.V = 0;
            }
            CharSequence text = typedArrayM.getText(6);
            boolean zEquals = TextUtils.equals(aVar2.H, text);
            f0 f0Var = aVar2.K;
            if (!zEquals) {
                aVar2.H = text;
                f0Var.f15651e = true;
                aVar2.invalidateSelf();
            }
            j20.d dVar = (!typedArrayM.hasValue(0) || (resourceId = typedArrayM.getResourceId(0, 0)) == 0) ? null : new j20.d(context2, resourceId);
            if (dVar != null && typedArrayM.hasValue(1)) {
                dVar.f24466k = h0.g.p(context2, typedArrayM, 1);
            }
            f0Var.c(dVar, context2);
            TypedValue typedValueI = i.I(context2, x20.a.class.getCanonicalName(), R.attr.colorOnBackground);
            int i12 = typedValueI.resourceId;
            int color = i12 != 0 ? context2.getColor(i12) : typedValueI.data;
            TypedValue typedValueI2 = i.I(context2, x20.a.class.getCanonicalName(), android.R.attr.colorBackground);
            int i13 = typedValueI2.resourceId;
            aVar2.t(ColorStateList.valueOf(typedArrayM.getColor(7, x6.c.c(x6.c.e(color, 153), x6.c.e(i13 != 0 ? context2.getColor(i13) : typedValueI2.data, 229)))));
            TypedValue typedValueI3 = i.I(context2, x20.a.class.getCanonicalName(), R.attr.colorSurface);
            int i14 = typedValueI3.resourceId;
            aVar2.z(ColorStateList.valueOf(i14 != 0 ? context2.getColor(i14) : typedValueI3.data));
            aVar2.N = typedArrayM.getDimensionPixelSize(2, 0);
            aVar2.O = typedArrayM.getDimensionPixelSize(4, 0);
            aVar2.P = typedArrayM.getDimensionPixelSize(5, 0);
            aVar2.Q = typedArrayM.getDimensionPixelSize(3, 0);
            typedArrayM.recycle();
            arrayList2.add(aVar2);
            if (isAttachedToWindow() && (viewGroupI = i0.i(this)) != null) {
                int[] iArr = new int[2];
                viewGroupI.getLocationOnScreen(iArr);
                aVar2.W = iArr[0];
                viewGroupI.getWindowVisibleDisplayFrame(aVar2.M);
                viewGroupI.addOnLayoutChangeListener(aVar2.L);
            }
        }
        int i15 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((x20.a) it.next()).A(i15);
        }
        for (a aVar3 : this.f34169m) {
            Iterator it2 = this.f34180r1.iterator();
            while (it2.hasNext()) {
                aVar3.a(this, ((Float) it2.next()).floatValue());
            }
        }
        postInvalidate();
    }

    public final boolean z(float f11, int i11) {
        this.f34184t1 = i11;
        if (Math.abs(f11 - ((Float) this.f34180r1.get(i11)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.U1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f12 = this.f34176p1;
                minSeparation = s.a(f12, this.f34178q1, (minSeparation - this.E) / this.f34196z1, f12);
            }
        }
        if (q() || r()) {
            minSeparation = -minSeparation;
        }
        int i12 = i11 + 1;
        int i13 = i11 - 1;
        this.f34180r1.set(i11, Float.valueOf(xz.b.n(f11, i13 < 0 ? this.f34176p1 : minSeparation + ((Float) this.f34180r1.get(i13)).floatValue(), i12 >= this.f34180r1.size() ? this.f34178q1 : ((Float) this.f34180r1.get(i12)).floatValue() - minSeparation)));
        Iterator it = this.f34169m.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this, ((Float) this.f34180r1.get(i11)).floatValue());
        }
        AccessibilityManager accessibilityManager = this.f34162i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f34164j;
            if (runnable == null) {
                this.f34164j = new e7.a(this);
            } else {
                removeCallbacks(runnable);
            }
            e7.a aVar = this.f34164j;
            aVar.f15805b = i11;
            postDelayed(aVar, 200L);
        }
        return true;
    }

    public void setValues(@NonNull List<Float> list) {
        y(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            drawableArr[i11] = getResources().getDrawable(iArr[i11]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }
}
