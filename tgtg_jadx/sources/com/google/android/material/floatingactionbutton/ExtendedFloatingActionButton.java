package com.google.android.material.floatingactionbutton;

import a50.c;
import a8.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c20.d;
import c20.e;
import c20.f;
import c20.g;
import com.app.tgtg.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import e20.i0;
import java.util.ArrayList;
import n20.o;
import s6.a;
import se.b;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f12440q = new d(0, "width", Float.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f12441r = new d(1, "height", Float.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f12442s = new d(2, "paddingStart", Float.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f12443t = new d(3, "paddingEnd", Float.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f12446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f12447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f12448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f12449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExtendedFloatingActionButtonBehavior f12453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12454k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f12456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12457o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12458p;

    public ExtendedFloatingActionButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i11);
        this.f12444a = 0;
        this.f12445b = true;
        b bVar = new b(8);
        g gVar = new g(this, bVar);
        this.f12448e = gVar;
        f fVar = new f(this, bVar);
        this.f12449f = fVar;
        this.f12454k = true;
        this.l = false;
        this.f12455m = false;
        Context context2 = getContext();
        this.f12453j = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayM = i0.m(context2, attributeSet, j10.a.f24420n, i11, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        k10.e eVarA = k10.e.a(context2, typedArrayM, 5);
        k10.e eVarA2 = k10.e.a(context2, typedArrayM, 4);
        k10.e eVarA3 = k10.e.a(context2, typedArrayM, 2);
        k10.e eVarA4 = k10.e.a(context2, typedArrayM, 6);
        this.f12450g = typedArrayM.getDimensionPixelSize(0, -1);
        int i12 = typedArrayM.getInt(3, 1);
        this.f12451h = getPaddingStart();
        this.f12452i = getPaddingEnd();
        b bVar2 = new b(8);
        c cVar = new c(this, 9);
        z zVar = new z(this, cVar, false, 18);
        h hVar = new h(this, zVar, cVar);
        boolean z11 = true;
        c20.h hVar2 = cVar;
        if (i12 != 1) {
            z11 = true;
            hVar2 = i12 != 2 ? hVar : zVar;
        }
        e eVar = new e(this, bVar2, hVar2, z11);
        this.f12447d = eVar;
        e eVar2 = new e(this, bVar2, new se.d(this, 7), false);
        this.f12446c = eVar2;
        gVar.f6946f = eVarA;
        fVar.f6946f = eVarA2;
        eVar.f6946f = eVarA3;
        eVar2.f6946f = eVarA4;
        typedArrayM.recycle();
        setShapeAppearanceModel(o.d(context2, attributeSet, i11, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, o.f30387m).a());
        this.f12456n = getTextColors();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r5, int r6) {
        /*
            r0 = 1
            r1 = 2
            if (r6 == 0) goto L1e
            if (r6 == r0) goto L1b
            if (r6 == r1) goto L18
            r2 = 3
            if (r6 != r2) goto Le
            c20.e r2 = r5.f12447d
            goto L20
        Le:
            java.lang.String r5 = "Unknown strategy type: "
            java.lang.String r5 = j4.s.f(r6, r5)
            com.braze.h2.b(r5)
            return
        L18:
            c20.e r2 = r5.f12446c
            goto L20
        L1b:
            c20.f r2 = r5.f12449f
            goto L20
        L1e:
            c20.g r2 = r5.f12448e
        L20:
            boolean r3 = r2.h()
            if (r3 == 0) goto L27
            return
        L27:
            boolean r3 = r5.f12445b
            if (r3 == 0) goto L91
            boolean r3 = r5.isLaidOut()
            if (r3 != 0) goto L43
            int r3 = r5.getVisibility()
            int r4 = r5.f12444a
            if (r3 == 0) goto L3c
            if (r4 != r1) goto L3f
            goto L91
        L3c:
            if (r4 == r0) goto L3f
            goto L91
        L3f:
            boolean r0 = r5.f12455m
            if (r0 == 0) goto L91
        L43:
            boolean r0 = r5.isInEditMode()
            if (r0 != 0) goto L91
            if (r6 != r1) goto L66
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            if (r6 == 0) goto L5a
            int r0 = r6.width
            r5.f12457o = r0
            int r6 = r6.height
            r5.f12458p = r6
            goto L66
        L5a:
            int r6 = r5.getWidth()
            r5.f12457o = r6
            int r6 = r5.getHeight()
            r5.f12458p = r6
        L66:
            r6 = 0
            r5.measure(r6, r6)
            android.animation.AnimatorSet r5 = r2.a()
            androidx.vectordrawable.graphics.drawable.e r6 = new androidx.vectordrawable.graphics.drawable.e
            r0 = 2
            r6.<init>(r2, r0)
            r5.addListener(r6)
            java.util.ArrayList r6 = r2.f6943c
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r6.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r5.addListener(r0)
            goto L7d
        L8d:
            r5.start()
            return
        L91:
            r2.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton, int):void");
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // s6.a
    @NonNull
    public s6.b getBehavior() {
        return this.f12453j;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i11 = this.f12450g;
        if (i11 >= 0) {
            return i11;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public k10.e getExtendMotionSpec() {
        return this.f12447d.f6946f;
    }

    public k10.e getHideMotionSpec() {
        return this.f12449f.f6946f;
    }

    public k10.e getShowMotionSpec() {
        return this.f12448e.f6946f;
    }

    public k10.e getShrinkMotionSpec() {
        return this.f12446c.f6946f;
    }

    public final void k(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12454k && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f12454k = false;
            this.f12446c.g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z11) {
        this.f12455m = z11;
    }

    public void setAnimationEnabled(boolean z11) {
        this.f12445b = z11;
    }

    public void setExtendMotionSpec(k10.e eVar) {
        this.f12447d.f6946f = eVar;
    }

    public void setExtendMotionSpecResource(int i11) {
        setExtendMotionSpec(k10.e.b(getContext(), i11));
    }

    public void setExtended(boolean z11) {
        if (this.f12454k == z11) {
            return;
        }
        e eVar = z11 ? this.f12447d : this.f12446c;
        if (eVar.h()) {
            return;
        }
        eVar.g();
    }

    public void setHideMotionSpec(k10.e eVar) {
        this.f12449f.f6946f = eVar;
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(k10.e.b(getContext(), i11));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
        if (!this.f12454k || this.l) {
            return;
        }
        this.f12451h = getPaddingStart();
        this.f12452i = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11, i12, i13, i14);
        if (!this.f12454k || this.l) {
            return;
        }
        this.f12451h = i11;
        this.f12452i = i13;
    }

    public void setShowMotionSpec(k10.e eVar) {
        this.f12448e.f6946f = eVar;
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(k10.e.b(getContext(), i11));
    }

    public void setShrinkMotionSpec(k10.e eVar) {
        this.f12446c.f6946f = eVar;
    }

    public void setShrinkMotionSpecResource(int i11) {
        setShrinkMotionSpec(k10.e.b(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        this.f12456n = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f12456n = getTextColors();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends s6.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f12459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f12461c;

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.f24421o);
            this.f12460b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f12461c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // s6.b
        public final /* bridge */ /* synthetic */ boolean e(View view, Rect rect) {
            return false;
        }

        @Override // s6.b
        public final void g(s6.e eVar) {
            if (eVar.f38846h == 0) {
                eVar.f38846h = 80;
            }
        }

        @Override // s6.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof s6.e ? ((s6.e) layoutParams).f38839a instanceof BottomSheetBehavior : false) {
                    x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // s6.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListK = coordinatorLayout.k(extendedFloatingActionButton);
            int size = arrayListK.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) arrayListK.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof s6.e ? ((s6.e) layoutParams).f38839a instanceof BottomSheetBehavior : false) && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(i11, extendedFloatingActionButton);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            s6.e eVar = (s6.e) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f12460b;
            boolean z12 = this.f12461c;
            if ((!z11 && !z12) || eVar.f38844f != appBarLayout.getId()) {
                return false;
            }
            if (this.f12459a == null) {
                this.f12459a = new Rect();
            }
            Rect rect = this.f12459a;
            e20.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton, z12 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton, z12 ? 3 : 0);
            }
            return true;
        }

        public final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            s6.e eVar = (s6.e) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f12460b;
            boolean z12 = this.f12461c;
            if ((!z11 && !z12) || eVar.f38844f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((s6.e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton, z12 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton, z12 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.f12460b = false;
            this.f12461c = true;
        }
    }

    public ExtendedFloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }
}
