package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import b20.a;
import b20.b;
import c20.c;
import c20.k;
import c20.l;
import c20.p;
import com.app.tgtg.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e20.d;
import e20.i0;
import e20.m0;
import h0.g;
import java.util.ArrayList;
import java.util.Iterator;
import k10.e;
import lx.u;
import lz.i;
import n20.o;
import n20.z;
import p.m;
import p.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton extends m0 implements a, z, s6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f12462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f12463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f12464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f12465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f12466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12471k;
    public final Rect l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f12472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f12473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f12474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f12475p;

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_Design_FloatingActionButton), attributeSet, i11);
        this.l = new Rect();
        this.f12472m = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.f24422p, i11, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f12462b = g.p(context2, typedArrayM, 1);
        this.f12463c = i0.o(typedArrayM.getInt(2, -1), null);
        this.f12466f = g.p(context2, typedArrayM, 12);
        this.f12467g = typedArrayM.getInt(7, -1);
        this.f12468h = typedArrayM.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayM.getDimensionPixelSize(3, 0);
        float dimension = typedArrayM.getDimension(4, 0.0f);
        float dimension2 = typedArrayM.getDimension(9, 0.0f);
        float dimension3 = typedArrayM.getDimension(11, 0.0f);
        this.f12471k = typedArrayM.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayM.getDimensionPixelSize(10, 0));
        e eVarA = e.a(context2, typedArrayM, 15);
        e eVarA2 = e.a(context2, typedArrayM, 8);
        o oVarA = o.d(context2, attributeSet, i11, R.style.Widget_Design_FloatingActionButton, o.f30387m).a();
        boolean z11 = typedArrayM.getBoolean(5, false);
        setEnabled(typedArrayM.getBoolean(0, true));
        typedArrayM.recycle();
        r rVar = new r(this);
        this.f12473n = rVar;
        rVar.b(attributeSet, i11);
        this.f12474o = new b(this);
        getImpl().h(oVarA);
        p impl = getImpl();
        ColorStateList colorStateList2 = this.f12462b;
        PorterDuff.Mode mode = this.f12463c;
        ColorStateList colorStateList3 = this.f12466f;
        FloatingActionButton floatingActionButton = impl.f7014v;
        o oVar = impl.f6994a;
        oVar.getClass();
        c20.o oVar2 = new c20.o(oVar);
        impl.f6995b = oVar2;
        oVar2.setTintList(colorStateList2);
        if (mode != null) {
            impl.f6995b.setTintMode(mode);
        }
        impl.f6995b.p(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            o oVar3 = impl.f6994a;
            oVar3.getClass();
            c cVar = new c(oVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            cVar.f6955i = color;
            cVar.f6956j = color2;
            cVar.f6957k = color3;
            cVar.l = color4;
            float f11 = dimensionPixelSize;
            if (cVar.f6954h != f11) {
                cVar.f6954h = f11;
                cVar.f6948b.setStrokeWidth(f11 * 1.3333f);
                cVar.f6959n = true;
                cVar.invalidateSelf();
            }
            if (colorStateList2 != null) {
                cVar.f6958m = colorStateList2.getColorForState(cVar.getState(), cVar.f6958m);
            }
            cVar.f6961p = colorStateList2;
            cVar.f6959n = true;
            cVar.invalidateSelf();
            impl.f6997d = cVar;
            c cVar2 = impl.f6997d;
            cVar2.getClass();
            c20.o oVar4 = impl.f6995b;
            oVar4.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{cVar2, oVar4});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.f6997d = null;
            layerDrawable = impl.f6995b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(k20.a.c(colorStateList), layerDrawable, drawable);
        impl.f6996c = rippleDrawable;
        impl.f6998e = rippleDrawable;
        getImpl().f7004k = dimensionPixelSize2;
        p impl2 = getImpl();
        if (impl2.f7001h != dimension) {
            impl2.f7001h = dimension;
            impl2.e(dimension, impl2.f7002i, impl2.f7003j);
        }
        p impl3 = getImpl();
        if (impl3.f7002i != dimension2) {
            impl3.f7002i = dimension2;
            impl3.e(impl3.f7001h, dimension2, impl3.f7003j);
        }
        p impl4 = getImpl();
        if (impl4.f7003j != dimension3) {
            impl4.f7003j = dimension3;
            impl4.e(impl4.f7001h, impl4.f7002i, dimension3);
        }
        getImpl().f7006n = eVarA;
        getImpl().f7007o = eVarA2;
        getImpl().f6999f = z11;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private p getImpl() {
        if (this.f12475p == null) {
            this.f12475p = new p(this, new i(this, 6));
        }
        return this.f12475p;
    }

    public final void c(o10.a aVar) {
        p impl = getImpl();
        if (impl.f7012t == null) {
            impl.f7012t = new ArrayList();
        }
        impl.f7012t.add(aVar);
    }

    public final void d(o10.a aVar) {
        p impl = getImpl();
        if (impl.f7011s == null) {
            impl.f7011s = new ArrayList();
        }
        impl.f7011s.add(aVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e(jb.b bVar) {
        p impl = getImpl();
        c20.i iVar = new c20.i(this, bVar);
        if (impl.f7013u == null) {
            impl.f7013u = new ArrayList();
        }
        impl.f7013u.add(iVar);
    }

    public final void f(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int i11 = rect.left;
        Rect rect2 = this.l;
        rect.left = i11 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final int g(int i11) {
        int i12 = this.f12468h;
        if (i12 != 0) {
            return i12;
        }
        Resources resources = getResources();
        return i11 != -1 ? i11 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f12462b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f12463c;
    }

    @Override // s6.a
    @NonNull
    public s6.b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f7014v.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f7002i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f7003j;
    }

    public Drawable getContentBackground() {
        return getImpl().f6998e;
    }

    public int getCustomSize() {
        return this.f12468h;
    }

    public int getExpandedComponentIdHint() {
        return this.f12474o.f5567a;
    }

    public e getHideMotionSpec() {
        return getImpl().f7007o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f12466f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f12466f;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        o oVar = getImpl().f6994a;
        oVar.getClass();
        return oVar;
    }

    public e getShowMotionSpec() {
        return getImpl().f7006n;
    }

    public int getSize() {
        return this.f12467g;
    }

    public int getSizeDimension() {
        return g(this.f12467g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f12464d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f12465e;
    }

    public boolean getUseCompatPadding() {
        return this.f12471k;
    }

    public final void h(o10.c cVar, boolean z11) {
        p impl = getImpl();
        w2.z zVar = cVar == null ? null : new w2.z(this, cVar, false, 19);
        FloatingActionButton floatingActionButton = impl.f7014v;
        FloatingActionButton floatingActionButton2 = impl.f7014v;
        int visibility = floatingActionButton.getVisibility();
        int i11 = impl.f7010r;
        if (visibility == 0) {
            if (i11 == 1) {
                return;
            }
        } else if (i11 != 2) {
            return;
        }
        Animator animator = impl.f7005m;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.a(z11 ? 8 : 4, z11);
            if (zVar != null) {
                ((w.b) zVar.f43083b).V((FloatingActionButton) zVar.f43084c);
                return;
            }
            return;
        }
        e eVar = impl.f7007o;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, p.E, p.F);
        animatorSetB.addListener(new k(impl, z11, zVar));
        ArrayList arrayList = impl.f7012t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetB.start();
    }

    public final boolean i() {
        p impl = getImpl();
        int visibility = impl.f7014v.getVisibility();
        int i11 = impl.f7010r;
        if (visibility == 0) {
            if (i11 != 1) {
                return false;
            }
        } else if (i11 == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        p impl = getImpl();
        int visibility = impl.f7014v.getVisibility();
        int i11 = impl.f7010r;
        if (visibility != 0) {
            if (i11 != 2) {
                return false;
            }
        } else if (i11 == 1) {
            return false;
        }
        return true;
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f12464d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f12465e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(m.c(colorForState, mode));
    }

    public final void l(o10.b bVar, boolean z11) {
        p impl = getImpl();
        w2.z zVar = bVar == null ? null : new w2.z(this, bVar, false, 19);
        FloatingActionButton floatingActionButton = impl.f7014v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.f7014v;
        int visibility = floatingActionButton.getVisibility();
        int i11 = impl.f7010r;
        if (visibility != 0) {
            if (i11 == 2) {
                return;
            }
        } else if (i11 != 1) {
            return;
        }
        Animator animator = impl.f7005m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z12 = impl.f7006n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z11);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f7008p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (zVar != null) {
                ((w.b) zVar.f43083b).W();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z12 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z12 ? 0.4f : 0.0f);
            float f11 = z12 ? 0.4f : 0.0f;
            impl.f7008p = f11;
            impl.a(f11, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        e eVar = impl.f7006n;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, p.C, p.D);
        animatorSetB.addListener(new l(impl, z11, zVar));
        ArrayList arrayList = impl.f7011s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p impl = getImpl();
        c20.o oVar = impl.f6995b;
        if (oVar != null) {
            u.P(impl.f7014v, oVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().f7014v.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i11, int i12) {
        int sizeDimension = getSizeDimension();
        this.f12469i = (sizeDimension - this.f12470j) / 2;
        getImpl().i();
        int iMin = Math.min(View.resolveSize(sizeDimension, i11), View.resolveSize(sizeDimension, i12));
        Rect rect = this.l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r20.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r20.a aVar = (r20.a) parcelable;
        super.onRestoreInstanceState(aVar.f45418a);
        Bundle bundle = (Bundle) aVar.f37574c.get("expandableWidgetHelper");
        bundle.getClass();
        b bVar = this.f12474o;
        bVar.getClass();
        bVar.f5568b = bundle.getBoolean("expanded", false);
        bVar.f5567a = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f5568b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.f5569c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        r20.a aVar = new r20.a(parcelableOnSaveInstanceState);
        b bVar = this.f12474o;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f5568b);
        bundle.putInt("expandedComponentIdHint", bVar.f5567a);
        aVar.f37574c.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f12472m;
            f(rect);
            p pVar = this.f12475p;
            int i11 = -(pVar.f6999f ? Math.max((pVar.f7004k - pVar.f7014v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i11, i11);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f12462b != colorStateList) {
            this.f12462b = colorStateList;
            p impl = getImpl();
            c20.o oVar = impl.f6995b;
            if (oVar != null) {
                oVar.setTintList(colorStateList);
            }
            c cVar = impl.f6997d;
            if (cVar != null) {
                if (colorStateList != null) {
                    cVar.f6958m = colorStateList.getColorForState(cVar.getState(), cVar.f6958m);
                }
                cVar.f6961p = colorStateList;
                cVar.f6959n = true;
                cVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f12463c != mode) {
            this.f12463c = mode;
            c20.o oVar = getImpl().f6995b;
            if (oVar != null) {
                oVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f11) {
        p impl = getImpl();
        if (impl.f7001h != f11) {
            impl.f7001h = f11;
            impl.e(f11, impl.f7002i, impl.f7003j);
        }
    }

    public void setCompatElevationResource(int i11) {
        setCompatElevation(getResources().getDimension(i11));
    }

    public void setCompatHoveredFocusedTranslationZ(float f11) {
        p impl = getImpl();
        if (impl.f7002i != f11) {
            impl.f7002i = f11;
            impl.e(impl.f7001h, f11, impl.f7003j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i11) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i11));
    }

    public void setCompatPressedTranslationZ(float f11) {
        p impl = getImpl();
        if (impl.f7003j != f11) {
            impl.f7003j = f11;
            impl.e(impl.f7001h, impl.f7002i, f11);
        }
    }

    public void setCompatPressedTranslationZResource(int i11) {
        setCompatPressedTranslationZ(getResources().getDimension(i11));
    }

    public void setCustomSize(int i11) {
        if (i11 < 0) {
            i4.a.f("Custom size must be non-negative");
        } else if (i11 != this.f12468h) {
            this.f12468h = i11;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        c20.o oVar = getImpl().f6995b;
        if (oVar != null) {
            oVar.s(f11);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        if (z11 != getImpl().f6999f) {
            getImpl().f6999f = z11;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i11) {
        this.f12474o.f5567a = i11;
    }

    public void setHideMotionSpec(e eVar) {
        getImpl().f7007o = eVar;
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(e.b(getContext(), i11));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            p impl = getImpl();
            float f11 = impl.f7008p;
            impl.f7008p = f11;
            Matrix matrix = impl.A;
            impl.a(f11, matrix);
            impl.f7014v.setImageMatrix(matrix);
            if (this.f12464d != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.f12473n.c(i11);
        k();
    }

    public void setMaxImageSize(int i11) {
        this.f12470j = i11;
        p impl = getImpl();
        if (impl.f7009q != i11) {
            impl.f7009q = i11;
            float f11 = impl.f7008p;
            impl.f7008p = f11;
            Matrix matrix = impl.A;
            impl.a(f11, matrix);
            impl.f7014v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f12466f != colorStateList) {
            this.f12466f = colorStateList;
            p impl = getImpl();
            ColorStateList colorStateList2 = this.f12466f;
            RippleDrawable rippleDrawable = impl.f6996c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(k20.a.c(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(k20.a.c(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f11) {
        super.setScaleX(f11);
        getImpl().f();
    }

    @Override // android.view.View
    public void setScaleY(float f11) {
        super.setScaleY(f11);
        getImpl().f();
    }

    public void setShadowPaddingEnabled(boolean z11) {
        p impl = getImpl();
        impl.f7000g = z11;
        impl.i();
    }

    @Override // n20.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        getImpl().h(oVar);
    }

    public void setShowMotionSpec(e eVar) {
        getImpl().f7006n = eVar;
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(e.b(getContext(), i11));
    }

    public void setSize(int i11) {
        this.f12468h = 0;
        if (i11 != this.f12467g) {
            this.f12467g = i11;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f12464d != colorStateList) {
            this.f12464d = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f12465e != mode) {
            this.f12465e = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f11) {
        super.setTranslationX(f11);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationY(float f11) {
        super.setTranslationY(f11);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationZ(float f11) {
        super.setTranslationZ(f11);
        getImpl().g();
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f12471k != z11) {
            this.f12471k = z11;
            getImpl().i();
        }
    }

    @Override // e20.m0, android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class BaseBehavior<T extends FloatingActionButton> extends s6.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f12476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12477b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.f24423q);
            this.f12477b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // s6.b
        public final boolean e(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // s6.b
        public final void g(s6.e eVar) {
            if (eVar.f38846h == 0) {
                eVar.f38846h = 80;
            }
        }

        @Override // s6.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof s6.e ? ((s6.e) layoutParams).f38839a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // s6.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListK = coordinatorLayout.k(floatingActionButton);
            int size = arrayListK.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayListK.get(i13);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof s6.e ? ((s6.e) layoutParams).f38839a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(i11, floatingActionButton);
            Rect rect = floatingActionButton.l;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                s6.e eVar = (s6.e) floatingActionButton.getLayoutParams();
                int i14 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i12 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i12 = -rect.top;
                }
                if (i12 != 0) {
                    ViewCompat.N(floatingActionButton, i12);
                }
                if (i14 != 0) {
                    ViewCompat.M(floatingActionButton, i14);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            s6.e eVar = (s6.e) floatingActionButton.getLayoutParams();
            if (!this.f12477b || eVar.f38844f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f12476a == null) {
                this.f12476a = new Rect();
            }
            Rect rect = this.f12476a;
            d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            s6.e eVar = (s6.e) floatingActionButton.getLayoutParams();
            if (!this.f12477b || eVar.f38844f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((s6.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public BaseBehavior() {
            this.f12477b = true;
        }
    }

    public void setRippleColor(int i11) {
        setRippleColor(ColorStateList.valueOf(i11));
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }
}
