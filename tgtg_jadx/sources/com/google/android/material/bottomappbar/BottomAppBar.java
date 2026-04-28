package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.tgtg.R;
import com.braze.ui.inappmessage.views.c;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e20.i0;
import e20.j0;
import h0.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import jb.b;
import lx.u;
import n20.f;
import n20.j;
import n20.m;
import n20.o;
import o10.d;
import ox.h;
import q1.k1;
import s6.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements s6.a {
    public static final /* synthetic */ int B1 = 0;
    public final b A1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public AnimatorSet f12283f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public AnimatorSet f12284g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Integer f12285h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f12286h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f12287i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f12288j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final int f12289k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f12290l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f12291m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final boolean f12292n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f12293o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final boolean f12294p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final boolean f12295q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final boolean f12296r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f12297s1;
    public final j t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f12298t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f12299u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public Behavior f12300v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f12301w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f12302x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f12303y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final o10.a f12304z1;

    public BottomAppBar(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i11);
        j jVar = new j();
        this.t0 = jVar;
        this.f12297s1 = 0;
        this.f12298t1 = false;
        this.f12299u1 = true;
        this.f12304z1 = new o10.a(this, 0);
        this.A1 = new b(this);
        Context context2 = getContext();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.f24411e, i11, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateListP = g.p(context2, typedArrayM, 1);
        if (typedArrayM.hasValue(12)) {
            setNavigationIconTint(typedArrayM.getColor(12, -1));
        }
        int dimensionPixelSize = typedArrayM.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayM.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayM.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayM.getDimensionPixelOffset(9, 0);
        this.f12286h1 = typedArrayM.getInt(3, 0);
        this.f12287i1 = typedArrayM.getInt(6, 0);
        this.f12288j1 = typedArrayM.getInt(5, 1);
        this.f12292n1 = typedArrayM.getBoolean(16, true);
        this.f12291m1 = typedArrayM.getInt(11, 0);
        this.f12293o1 = typedArrayM.getBoolean(10, false);
        this.f12294p1 = typedArrayM.getBoolean(13, false);
        this.f12295q1 = typedArrayM.getBoolean(14, false);
        this.f12296r1 = typedArrayM.getBoolean(15, false);
        this.f12290l1 = typedArrayM.getDimensionPixelOffset(4, -1);
        boolean z11 = typedArrayM.getBoolean(0, true);
        typedArrayM.recycle();
        this.f12289k1 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        o10.g gVar = new o10.g(0);
        gVar.f31808g = -1.0f;
        gVar.f31804c = dimensionPixelOffset;
        gVar.f31803b = dimensionPixelOffset2;
        gVar.y(dimensionPixelOffset3);
        gVar.f31807f = 0.0f;
        m mVar = new m();
        m mVar2 = new m();
        m mVar3 = new m();
        m mVar4 = new m();
        n20.a aVar = new n20.a(0.0f);
        n20.a aVar2 = new n20.a(0.0f);
        n20.a aVar3 = new n20.a(0.0f);
        n20.a aVar4 = new n20.a(0.0f);
        f fVar = new f(0);
        f fVar2 = new f(0);
        f fVar3 = new f(0);
        o oVar = new o();
        oVar.f30388a = mVar;
        oVar.f30389b = mVar2;
        oVar.f30390c = mVar3;
        oVar.f30391d = mVar4;
        oVar.f30392e = aVar;
        oVar.f30393f = aVar2;
        oVar.f30394g = aVar3;
        oVar.f30395h = aVar4;
        oVar.f30396i = gVar;
        oVar.f30397j = fVar;
        oVar.f30398k = fVar2;
        oVar.l = fVar3;
        jVar.setShapeAppearanceModel(oVar);
        if (z11) {
            jVar.x(2);
        } else {
            jVar.x(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        Paint.Style style = Paint.Style.FILL;
        jVar.v();
        jVar.p(context2);
        jVar.setTintList(colorStateListP);
        setElevation(dimensionPixelSize);
        setBackground(jVar);
        m1.a aVar5 = new m1.a(this);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j10.a.f24426t, i11, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
        i0.f(this, new j0(z12, z13, z14, aVar5));
    }

    public static void L(BottomAppBar bottomAppBar, View view) {
        e eVar = (e) view.getLayoutParams();
        eVar.f38842d = 17;
        int i11 = bottomAppBar.f12288j1;
        if (i11 == 1) {
            eVar.f38842d = 49;
        }
        if (i11 == 0) {
            eVar.f38842d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f12301w1;
    }

    private int getFabAlignmentAnimationDuration() {
        return h.P(getContext(), R.attr.motionDurationLong2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return E(this.f12286h1);
    }

    private float getFabTranslationY() {
        if (this.f12288j1 == 1) {
            return -getTopEdgeTreatment().f31806e;
        }
        return C() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f12303y1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f12302x1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public o10.g getTopEdgeTreatment() {
        return (o10.g) this.t0.f30345b.f30318a.f30396i;
    }

    public final View C() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((k1) coordinatorLayout.f2550b.f12780c).get(this);
        ArrayList<View> arrayList = coordinatorLayout.f2552d;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        for (View view : arrayList) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int D(ActionMenuView actionMenuView, int i11, boolean z11) {
        int i12 = 0;
        if (this.f12291m1 != 1 && (i11 != 1 || !z11)) {
            return 0;
        }
        boolean z12 = getLayoutDirection() == 1;
        int measuredWidth = z12 ? getMeasuredWidth() : 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof Toolbar.a) && (((Toolbar.a) childAt.getLayoutParams()).f1765a & 8388615) == 8388611) {
                measuredWidth = z12 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z12 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i14 = z12 ? this.f12302x1 : -this.f12303y1;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z12) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i12 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i14) + i12);
    }

    public final float E(int i11) {
        boolean z11 = getLayoutDirection() == 1;
        if (i11 != 1) {
            return 0.0f;
        }
        View viewC = C();
        int i12 = z11 ? this.f12303y1 : this.f12302x1;
        return ((getMeasuredWidth() / 2) - ((this.f12290l1 == -1 || viewC == null) ? this.f12289k1 + i12 : ((viewC.getMeasuredWidth() / 2) + this.f12290l1) + i12)) * (z11 ? -1 : 1);
    }

    public final boolean F() {
        View viewC = C();
        FloatingActionButton floatingActionButton = viewC instanceof FloatingActionButton ? (FloatingActionButton) viewC : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void G(int i11, boolean z11) {
        if (!isLaidOut()) {
            this.f12298t1 = false;
            int i12 = this.f12297s1;
            if (i12 != 0) {
                this.f12297s1 = 0;
                getMenu().clear();
                m(i12);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f12284g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!F()) {
            i11 = 0;
            z11 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        int i13 = 2;
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - D(actionMenuView, i11, z11)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new d(this, actionMenuView, i11, z11));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.f12284g1 = animatorSet3;
        animatorSet3.addListener(new o10.a(this, i13));
        this.f12284g1.start();
    }

    public final void H() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f12284g1 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (F()) {
            K(actionMenuView, this.f12286h1, this.f12299u1, false);
        } else {
            K(actionMenuView, 0, false, false);
        }
    }

    public final void I() {
        getTopEdgeTreatment().f31807f = getFabTranslationX();
        this.t0.u((this.f12299u1 && F() && this.f12288j1 == 1) ? 1.0f : 0.0f);
        View viewC = C();
        if (viewC != null) {
            viewC.setTranslationY(getFabTranslationY());
            viewC.setTranslationX(getFabTranslationX());
        }
    }

    public final void J(int i11) {
        float f11 = i11;
        if (f11 != getTopEdgeTreatment().f31805d) {
            getTopEdgeTreatment().f31805d = f11;
            this.t0.invalidateSelf();
        }
    }

    public final void K(ActionMenuView actionMenuView, int i11, boolean z11, boolean z12) {
        o10.e eVar = new o10.e(this, actionMenuView, i11, z11);
        if (z12) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.t0.f30345b.f30323f;
    }

    @Override // s6.a
    @NonNull
    public Behavior getBehavior() {
        if (this.f12300v1 == null) {
            this.f12300v1 = new Behavior();
        }
        return this.f12300v1;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f31806e;
    }

    public int getFabAlignmentMode() {
        return this.f12286h1;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f12290l1;
    }

    public int getFabAnchorMode() {
        return this.f12288j1;
    }

    public int getFabAnimationMode() {
        return this.f12287i1;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f31804c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f31803b;
    }

    public boolean getHideOnScroll() {
        return this.f12293o1;
    }

    public int getMenuAlignmentMode() {
        return this.f12291m1;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.P(this, this.t0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            AnimatorSet animatorSet = this.f12284g1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f12283f1;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            I();
            View viewC = C();
            if (viewC != null && viewC.isLaidOut()) {
                viewC.post(new c(4, viewC));
            }
        }
        H();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o10.f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o10.f fVar = (o10.f) parcelable;
        super.onRestoreInstanceState(fVar.f45418a);
        this.f12286h1 = fVar.f31801c;
        this.f12299u1 = fVar.f31802d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        o10.f fVar = new o10.f(super.onSaveInstanceState());
        fVar.f31801c = this.f12286h1;
        fVar.f31802d = this.f12299u1;
        return fVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.t0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f11) {
        if (f11 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().y(f11);
            this.t0.invalidateSelf();
            I();
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        j jVar = this.t0;
        jVar.s(f11);
        int iK = jVar.f30345b.f30332p - jVar.k();
        Behavior behavior = getBehavior();
        behavior.f12263k = iK;
        if (behavior.f12262j == 1) {
            setTranslationY(behavior.f12258f + iK);
        }
    }

    public void setFabAlignmentMode(int i11) {
        setFabAlignmentModeAndReplaceMenu(i11, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i11, int i12) {
        this.f12297s1 = i12;
        int i13 = 1;
        this.f12298t1 = true;
        G(i11, this.f12299u1);
        if (this.f12286h1 != i11 && isLaidOut()) {
            AnimatorSet animatorSet = this.f12283f1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f12287i1 == 1) {
                View viewC = C();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewC instanceof FloatingActionButton ? (FloatingActionButton) viewC : null, "translationX", E(i11));
                objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                View viewC2 = C();
                FloatingActionButton floatingActionButton = viewC2 instanceof FloatingActionButton ? (FloatingActionButton) viewC2 : null;
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new o10.c(this, i11), true);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(h.Q(getContext(), R.attr.motionEasingEmphasizedInterpolator, k10.a.f25730a));
            this.f12283f1 = animatorSet2;
            animatorSet2.addListener(new o10.a(this, i13));
            this.f12283f1.start();
        }
        this.f12286h1 = i11;
    }

    public void setFabAlignmentModeEndMargin(int i11) {
        if (this.f12290l1 != i11) {
            this.f12290l1 = i11;
            I();
        }
    }

    public void setFabAnchorMode(int i11) {
        this.f12288j1 = i11;
        I();
        View viewC = C();
        if (viewC != null) {
            L(this, viewC);
            viewC.requestLayout();
            this.t0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i11) {
        this.f12287i1 = i11;
    }

    public void setFabCornerSize(float f11) {
        if (f11 != getTopEdgeTreatment().f31808g) {
            getTopEdgeTreatment().f31808g = f11;
            this.t0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f11) {
        if (f11 != getFabCradleMargin()) {
            getTopEdgeTreatment().f31804c = f11;
            this.t0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f11) {
        if (f11 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f31803b = f11;
            this.t0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z11) {
        this.f12293o1 = z11;
    }

    public void setMenuAlignmentMode(int i11) {
        if (this.f12291m1 != i11) {
            this.f12291m1 = i11;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                K(actionMenuView, this.f12286h1, F(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f12285h0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f12285h0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i11) {
        this.f12285h0 = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Rect f12305m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public WeakReference f12306n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f12307o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final a f12308p;

        public Behavior() {
            this.f12308p = new a(this);
            this.f12305m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, s6.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f12306n = new WeakReference(bottomAppBar);
            int i12 = BottomAppBar.B1;
            View viewC = bottomAppBar.C();
            if (viewC != null && !viewC.isLaidOut()) {
                BottomAppBar.L(bottomAppBar, viewC);
                this.f12307o = ((ViewGroup.MarginLayoutParams) ((e) viewC.getLayoutParams())).bottomMargin;
                if (viewC instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewC;
                    if (bottomAppBar.f12288j1 == 0 && bottomAppBar.f12292n1) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.c(bottomAppBar.f12304z1);
                    floatingActionButton.d(new o10.a(bottomAppBar, 3));
                    floatingActionButton.e(bottomAppBar.A1);
                }
                viewC.addOnLayoutChangeListener(this.f12308p);
                bottomAppBar.I();
            }
            coordinatorLayout.r(i11, bottomAppBar);
            super.l(coordinatorLayout, bottomAppBar, i11);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, s6.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.t(coordinatorLayout, bottomAppBar, view2, view3, i11, i12);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12308p = new a(this);
            this.f12305m = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }
}
