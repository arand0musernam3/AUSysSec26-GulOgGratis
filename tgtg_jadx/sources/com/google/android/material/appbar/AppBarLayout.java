package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import b0.a0;
import com.app.tgtg.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import e20.i0;
import ex.i;
import h0.g;
import h7.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jd.f;
import l10.e;
import lx.u;
import n20.j;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements s6.a {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WindowInsetsCompat f12211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12215k;
    public ColorStateList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f12217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ValueAnimator f12218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f12219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f12220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f12221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f12222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f12223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f12224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12225v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f12226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f12227x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f12228y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Behavior f12229z;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k8.d f12235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Interpolator f12236c;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12234a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.f24405b);
            this.f12234a = typedArrayObtainStyledAttributes.getInt(1, 0);
            this.f12235b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new k8.d(4);
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.f12236c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_Design_AppBarLayout), attributeSet, i11);
        this.f12206b = -1;
        this.f12207c = -1;
        this.f12208d = -1;
        this.f12210f = 0;
        this.f12220q = new ArrayList();
        this.f12221r = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayM = i0.m(context3, attributeSet, e.f26782a, i11, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayM.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM.getResourceId(0, 0)));
            }
            typedArrayM.recycle();
            TypedArray typedArrayM2 = i0.m(context2, attributeSet, j10.a.f24403a, i11, R.style.Widget_Design_AppBarLayout, new int[0]);
            int i12 = 6;
            this.l = g.p(context2, typedArrayM2, 6);
            this.f12222s = h.P(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f12223t = h.Q(context2, R.attr.motionEasingStandardInterpolator, k10.a.f25730a);
            if (typedArrayM2.hasValue(4)) {
                this.f12210f = typedArrayM2.getBoolean(4, false) ? 1 : 2;
                requestLayout();
            }
            if (typedArrayM2.hasValue(3)) {
                e.a(this, typedArrayM2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayM2.getDrawable(0));
            if (typedArrayM2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayM2.getBoolean(2, false));
            }
            if (typedArrayM2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayM2.getBoolean(1, false));
            }
            this.f12228y = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f12215k = typedArrayM2.getBoolean(5, false);
            this.f12216m = typedArrayM2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayM2.getDrawable(8));
            typedArrayM2.recycle();
            ViewCompat.k0(this, new f(this, i12));
        } catch (Throwable th2) {
            typedArrayM.recycle();
            throw th2;
        }
    }

    public static a a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            a aVar = new a((LinearLayout.LayoutParams) layoutParams);
            aVar.f12234a = 1;
            return aVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar2 = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar2.f12234a = 1;
            return aVar2;
        }
        a aVar3 = new a(layoutParams);
        aVar3.f12234a = 1;
        return aVar3;
    }

    public final void b() {
        Behavior behavior = this.f12229z;
        d dVarF = (behavior == null || this.f12206b == -1 || this.f12210f != 0) ? null : behavior.F(y7.b.f45417b, this);
        this.f12206b = -1;
        this.f12207c = -1;
        this.f12208d = -1;
        if (dVarF != null) {
            Behavior behavior2 = this.f12229z;
            if (behavior2.f12232m != null) {
                return;
            }
            behavior2.f12232m = dVarF;
        }
    }

    public final boolean c(boolean z11) {
        if (this.f12212h || this.f12214j == z11) {
            return false;
        }
        this.f12214j = z11;
        refreshDrawableState();
        if (!(getBackground() instanceof j)) {
            return true;
        }
        if (this.l != null) {
            e(z11 ? 0.0f : 1.0f, z11 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f12215k) {
            return true;
        }
        float f11 = this.f12228y;
        e(z11 ? 0.0f : f11, z11 ? f11 : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d(View view) {
        int i11;
        if (this.f12217n == null && (i11 = this.f12216m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i11) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f12216m);
            }
            if (viewFindViewById != null) {
                this.f12217n = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f12217n;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f12226w == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f12205a);
        this.f12226w.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12226w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(float f11, float f12) {
        ValueAnimator valueAnimator = this.f12218o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f12);
        this.f12218o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f12222s);
        this.f12218o.setInterpolator(this.f12223t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f12219p;
        if (animatorUpdateListener != null) {
            this.f12218o.addUpdateListener(animatorUpdateListener);
        }
        this.f12218o.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -2);
        aVar.f12234a = 1;
        return aVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // s6.a
    @NonNull
    public s6.b getBehavior() {
        Behavior behavior = new Behavior();
        this.f12229z = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i11 = this.f12207c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = aVar.f12234a;
                if ((i13 & 5) != 5) {
                    if (i12 > 0) {
                        break;
                    }
                } else {
                    int i14 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    if ((i13 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i13 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i14 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i12 += iMin;
                    }
                    iMin = minimumHeight + i14;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i12 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i12);
        this.f12207c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i11 = this.f12208d;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + childAt.getMeasuredHeight();
                int i13 = aVar.f12234a;
                if ((i13 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i13 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i12++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f12208d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f12216m;
    }

    public j getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof j) {
            return (j) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i11 = (minimumHeight * 2) + topInset;
            return i11 < getHeight() ? i11 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i12 = (minimumHeight2 * 2) + topInset;
        return i12 < getHeight() ? i12 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f12210f;
    }

    public Drawable getStatusBarForeground() {
        return this.f12226w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f12211g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i11 = this.f12206b;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = aVar.f12234a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + minimumHeight;
                if (i12 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i13 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i12++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f12206b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.Q(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        if (this.f12224u == null) {
            this.f12224u = new int[4];
        }
        int[] iArr = this.f12224u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + iArr.length);
        boolean z11 = this.f12213i;
        int i12 = R.attr.state_liftable;
        if (!z11) {
            i12 = -R.attr.state_liftable;
        }
        iArr[0] = i12;
        int i13 = R.attr.state_lifted;
        if (!z11 || !this.f12214j) {
            i13 = -R.attr.state_lifted;
        }
        iArr[1] = i13;
        int i14 = R.attr.state_collapsible;
        if (!z11) {
            i14 = -R.attr.state_collapsible;
        }
        iArr[2] = i14;
        int i15 = R.attr.state_collapsed;
        if (!z11 || !this.f12214j) {
            i15 = -R.attr.state_collapsed;
        }
        iArr[3] = i15;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f12217n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12217n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    ViewCompat.N(getChildAt(childCount), topInset);
                }
            }
        }
        b();
        this.f12209e = false;
        int childCount2 = getChildCount();
        int i15 = 0;
        while (true) {
            if (i15 >= childCount2) {
                break;
            }
            if (((a) getChildAt(i15).getLayoutParams()).f12236c != null) {
                this.f12209e = true;
                break;
            }
            i15++;
        }
        Drawable drawable = this.f12226w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f12212h) {
            return;
        }
        if (!this.f12215k) {
            int childCount3 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount3) {
                    z12 = false;
                    break;
                }
                int i17 = ((a) getChildAt(i16).getLayoutParams()).f12234a;
                if ((i17 & 1) == 1 && (i17 & 10) != 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        if (this.f12213i != z12) {
            this.f12213i = z12;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = xz.b.o(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i12));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final j jVar;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer numValueOf = null;
        if (drawable instanceof j) {
            jVar = (j) drawable;
        } else {
            ColorStateList colorStateListM = b6.a.m(drawable);
            if (colorStateListM == null) {
                jVar = null;
            } else {
                j jVar2 = new j();
                jVar2.t(colorStateListM);
                jVar = jVar2;
            }
        }
        if (jVar != null && (colorStateList = jVar.f30345b.f30321d) != null) {
            this.f12225v = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.l;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue typedValueF = i.F(context2, R.attr.colorSurface);
                if (typedValueF != null) {
                    int i11 = typedValueF.resourceId;
                    numValueOf = Integer.valueOf(i11 != 0 ? context2.getColor(i11) : typedValueF.data);
                }
                this.f12219p = new ValueAnimator.AnimatorUpdateListener() { // from class: l10.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f26765a;
                        LinkedHashSet linkedHashSet = appBarLayout.f12221r;
                        ArrayList arrayList = appBarLayout.f12220q;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int iE = w0.e.E(appBarLayout.f12225v, fFloatValue, colorStateList2.getDefaultColor());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iE);
                        j jVar3 = jVar;
                        jVar3.t(colorStateListValueOf);
                        if (appBarLayout.f12226w != null && (num = appBarLayout.f12227x) != null && num.equals(numValueOf)) {
                            appBarLayout.f12226w.setTint(iE);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    org.bouncycastle.jce.provider.a.c();
                                    return;
                                } else if (jVar3.f30345b.f30321d != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            SearchBar searchBar = ((l20.a) it2.next()).f26791a;
                            ColorStateList colorStateList3 = searchBar.f12536i1;
                            if (colorStateList3 != null) {
                                searchBar.f12548u1.t(ColorStateList.valueOf(w0.e.E(searchBar.f12533g1, fFloatValue, colorStateList3.getDefaultColor())));
                            }
                        }
                    }
                };
            } else {
                jVar.p(context);
                this.f12219p = new com.braze.ui.inappmessage.listeners.b(2, this, jVar);
            }
            drawable = jVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        u.N(this, f11);
    }

    public void setExpanded(boolean z11, boolean z12) {
        this.f12210f = (z11 ? 1 : 2) | (z12 ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z11) {
        this.f12215k = z11;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f12216m = -1;
        if (view != null) {
            this.f12217n = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f12217n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12217n = null;
    }

    public void setLiftOnScrollTargetViewId(int i11) {
        this.f12216m = i11;
        WeakReference weakReference = this.f12217n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12217n = null;
    }

    public void setLiftableOverrideEnabled(boolean z11) {
        this.f12212h = z11;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (i11 == 1) {
            super.setOrientation(i11);
        } else {
            i4.a.f("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i11) {
        this.f12210f = i11;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f12226w;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f12226w = drawableMutate;
            if (drawableMutate instanceof j) {
                numValueOf = Integer.valueOf(((j) drawableMutate).f30364v);
            } else {
                ColorStateList colorStateListM = b6.a.m(drawableMutate);
                if (colorStateListM != null) {
                    numValueOf = Integer.valueOf(colorStateListM.getDefaultColor());
                }
            }
            this.f12227x = numValueOf;
            Drawable drawable3 = this.f12226w;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f12226w.setState(getDrawableState());
                }
                this.f12226w.setLayoutDirection(getLayoutDirection());
                this.f12226w.setVisible(getVisibility() == 0, false);
                this.f12226w.setCallback(this);
            }
            if (this.f12226w != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i11) {
        setStatusBarForeground(new ColorDrawable(i11));
    }

    public void setStatusBarForegroundResource(int i11) {
        setStatusBarForeground(a0.x(getContext(), i11));
    }

    @Deprecated
    public void setTargetElevation(float f11) {
        e.a(this, f11);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f12226w;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12226w;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class BaseBehavior<T extends AppBarLayout> extends l10.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f12230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f12231k;
        public ValueAnimator l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public d f12232m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public WeakReference f12233n;

        public BaseBehavior() {
            this.f26772f = -1;
            this.f26774h = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (((s6.e) childAt.getLayoutParams()).f38839a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt instanceof s) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void H(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.H(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11) {
            int iAbs = Math.abs(y() - i11);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iY = y();
            ValueAnimator valueAnimator = this.l;
            if (iY == i11) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.l = valueAnimator2;
                valueAnimator2.setInterpolator(k10.a.f25734e);
                this.l.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.l.setDuration(Math.min(iRound, 600));
            this.l.setIntValues(iY, i11);
            this.l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void E(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.y()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.z(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.f12215k
                if (r9 == 0) goto L37
                boolean r9 = r4.d(r11)
                r4.c(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final d F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = y7.b.f45417b;
                    }
                    d dVar = new d(parcelable);
                    boolean z11 = iW == 0;
                    dVar.f12249d = z11;
                    dVar.f12248c = !z11 && (-iW) >= appBarLayout.getTotalScrollRange();
                    dVar.f12250e = i11;
                    dVar.f12252g = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    dVar.f12251f = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iY = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    i11 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                a aVar = (a) childAt.getLayoutParams();
                if ((aVar.f12234a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) aVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) aVar).bottomMargin;
                }
                int i12 = -iY;
                if (top <= i12 && bottom >= i12) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i11);
                a aVar2 = (a) childAt2.getLayoutParams();
                int i13 = aVar2.f12234a;
                if ((i13 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i11 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i13 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i13 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iY < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i13 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) aVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                    }
                    if (iY < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, appBarLayout, xz.b.o(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // l10.d, s6.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i11);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f12232m;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z11 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i12 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z11) {
                            C(coordinatorLayout, appBarLayout, i12);
                        } else {
                            A(coordinatorLayout, appBarLayout, i12);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z11) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.f12248c) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.f12249d) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.f12250e);
                int i13 = -childAt.getBottom();
                A(coordinatorLayout, appBarLayout, this.f12232m.f12252g ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i13 : Math.round(childAt.getHeight() * this.f12232m.f12251f) + i13);
            }
            appBarLayout.f12210f = 0;
            this.f12232m = null;
            int iO = xz.b.o(w(), -appBarLayout.getTotalScrollRange(), 0);
            a60.s sVar = this.f26780a;
            if (sVar == null) {
                this.f26781b = iO;
            } else if (sVar.f911c != iO) {
                sVar.f911c = iO;
                sVar.b();
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.f12205a = w();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (!ViewCompat.E(coordinatorLayout)) {
                ViewCompat.b0(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            }
            return true;
        }

        @Override // s6.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((s6.e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i11, i12, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // s6.b
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr, int i13) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i12, iArr);
        }

        @Override // s6.b
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i13, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i13 != 0 || ViewCompat.E(coordinatorLayout2)) {
                return;
            }
            ViewCompat.b0(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
        }

        @Override // s6.b
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.f12232m = (d) parcelable;
            } else {
                this.f12232m = null;
            }
        }

        @Override // s6.b
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d dVarF = F(absSavedState, (AppBarLayout) view);
            return dVarF == null ? absSavedState : dVarF;
        }

        @Override // s6.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z11 = (i11 & 2) != 0 && (appBarLayout.f12215k || appBarLayout.f12214j || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z11 && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.f12233n = null;
            this.f12231k = i12;
            return z11;
        }

        @Override // s6.b
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f12231k == 0 || i11 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f12215k) {
                    appBarLayout.c(appBarLayout.d(view2));
                }
            }
            this.f12233n = new WeakReference(view2);
        }

        @Override // l10.b
        public final int y() {
            return w() + this.f12230j;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
        @Override // l10.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instruction units count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26772f = -1;
            this.f26774h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -2);
        aVar.f12234a = 1;
        return aVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class ScrollingViewBehavior extends l10.c {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.Q);
            this.f26779f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) arrayList.get(i11);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // s6.b
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // s6.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            s6.b bVar = ((s6.e) view2.getLayoutParams()).f38839a;
            if (bVar instanceof BaseBehavior) {
                ViewCompat.N(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f12230j) + this.f26778e) - y(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f12215k) {
                return false;
            }
            appBarLayout.c(appBarLayout.d(view));
            return false;
        }

        @Override // s6.b
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ViewCompat.b0(coordinatorLayout, null);
            }
        }

        @Override // s6.b
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z11) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.k(view));
            if (appBarLayoutZ != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f26776c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutZ.setExpanded(false, !z11);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public void setExpanded(boolean z11) {
        setExpanded(z11, isLaidOut());
    }

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }
}
