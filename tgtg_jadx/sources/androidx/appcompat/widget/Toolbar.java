package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.i;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import b0.a0;
import com.app.tgtg.R;
import e20.m;
import h7.p;
import h7.r;
import java.util.ArrayList;
import java.util.Iterator;
import o.j;
import o.l;
import o.n;
import o.w;
import p.a3;
import p.b1;
import p.c3;
import p.e2;
import p.g3;
import p.x2;
import p.y2;
import p.z2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements p {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final r G;
    public ArrayList H;
    public z2 I;
    public final jb.b J;
    public h K;
    public androidx.appcompat.widget.a L;
    public g M;
    public w N;
    public j O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher T;
    public boolean V;
    public final a8.f W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f2098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatTextView f2099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatTextView f2100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatImageButton f2101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatImageView f2102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f2103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f2104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AppCompatImageButton f2105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f2106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f2107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2108k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e2 f2116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2119w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f2120x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f2121y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f2122z;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ActionBar.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2123b;

        public a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2123b = 0;
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2119w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new r(new x2(this, 1));
        this.H = new ArrayList();
        this.J = new jb.b(this);
        this.W = new a8.f(this, 10);
        Context context2 = getContext();
        int[] iArr = j.a.f24277z;
        j30.g gVarT = j30.g.t(context2, attributeSet, iArr, i11);
        ViewCompat.a0(this, context, iArr, attributeSet, (TypedArray) gVarT.f24503c, i11, 0);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        this.l = typedArray.getResourceId(28, 0);
        this.f2109m = typedArray.getResourceId(19, 0);
        this.f2119w = typedArray.getInteger(0, 8388627);
        this.f2110n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2115s = dimensionPixelOffset;
        this.f2114r = dimensionPixelOffset;
        this.f2113q = dimensionPixelOffset;
        this.f2112p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2112p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2113q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2114r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2115s = dimensionPixelOffset5;
        }
        this.f2111o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        e2 e2Var = this.f2116t;
        e2Var.f33891h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            e2Var.f33888e = dimensionPixelSize;
            e2Var.f33884a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            e2Var.f33889f = dimensionPixelSize2;
            e2Var.f33885b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            e2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2117u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2118v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f2103f = gVarT.k(4);
        this.f2104g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2107j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableK = gVarT.k(16);
        if (drawableK != null) {
            setNavigationIcon(drawableK);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableK2 = gVarT.k(11);
        if (drawableK2 != null) {
            setLogo(drawableK2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(gVarT.j(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(gVarT.j(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        gVarT.v();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i11 = 0; i11 < menu.size(); i11++) {
            arrayList.add(menu.getItem(i11));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i(getContext());
    }

    public static a h() {
        a aVar = new a(-2, -2);
        aVar.f2123b = 0;
        aVar.f1765a = 8388627;
        return aVar;
    }

    public static a i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            a aVar = (a) layoutParams;
            a aVar2 = new a(aVar);
            aVar2.f2123b = 0;
            aVar2.f2123b = aVar.f2123b;
            return aVar2;
        }
        if (layoutParams instanceof ActionBar.a) {
            a aVar3 = new a((ActionBar.a) layoutParams);
            aVar3.f2123b = 0;
            return aVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            a aVar4 = new a(layoutParams);
            aVar4.f2123b = 0;
            return aVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        a aVar5 = new a(marginLayoutParams);
        aVar5.f2123b = 0;
        ((ViewGroup.MarginLayoutParams) aVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) aVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) aVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) aVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return aVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i11, ArrayList arrayList) {
        boolean z11 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
        arrayList.clear();
        if (!z11) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.f2123b == 0 && u(childAt)) {
                    int i13 = aVar.f1765a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i14 = childCount - 1; i14 >= 0; i14--) {
            View childAt2 = getChildAt(i14);
            a aVar2 = (a) childAt2.getLayoutParams();
            if (aVar2.f2123b == 0 && u(childAt2)) {
                int i15 = aVar2.f1765a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i15, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // h7.p
    public final void addMenuProvider(MenuProvider menuProvider) {
        r rVar = this.G;
        rVar.f21615b.add(menuProvider);
        rVar.f21614a.run();
    }

    public final void b(View view, boolean z11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a aVarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (a) layoutParams;
        aVarH.f2123b = 1;
        if (!z11 || this.f2106i == null) {
            addView(view, aVarH);
        } else {
            view.setLayoutParams(aVarH);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.f2105h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f2105h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f2103f);
            this.f2105h.setContentDescription(this.f2104g);
            a aVarH = h();
            aVarH.f1765a = (this.f2110n & 112) | 8388611;
            aVarH.f2123b = 2;
            this.f2105h.setLayoutParams(aVarH);
            this.f2105h.setOnClickListener(new m(this, 4));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a);
    }

    public final void d() {
        if (this.f2116t == null) {
            e2 e2Var = new e2();
            e2Var.f33884a = 0;
            e2Var.f33885b = 0;
            e2Var.f33886c = Integer.MIN_VALUE;
            e2Var.f33887d = Integer.MIN_VALUE;
            e2Var.f33888e = 0;
            e2Var.f33889f = 0;
            e2Var.f33890g = false;
            e2Var.f33891h = false;
            this.f2116t = e2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f2098a;
        if (actionMenuView.f1986p == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new g(this);
            }
            this.f2098a.setExpandedActionViewsExclusive(true);
            lVar.b(this.M, this.f2107j);
            w();
        }
    }

    public final void f() {
        if (this.f2098a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f2098a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2108k);
            this.f2098a.setOnMenuItemClickListener(this.J);
            this.f2098a.setMenuCallbacks(this.N, new m1.a(this));
            a aVarH = h();
            aVarH.f1765a = (this.f2110n & 112) | 8388613;
            this.f2098a.setLayoutParams(aVarH);
            b(this.f2098a, false);
        }
    }

    public final void g() {
        if (this.f2101d == null) {
            this.f2101d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            a aVarH = h();
            aVarH.f1765a = (this.f2110n & 112) | 8388611;
            this.f2101d.setLayoutParams(aVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f2105h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f2105h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        e2 e2Var = this.f2116t;
        if (e2Var != null) {
            return e2Var.f33890g ? e2Var.f33884a : e2Var.f33885b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i11 = this.f2118v;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        e2 e2Var = this.f2116t;
        if (e2Var != null) {
            return e2Var.f33884a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        e2 e2Var = this.f2116t;
        if (e2Var != null) {
            return e2Var.f33885b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        e2 e2Var = this.f2116t;
        if (e2Var != null) {
            return e2Var.f33890g ? e2Var.f33885b : e2Var.f33884a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i11 = this.f2117u;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f2098a;
        return (actionMenuView == null || (lVar = actionMenuView.f1986p) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f2118v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2117u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f2102e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f2102e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2098a.getMenu();
    }

    public View getNavButtonView() {
        return this.f2101d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f2101d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f2101d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2098a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2107j;
    }

    public int getPopupTheme() {
        return this.f2108k;
    }

    public CharSequence getSubtitle() {
        return this.f2121y;
    }

    public final TextView getSubtitleTextView() {
        return this.f2100c;
    }

    public CharSequence getTitle() {
        return this.f2120x;
    }

    public int getTitleMarginBottom() {
        return this.f2115s;
    }

    public int getTitleMarginEnd() {
        return this.f2113q;
    }

    public int getTitleMarginStart() {
        return this.f2112p;
    }

    public int getTitleMarginTop() {
        return this.f2114r;
    }

    public final TextView getTitleTextView() {
        return this.f2099b;
    }

    public b1 getWrapper() {
        if (this.K == null) {
            this.K = new h(this, true);
        }
        return this.K;
    }

    public final int j(int i11, View view) {
        a aVar = (a) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = i11 > 0 ? (measuredHeight - i11) / 2 : 0;
        int i13 = aVar.f1765a & 112;
        if (i13 != 16 && i13 != 48 && i13 != 80) {
            i13 = this.f2119w & 112;
        }
        if (i13 == 48) {
            return getPaddingTop() - i12;
        }
        if (i13 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin) - i12;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
        if (iMax < i14) {
            iMax = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i16 = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            if (i15 < i16) {
                iMax = Math.max(0, iMax - (i16 - i15));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i11) {
        getMenuInflater().inflate(i11, getMenu());
    }

    public final void n() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.G.f21615b.iterator();
        while (it2.hasNext()) {
            ((MenuProvider) it2.next()).c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.W);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0283 A[LOOP:0: B:107:0x0281->B:108:0x0283, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029b A[LOOP:1: B:110:0x0299->B:111:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bb A[LOOP:2: B:113:0x02b9->B:114:0x02bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030e A[LOOP:3: B:122:0x030c->B:123:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        char c3;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z11 = g3.f33904a;
        int i13 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c3 = 0;
        } else {
            c3 = 1;
            objArr = false;
        }
        if (u(this.f2101d)) {
            t(this.f2101d, i11, 0, i12, this.f2111o);
            iK = k(this.f2101d) + this.f2101d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f2101d) + this.f2101d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2101d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.f2105h)) {
            t(this.f2105h, i11, 0, i12, this.f2111o);
            iK = k(this.f2105h) + this.f2105h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f2105h) + this.f2105h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2105h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.F;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (u(this.f2098a)) {
            t(this.f2098a, i11, iMax3, i12, this.f2111o);
            iK2 = k(this.f2098a) + this.f2098a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f2098a) + this.f2098a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2098a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c3] = Math.max(0, currentContentInsetEnd - iK2);
        if (u(this.f2106i)) {
            iMax5 += s(this.f2106i, i11, iMax5, i12, 0, iArr);
            iMax = Math.max(iMax, l(this.f2106i) + this.f2106i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2106i.getMeasuredState());
        }
        if (u(this.f2102e)) {
            iMax5 += s(this.f2102e, i11, iMax5, i12, 0, iArr);
            iMax = Math.max(iMax, l(this.f2102e) + this.f2102e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2102e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((a) childAt.getLayoutParams()).f2123b == 0 && u(childAt)) {
                iMax5 += s(childAt, i11, iMax5, i12, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i15 = iMax5;
        int i16 = this.f2114r + this.f2115s;
        int i17 = this.f2112p + this.f2113q;
        if (u(this.f2099b)) {
            s(this.f2099b, i11, i15 + i17, i12, i16, iArr);
            int iK3 = k(this.f2099b) + this.f2099b.getMeasuredWidth();
            iL = l(this.f2099b) + this.f2099b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2099b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.f2100c)) {
            iMax2 = Math.max(iMax2, s(this.f2100c, i11, i15 + i17, i12, i16 + iL, iArr));
            iL += l(this.f2100c) + this.f2100c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2100c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i15 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i11, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i12, iCombineMeasuredStates2 << 16);
        if (!this.P) {
            i13 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            View childAt2 = getChildAt(i18);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i13 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i13);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof a3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a3 a3Var = (a3) parcelable;
        super.onRestoreInstanceState(a3Var.f45418a);
        ActionMenuView actionMenuView = this.f2098a;
        l lVar = actionMenuView != null ? actionMenuView.f1986p : null;
        int i11 = a3Var.f33852c;
        if (i11 != 0 && this.M != null && lVar != null && (menuItemFindItem = lVar.findItem(i11)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (a3Var.f33853d) {
            a8.f fVar = this.W;
            removeCallbacks(fVar);
            post(fVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        d();
        e2 e2Var = this.f2116t;
        boolean z11 = i11 == 1;
        if (z11 == e2Var.f33890g) {
            return;
        }
        e2Var.f33890g = z11;
        if (!e2Var.f33891h) {
            e2Var.f33884a = e2Var.f33888e;
            e2Var.f33885b = e2Var.f33889f;
            return;
        }
        if (z11) {
            int i12 = e2Var.f33887d;
            if (i12 == Integer.MIN_VALUE) {
                i12 = e2Var.f33888e;
            }
            e2Var.f33884a = i12;
            int i13 = e2Var.f33886c;
            if (i13 == Integer.MIN_VALUE) {
                i13 = e2Var.f33889f;
            }
            e2Var.f33885b = i13;
            return;
        }
        int i14 = e2Var.f33886c;
        if (i14 == Integer.MIN_VALUE) {
            i14 = e2Var.f33888e;
        }
        e2Var.f33884a = i14;
        int i15 = e2Var.f33887d;
        if (i15 == Integer.MIN_VALUE) {
            i15 = e2Var.f33889f;
        }
        e2Var.f33885b = i15;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        n nVar;
        a3 a3Var = new a3(super.onSaveInstanceState());
        g gVar = this.M;
        if (gVar != null && (nVar = gVar.f2155b) != null) {
            a3Var.f33852c = nVar.f31570a;
        }
        a3Var.f33853d = p();
        return a3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final boolean p() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f2098a;
        return (actionMenuView == null || (aVar = actionMenuView.f1990t) == null || !aVar.m()) ? false : true;
    }

    public final int q(View view, int i11, int i12, int[] iArr) {
        a aVar = (a) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i13) + i11;
        iArr[0] = Math.max(0, -i13);
        int iJ = j(i12, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + iMax;
    }

    public final int r(View view, int i11, int i12, int[] iArr) {
        a aVar = (a) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin - iArr[1];
        int iMax = i11 - Math.max(0, i13);
        iArr[1] = Math.max(0, -i13);
        int iJ = j(i12, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).leftMargin);
    }

    @Override // h7.p
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.G.a(menuProvider);
    }

    public final int s(View view, int i11, int i12, int i13, int i14, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i15 = marginLayoutParams.leftMargin - iArr[0];
        int i16 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i16) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i15);
        iArr[1] = Math.max(0, -i16);
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + iMax + i12, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z11) {
        if (this.V != z11) {
            this.V = z11;
            w();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f2105h;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2105h.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f2105h;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f2103f);
            }
        }
    }

    public void setCollapsible(boolean z11) {
        this.P = z11;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f2118v) {
            this.f2118v = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f2117u) {
            this.f2117u = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i11, int i12) {
        d();
        e2 e2Var = this.f2116t;
        e2Var.f33891h = false;
        if (i11 != Integer.MIN_VALUE) {
            e2Var.f33888e = i11;
            e2Var.f33884a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            e2Var.f33889f = i12;
            e2Var.f33885b = i12;
        }
    }

    public void setContentInsetsRelative(int i11, int i12) {
        d();
        this.f2116t.a(i11, i12);
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.f2102e;
        if (drawable != null) {
            if (appCompatImageView == null) {
                this.f2102e = new AppCompatImageView(getContext());
            }
            if (!o(this.f2102e)) {
                b(this.f2102e, true);
            }
        } else if (appCompatImageView != null && o(appCompatImageView)) {
            removeView(this.f2102e);
            this.E.remove(this.f2102e);
        }
        AppCompatImageView appCompatImageView2 = this.f2102e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2102e == null) {
            this.f2102e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f2102e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(l lVar, androidx.appcompat.widget.a aVar) {
        if (lVar == null && this.f2098a == null) {
            return;
        }
        f();
        l lVar2 = this.f2098a.f1986p;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(this.L);
            lVar2.r(this.M);
        }
        if (this.M == null) {
            this.M = new g(this);
        }
        aVar.f2135r = true;
        Context context = this.f2107j;
        if (lVar != null) {
            lVar.b(aVar, context);
            lVar.b(this.M, this.f2107j);
        } else {
            aVar.c(context, null);
            this.M.c(this.f2107j, null);
            aVar.b(true);
            this.M.b(true);
        }
        this.f2098a.setPopupTheme(this.f2108k);
        this.f2098a.setPresenter(aVar);
        this.L = aVar;
        w();
    }

    public void setMenuCallbacks(w wVar, j jVar) {
        this.N = wVar;
        this.O = jVar;
        ActionMenuView actionMenuView = this.f2098a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(wVar, jVar);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f2101d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            c3.a(this.f2101d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f2101d)) {
                b(this.f2101d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f2101d;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.f2101d);
                this.E.remove(this.f2101d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f2101d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f2101d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(z2 z2Var) {
        this.I = z2Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2098a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i11) {
        if (this.f2108k != i11) {
            this.f2108k = i11;
            if (i11 == 0) {
                this.f2107j = getContext();
            } else {
                this.f2107j = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.f2100c;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f2100c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f2100c.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.f2109m;
                if (i11 != 0) {
                    this.f2100c.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f2100c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f2100c)) {
                b(this.f2100c, true);
            }
        } else if (appCompatTextView != null && o(appCompatTextView)) {
            removeView(this.f2100c);
            this.E.remove(this.f2100c);
        }
        AppCompatTextView appCompatTextView3 = this.f2100c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f2121y = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int i11) {
        this.f2109m = i11;
        AppCompatTextView appCompatTextView = this.f2100c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i11);
        }
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.f2100c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.f2099b;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f2099b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f2099b.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.l;
                if (i11 != 0) {
                    this.f2099b.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.f2122z;
                if (colorStateList != null) {
                    this.f2099b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f2099b)) {
                b(this.f2099b, true);
            }
        } else if (appCompatTextView != null && o(appCompatTextView)) {
            removeView(this.f2099b);
            this.E.remove(this.f2099b);
        }
        AppCompatTextView appCompatTextView3 = this.f2099b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f2120x = charSequence;
    }

    public void setTitleMargin(int i11, int i12, int i13, int i14) {
        this.f2112p = i11;
        this.f2114r = i12;
        this.f2113q = i13;
        this.f2115s = i14;
        requestLayout();
    }

    public void setTitleMarginBottom(int i11) {
        this.f2115s = i11;
        requestLayout();
    }

    public void setTitleMarginEnd(int i11) {
        this.f2113q = i11;
        requestLayout();
    }

    public void setTitleMarginStart(int i11) {
        this.f2112p = i11;
        requestLayout();
    }

    public void setTitleMarginTop(int i11) {
        this.f2114r = i11;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i11) {
        this.l = i11;
        AppCompatTextView appCompatTextView = this.f2099b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i11);
        }
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f2122z = colorStateList;
        AppCompatTextView appCompatTextView = this.f2099b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final void t(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f2098a;
        return (actionMenuView == null || (aVar = actionMenuView.f1990t) == null || !aVar.n()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = y2.a(this);
            g gVar = this.M;
            boolean z11 = (gVar == null || gVar.f2155b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.V) ? false : true;
            if (z11 && this.T == null) {
                if (this.Q == null) {
                    this.Q = y2.b(new x2(this, 0));
                }
                y2.c(onBackInvokedDispatcherA, this.Q);
                this.T = onBackInvokedDispatcherA;
                return;
            }
            if (z11 || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            y2.d(onBackInvokedDispatcher, this.Q);
            this.T = null;
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setSubtitleTextColor(int i11) {
        setSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setTitleTextColor(int i11) {
        setTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setCollapseContentDescription(int i11) {
        setCollapseContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setCollapseIcon(int i11) {
        setCollapseIcon(a0.x(getContext(), i11));
    }

    public void setNavigationContentDescription(int i11) {
        setNavigationContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setLogoDescription(int i11) {
        setLogoDescription(getContext().getText(i11));
    }

    public void setNavigationIcon(int i11) {
        setNavigationIcon(a0.x(getContext(), i11));
    }

    public void setLogo(int i11) {
        setLogo(a0.x(getContext(), i11));
    }

    public void setSubtitle(int i11) {
        setSubtitle(getContext().getText(i11));
    }

    public void setTitle(int i11) {
        setTitle(getContext().getText(i11));
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }
}
