package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.i;
import androidx.core.app.e;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.braze.h2;
import com.google.android.material.internal.NavigationMenuView;
import e20.b0;
import e20.l;
import e20.x;
import g20.b;
import g20.f;
import g20.k;
import h20.c;
import h20.t;
import h20.u;
import h20.v;
import h20.w;
import j30.g;
import java.util.ArrayList;
import k10.a;
import n20.a0;
import n20.j;
import n20.n;
import n20.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends b0 implements b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f12509y = {R.attr.state_checked};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f12510z = {-16842910};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f12511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f12512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f12514k;
    public i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f12515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a0 f12523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f12524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f12525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f12526x;

    /* JADX WARN: Removed duplicated region for block: B:62:0x018c A[PHI: r9
      0x018c: PHI (r9v3 android.graphics.drawable.Drawable) = 
      (r9v2 android.graphics.drawable.Drawable)
      (r9v7 android.graphics.drawable.Drawable)
      (r9v2 android.graphics.drawable.Drawable)
     binds: [B:54:0x014f, B:60:0x0175, B:58:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.l == null) {
            this.l = new i(getContext());
        }
        return this.l;
    }

    @Override // g20.b
    public final void a(androidx.activity.b bVar) {
        i();
        this.f12524v.f18279f = bVar;
    }

    @Override // g20.b
    public final void b(androidx.activity.b bVar) {
        int i11 = ((DrawerLayout.a) i().second).f3095a;
        k kVar = this.f12524v;
        if (kVar.f18279f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = kVar.f18279f;
        kVar.f18279f = bVar;
        if (bVar2 != null) {
            kVar.d(i11, bVar.a(), bVar.b() == 0);
        }
        if (this.f12521s) {
            this.f12520r = a.c(0, kVar.f18274a.getInterpolation(bVar.a()), this.f12522t);
            h(getWidth(), getHeight());
        }
    }

    @Override // g20.b
    public final void c() {
        Pair pairI = i();
        DrawerLayout drawerLayout = (DrawerLayout) pairI.first;
        k kVar = this.f12524v;
        androidx.activity.b bVar = kVar.f18279f;
        kVar.f18279f = null;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.b(this, true);
            return;
        }
        int i11 = ((DrawerLayout.a) pairI.second).f3095a;
        int i12 = c.f21260a;
        kVar.c(bVar, i11, new h20.b(0, drawerLayout, this), new bg.t(drawerLayout, 4));
    }

    @Override // g20.b
    public final void d() {
        i();
        this.f12524v.b();
        if (!this.f12521s || this.f12520r == 0) {
            return;
        }
        this.f12520r = 0;
        h(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a0 a0Var = this.f12523u;
        Path path = a0Var.f30295e;
        if (!a0Var.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // e20.b0
    public final void e(WindowInsetsCompat windowInsetsCompat) {
        x xVar = this.f12512i;
        xVar.getClass();
        int iL = windowInsetsCompat.l();
        if (xVar.f15723z != iL) {
            xVar.f15723z = iL;
            int i11 = (xVar.f15700b.getChildCount() <= 0 && xVar.f15721x) ? xVar.f15723z : 0;
            NavigationMenuView navigationMenuView = xVar.f15699a;
            navigationMenuView.setPadding(0, i11, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = xVar.f15699a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, windowInsetsCompat.i());
        ViewCompat.e(xVar.f15700b, windowInsetsCompat);
    }

    public final ColorStateList f(int i11) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i11, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = e.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.app.tgtg.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i12 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = f12509y;
        int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
        int[] iArr3 = f12510z;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListB.getColorForState(iArr3, defaultColor), i12, defaultColor});
    }

    public final InsetDrawable g(g gVar, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) gVar.f24503c;
        j jVar = new j(o.a(getContext(), typedArray.getResourceId(18, 0), typedArray.getResourceId(19, 0)).a());
        jVar.t(colorStateList);
        return new InsetDrawable((Drawable) jVar, typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(24, 0), typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(21, 0));
    }

    public k getBackHelper() {
        return this.f12524v;
    }

    public MenuItem getCheckedItem() {
        return this.f12512i.f15703e.f15691b;
    }

    public int getDividerInsetEnd() {
        return this.f12512i.f15717t;
    }

    public int getDividerInsetStart() {
        return this.f12512i.f15716s;
    }

    public int getHeaderCount() {
        return this.f12512i.f15700b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f12512i.f15710m;
    }

    public int getItemHorizontalPadding() {
        return this.f12512i.f15712o;
    }

    public int getItemIconPadding() {
        return this.f12512i.f15714q;
    }

    public ColorStateList getItemIconTintList() {
        return this.f12512i.l;
    }

    public int getItemMaxLines() {
        return this.f12512i.f15722y;
    }

    public ColorStateList getItemTextColor() {
        return this.f12512i.f15709k;
    }

    public int getItemVerticalPadding() {
        return this.f12512i.f15713p;
    }

    @NonNull
    public Menu getMenu() {
        return this.f12511h;
    }

    public int getSubheaderInsetEnd() {
        return this.f12512i.f15719v;
    }

    public int getSubheaderInsetStart() {
        return this.f12512i.f15718u;
    }

    public final void h(int i11, int i12) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.a)) {
            if ((this.f12520r > 0 || this.f12521s) && (getBackground() instanceof j)) {
                boolean z11 = Gravity.getAbsoluteGravity(((DrawerLayout.a) getLayoutParams()).f3095a, getLayoutDirection()) == 3;
                j jVar = (j) getBackground();
                n nVarH = jVar.f30345b.f30318a.h();
                nVarH.b(this.f12520r);
                if (z11) {
                    nVarH.f(0.0f);
                    nVarH.d(0.0f);
                } else {
                    nVarH.g(0.0f);
                    nVarH.e(0.0f);
                }
                o oVarA = nVarH.a();
                jVar.setShapeAppearanceModel(oVarA);
                a0 a0Var = this.f12523u;
                a0Var.f30293c = oVarA;
                a0Var.c();
                a0Var.a(this);
                a0Var.f30294d = new RectF(0.0f, 0.0f, i11, i12);
                a0Var.c();
                a0Var.a(this);
                a0Var.f30292b = true;
                a0Var.a(this);
            }
        }
    }

    public final Pair i() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.a)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.a) layoutParams);
        }
        h2.b("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        return null;
    }

    @Override // e20.b0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ArrayList arrayList;
        super.onAttachedToWindow();
        lx.u.Q(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            f fVar = this.f12525w;
            if (fVar.f18283a != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                t tVar = this.f12526x;
                if (tVar != null && (arrayList = drawerLayout.f3087s) != null) {
                    arrayList.remove(tVar);
                }
                if (tVar != null) {
                    if (drawerLayout.f3087s == null) {
                        drawerLayout.f3087s = new ArrayList();
                    }
                    drawerLayout.f3087s.add(tVar);
                }
                if (DrawerLayout.i(this)) {
                    fVar.a(true);
                }
            }
        }
    }

    @Override // e20.b0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f12515m);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            t tVar = this.f12526x;
            if (tVar != null && (arrayList = drawerLayout.f3087s) != null) {
                arrayList.remove(tVar);
            }
        }
        this.f12525w.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int i13 = this.f12513j;
        if (mode == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), i13), 1073741824);
        } else if (mode == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        super.onRestoreInstanceState(wVar.f45418a);
        this.f12511h.t(wVar.f21361c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        wVar.f21361c = bundle;
        this.f12511h.v(bundle);
        return wVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        h(i11, i12);
    }

    public void setBottomInsetScrimEnabled(boolean z11) {
        this.f12517o = z11;
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f12511h.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            i4.a.f("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        } else {
            this.f12512i.f15703e.b((o.n) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i11) {
        x xVar = this.f12512i;
        xVar.f15717t = i11;
        xVar.a();
    }

    public void setDividerInsetStart(int i11) {
        x xVar = this.f12512i;
        xVar.f15716s = i11;
        xVar.a();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        lx.u.N(this, f11);
    }

    public void setEndInsetScrimEnabled(boolean z11) {
        this.f12519q = z11;
    }

    public void setForceCompatClippingEnabled(boolean z11) {
        a0 a0Var = this.f12523u;
        if (z11 != a0Var.f30291a) {
            a0Var.f30291a = z11;
            a0Var.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        x xVar = this.f12512i;
        xVar.f15710m = drawable;
        xVar.m();
    }

    public void setItemBackgroundResource(int i11) {
        setItemBackground(getContext().getDrawable(i11));
    }

    public void setItemHorizontalPadding(int i11) {
        x xVar = this.f12512i;
        xVar.f15712o = i11;
        xVar.m();
    }

    public void setItemHorizontalPaddingResource(int i11) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i11);
        x xVar = this.f12512i;
        xVar.f15712o = dimensionPixelSize;
        xVar.m();
    }

    public void setItemIconPadding(int i11) {
        x xVar = this.f12512i;
        xVar.f15714q = i11;
        xVar.m();
    }

    public void setItemIconPaddingResource(int i11) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i11);
        x xVar = this.f12512i;
        xVar.f15714q = dimensionPixelSize;
        xVar.m();
    }

    public void setItemIconSize(int i11) {
        x xVar = this.f12512i;
        if (xVar.f15715r != i11) {
            xVar.f15715r = i11;
            xVar.f15720w = true;
            xVar.m();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        x xVar = this.f12512i;
        xVar.l = colorStateList;
        xVar.m();
    }

    public void setItemMaxLines(int i11) {
        x xVar = this.f12512i;
        xVar.f15722y = i11;
        xVar.m();
    }

    public void setItemTextAppearance(int i11) {
        x xVar = this.f12512i;
        xVar.f15707i = i11;
        xVar.m();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        x xVar = this.f12512i;
        xVar.f15708j = z11;
        xVar.m();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        x xVar = this.f12512i;
        xVar.f15709k = colorStateList;
        xVar.m();
    }

    public void setItemVerticalPadding(int i11) {
        x xVar = this.f12512i;
        xVar.f15713p = i11;
        xVar.m();
    }

    public void setItemVerticalPaddingResource(int i11) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i11);
        x xVar = this.f12512i;
        xVar.f15713p = dimensionPixelSize;
        xVar.m();
    }

    @Override // android.view.View
    public void setOverScrollMode(int i11) {
        super.setOverScrollMode(i11);
        x xVar = this.f12512i;
        if (xVar != null) {
            xVar.B = i11;
            NavigationMenuView navigationMenuView = xVar.f15699a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i11);
            }
        }
    }

    public void setStartInsetScrimEnabled(boolean z11) {
        this.f12518p = z11;
    }

    public void setSubheaderInsetEnd(int i11) {
        x xVar = this.f12512i;
        xVar.f15719v = i11;
        xVar.g();
    }

    public void setSubheaderInsetStart(int i11) {
        x xVar = this.f12512i;
        xVar.f15718u = i11;
        xVar.g();
    }

    public void setTopInsetScrimEnabled(boolean z11) {
        this.f12516n = z11;
    }

    public void setCheckedItem(int i11) {
        MenuItem menuItemFindItem = this.f12511h.findItem(i11);
        if (menuItemFindItem != null) {
            this.f12512i.f15703e.b((o.n) menuItemFindItem);
        }
    }

    public void setNavigationItemSelectedListener(v vVar) {
    }

    public NavigationView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.navigationViewStyle);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }
}
