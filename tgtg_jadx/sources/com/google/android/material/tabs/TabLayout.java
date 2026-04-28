package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import b0.a0;
import com.app.tgtg.R;
import e20.g0;
import e20.i0;
import ex.i;
import g7.b;
import java.util.ArrayList;
import java.util.Iterator;
import l20.c;
import lx.u;
import n20.j;
import s20.d;
import s20.f;
import s20.g;
import s20.h;
import s20.k;
import ta.e;
import v20.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    public static final b t0 = new b(16);
    public int A;
    public final int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public c J;
    public final TimeInterpolator K;
    public d L;
    public final ArrayList M;
    public k N;
    public ValueAnimator O;
    public e P;
    public h Q;
    public s20.c T;
    public boolean V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f12611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f12612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12616h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final g6.e f12617h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12620k;
    public ColorStateList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f12621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f12622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f12623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PorterDuff.Mode f12625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f12626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f12627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f12628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f12629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f12633y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f12634z;

    public TabLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(a.a(context, attributeSet, i11, R.style.Widget_Design_TabLayout), attributeSet, i11);
        this.f12609a = -1;
        this.f12610b = new ArrayList();
        this.f12620k = -1;
        this.f12624p = 0;
        this.f12630v = Integer.MAX_VALUE;
        this.G = -1;
        this.M = new ArrayList();
        this.f12617h0 = new g6.e(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(this, context2);
        this.f12612d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.f24404a0, i11, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListM = b6.a.m(getBackground());
        if (colorStateListM != null) {
            j jVar = new j();
            jVar.t(colorStateListM);
            jVar.p(context2);
            jVar.s(getElevation());
            setBackground(jVar);
        }
        setSelectedTabIndicator(h0.g.s(context2, typedArrayM, 5));
        setSelectedTabIndicatorColor(typedArrayM.getColor(8, 0));
        fVar.b(typedArrayM.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayM.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayM.getBoolean(9, true));
        int dimensionPixelSize = typedArrayM.getDimensionPixelSize(16, 0);
        this.f12616h = dimensionPixelSize;
        this.f12615g = dimensionPixelSize;
        this.f12614f = dimensionPixelSize;
        this.f12613e = dimensionPixelSize;
        this.f12613e = typedArrayM.getDimensionPixelSize(19, dimensionPixelSize);
        this.f12614f = typedArrayM.getDimensionPixelSize(20, dimensionPixelSize);
        this.f12615g = typedArrayM.getDimensionPixelSize(18, dimensionPixelSize);
        this.f12616h = typedArrayM.getDimensionPixelSize(17, dimensionPixelSize);
        if (i.G(context2, R.attr.isMaterial3Theme, false)) {
            this.f12618i = R.attr.textAppearanceTitleSmall;
        } else {
            this.f12618i = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayM.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f12619j = resourceId;
        int[] iArr = j.a.f24276y;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.f12626r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.l = h0.g.p(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM.hasValue(22)) {
                this.f12620k = typedArrayM.getResourceId(22, resourceId);
            }
            int i12 = this.f12620k;
            if (i12 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i12, iArr);
                try {
                    this.f12627s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) r6);
                    ColorStateList colorStateListP = h0.g.p(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListP != null) {
                        this.l = f(this.l.getDefaultColor(), colorStateListP.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListP.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayM.hasValue(25)) {
                this.l = h0.g.p(context2, typedArrayM, 25);
            }
            if (typedArrayM.hasValue(23)) {
                this.l = f(this.l.getDefaultColor(), typedArrayM.getColor(23, 0));
            }
            this.f12621m = h0.g.p(context2, typedArrayM, 3);
            this.f12625q = i0.o(typedArrayM.getInt(4, -1), null);
            this.f12622n = h0.g.p(context2, typedArrayM, 21);
            this.B = typedArrayM.getInt(6, 300);
            this.K = ox.h.Q(context2, R.attr.motionEasingEmphasizedInterpolator, k10.a.f25731b);
            this.f12631w = typedArrayM.getDimensionPixelSize(14, -1);
            this.f12632x = typedArrayM.getDimensionPixelSize(13, -1);
            this.f12629u = typedArrayM.getResourceId(0, 0);
            this.f12634z = typedArrayM.getDimensionPixelSize(1, 0);
            this.D = typedArrayM.getInt(15, 1);
            this.A = typedArrayM.getInt(2, 0);
            this.E = typedArrayM.getBoolean(12, false);
            this.I = typedArrayM.getBoolean(26, false);
            typedArrayM.recycle();
            Resources resources = getResources();
            this.f12628t = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f12633y = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    public static ColorStateList f(int i11, int i12) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i12, i11});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f12610b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            if (gVar != null && gVar.f38788a != null && !TextUtils.isEmpty(gVar.f38789b)) {
                return !this.E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i11 = this.f12631w;
        if (i11 != -1) {
            return i11;
        }
        int i12 = this.D;
        if (i12 == 0 || i12 == 2) {
            return this.f12633y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f12612d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i11) {
        f fVar = this.f12612d;
        int childCount = fVar.getChildCount();
        if (i11 < childCount) {
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = fVar.getChildAt(i12);
                if ((i12 != i11 || childAt.isSelected()) && (i12 == i11 || !childAt.isSelected())) {
                    childAt.setSelected(i12 == i11);
                    childAt.setActivated(i12 == i11);
                } else {
                    childAt.setSelected(i12 == i11);
                    childAt.setActivated(i12 == i11);
                    if (childAt instanceof s20.j) {
                        ((s20.j) childAt).f();
                    }
                }
                i12++;
            }
        }
    }

    public final void a(g gVar, boolean z11) {
        ArrayList arrayList = this.f12610b;
        int size = arrayList.size();
        if (gVar.f38793f != this) {
            i4.a.f("Tab belongs to a different TabLayout.");
            return;
        }
        gVar.f38791d = size;
        arrayList.add(size, gVar);
        int size2 = arrayList.size();
        int i11 = -1;
        for (int i12 = size + 1; i12 < size2; i12++) {
            if (((g) arrayList.get(i12)).f38791d == this.f12609a) {
                i11 = i12;
            }
            ((g) arrayList.get(i12)).f38791d = i12;
        }
        this.f12609a = i11;
        s20.j jVar = gVar.f38794g;
        jVar.setSelected(false);
        jVar.setActivated(false);
        int i13 = gVar.f38791d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f12612d.addView(jVar, i13, layoutParams);
        if (z11) {
            TabLayout tabLayout = gVar.f38793f;
            if (tabLayout != null) {
                tabLayout.k(gVar, true);
            } else {
                i4.a.f("Tab not attached to a TabLayout");
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (!(view instanceof s20.b)) {
            i4.a.f("Only TabItem instances can be added to TabLayout");
            return;
        }
        s20.b bVar = (s20.b) view;
        g gVarI = i();
        CharSequence charSequence = bVar.f38781a;
        if (charSequence != null) {
            gVarI.b(charSequence);
        }
        Drawable drawable = bVar.f38782b;
        if (drawable != null) {
            gVarI.f38788a = drawable;
            TabLayout tabLayout = gVarI.f38793f;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.n(true);
            }
            gVarI.c();
        }
        int i11 = bVar.f38783c;
        if (i11 != 0) {
            gVarI.f38792e = LayoutInflater.from(gVarI.f38794g.getContext()).inflate(i11, (ViewGroup) gVarI.f38794g, false);
            gVarI.c();
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            gVarI.f38790c = bVar.getContentDescription();
            gVarI.c();
        }
        a(gVarI, this.f12610b.isEmpty());
    }

    public final void c(int i11) {
        if (i11 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            f fVar = this.f12612d;
            int childCount = fVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (fVar.getChildAt(i12).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iE = e(0.0f, i11);
            if (scrollX != iE) {
                g();
                this.O.setIntValues(scrollX, iE);
                this.O.start();
            }
            ValueAnimator valueAnimator = fVar.f38786a;
            if (valueAnimator != null && valueAnimator.isRunning() && fVar.f38787b.f12609a != i11) {
                fVar.f38786a.cancel();
            }
            fVar.d(i11, this.B, true);
            return;
        }
        setScrollPosition(i11, 0.0f, true);
    }

    public final void d() {
        int i11 = this.D;
        int iMax = (i11 == 0 || i11 == 2) ? Math.max(0, this.f12634z - this.f12613e) : 0;
        f fVar = this.f12612d;
        fVar.setPaddingRelative(iMax, 0, 0, 0);
        int i12 = this.D;
        if (i12 == 0) {
            int i13 = this.A;
            if (i13 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i13 == 1) {
                fVar.setGravity(1);
            } else if (i13 == 2) {
            }
            fVar.setGravity(8388611);
        } else if (i12 == 1 || i12 == 2) {
            if (this.A == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            fVar.setGravity(1);
        }
        n(true);
    }

    public final int e(float f11, int i11) {
        f fVar;
        View childAt;
        int i12 = this.D;
        if ((i12 != 0 && i12 != 2) || (childAt = (fVar = this.f12612d).getChildAt(i11)) == null) {
            return 0;
        }
        int i13 = i11 + 1;
        View childAt2 = i13 < fVar.getChildCount() ? fVar.getChildAt(i13) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) ((width + width2) * 0.5f * f11);
        return getLayoutDirection() == 0 ? left + i14 : left - i14;
    }

    public final void g() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration(this.B);
            this.O.addUpdateListener(new g0(1, this));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f12611c;
        if (gVar != null) {
            return gVar.f38791d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f12610b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    public ColorStateList getTabIconTint() {
        return this.f12621m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    public int getTabMaxWidth() {
        return this.f12630v;
    }

    public int getTabMode() {
        return this.D;
    }

    public ColorStateList getTabRippleColor() {
        return this.f12622n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f12623o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final g h(int i11) {
        if (i11 < 0 || i11 >= getTabCount()) {
            return null;
        }
        return (g) this.f12610b.get(i11);
    }

    public final g i() {
        g gVar = (g) t0.a();
        if (gVar == null) {
            gVar = new g();
            gVar.f38791d = -1;
        }
        gVar.f38793f = this;
        g6.e eVar = this.f12617h0;
        s20.j jVar = eVar != null ? (s20.j) eVar.a() : null;
        if (jVar == null) {
            jVar = new s20.j(this, getContext());
        }
        jVar.setTab(gVar);
        jVar.setFocusable(true);
        jVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f38790c)) {
            jVar.setContentDescription(gVar.f38789b);
        } else {
            jVar.setContentDescription(gVar.f38790c);
        }
        gVar.f38794g = jVar;
        return gVar;
    }

    public final void j() {
        f fVar = this.f12612d;
        int childCount = fVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            s20.j jVar = (s20.j) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (jVar != null) {
                jVar.setTab(null);
                jVar.setSelected(false);
                this.f12617h0.c(jVar);
            }
            requestLayout();
        }
        Iterator it = this.f12610b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.f38793f = null;
            gVar.f38794g = null;
            gVar.f38788a = null;
            gVar.f38789b = null;
            gVar.f38790c = null;
            gVar.f38791d = -1;
            gVar.f38792e = null;
            t0.c(gVar);
        }
        this.f12611c = null;
    }

    public final void k(g gVar, boolean z11) {
        g gVar2 = this.f12611c;
        ArrayList arrayList = this.M;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((d) arrayList.get(size)).getClass();
                }
                c(gVar.f38791d);
                return;
            }
            return;
        }
        int i11 = gVar != null ? gVar.f38791d : -1;
        if (z11) {
            if ((gVar2 == null || gVar2.f38791d == -1) && i11 != -1) {
                setScrollPosition(i11, 0.0f, true);
            } else {
                c(i11);
            }
            if (i11 != -1) {
                setSelectedTabView(i11);
            }
        }
        this.f12611c = gVar;
        if (gVar2 != null && gVar2.f38793f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((d) arrayList.get(size2)).getClass();
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((d) arrayList.get(size3)).a(gVar);
            }
        }
    }

    public final void l(int i11, float f11, boolean z11, boolean z12, boolean z13) {
        float f12 = i11 + f11;
        int iRound = Math.round(f12);
        if (iRound >= 0) {
            f fVar = this.f12612d;
            if (iRound >= fVar.getChildCount()) {
                return;
            }
            if (z12) {
                fVar.f38787b.f12609a = Math.round(f12);
                ValueAnimator valueAnimator = fVar.f38786a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f38786a.cancel();
                }
                fVar.c(fVar.getChildAt(i11), fVar.getChildAt(i11 + 1), f11);
            }
            ValueAnimator valueAnimator2 = this.O;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.O.cancel();
            }
            int iE = e(f11, i11);
            int scrollX = getScrollX();
            boolean z14 = (i11 < getSelectedTabPosition() && iE >= scrollX) || (i11 > getSelectedTabPosition() && iE <= scrollX) || i11 == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z14 = (i11 < getSelectedTabPosition() && iE <= scrollX) || (i11 > getSelectedTabPosition() && iE >= scrollX) || i11 == getSelectedTabPosition();
            }
            if (z14 || this.W == 1 || z13) {
                if (i11 < 0) {
                    iE = 0;
                }
                scrollTo(iE, 0);
            }
            if (z11) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void m(e eVar, boolean z11, boolean z12) {
        ArrayList arrayList;
        ArrayList arrayList2;
        e eVar2 = this.P;
        if (eVar2 != null) {
            h hVar = this.Q;
            if (hVar != null && (arrayList2 = eVar2.D) != null) {
                arrayList2.remove(hVar);
            }
            s20.c cVar = this.T;
            if (cVar != null && (arrayList = this.P.F) != null) {
                arrayList.remove(cVar);
            }
        }
        k kVar = this.N;
        ArrayList arrayList3 = this.M;
        if (kVar != null) {
            arrayList3.remove(kVar);
            this.N = null;
        }
        if (eVar != null) {
            this.P = eVar;
            if (this.Q == null) {
                this.Q = new h(this);
            }
            h hVar2 = this.Q;
            hVar2.f38797c = 0;
            hVar2.f38796b = 0;
            if (eVar.D == null) {
                eVar.D = new ArrayList();
            }
            eVar.D.add(hVar2);
            k kVar2 = new k(eVar, 0);
            this.N = kVar2;
            if (!arrayList3.contains(kVar2)) {
                arrayList3.add(kVar2);
            }
            eVar.getAdapter();
            if (this.T == null) {
                this.T = new s20.c(this);
            }
            s20.c cVar2 = this.T;
            cVar2.getClass();
            if (eVar.F == null) {
                eVar.F = new ArrayList();
            }
            eVar.F.add(cVar2);
            setScrollPosition(eVar.getCurrentItem(), 0.0f, true);
        } else {
            this.P = null;
            j();
        }
        this.V = z12;
    }

    public final void n(boolean z11) {
        int i11 = 0;
        while (true) {
            f fVar = this.f12612d;
            if (i11 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i11);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.D == 1 && this.A == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z11) {
                childAt.requestLayout();
            }
            i11++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.Q(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof e) {
                m((e) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            setupWithViewPager(null);
            this.V = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        s20.j jVar;
        Drawable drawable;
        int i11 = 0;
        while (true) {
            f fVar = this.f12612d;
            if (i11 >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i11);
            if ((childAt instanceof s20.j) && (drawable = (jVar = (s20.j) childAt).f38808i) != null) {
                drawable.setBounds(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
                jVar.f38808i.draw(canvas);
            }
            i11++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.Z0(accessibilityNodeInfo).j0(i7.d.a(1, getTabCount(), 1, false));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = e20.i0.g(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f12632x
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = e20.i0.g(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f12630v = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.D
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        u.N(this, f11);
    }

    public void setInlineLabel(boolean z11) {
        if (this.E == z11) {
            return;
        }
        this.E = z11;
        int i11 = 0;
        while (true) {
            f fVar = this.f12612d;
            if (i11 >= fVar.getChildCount()) {
                d();
                return;
            }
            View childAt = fVar.getChildAt(i11);
            if (childAt instanceof s20.j) {
                s20.j jVar = (s20.j) childAt;
                jVar.setOrientation(!jVar.f38810k.E ? 1 : 0);
                TextView textView = jVar.f38806g;
                if (textView == null && jVar.f38807h == null) {
                    jVar.g(jVar.f38801b, jVar.f38802c, true);
                } else {
                    jVar.g(textView, jVar.f38807h, false);
                }
            }
            i11++;
        }
    }

    public void setInlineLabelResource(int i11) {
        setInlineLabel(getResources().getBoolean(i11));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        d dVar2 = this.L;
        ArrayList arrayList = this.M;
        if (dVar2 != null) {
            arrayList.remove(dVar2);
        }
        this.L = dVar;
        if (dVar == null || arrayList.contains(dVar)) {
            return;
        }
        arrayList.add(dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.O.addListener(animatorListener);
    }

    public void setScrollPosition(int i11, float f11, boolean z11, boolean z12) {
        l(i11, f11, z11, z12, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f12623o = drawableMutate;
        int i11 = this.f12624p;
        if (i11 != 0) {
            drawableMutate.setTint(i11);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.G;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f12623o.getIntrinsicHeight();
        }
        this.f12612d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i11) {
        this.f12624p = i11;
        Drawable drawable = this.f12623o;
        if (i11 != 0) {
            drawable.setTint(i11);
        } else {
            drawable.setTintList(null);
        }
        n(false);
    }

    public void setSelectedTabIndicatorGravity(int i11) {
        if (this.C != i11) {
            this.C = i11;
            this.f12612d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i11) {
        this.G = i11;
        this.f12612d.b(i11);
    }

    public void setTabGravity(int i11) {
        if (this.A != i11) {
            this.A = i11;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f12621m != colorStateList) {
            this.f12621m = colorStateList;
            ArrayList arrayList = this.f12610b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((g) arrayList.get(i11)).c();
            }
        }
    }

    public void setTabIconTintResource(int i11) {
        setTabIconTint(androidx.core.app.e.b(getContext(), i11));
    }

    public void setTabIndicatorAnimationMode(int i11) {
        this.H = i11;
        if (i11 == 0) {
            this.J = new c(16);
            return;
        }
        if (i11 == 1) {
            this.J = new s20.a(0);
        } else {
            if (i11 == 2) {
                this.J = new s20.a(1);
                return;
            }
            throw new IllegalArgumentException(i11 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z11) {
        this.F = z11;
        int i11 = f.f38785c;
        f fVar = this.f12612d;
        fVar.a(fVar.f38787b.getSelectedTabPosition());
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i11) {
        if (i11 != this.D) {
            this.D = i11;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f12622n == colorStateList) {
            return;
        }
        this.f12622n = colorStateList;
        int i11 = 0;
        while (true) {
            f fVar = this.f12612d;
            if (i11 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i11);
            if (childAt instanceof s20.j) {
                Context context = getContext();
                int i12 = s20.j.l;
                ((s20.j) childAt).e(context);
            }
            i11++;
        }
    }

    public void setTabRippleColorResource(int i11) {
        setTabRippleColor(androidx.core.app.e.b(getContext(), i11));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.f12610b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((g) arrayList.get(i11)).c();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(ta.a aVar) {
        j();
    }

    public void setUnboundedRipple(boolean z11) {
        if (this.I == z11) {
            return;
        }
        this.I = z11;
        int i11 = 0;
        while (true) {
            f fVar = this.f12612d;
            if (i11 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i11);
            if (childAt instanceof s20.j) {
                Context context = getContext();
                int i12 = s20.j.l;
                ((s20.j) childAt).e(context);
            }
            i11++;
        }
    }

    public void setUnboundedRippleResource(int i11) {
        setUnboundedRipple(getResources().getBoolean(i11));
    }

    public void setupWithViewPager(e eVar) {
        setupWithViewPager(eVar, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i11) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setupWithViewPager(e eVar, boolean z11) {
        m(eVar, z11, false);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public void setScrollPosition(int i11, float f11, boolean z11) {
        setScrollPosition(i11, f11, z11, true);
    }

    @Deprecated
    public void setOnTabSelectedListener(s20.e eVar) {
        setOnTabSelectedListener((d) eVar);
    }

    public void setTabTextColors(int i11, int i12) {
        setTabTextColors(f(i11, i12));
    }

    public void setSelectedTabIndicator(int i11) {
        if (i11 != 0) {
            setSelectedTabIndicator(a0.x(getContext(), i11));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public TabLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }
}
