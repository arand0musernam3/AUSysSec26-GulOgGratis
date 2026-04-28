package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.LinearLayoutCompat;
import o.k;
import o.l;
import o.n;
import o.w;
import o.z;
import p.g3;
import p.i;
import p.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements k, z {
    public j A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f1986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f1987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.appcompat.widget.a f1990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w f1991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o.j f1992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1995y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1996z;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends LinearLayoutCompat.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2002f;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f1995y = (int) (56.0f * f11);
        this.f1996z = (int) (f11 * 4.0f);
        this.f1987q = context;
        this.f1988r = 0;
    }

    public static a j() {
        a aVar = new a(-2, -2);
        aVar.f1997a = false;
        ((LinearLayout.LayoutParams) aVar).gravity = 16;
        return aVar;
    }

    public static a k(ViewGroup.LayoutParams layoutParams) {
        a aVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof a) {
            a aVar2 = (a) layoutParams;
            aVar = new a(aVar2);
            aVar.f1997a = aVar2.f1997a;
        } else {
            aVar = new a(layoutParams);
        }
        if (((LinearLayout.LayoutParams) aVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) aVar).gravity = 16;
        }
        return aVar;
    }

    @Override // o.z
    public final void b(l lVar) {
        this.f1986p = lVar;
    }

    @Override // o.k
    public final boolean c(n nVar) {
        return this.f1986p.q(nVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: g */
    public final LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f1986p == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f1986p = lVar;
            lVar.f31548e = new jd.f(this, 18);
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f1990t = aVar;
            aVar.f2130m = true;
            aVar.f2131n = true;
            w aVar2 = this.f1991u;
            if (aVar2 == null) {
                aVar2 = new l50.a(7);
            }
            aVar.f31496e = aVar2;
            this.f1986p.b(aVar, this.f1987q);
            androidx.appcompat.widget.a aVar3 = this.f1990t;
            aVar3.f31499h = this;
            this.f1986p = aVar3.f31494c;
        }
        return this.f1986p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f1990t;
        p.g gVar = aVar.f2128j;
        if (gVar != null) {
            return gVar.getDrawable();
        }
        if (aVar.l) {
            return aVar.f2129k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1988r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i11) {
        boolean zB = false;
        if (i11 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i11 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof i)) {
            zB = ((i) childAt).b();
        }
        return (i11 <= 0 || !(childAt2 instanceof i)) ? zB : ((i) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f1990t;
        if (aVar != null) {
            aVar.b(false);
            if (this.f1990t.m()) {
                this.f1990t.g();
                this.f1990t.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f1990t;
        if (aVar != null) {
            aVar.g();
            p.d dVar = aVar.f2138u;
            if (dVar == null || !dVar.b()) {
                return;
            }
            dVar.f31614i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int width;
        int paddingLeft;
        if (!this.f1993w) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i13 - i11;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean z12 = g3.f33904a;
        boolean z13 = getLayoutDirection() == 1;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.f1997a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z13) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) aVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i21 = i15 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar).leftMargin) + ((LinearLayout.LayoutParams) aVar).rightMargin;
                    l(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i16 / 2) - (measuredWidth2 / 2);
            int i23 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i18 - (i17 ^ 1);
        int iMax = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (z13) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                a aVar2 = (a) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !aVar2.f1997a) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) aVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) aVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            a aVar3 = (a) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !aVar3.f1997a) {
                int i29 = paddingLeft2 + ((LinearLayout.LayoutParams) aVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i31 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i29, i31, i29 + measuredWidth4, measuredHeight4 + i31);
                paddingLeft2 = org.bouncycastle.jcajce.provider.asymmetric.a.C(measuredWidth4, ((LinearLayout.LayoutParams) aVar3).rightMargin, iMax, i29);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        ?? r11;
        int i15;
        int i16;
        l lVar;
        boolean z11 = this.f1993w;
        boolean z12 = View.MeasureSpec.getMode(i11) == 1073741824;
        this.f1993w = z12;
        if (z11 != z12) {
            this.f1994x = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (this.f1993w && (lVar = this.f1986p) != null && size != this.f1994x) {
            this.f1994x = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1993w || childCount <= 0) {
            for (int i17 = 0; i17 < childCount; i17++) {
                a aVar = (a) getChildAt(i17).getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) aVar).leftMargin = 0;
            }
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i11);
        int size3 = View.MeasureSpec.getSize(i12);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingBottom, -2);
        int i18 = size2 - paddingRight;
        int i19 = this.f1995y;
        int i21 = i18 / i19;
        int i22 = i18 % i19;
        if (i21 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i23 = (i22 / i21) + i19;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i24 = 0;
        int iMax2 = 0;
        int i25 = 0;
        boolean z13 = false;
        int i26 = 0;
        long j9 = 0;
        while (true) {
            i13 = this.f1996z;
            if (i25 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i25);
            int i27 = size3;
            int i28 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i15 = i23;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                i24++;
                if (z14) {
                    childAt.setPadding(i13, 0, i13, 0);
                }
                a aVar2 = (a) childAt.getLayoutParams();
                aVar2.f2002f = false;
                aVar2.f1999c = 0;
                aVar2.f1998b = 0;
                aVar2.f2000d = false;
                ((LinearLayout.LayoutParams) aVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) aVar2).rightMargin = 0;
                aVar2.f2001e = z14 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i29 = aVar2.f1997a ? 1 : i21;
                a aVar3 = (a) childAt.getLayoutParams();
                int i31 = i21;
                i15 = i23;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i28, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z16 = z15;
                if (i29 <= 0 || (z15 && i29 < 2)) {
                    i16 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i29, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i16 = measuredWidth / i15;
                    if (measuredWidth % i15 != 0) {
                        i16++;
                    }
                    if (z16 && i16 < 2) {
                        i16 = 2;
                    }
                }
                aVar3.f2000d = !aVar3.f1997a && z16;
                aVar3.f1998b = i16;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i15, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i16);
                if (aVar2.f2000d) {
                    i26++;
                }
                if (aVar2.f1997a) {
                    z13 = true;
                }
                i21 = i31 - i16;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i16 == 1) {
                    j9 |= (long) (1 << i25);
                }
            }
            i25++;
            size3 = i27;
            paddingBottom = i28;
            i23 = i15;
        }
        int i32 = size3;
        int i33 = i21;
        int i34 = i23;
        boolean z17 = z13 && i24 == 2;
        int i35 = i33;
        boolean z18 = false;
        while (i26 > 0 && i35 > 0) {
            int i36 = Integer.MAX_VALUE;
            long j11 = 0;
            int i37 = 0;
            int i38 = 0;
            while (i38 < childCount2) {
                int i39 = iMax;
                a aVar4 = (a) getChildAt(i38).getLayoutParams();
                boolean z19 = z17;
                if (aVar4.f2000d) {
                    int i41 = aVar4.f1998b;
                    if (i41 < i36) {
                        j11 = 1 << i38;
                        i36 = i41;
                        i37 = 1;
                    } else if (i41 == i36) {
                        j11 |= 1 << i38;
                        i37++;
                    }
                }
                i38++;
                z17 = z19;
                iMax = i39;
            }
            i14 = iMax;
            boolean z21 = z17;
            j9 |= j11;
            if (i37 > i35) {
                break;
            }
            int i42 = i36 + 1;
            int i43 = 0;
            while (i43 < childCount2) {
                View childAt2 = getChildAt(i43);
                a aVar5 = (a) childAt2.getLayoutParams();
                boolean z22 = z13;
                long j12 = 1 << i43;
                if ((j11 & j12) != 0) {
                    if (z21 && aVar5.f2001e) {
                        r11 = 1;
                        r11 = 1;
                        if (i35 == 1) {
                            childAt2.setPadding(i13 + i34, 0, i13, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    aVar5.f1998b += r11;
                    aVar5.f2002f = r11;
                    i35--;
                } else if (aVar5.f1998b == i42) {
                    j9 |= j12;
                }
                i43++;
                z13 = z22;
            }
            z17 = z21;
            iMax = i14;
            z18 = true;
        }
        i14 = iMax;
        boolean z23 = !z13 && i24 == 1;
        if (i35 > 0 && j9 != 0 && (i35 < i24 - 1 || z23 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j9);
            if (!z23) {
                if ((j9 & 1) != 0 && !((a) getChildAt(0).getLayoutParams()).f2001e) {
                    fBitCount -= 0.5f;
                }
                int i44 = childCount2 - 1;
                if ((j9 & ((long) (1 << i44))) != 0 && !((a) getChildAt(i44).getLayoutParams()).f2001e) {
                    fBitCount -= 0.5f;
                }
            }
            int i45 = fBitCount > 0.0f ? (int) ((i35 * i34) / fBitCount) : 0;
            boolean z24 = z18;
            for (int i46 = 0; i46 < childCount2; i46++) {
                if ((j9 & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    a aVar6 = (a) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        aVar6.f1999c = i45;
                        aVar6.f2002f = true;
                        if (i46 == 0 && !aVar6.f2001e) {
                            ((LinearLayout.LayoutParams) aVar6).leftMargin = (-i45) / 2;
                        }
                        z24 = true;
                    } else if (aVar6.f1997a) {
                        aVar6.f1999c = i45;
                        aVar6.f2002f = true;
                        ((LinearLayout.LayoutParams) aVar6).rightMargin = (-i45) / 2;
                        z24 = true;
                    } else {
                        if (i46 != 0) {
                            ((LinearLayout.LayoutParams) aVar6).leftMargin = i45 / 2;
                        }
                        if (i46 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) aVar6).rightMargin = i45 / 2;
                        }
                    }
                }
            }
            z18 = z24;
        }
        if (z18) {
            for (int i47 = 0; i47 < childCount2; i47++) {
                View childAt4 = getChildAt(i47);
                a aVar7 = (a) childAt4.getLayoutParams();
                if (aVar7.f2002f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((aVar7.f1998b * i34) + aVar7.f1999c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i18, mode != 1073741824 ? i14 : i32);
    }

    public void setExpandedActionViewsExclusive(boolean z11) {
        this.f1990t.f2135r = z11;
    }

    public void setMenuCallbacks(w wVar, o.j jVar) {
        this.f1991u = wVar;
        this.f1992v = jVar;
    }

    public void setOnMenuItemClickListener(j jVar) {
        this.A = jVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f1990t;
        p.g gVar = aVar.f2128j;
        if (gVar != null) {
            gVar.setImageDrawable(drawable);
        } else {
            aVar.l = true;
            aVar.f2129k = drawable;
        }
    }

    public void setOverflowReserved(boolean z11) {
        this.f1989s = z11;
    }

    public void setPopupTheme(int i11) {
        if (this.f1988r != i11) {
            this.f1988r = i11;
            if (i11 == 0) {
                this.f1987q = getContext();
            } else {
                this.f1987q = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f1990t = aVar;
        aVar.f31499h = this;
        this.f1986p = aVar.f31494c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }
}
