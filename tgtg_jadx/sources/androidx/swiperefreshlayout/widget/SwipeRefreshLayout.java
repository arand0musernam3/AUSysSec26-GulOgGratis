package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.r1;
import h7.s;
import h7.t;
import h7.u;
import h7.v;
import m0.l;
import oa.a;
import oa.b;
import oa.c;
import oa.d;
import oa.e;
import oa.f;
import oa.g;
import oa.h;
import oa.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements v, u, s {
    public static final int[] O = {R.attr.enabled};
    public int A;
    public final c B;
    public e C;
    public e D;
    public f E;
    public f F;
    public e G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public final d L;
    public final e M;
    public final e N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f4005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f4006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f4010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r1 f4011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f4012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f4013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f4014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f4015k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f4018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f4019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DecelerateInterpolator f4023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f4024u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4025v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f4027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4029z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4007c = false;
        this.f4009e = -1.0f;
        this.f4013i = new int[2];
        this.f4014j = new int[2];
        this.f4015k = new int[2];
        this.f4021r = -1;
        this.f4025v = -1;
        this.L = new d(this, 0);
        this.M = new e(this, 2);
        this.N = new e(this, 3);
        this.f4008d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4016m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f4023t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 40.0f);
        a aVar = new a(getContext());
        float f11 = aVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(na.a.f30791a);
        aVar.f32223b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        ViewCompat.h0(aVar, f11 * 4.0f);
        shapeDrawable.getPaint().setColor(aVar.f32223b);
        aVar.setBackground(shapeDrawable);
        this.f4024u = aVar;
        c cVar = new c(getContext());
        this.B = cVar;
        cVar.c(1);
        this.f4024u.setImageDrawable(this.B);
        this.f4024u.setVisibility(8);
        addView(this.f4024u);
        setChildrenDrawingOrderEnabled(true);
        int i11 = (int) (displayMetrics.density * 64.0f);
        this.f4029z = i11;
        this.f4009e = i11;
        this.f4011g = new r1();
        this.f4012h = new t(this);
        setNestedScrollingEnabled(true);
        int i12 = -this.I;
        this.f4017n = i12;
        this.f4028y = i12;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, O);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i11) {
        this.f4024u.getBackground().setAlpha(i11);
        this.B.setAlpha(i11);
    }

    public final boolean a() {
        View view = this.f4005a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f4005a == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (!childAt.equals(this.f4024u)) {
                    this.f4005a = childAt;
                    return;
                }
            }
        }
    }

    @Override // h7.u
    public final void c(int i11, View view) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // h7.v
    public final void d(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (i15 != 0) {
            return;
        }
        int i16 = iArr[1];
        if (i15 == 0) {
            this.f4012h.d(i11, this.f4014j, i12, i13, i14, iArr, i15);
        }
        int i17 = i14 - (iArr[1] - i16);
        if ((i17 == 0 ? i14 + this.f4014j[1] : i17) >= 0 || a()) {
            return;
        }
        float fAbs = this.f4010f + Math.abs(r14);
        this.f4010f = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f4012h.a(f11, f12, z11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f4012h.b(f11, f12);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f4012h.c(i11, iArr, i12, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f4012h.d(i11, iArr, i12, i13, i14, null, 0);
    }

    @Override // h7.u
    public final void e(View view, int i11, int i12, int i13, int i14, int i15) {
        d(view, i11, i12, i13, i14, i15, this.f4015k);
    }

    @Override // h7.u
    public final boolean f(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            return onStartNestedScroll(view, view2, i11);
        }
        return false;
    }

    @Override // h7.u
    public final void g(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i11, int i12) {
        int i13 = this.f4025v;
        return i13 < 0 ? i12 : i12 == i11 + (-1) ? i13 : i12 >= i13 ? i12 + 1 : i12;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r1 r1Var = this.f4011g;
        return r1Var.f3901b | r1Var.f3900a;
    }

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.f4029z;
    }

    public int getProgressViewStartOffset() {
        return this.f4028y;
    }

    @Override // h7.u
    public final void h(View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 0) {
            onNestedPreScroll(view, i11, i12, iArr);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4012h.f(0);
    }

    public final void i(float f11) {
        if (f11 > this.f4009e) {
            m(true, true);
            return;
        }
        this.f4007c = false;
        c cVar = this.B;
        b bVar = cVar.f32247a;
        bVar.f32228e = 0.0f;
        bVar.f32229f = 0.0f;
        cVar.invalidateSelf();
        boolean z11 = this.f4022s;
        d dVar = !z11 ? new d(this, 1) : null;
        int i11 = this.f4017n;
        if (z11) {
            this.f4026w = i11;
            this.f4027x = this.f4024u.getScaleX();
            e eVar = new e(this, 4);
            this.G = eVar;
            eVar.setDuration(150L);
            if (dVar != null) {
                this.f4024u.setAnimationListener(dVar);
            }
            this.f4024u.clearAnimation();
            this.f4024u.startAnimation(this.G);
        } else {
            this.f4026w = i11;
            e eVar2 = this.N;
            eVar2.reset();
            eVar2.setDuration(200L);
            eVar2.setInterpolator(this.f4023t);
            if (dVar != null) {
                this.f4024u.setAnimationListener(dVar);
            }
            this.f4024u.clearAnimation();
            this.f4024u.startAnimation(eVar2);
        }
        c cVar2 = this.B;
        b bVar2 = cVar2.f32247a;
        if (bVar2.f32236n) {
            bVar2.f32236n = false;
        }
        cVar2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4012h.f21621d;
    }

    public final void j(float f11) {
        float f12;
        f fVar;
        f fVar2;
        c cVar = this.B;
        b bVar = cVar.f32247a;
        if (!bVar.f32236n) {
            bVar.f32236n = true;
        }
        cVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f11 / this.f4009e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f11) - this.f4009e;
        int i11 = this.A;
        if (i11 > 0) {
            f12 = i11;
        } else {
            boolean z11 = this.J;
            int i12 = this.f4029z;
            if (z11) {
                i12 -= this.f4028y;
            }
            f12 = i12;
        }
        double dMax = Math.max(0.0f, Math.min(fAbs, f12 * 2.0f) / f12) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i13 = this.f4028y + ((int) ((f12 * fMin) + (f12 * fPow * 2.0f)));
        if (this.f4024u.getVisibility() != 0) {
            this.f4024u.setVisibility(0);
        }
        if (!this.f4022s) {
            this.f4024u.setScaleX(1.0f);
            this.f4024u.setScaleY(1.0f);
        }
        if (this.f4022s) {
            setAnimationProgress(Math.min(1.0f, f11 / this.f4009e));
        }
        float f13 = this.f4009e;
        c cVar2 = this.B;
        if (f11 < f13) {
            if (cVar2.f32247a.f32242t > 76 && ((fVar2 = this.E) == null || !fVar2.hasStarted() || fVar2.hasEnded())) {
                f fVar3 = new f(this, this.B.f32247a.f32242t, 76);
                fVar3.setDuration(300L);
                this.f4024u.setAnimationListener(null);
                this.f4024u.clearAnimation();
                this.f4024u.startAnimation(fVar3);
                this.E = fVar3;
            }
        } else if (cVar2.f32247a.f32242t < 255 && ((fVar = this.F) == null || !fVar.hasStarted() || fVar.hasEnded())) {
            f fVar4 = new f(this, this.B.f32247a.f32242t, 255);
            fVar4.setDuration(300L);
            this.f4024u.setAnimationListener(null);
            this.f4024u.clearAnimation();
            this.f4024u.startAnimation(fVar4);
            this.F = fVar4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        c cVar3 = this.B;
        b bVar2 = cVar3.f32247a;
        bVar2.f32228e = 0.0f;
        bVar2.f32229f = fMin2;
        cVar3.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        c cVar4 = this.B;
        b bVar3 = cVar4.f32247a;
        if (fMin3 != bVar3.f32238p) {
            bVar3.f32238p = fMin3;
        }
        cVar4.invalidateSelf();
        c cVar5 = this.B;
        cVar5.f32247a.f32230g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        cVar5.invalidateSelf();
        setTargetOffsetTopAndBottom(i13 - this.f4017n);
    }

    public final void k(float f11) {
        setTargetOffsetTopAndBottom((this.f4026w + ((int) ((this.f4028y - r0) * f11))) - this.f4024u.getTop());
    }

    public final void l() {
        this.f4024u.clearAnimation();
        this.B.stop();
        this.f4024u.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4022s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4028y - this.f4017n);
        }
        this.f4017n = this.f4024u.getTop();
    }

    public final void m(boolean z11, boolean z12) {
        if (this.f4007c != z11) {
            this.H = z12;
            b();
            this.f4007c = z11;
            d dVar = this.L;
            if (!z11) {
                p(dVar);
                return;
            }
            this.f4026w = this.f4017n;
            e eVar = this.M;
            eVar.reset();
            eVar.setDuration(200L);
            eVar.setInterpolator(this.f4023t);
            if (dVar != null) {
                this.f4024u.setAnimationListener(dVar);
            }
            this.f4024u.clearAnimation();
            this.f4024u.startAnimation(eVar);
        }
    }

    public final void n(boolean z11, boolean z12) {
        if (!z11 || this.f4007c == z11) {
            m(z11, false);
            return;
        }
        this.f4007c = z11;
        boolean z13 = this.J;
        int i11 = this.f4029z;
        if (!z13) {
            i11 += this.f4028y;
        }
        setTargetOffsetTopAndBottom(i11 - this.f4017n);
        this.H = z12;
        this.f4024u.setVisibility(0);
        this.B.setAlpha(255);
        e eVar = new e(this, 0);
        this.C = eVar;
        eVar.setDuration(this.f4016m);
        d dVar = this.L;
        if (dVar != null) {
            this.f4024u.setAnimationListener(dVar);
        }
        this.f4024u.clearAnimation();
        this.f4024u.startAnimation(this.C);
    }

    public final void o(float f11) {
        float f12 = this.f4019p;
        float f13 = f11 - f12;
        float f14 = this.f4008d;
        if (f13 <= f14 || this.f4020q) {
            return;
        }
        this.f4018o = f12 + f14;
        this.f4020q = true;
        this.B.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.b()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L88
            boolean r1 = r5.a()
            if (r1 != 0) goto L88
            boolean r1 = r5.f4007c
            if (r1 != 0) goto L88
            boolean r1 = r5.l
            if (r1 == 0) goto L1e
            goto L88
        L1e:
            if (r0 == 0) goto L64
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L5f
            r4 = 2
            if (r0 == r4) goto L44
            r4 = 3
            if (r0 == r4) goto L5f
            r3 = 6
            if (r0 == r3) goto L2e
            goto L85
        L2e:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.f4021r
            if (r3 != r4) goto L85
            if (r0 != 0) goto L3d
            r2 = r1
        L3d:
            int r6 = r6.getPointerId(r2)
            r5.f4021r = r6
            goto L85
        L44:
            int r0 = r5.f4021r
            if (r0 != r3) goto L50
            java.lang.String r6 = "SwipeRefreshLayout"
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r6, r0)
            return r2
        L50:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L57
            goto L88
        L57:
            float r6 = r6.getY(r0)
            r5.o(r6)
            goto L85
        L5f:
            r5.f4020q = r2
            r5.f4021r = r3
            goto L85
        L64:
            int r0 = r5.f4028y
            oa.a r1 = r5.f4024u
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r5.setTargetOffsetTopAndBottom(r0)
            int r0 = r6.getPointerId(r2)
            r5.f4021r = r0
            r5.f4020q = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L7f
            goto L88
        L7f:
            float r6 = r6.getY(r0)
            r5.f4019p = r6
        L85:
            boolean r6 = r5.f4020q
            return r6
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4005a == null) {
            b();
        }
        View view = this.f4005a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4024u.getMeasuredWidth();
        int measuredHeight2 = this.f4024u.getMeasuredHeight();
        int i15 = measuredWidth / 2;
        int i16 = measuredWidth2 / 2;
        int i17 = this.f4017n;
        this.f4024u.layout(i15 - i16, i17, i15 + i16, measuredHeight2 + i17);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f4005a == null) {
            b();
        }
        View view = this.f4005a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4024u.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
        this.f4025v = -1;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13) == this.f4024u) {
                this.f4025v = i13;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return this.f4012h.a(f11, f12, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f11, float f12) {
        return this.f4012h.b(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        if (i12 > 0) {
            float f11 = this.f4010f;
            if (f11 > 0.0f) {
                float f12 = i12;
                if (f12 > f11) {
                    iArr[1] = (int) f11;
                    this.f4010f = 0.0f;
                } else {
                    this.f4010f = f11 - f12;
                    iArr[1] = i12;
                }
                j(this.f4010f);
            }
        }
        if (this.J && i12 > 0 && this.f4010f == 0.0f && Math.abs(i12 - iArr[1]) > 0) {
            this.f4024u.setVisibility(8);
        }
        int i13 = i11 - iArr[0];
        int i14 = i12 - iArr[1];
        int[] iArr2 = this.f4013i;
        if (dispatchNestedPreScroll(i13, i14, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        d(view, i11, i12, i13, i14, 0, this.f4015k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f4011g.f3900a = i11;
        startNestedScroll(i11 & 2);
        this.f4010f = 0.0f;
        this.l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        setRefreshing(jVar.f32261a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new j(super.onSaveInstanceState(), this.f4007c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i11) {
        return (!isEnabled() || this.f4007c || (i11 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f4011g.f3900a = 0;
        this.l = false;
        float f11 = this.f4010f;
        if (f11 > 0.0f) {
            i(f11);
            this.f4010f = 0.0f;
        } else {
            post(new l(this, 4));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f4007c && !this.l) {
            if (actionMasked == 0) {
                this.f4021r = motionEvent.getPointerId(0);
                this.f4020q = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4021r);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f4020q) {
                    float y5 = (motionEvent.getY(iFindPointerIndex) - this.f4018o) * 0.5f;
                    this.f4020q = false;
                    i(y5);
                }
                this.f4021r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f4021r);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y6 = motionEvent.getY(iFindPointerIndex2);
                o(y6);
                if (this.f4020q) {
                    float f11 = (y6 - this.f4018o) * 0.5f;
                    if (f11 > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        j(f11);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f4021r) {
                            this.f4021r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f4021r = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    public final void p(d dVar) {
        e eVar = new e(this, 1);
        this.D = eVar;
        eVar.setDuration(150L);
        this.f4024u.setAnimationListener(dVar);
        this.f4024u.clearAnimation();
        this.f4024u.startAnimation(this.D);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        View view;
        if (!this.K || (view = this.f4005a) == null || ViewCompat.J(view)) {
            super.requestDisallowInterceptTouchEvent(z11);
        }
    }

    public void setAnimationProgress(float f11) {
        this.f4024u.setScaleX(f11);
        this.f4024u.setScaleY(f11);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        c cVar = this.B;
        b bVar = cVar.f32247a;
        bVar.f32232i = iArr;
        bVar.a(0);
        bVar.a(0);
        cVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = context.getColor(iArr[i11]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i11) {
        this.f4009e = i11;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (z11) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z11) {
        this.K = z11;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        t tVar = this.f4012h;
        if (tVar.f21621d) {
            ViewCompat.r0(tVar.f21620c);
        }
        tVar.f21621d = z11;
    }

    public void setOnRefreshListener(h hVar) {
        this.f4006b = hVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i11) {
        setProgressBackgroundColorSchemeResource(i11);
    }

    public void setProgressBackgroundColorSchemeColor(int i11) {
        this.f4024u.setBackgroundColor(i11);
    }

    public void setProgressBackgroundColorSchemeResource(int i11) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i11));
    }

    public void setProgressViewEndTarget(boolean z11, int i11) {
        this.f4029z = i11;
        this.f4022s = z11;
        this.f4024u.invalidate();
    }

    public void setProgressViewOffset(boolean z11, int i11, int i12) {
        this.f4022s = z11;
        this.f4028y = i11;
        this.f4029z = i12;
        this.J = true;
        l();
        this.f4007c = false;
    }

    public void setRefreshing(boolean z11) {
        n(z11, false);
    }

    public void setSize(int i11) {
        if (i11 == 0 || i11 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i11 == 0) {
                this.I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.I = (int) (displayMetrics.density * 40.0f);
            }
            this.f4024u.setImageDrawable(null);
            this.B.c(i11);
            this.f4024u.setImageDrawable(this.B);
        }
    }

    public void setSlingshotDistance(int i11) {
        this.A = i11;
    }

    public void setTargetOffsetTopAndBottom(int i11) {
        this.f4024u.bringToFront();
        ViewCompat.N(this.f4024u, i11);
        this.f4017n = this.f4024u.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i11) {
        return this.f4012h.g(i11, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f4012h.h(0);
    }

    public void setOnChildScrollUpCallback(g gVar) {
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
