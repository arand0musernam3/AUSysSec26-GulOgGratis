package h20;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.BaselineLayout;
import p.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends FrameLayout implements k {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int[] f21268p1 = {R.attr.state_checked};

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final n20.f f21269q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final g f21270r1;
    public BaselineLayout A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public ColorStateList G;
    public boolean H;
    public o.n I;
    public ColorStateList J;
    public Drawable K;
    public Drawable L;
    public ValueAnimator M;
    public n20.f N;
    public float O;
    public boolean P;
    public int Q;
    public int T;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f21272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f21273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21276f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f21277f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21278g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public m10.a f21279g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f21280h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f21281h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f21282h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f21283i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f21284i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f21285j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f21286j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f21287k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f21288k1;
    public float l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f21289l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f21290m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f21291m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21292n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f21293n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21294o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Rect f21295o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f21296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayout f21297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f21298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FrameLayout f21299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f21300t;
    public int t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final BaselineLayout f21301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f21302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f21303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BaselineLayout f21304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f21305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f21306z;

    static {
        int i11 = 17;
        f21269q1 = new n20.f(i11);
        f21270r1 = new g(i11);
    }

    public h(Context context) {
        super(context);
        this.f21271a = false;
        this.B = -1;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.H = false;
        this.N = f21269q1;
        this.O = 0.0f;
        this.P = false;
        this.Q = 0;
        this.T = 0;
        this.V = -2;
        this.W = 0;
        this.f21281h0 = false;
        this.t0 = 0;
        this.f21277f1 = 0;
        this.f21284i1 = 0;
        this.f21286j1 = 49;
        this.f21288k1 = false;
        this.f21289l1 = false;
        this.f21291m1 = false;
        this.f21293n1 = false;
        this.f21295o1 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f21296p = (LinearLayout) findViewById(com.app.tgtg.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.app.tgtg.R.id.navigation_bar_item_inner_content_container);
        this.f21297q = linearLayout;
        this.f21298r = findViewById(com.app.tgtg.R.id.navigation_bar_item_active_indicator_view);
        this.f21299s = (FrameLayout) findViewById(com.app.tgtg.R.id.navigation_bar_item_icon_container);
        this.f21300t = (ImageView) findViewById(com.app.tgtg.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.app.tgtg.R.id.navigation_bar_item_labels_group);
        this.f21301u = baselineLayout;
        TextView textView = (TextView) findViewById(com.app.tgtg.R.id.navigation_bar_item_small_label_view);
        this.f21302v = textView;
        TextView textView2 = (TextView) findViewById(com.app.tgtg.R.id.navigation_bar_item_large_label_view);
        this.f21303w = textView2;
        float dimension = getResources().getDimension(com.app.tgtg.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.app.tgtg.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.f21304x = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.f21304x.setDuplicateParentStateEnabled(true);
        this.f21304x.setMeasurePaddingFromBaseline(this.f21291m1);
        TextView textView3 = new TextView(getContext());
        this.f21305y = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.f21305y;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f21305y.setDuplicateParentStateEnabled(true);
        this.f21305y.setIncludeFontPadding(false);
        this.f21305y.setGravity(16);
        this.f21305y.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.f21306z = textView5;
        textView5.setMaxLines(1);
        this.f21306z.setEllipsize(truncateAt);
        this.f21306z.setDuplicateParentStateEnabled(true);
        this.f21306z.setVisibility(4);
        this.f21306z.setIncludeFontPadding(false);
        this.f21306z.setGravity(16);
        this.f21306z.setTextSize(dimension2);
        this.f21304x.addView(this.f21305y);
        this.f21304x.addView(this.f21306z);
        this.A = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f21274d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f21275e = baselineLayout.getPaddingBottom();
        this.f21276f = 0;
        this.f21278g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f21305y.setImportantForAccessibility(2);
        this.f21306z.setImportantForAccessibility(2);
        setFocusable(true);
        b();
        this.W = getResources().getDimensionPixelSize(com.app.tgtg.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new e((p10.a) this, 0));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i11 = 0;
        for (int i12 = 0; i12 < iIndexOfChild; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof h) && childAt.getVisibility() == 0) {
                i11++;
            }
        }
        return i11;
    }

    private int getSuggestedIconWidth() {
        m10.a aVar = this.f21279g1;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f21279g1.f28713e.f28747b.f28742w.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21299s.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f21300t.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(View view, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i12;
        layoutParams.gravity = i13;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    @Override // o.y
    public final void a(o.n nVar) {
        this.I = nVar;
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setIcon(nVar.getIcon());
        setTitle(nVar.f31574e);
        setId(nVar.f31570a);
        if (!TextUtils.isEmpty(nVar.f31585q)) {
            setContentDescription(nVar.f31585q);
        }
        c3.a(this, !TextUtils.isEmpty(nVar.f31586r) ? nVar.f31586r : nVar.f31574e);
        l();
        this.f21271a = true;
    }

    public final void b() {
        float textSize = this.f21302v.getTextSize();
        float textSize2 = this.f21303w.getTextSize();
        this.f21280h = textSize - textSize2;
        this.f21283i = (textSize2 * 1.0f) / textSize;
        this.f21285j = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f21305y.getTextSize();
        float textSize4 = this.f21306z.getTextSize();
        this.f21287k = textSize3 - textSize4;
        this.l = (textSize4 * 1.0f) / textSize3;
        this.f21290m = (textSize3 * 1.0f) / textSize4;
    }

    public final void c() {
        Drawable rippleDrawable = this.f21273c;
        RippleDrawable rippleDrawable2 = null;
        boolean z11 = true;
        if (this.f21272b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.P && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(k20.a.c(this.f21272b), null, activeIndicatorDrawable);
                z11 = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(k20.a.a(this.f21272b), null, null);
            }
        }
        FrameLayout frameLayout = this.f21299s;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable2);
        setBackground(rippleDrawable);
        setDefaultFocusHighlightEnabled(z11);
    }

    public final void d(float f11, float f12) {
        n20.f fVar = this.N;
        fVar.getClass();
        float fA = k10.a.a(0.4f, 1.0f, f11);
        View view = this.f21298r;
        view.setScaleX(fA);
        view.setScaleY(fVar.n(f11));
        view.setAlpha(k10.a.b(0.0f, 1.0f, f12 == 0.0f ? 0.8f : 0.0f, f12 == 0.0f ? 1.0f : 0.2f, f11));
        this.O = f11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.P) {
            this.f21299s.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i11 = this.f21300t.getLayoutParams().width > 0 ? this.f21278g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21304x.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i11 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i11 : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f11, float f12) {
        i(this.f21296p, this.f21282h1 == 0 ? (int) (this.f21274d + f12) : 0, 0, this.f21286j1);
        int i11 = this.f21282h1;
        i(this.f21297q, i11 == 0 ? 0 : this.f21295o1.top, i11 == 0 ? 0 : this.f21295o1.bottom, i11 == 0 ? 17 : 8388627);
        int i12 = this.f21275e;
        BaselineLayout baselineLayout = this.f21301u;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i12);
        this.A.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f11);
        textView2.setScaleY(f11);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i11 = this.f21274d;
        i(this.f21296p, i11, i11, this.f21282h1 == 0 ? 17 : this.f21286j1);
        i(this.f21297q, 0, 0, 17);
        BaselineLayout baselineLayout = this.f21301u;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.A.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f21298r.getBackground();
    }

    public m10.a getBadge() {
        return this.f21279g1;
    }

    @NonNull
    public BaselineLayout getExpandedLabelGroup() {
        return this.f21304x;
    }

    public int getItemBackgroundResId() {
        return com.app.tgtg.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // o.y
    public o.n getItemData() {
        return this.I;
    }

    public int getItemDefaultMarginResId() {
        return com.app.tgtg.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.B;
    }

    @NonNull
    public BaselineLayout getLabelGroup() {
        return this.f21301u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.f21296p;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.f21282h1 == 1) {
            LinearLayout linearLayout = this.f21297q;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.f21301u;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.widget.TextView r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.f21293n1
            if (r0 == 0) goto L8
            r5.setTextAppearance(r6)
            return
        L8:
            r5.setTextAppearance(r6)
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r6 != 0) goto L13
            goto L27
        L13:
            int[] r2 = j.a.f24276y
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r6.getValue(r1, r2)
            r6.recycle()
            if (r3 != 0) goto L29
        L27:
            r6 = r1
            goto L52
        L29:
            int r6 = r2.getComplexUnit()
            int r2 = r2.data
            r3 = 2
            if (r6 != r3) goto L46
            float r6 = android.util.TypedValue.complexToFloat(r2)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            goto L52
        L46:
            android.content.res.Resources r6 = r0.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = android.util.TypedValue.complexToDimensionPixelSize(r2, r6)
        L52:
            if (r6 == 0) goto L58
            float r6 = (float) r6
            r5.setTextSize(r1, r6)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h20.h.h(android.widget.TextView, int):void");
    }

    public final void j(int i11) {
        if (i11 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.Q, i11 - (this.t0 * 2));
            int iMax = this.T;
            if (this.f21282h1 == 1) {
                int measuredWidth = i11 - (this.f21277f1 * 2);
                int i12 = this.V;
                if (i12 != -1) {
                    measuredWidth = i12 == -2 ? this.f21296p.getMeasuredWidth() : Math.min(i12, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.W, this.f21297q.getMeasuredHeight());
            }
            View view = this.f21298r;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f21281h0 && this.f21292n == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void k(TextView textView, int i11) {
        if (textView == null) {
            return;
        }
        h(textView, i11);
        b();
        textView.setMinimumHeight(h0.g.u(textView.getContext(), i11));
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.f21303w;
        textView2.setTypeface(textView2.getTypeface(), this.H ? 1 : 0);
        TextView textView3 = this.f21306z;
        textView3.setTypeface(textView3.getTypeface(), this.H ? 1 : 0);
    }

    public final void l() {
        o.n nVar = this.I;
        if (nVar != null) {
            setVisibility((!nVar.isVisible() || (!this.f21288k1 && this.f21289l1)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        o.n nVar = this.I;
        if (nVar != null && nVar.isCheckable() && this.I.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f21268p1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m10.a aVar = this.f21279g1;
        if (aVar != null && aVar.isVisible()) {
            o.n nVar = this.I;
            CharSequence charSequence = nVar.f31574e;
            if (!TextUtils.isEmpty(nVar.f31585q)) {
                charSequence = this.I.f31585q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f21279g1.d()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatZ0 = AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo);
        accessibilityNodeInfoCompatZ0.k0(i7.e.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatZ0.i0(false);
            accessibilityNodeInfoCompatZ0.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2750i);
        }
        accessibilityNodeInfoCompatZ0.J0(getResources().getString(com.app.tgtg.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        post(new e7.a(this, i11, 1));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f21298r.setBackground(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z11) {
        this.P = z11;
        c();
        this.f21298r.setVisibility(z11 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i11) {
        this.W = i11;
        j(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i11) {
        this.f21277f1 = i11;
        if (this.f21282h1 == 1) {
            setPadding(i11, 0, i11, 0);
        }
        j(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(@NonNull Rect rect) {
        this.f21295o1 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i11) {
        this.V = i11;
        j(getWidth());
    }

    public void setActiveIndicatorHeight(int i11) {
        this.T = i11;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        if (this.f21276f != i11) {
            this.f21276f = i11;
            ((LinearLayout.LayoutParams) this.f21301u.getLayoutParams()).topMargin = i11;
            if (this.f21304x.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21304x.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i11 : 0;
                if (getLayoutDirection() == 1) {
                    i11 = 0;
                }
                layoutParams.leftMargin = i11;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i11) {
        this.t0 = i11;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z11) {
        this.f21281h0 = z11;
    }

    public void setActiveIndicatorWidth(int i11) {
        this.Q = i11;
        j(getWidth());
    }

    public void setBadge(@NonNull m10.a aVar) {
        m10.a aVar2 = this.f21279g1;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.f21300t;
        if (aVar2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f21279g1 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                m10.a aVar3 = this.f21279g1;
                if (aVar3 != null) {
                    if (aVar3.e() != null) {
                        aVar3.e().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.f21279g1 = null;
            }
        }
        this.f21279g1 = aVar;
        int i11 = this.f21284i1;
        m10.c cVar = aVar.f28713e;
        if (cVar.l != i11) {
            cVar.l = i11;
            aVar.k();
        }
        if (imageView == null || this.f21279g1 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        m10.a aVar4 = this.f21279g1;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar4.setBounds(rect);
        aVar4.j(imageView, null);
        if (aVar4.e() != null) {
            aVar4.e().setForeground(aVar4);
        } else {
            imageView.getOverlay().add(aVar4);
        }
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
    }

    public void setChecked(boolean z11) {
        TextView textView = this.f21303w;
        setLabelPivots(textView);
        TextView textView2 = this.f21302v;
        setLabelPivots(textView2);
        TextView textView3 = this.f21306z;
        setLabelPivots(textView3);
        TextView textView4 = this.f21305y;
        setLabelPivots(textView4);
        float f11 = z11 ? 1.0f : 0.0f;
        if (this.P && this.f21271a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.O, f11);
            this.M = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new f(this, f11));
            this.M.setInterpolator(ox.h.Q(getContext(), com.app.tgtg.R.attr.motionEasingEmphasizedInterpolator, k10.a.f25731b));
            this.M.setDuration(ox.h.P(getContext(), com.app.tgtg.R.attr.motionDurationLong2, getResources().getInteger(com.app.tgtg.R.integer.material_motion_duration_long_1)));
            this.M.start();
        } else {
            d(f11, f11);
        }
        float f12 = this.f21280h;
        float f13 = this.f21283i;
        float f14 = this.f21285j;
        if (this.f21282h1 == 1) {
            f12 = this.f21287k;
            f13 = this.l;
            f14 = this.f21290m;
            textView = textView3;
            textView2 = textView4;
        }
        int i11 = this.f21292n;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        g();
                    }
                } else if (z11) {
                    f(textView, textView2, f13, f12);
                } else {
                    f(textView2, textView, f14, 0.0f);
                }
            } else if (z11) {
                f(textView, textView2, f13, 0.0f);
            } else {
                g();
            }
        } else if (this.f21294o) {
            if (z11) {
                f(textView, textView2, f13, 0.0f);
            } else {
                g();
            }
        } else if (z11) {
            f(textView, textView2, f13, f12);
        } else {
            f(textView2, textView, f14, 0.0f);
        }
        refreshDrawableState();
        setSelected(z11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f21302v.setEnabled(z11);
        this.f21303w.setEnabled(z11);
        this.f21305y.setEnabled(z11);
        this.f21306z.setEnabled(z11);
        this.f21300t.setEnabled(z11);
    }

    @Override // h20.k
    public void setExpanded(boolean z11) {
        this.f21288k1 = z11;
        l();
    }

    public void setHorizontalTextAppearanceActive(int i11) {
        this.E = i11;
        if (i11 == 0) {
            i11 = this.C;
        }
        k(this.f21306z, i11);
    }

    public void setHorizontalTextAppearanceInactive(int i11) {
        this.F = i11;
        if (i11 == 0) {
            i11 = this.D;
        }
        TextView textView = this.f21305y;
        if (textView == null) {
            return;
        }
        h(textView, i11);
        b();
        textView.setMinimumHeight(h0.g.u(textView.getContext(), i11));
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.K) {
            return;
        }
        this.K = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.L = drawable;
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f21300t.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i11) {
        if (this.f21278g != i11) {
            this.f21278g = i11;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i11) {
        ImageView imageView = this.f21300t;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.J = colorStateList;
        if (this.I == null || (drawable = this.L) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.L.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f21273c = drawable;
        c();
    }

    public void setItemGravity(int i11) {
        this.f21286j1 = i11;
        requestLayout();
    }

    public void setItemIconGravity(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.f21282h1 != i11) {
            this.f21282h1 = i11;
            this.f21284i1 = 0;
            BaselineLayout baselineLayout = this.f21301u;
            this.A = baselineLayout;
            LinearLayout linearLayout = this.f21297q;
            int i18 = 8;
            if (i11 == 1) {
                if (this.f21304x.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(this.f21304x, layoutParams);
                    e();
                }
                Rect rect = this.f21295o1;
                int i19 = rect.left;
                int i21 = rect.right;
                int i22 = rect.top;
                i12 = rect.bottom;
                this.f21284i1 = 1;
                int i23 = this.f21277f1;
                this.A = this.f21304x;
                i16 = i22;
                i15 = i21;
                i14 = i19;
                i13 = i23;
                i17 = 0;
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i15 = 0;
                i16 = 0;
                i17 = 8;
                i18 = 0;
            }
            baselineLayout.setVisibility(i18);
            this.f21304x.setVisibility(i17);
            ((FrameLayout.LayoutParams) this.f21296p.getLayoutParams()).gravity = this.f21286j1;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i14;
            layoutParams2.rightMargin = i15;
            layoutParams2.topMargin = i16;
            layoutParams2.bottomMargin = i12;
            setPadding(i13, 0, i13, 0);
            j(getWidth());
            c();
        }
    }

    public void setItemPaddingBottom(int i11) {
        if (this.f21275e != i11) {
            this.f21275e = i11;
            o.n nVar = this.I;
            if (nVar != null) {
                setChecked(nVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i11) {
        if (this.f21274d != i11) {
            this.f21274d = i11;
            o.n nVar = this.I;
            if (nVar != null) {
                setChecked(nVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i11) {
        this.B = i11;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f21272b = colorStateList;
        c();
    }

    public void setLabelFontScalingEnabled(boolean z11) {
        this.f21293n1 = z11;
        setTextAppearanceActive(this.C);
        setTextAppearanceInactive(this.D);
        setHorizontalTextAppearanceActive(this.E);
        setHorizontalTextAppearanceInactive(this.F);
    }

    public void setLabelMaxLines(int i11) {
        TextView textView = this.f21302v;
        textView.setMaxLines(i11);
        TextView textView2 = this.f21303w;
        textView2.setMaxLines(i11);
        this.f21305y.setMaxLines(i11);
        this.f21306z.setMaxLines(i11);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i11 > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.f21292n != i11) {
            this.f21292n = i11;
            if (this.f21281h0 && i11 == 2) {
                this.N = f21270r1;
            } else {
                this.N = f21269q1;
            }
            j(getWidth());
            o.n nVar = this.I;
            if (nVar != null) {
                setChecked(nVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z11) {
        this.f21291m1 = z11;
        this.f21301u.setMeasurePaddingFromBaseline(z11);
        this.f21302v.setIncludeFontPadding(z11);
        this.f21303w.setIncludeFontPadding(z11);
        this.f21304x.setMeasurePaddingFromBaseline(z11);
        this.f21305y.setIncludeFontPadding(z11);
        this.f21306z.setIncludeFontPadding(z11);
        requestLayout();
    }

    @Override // h20.k
    public void setOnlyShowWhenExpanded(boolean z11) {
        this.f21289l1 = z11;
        l();
    }

    public void setShifting(boolean z11) {
        if (this.f21294o != z11) {
            this.f21294o = z11;
            o.n nVar = this.I;
            if (nVar != null) {
                setChecked(nVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i11) {
        this.C = i11;
        k(this.f21303w, i11);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z11) {
        this.H = z11;
        setTextAppearanceActive(this.C);
        setHorizontalTextAppearanceActive(this.E);
        TextView textView = this.f21303w;
        textView.setTypeface(textView.getTypeface(), this.H ? 1 : 0);
        TextView textView2 = this.f21306z;
        textView2.setTypeface(textView2.getTypeface(), this.H ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i11) {
        this.D = i11;
        TextView textView = this.f21302v;
        if (textView == null) {
            return;
        }
        h(textView, i11);
        b();
        textView.setMinimumHeight(h0.g.u(textView.getContext(), i11));
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        if (colorStateList != null) {
            this.f21302v.setTextColor(colorStateList);
            this.f21303w.setTextColor(colorStateList);
            this.f21305y.setTextColor(colorStateList);
            this.f21306z.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f21302v.setText(charSequence);
        this.f21303w.setText(charSequence);
        this.f21305y.setText(charSequence);
        this.f21306z.setText(charSequence);
        o.n nVar = this.I;
        if (nVar == null || TextUtils.isEmpty(nVar.f31585q)) {
            setContentDescription(charSequence);
        }
        o.n nVar2 = this.I;
        if (nVar2 != null && !TextUtils.isEmpty(nVar2.f31586r)) {
            charSequence = this.I.f31586r;
        }
        c3.a(this, charSequence);
    }

    public void setItemBackground(int i11) {
        setItemBackground(i11 == 0 ? null : getContext().getDrawable(i11));
    }

    public void setShortcut(boolean z11, char c3) {
    }
}
