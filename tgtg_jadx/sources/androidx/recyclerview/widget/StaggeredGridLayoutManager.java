package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends y1 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3[] f3629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f3630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1 f3631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f3634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3635h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BitSet f3637j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y2 f3639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z2 f3643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f3644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w2 f3645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f3647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a0 f3648v;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3636i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3638k = -1;
    public int l = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends RecyclerView.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a3 f3649e;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f3628a = -1;
        this.f3635h = false;
        y2 y2Var = new y2();
        this.f3639m = y2Var;
        this.f3640n = 2;
        this.f3644r = new Rect();
        this.f3645s = new w2(this);
        this.f3646t = true;
        this.f3648v = new a0(this, 2);
        x1 properties = y1.getProperties(context, attributeSet, i11, i12);
        int i13 = properties.f3970a;
        if (i13 != 0 && i13 != 1) {
            i4.a.f("invalid orientation.");
            throw null;
        }
        assertNotInLayoutOrScroll(null);
        if (i13 != this.f3632e) {
            this.f3632e = i13;
            f1 f1Var = this.f3630c;
            this.f3630c = this.f3631d;
            this.f3631d = f1Var;
            requestLayout();
        }
        int i14 = properties.f3971b;
        assertNotInLayoutOrScroll(null);
        if (i14 != this.f3628a) {
            y2Var.a();
            requestLayout();
            this.f3628a = i14;
            this.f3637j = new BitSet(this.f3628a);
            this.f3629b = new a3[this.f3628a];
            for (int i15 = 0; i15 < this.f3628a; i15++) {
                this.f3629b[i15] = new a3(this, i15);
            }
            requestLayout();
        }
        boolean z11 = properties.f3972c;
        assertNotInLayoutOrScroll(null);
        z2 z2Var = this.f3643q;
        if (z2Var != null && z2Var.f3996h != z11) {
            z2Var.f3996h = z11;
        }
        this.f3635h = z11;
        requestLayout();
        s0 s0Var = new s0();
        s0Var.f3903a = true;
        s0Var.f3908f = 0;
        s0Var.f3909g = 0;
        this.f3634g = s0Var;
        this.f3630c = f1.a(this, this.f3632e);
        this.f3631d = f1.a(this, 1 - this.f3632e);
    }

    public static int B(int i11, int i12, int i13) {
        int mode;
        return (!(i12 == 0 && i13 == 0) && ((mode = View.MeasureSpec.getMode(i11)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - i12) - i13), mode) : i11;
    }

    public final void A(a3 a3Var, int i11, int i12) {
        int i13 = a3Var.f3660d;
        int i14 = a3Var.f3661e;
        if (i11 != -1) {
            int i15 = a3Var.f3659c;
            if (i15 == Integer.MIN_VALUE) {
                a3Var.a();
                i15 = a3Var.f3659c;
            }
            if (i15 - i13 >= i12) {
                this.f3637j.set(i14, false);
                return;
            }
            return;
        }
        int i16 = a3Var.f3658b;
        if (i16 == Integer.MIN_VALUE) {
            View view = (View) a3Var.f3657a.get(0);
            a aVar = (a) view.getLayoutParams();
            a3Var.f3658b = a3Var.f3662f.f3630c.e(view);
            aVar.getClass();
            i16 = a3Var.f3658b;
        }
        if (i16 + i13 <= i12) {
            this.f3637j.set(i14, false);
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f3643q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean canScrollHorizontally() {
        return this.f3632e == 0;
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean canScrollVertically() {
        return this.f3632e == 1;
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean checkLayoutParams(RecyclerView.a aVar) {
        return aVar instanceof a;
    }

    @Override // androidx.recyclerview.widget.y1
    public final void collectAdjacentPrefetchPositions(int i11, int i12, n2 n2Var, w1 w1Var) {
        s0 s0Var;
        int iF;
        int iH;
        if (this.f3632e != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        t(i11, n2Var);
        int[] iArr = this.f3647u;
        if (iArr == null || iArr.length < this.f3628a) {
            this.f3647u = new int[this.f3628a];
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f3628a;
            s0Var = this.f3634g;
            if (i13 >= i15) {
                break;
            }
            if (s0Var.f3906d == -1) {
                iF = s0Var.f3908f;
                iH = this.f3629b[i13].h(iF);
            } else {
                iF = this.f3629b[i13].f(s0Var.f3909g);
                iH = s0Var.f3909g;
            }
            int i16 = iF - iH;
            if (i16 >= 0) {
                this.f3647u[i14] = i16;
                i14++;
            }
            i13++;
        }
        Arrays.sort(this.f3647u, 0, i14);
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = s0Var.f3905c;
            if (i18 < 0 || i18 >= n2Var.b()) {
                return;
            }
            ((f0) w1Var).a(s0Var.f3905c, this.f3647u[i17]);
            s0Var.f3905c += s0Var.f3906d;
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeHorizontalScrollExtent(n2 n2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.f3646t;
        return d.b(n2Var, this.f3630c, h(z11), g(z11), this, this.f3646t);
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeHorizontalScrollOffset(n2 n2Var) {
        return e(n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeHorizontalScrollRange(n2 n2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.f3646t;
        return d.d(n2Var, this.f3630c, h(z11), g(z11), this, this.f3646t);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF computeScrollVectorForPosition(int r4) {
        /*
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f3636i
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.k()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f3636i
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f3632e
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.computeScrollVectorForPosition(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeVerticalScrollExtent(n2 n2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.f3646t;
        return d.b(n2Var, this.f3630c, h(z11), g(z11), this, this.f3646t);
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeVerticalScrollOffset(n2 n2Var) {
        return e(n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeVerticalScrollRange(n2 n2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.f3646t;
        return d.d(n2Var, this.f3630c, h(z11), g(z11), this, this.f3646t);
    }

    public final boolean d() {
        int iK;
        if (getChildCount() != 0 && this.f3640n != 0 && isAttachedToWindow()) {
            if (this.f3636i) {
                iK = l();
                k();
            } else {
                iK = k();
                l();
            }
            if (iK == 0 && p() != null) {
                this.f3639m.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int e(n2 n2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.f3646t;
        return d.c(n2Var, this.f3630c, h(z11), g(z11), this, this.f3646t, this.f3636i);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int f(f2 f2Var, s0 s0Var, n2 n2Var) {
        a3 a3Var;
        ?? r32;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i11;
        int i12;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i13 = 0;
        int i14 = 1;
        staggeredGridLayoutManager.f3637j.set(0, staggeredGridLayoutManager.f3628a, true);
        s0 s0Var2 = staggeredGridLayoutManager.f3634g;
        int i15 = s0Var2.f3911i ? s0Var.f3907e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : s0Var.f3907e == 1 ? s0Var.f3909g + s0Var.f3904b : s0Var.f3908f - s0Var.f3904b;
        int i16 = s0Var.f3907e;
        for (int i17 = 0; i17 < staggeredGridLayoutManager.f3628a; i17++) {
            if (!staggeredGridLayoutManager.f3629b[i17].f3657a.isEmpty()) {
                staggeredGridLayoutManager.A(staggeredGridLayoutManager.f3629b[i17], i16, i15);
            }
        }
        boolean z11 = staggeredGridLayoutManager.f3636i;
        f1 f1Var = staggeredGridLayoutManager.f3630c;
        int iG = z11 ? f1Var.g() : f1Var.k();
        boolean z12 = false;
        while (true) {
            int i18 = s0Var.f3905c;
            int i19 = -1;
            if (i18 < 0 || i18 >= n2Var.b() || (!s0Var2.f3911i && staggeredGridLayoutManager.f3637j.isEmpty())) {
                break;
            }
            View viewD = f2Var.d(s0Var.f3905c);
            s0Var.f3905c += s0Var.f3906d;
            a aVar = (a) viewD.getLayoutParams();
            int layoutPosition = aVar.f3624a.getLayoutPosition();
            y2 y2Var = staggeredGridLayoutManager.f3639m;
            int[] iArr = y2Var.f3982a;
            int i21 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i21 == -1) {
                boolean zS = staggeredGridLayoutManager.s(s0Var.f3907e);
                int i22 = staggeredGridLayoutManager.f3628a;
                if (zS) {
                    i12 = i22 - 1;
                    i11 = -1;
                } else {
                    i11 = i14;
                    i19 = i22;
                    i12 = i13;
                }
                int i23 = s0Var.f3907e;
                a3 a3Var2 = null;
                f1 f1Var2 = staggeredGridLayoutManager.f3630c;
                if (i23 == i14) {
                    int iK2 = f1Var2.k();
                    int i24 = Integer.MAX_VALUE;
                    while (i12 != i19) {
                        a3 a3Var3 = staggeredGridLayoutManager.f3629b[i12];
                        int i25 = i11;
                        int iF = a3Var3.f(iK2);
                        if (iF < i24) {
                            a3Var2 = a3Var3;
                            i24 = iF;
                        }
                        i12 += i25;
                        i11 = i25;
                    }
                } else {
                    int i26 = i11;
                    int iG2 = f1Var2.g();
                    int i27 = Integer.MIN_VALUE;
                    while (i12 != i19) {
                        a3 a3Var4 = staggeredGridLayoutManager.f3629b[i12];
                        int iH2 = a3Var4.h(iG2);
                        if (iH2 > i27) {
                            a3Var2 = a3Var4;
                            i27 = iH2;
                        }
                        i12 += i26;
                    }
                }
                a3Var = a3Var2;
                y2Var.b(layoutPosition);
                y2Var.f3982a[layoutPosition] = a3Var.f3661e;
            } else {
                a3Var = staggeredGridLayoutManager.f3629b[i21];
            }
            a3 a3Var5 = a3Var;
            aVar.f3649e = a3Var5;
            if (s0Var.f3907e == 1) {
                staggeredGridLayoutManager.addView(viewD);
                r32 = 0;
            } else {
                r32 = 0;
                staggeredGridLayoutManager.addView(viewD, 0);
            }
            if (staggeredGridLayoutManager.f3632e == 1) {
                staggeredGridLayoutManager.q(viewD, y1.getChildMeasureSpec(staggeredGridLayoutManager.f3633f, staggeredGridLayoutManager.getWidthMode(), r32, ((ViewGroup.MarginLayoutParams) aVar).width, r32), y1.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) aVar).height, true));
            } else {
                staggeredGridLayoutManager.q(viewD, y1.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) aVar).width, true), y1.getChildMeasureSpec(staggeredGridLayoutManager.f3633f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) aVar).height, false));
            }
            if (s0Var.f3907e == 1) {
                iC = a3Var5.f(iG);
                iH = staggeredGridLayoutManager.f3630c.c(viewD) + iC;
            } else {
                iH = a3Var5.h(iG);
                iC = iH - staggeredGridLayoutManager.f3630c.c(viewD);
            }
            int i28 = s0Var.f3907e;
            a3 a3Var6 = aVar.f3649e;
            if (i28 == 1) {
                a3Var6.getClass();
                a aVar2 = (a) viewD.getLayoutParams();
                aVar2.f3649e = a3Var6;
                ArrayList arrayList = a3Var6.f3657a;
                arrayList.add(viewD);
                a3Var6.f3659c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    a3Var6.f3658b = Integer.MIN_VALUE;
                }
                if (aVar2.f3624a.isRemoved() || aVar2.f3624a.isUpdated()) {
                    a3Var6.f3660d = a3Var6.f3662f.f3630c.c(viewD) + a3Var6.f3660d;
                }
            } else {
                a3Var6.getClass();
                a aVar3 = (a) viewD.getLayoutParams();
                aVar3.f3649e = a3Var6;
                ArrayList arrayList2 = a3Var6.f3657a;
                arrayList2.add(0, viewD);
                a3Var6.f3658b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    a3Var6.f3659c = Integer.MIN_VALUE;
                }
                if (aVar3.f3624a.isRemoved() || aVar3.f3624a.isUpdated()) {
                    a3Var6.f3660d = a3Var6.f3662f.f3630c.c(viewD) + a3Var6.f3660d;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f3632e == 1) {
                iC2 = staggeredGridLayoutManager.f3631d.g() - (((staggeredGridLayoutManager.f3628a - 1) - a3Var5.f3661e) * staggeredGridLayoutManager.f3633f);
                iK = iC2 - staggeredGridLayoutManager.f3631d.c(viewD);
            } else {
                iK = staggeredGridLayoutManager.f3631d.k() + (a3Var5.f3661e * staggeredGridLayoutManager.f3633f);
                iC2 = staggeredGridLayoutManager.f3631d.c(viewD) + iK;
            }
            int i29 = iK;
            int i31 = iC2;
            if (staggeredGridLayoutManager.f3632e == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewD, i29, iC, i31, iH);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewD, iC, i29, iH, i31);
            }
            staggeredGridLayoutManager.A(a3Var5, s0Var2.f3907e, i15);
            staggeredGridLayoutManager.u(f2Var, s0Var2);
            if (s0Var2.f3910h && viewD.hasFocusable()) {
                staggeredGridLayoutManager.f3637j.set(a3Var5.f3661e, false);
            }
            z12 = true;
            i14 = 1;
            i13 = 0;
        }
        if (!z12) {
            staggeredGridLayoutManager.u(f2Var, s0Var2);
        }
        int i32 = s0Var2.f3907e;
        f1 f1Var3 = staggeredGridLayoutManager.f3630c;
        int iK3 = i32 == -1 ? staggeredGridLayoutManager.f3630c.k() - staggeredGridLayoutManager.n(f1Var3.k()) : staggeredGridLayoutManager.m(f1Var3.g()) - staggeredGridLayoutManager.f3630c.g();
        if (iK3 > 0) {
            return Math.min(s0Var.f3904b, iK3);
        }
        return 0;
    }

    public final View g(boolean z11) {
        int iK = this.f3630c.k();
        int iG = this.f3630c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.f3630c.e(childAt);
            int iB = this.f3630c.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.y1
    public final RecyclerView.a generateDefaultLayoutParams() {
        return this.f3632e == 0 ? new a(-2, -1) : new a(-1, -2);
    }

    @Override // androidx.recyclerview.widget.y1
    public final RecyclerView.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // androidx.recyclerview.widget.y1
    public final int getColumnCountForAccessibility(f2 f2Var, n2 n2Var) {
        if (this.f3632e == 1) {
            return Math.min(this.f3628a, n2Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int getRowCountForAccessibility(f2 f2Var, n2 n2Var) {
        if (this.f3632e == 0) {
            return Math.min(this.f3628a, n2Var.b());
        }
        return -1;
    }

    public final View h(boolean z11) {
        int iK = this.f3630c.k();
        int iG = this.f3630c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int iE = this.f3630c.e(childAt);
            if (this.f3630c.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void i(f2 f2Var, n2 n2Var, boolean z11) {
        int iG;
        int iM = m(Integer.MIN_VALUE);
        if (iM != Integer.MIN_VALUE && (iG = this.f3630c.g() - iM) > 0) {
            int i11 = iG - (-scrollBy(-iG, f2Var, n2Var));
            if (!z11 || i11 <= 0) {
                return;
            }
            this.f3630c.o(i11);
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean isAutoMeasureEnabled() {
        return this.f3640n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean isLayoutReversed() {
        return this.f3635h;
    }

    public final void j(f2 f2Var, n2 n2Var, boolean z11) {
        int iK;
        int iN = n(Integer.MAX_VALUE);
        if (iN != Integer.MAX_VALUE && (iK = iN - this.f3630c.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, f2Var, n2Var);
            if (!z11 || iScrollBy <= 0) {
                return;
            }
            this.f3630c.o(-iScrollBy);
        }
    }

    public final int k() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int l() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int m(int i11) {
        int iF = this.f3629b[0].f(i11);
        for (int i12 = 1; i12 < this.f3628a; i12++) {
            int iF2 = this.f3629b[i12].f(i11);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int n(int i11) {
        int iH = this.f3629b[0].h(i11);
        for (int i12 = 1; i12 < this.f3628a; i12++) {
            int iH2 = this.f3629b[i12].h(i11);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.f3636i
            if (r0 == 0) goto L9
            int r0 = r9.l()
            goto Ld
        L9:
            int r0 = r9.k()
        Ld:
            r1 = 8
            if (r12 != r1) goto L1b
            if (r10 >= r11) goto L17
            int r2 = r11 + 1
        L15:
            r3 = r10
            goto L1e
        L17:
            int r2 = r10 + 1
            r3 = r11
            goto L1e
        L1b:
            int r2 = r10 + r11
            goto L15
        L1e:
            androidx.recyclerview.widget.y2 r4 = r9.f3639m
            int[] r5 = r4.f3982a
            if (r5 != 0) goto L26
            goto L95
        L26:
            int r5 = r5.length
            if (r3 < r5) goto L2b
            goto L95
        L2b:
            java.util.ArrayList r5 = r4.f3983b
            r6 = -1
            if (r5 != 0) goto L32
        L30:
            r5 = r6
            goto L7d
        L32:
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L38:
            if (r5 < 0) goto L4a
            java.util.ArrayList r7 = r4.f3983b
            java.lang.Object r7 = r7.get(r5)
            androidx.recyclerview.widget.x2 r7 = (androidx.recyclerview.widget.x2) r7
            int r8 = r7.f3974a
            if (r8 != r3) goto L47
            goto L4b
        L47:
            int r5 = r5 + (-1)
            goto L38
        L4a:
            r7 = 0
        L4b:
            if (r7 == 0) goto L52
            java.util.ArrayList r5 = r4.f3983b
            r5.remove(r7)
        L52:
            java.util.ArrayList r5 = r4.f3983b
            int r5 = r5.size()
            r7 = 0
        L59:
            if (r7 >= r5) goto L6b
            java.util.ArrayList r8 = r4.f3983b
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.x2 r8 = (androidx.recyclerview.widget.x2) r8
            int r8 = r8.f3974a
            if (r8 < r3) goto L68
            goto L6c
        L68:
            int r7 = r7 + 1
            goto L59
        L6b:
            r7 = r6
        L6c:
            if (r7 == r6) goto L30
            java.util.ArrayList r5 = r4.f3983b
            java.lang.Object r5 = r5.get(r7)
            androidx.recyclerview.widget.x2 r5 = (androidx.recyclerview.widget.x2) r5
            java.util.ArrayList r8 = r4.f3983b
            r8.remove(r7)
            int r5 = r5.f3974a
        L7d:
            int[] r7 = r4.f3982a
            if (r5 != r6) goto L89
            int r5 = r7.length
            java.util.Arrays.fill(r7, r3, r5, r6)
            int[] r5 = r4.f3982a
            int r5 = r5.length
            goto L95
        L89:
            int r5 = r5 + 1
            int r7 = r7.length
            int r5 = java.lang.Math.min(r5, r7)
            int[] r7 = r4.f3982a
            java.util.Arrays.fill(r7, r3, r5, r6)
        L95:
            r5 = 1
            if (r12 == r5) goto La9
            r6 = 2
            if (r12 == r6) goto La5
            if (r12 == r1) goto L9e
            goto Lac
        L9e:
            r4.d(r10, r5)
            r4.c(r11, r5)
            goto Lac
        La5:
            r4.d(r10, r11)
            goto Lac
        La9:
            r4.c(r10, r11)
        Lac:
            if (r2 > r0) goto Laf
            goto Lc1
        Laf:
            boolean r10 = r9.f3636i
            if (r10 == 0) goto Lb8
            int r10 = r9.k()
            goto Lbc
        Lb8:
            int r10 = r9.l()
        Lbc:
            if (r3 > r10) goto Lc1
            r9.requestLayout()
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.y1
    public final void offsetChildrenHorizontal(int i11) {
        super.offsetChildrenHorizontal(i11);
        for (int i12 = 0; i12 < this.f3628a; i12++) {
            a3 a3Var = this.f3629b[i12];
            int i13 = a3Var.f3658b;
            if (i13 != Integer.MIN_VALUE) {
                a3Var.f3658b = i13 + i11;
            }
            int i14 = a3Var.f3659c;
            if (i14 != Integer.MIN_VALUE) {
                a3Var.f3659c = i14 + i11;
            }
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void offsetChildrenVertical(int i11) {
        super.offsetChildrenVertical(i11);
        for (int i12 = 0; i12 < this.f3628a; i12++) {
            a3 a3Var = this.f3629b[i12];
            int i13 = a3Var.f3658b;
            if (i13 != Integer.MIN_VALUE) {
                a3Var.f3658b = i13 + i11;
            }
            int i14 = a3Var.f3659c;
            if (i14 != Integer.MIN_VALUE) {
                a3Var.f3659c = i14 + i11;
            }
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onAdapterChanged(l1 l1Var, l1 l1Var2) {
        this.f3639m.a();
        for (int i11 = 0; i11 < this.f3628a; i11++) {
            this.f3629b[i11].b();
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onDetachedFromWindow(RecyclerView recyclerView, f2 f2Var) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f3648v);
        for (int i11 = 0; i11 < this.f3628a; i11++) {
            this.f3629b[i11].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    @Override // androidx.recyclerview.widget.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r8, int r9, androidx.recyclerview.widget.f2 r10, androidx.recyclerview.widget.n2 r11) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.f2, androidx.recyclerview.widget.n2):android.view.View");
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewH = h(false);
            View viewG = g(false);
            if (viewH == null || viewG == null) {
                return;
            }
            int position = getPosition(viewH);
            int position2 = getPosition(viewG);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onInitializeAccessibilityNodeInfo(f2 f2Var, n2 n2Var, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(f2Var, n2Var, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.h0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onInitializeAccessibilityNodeInfoForItem(f2 f2Var, n2 n2Var, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof a)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        a3 a3Var = ((a) layoutParams).f3649e;
        if (this.f3632e == 0) {
            accessibilityNodeInfoCompat.k0(i7.e.a(a3Var != null ? a3Var.f3661e : -1, 1, -1, -1, false, false));
        } else {
            accessibilityNodeInfoCompat.k0(i7.e.a(-1, -1, a3Var != null ? a3Var.f3661e : -1, 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        o(i11, i12, 1);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f3639m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        o(i11, i12, 8);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        o(i11, i12, 2);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        o(i11, i12, 4);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onLayoutChildren(f2 f2Var, n2 n2Var) {
        r(f2Var, n2Var, true);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onLayoutCompleted(n2 n2Var) {
        this.f3638k = -1;
        this.l = Integer.MIN_VALUE;
        this.f3643q = null;
        this.f3645s.a();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof z2) {
            z2 z2Var = (z2) parcelable;
            this.f3643q = z2Var;
            if (this.f3638k != -1) {
                z2Var.f3989a = -1;
                z2Var.f3990b = -1;
                z2Var.f3992d = null;
                z2Var.f3991c = 0;
                z2Var.f3993e = 0;
                z2Var.f3994f = null;
                z2Var.f3995g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final Parcelable onSaveInstanceState() {
        int iH;
        int iK;
        int[] iArr;
        z2 z2Var = this.f3643q;
        if (z2Var != null) {
            z2 z2Var2 = new z2();
            z2Var2.f3991c = z2Var.f3991c;
            z2Var2.f3989a = z2Var.f3989a;
            z2Var2.f3990b = z2Var.f3990b;
            z2Var2.f3992d = z2Var.f3992d;
            z2Var2.f3993e = z2Var.f3993e;
            z2Var2.f3994f = z2Var.f3994f;
            z2Var2.f3996h = z2Var.f3996h;
            z2Var2.f3997i = z2Var.f3997i;
            z2Var2.f3998j = z2Var.f3998j;
            z2Var2.f3995g = z2Var.f3995g;
            return z2Var2;
        }
        z2 z2Var3 = new z2();
        z2Var3.f3996h = this.f3635h;
        z2Var3.f3997i = this.f3641o;
        z2Var3.f3998j = this.f3642p;
        y2 y2Var = this.f3639m;
        if (y2Var == null || (iArr = y2Var.f3982a) == null) {
            z2Var3.f3993e = 0;
        } else {
            z2Var3.f3994f = iArr;
            z2Var3.f3993e = iArr.length;
            z2Var3.f3995g = y2Var.f3983b;
        }
        if (getChildCount() <= 0) {
            z2Var3.f3989a = -1;
            z2Var3.f3990b = -1;
            z2Var3.f3991c = 0;
            return z2Var3;
        }
        z2Var3.f3989a = this.f3641o ? l() : k();
        View viewG = this.f3636i ? g(true) : h(true);
        z2Var3.f3990b = viewG != null ? getPosition(viewG) : -1;
        int i11 = this.f3628a;
        z2Var3.f3991c = i11;
        z2Var3.f3992d = new int[i11];
        for (int i12 = 0; i12 < this.f3628a; i12++) {
            boolean z11 = this.f3641o;
            a3[] a3VarArr = this.f3629b;
            if (z11) {
                iH = a3VarArr[i12].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f3630c.g();
                    iH -= iK;
                }
            } else {
                iH = a3VarArr[i12].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f3630c.k();
                    iH -= iK;
                }
            }
            z2Var3.f3992d[i12] = iH;
        }
        return z2Var3;
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onScrollStateChanged(int i11) {
        if (i11 == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View p() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.p():android.view.View");
    }

    public final void q(View view, int i11, int i12) {
        Rect rect = this.f3644r;
        calculateItemDecorationsForChild(view, rect);
        a aVar = (a) view.getLayoutParams();
        int iB = B(i11, ((ViewGroup.MarginLayoutParams) aVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) aVar).rightMargin + rect.right);
        int iB2 = B(i12, ((ViewGroup.MarginLayoutParams) aVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iB, iB2, aVar)) {
            view.measure(iB, iB2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0407  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(androidx.recyclerview.widget.f2 r17, androidx.recyclerview.widget.n2 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r(androidx.recyclerview.widget.f2, androidx.recyclerview.widget.n2, boolean):void");
    }

    public final boolean s(int i11) {
        if (this.f3632e == 0) {
            return (i11 == -1) != this.f3636i;
        }
        return ((i11 == -1) == this.f3636i) == isLayoutRTL();
    }

    public final int scrollBy(int i11, f2 f2Var, n2 n2Var) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        t(i11, n2Var);
        s0 s0Var = this.f3634g;
        int iF = f(f2Var, s0Var, n2Var);
        if (s0Var.f3904b >= iF) {
            i11 = i11 < 0 ? -iF : iF;
        }
        this.f3630c.o(-i11);
        this.f3641o = this.f3636i;
        s0Var.f3904b = 0;
        u(f2Var, s0Var);
        return i11;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int scrollHorizontallyBy(int i11, f2 f2Var, n2 n2Var) {
        return scrollBy(i11, f2Var, n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void scrollToPosition(int i11) {
        z2 z2Var = this.f3643q;
        if (z2Var != null && z2Var.f3989a != i11) {
            z2Var.f3992d = null;
            z2Var.f3991c = 0;
            z2Var.f3989a = -1;
            z2Var.f3990b = -1;
        }
        this.f3638k = i11;
        this.l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.y1
    public final int scrollVerticallyBy(int i11, f2 f2Var, n2 n2Var) {
        return scrollBy(i11, f2Var, n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void setMeasuredDimension(Rect rect, int i11, int i12) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f3632e == 1) {
            iChooseSize2 = y1.chooseSize(i12, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = y1.chooseSize(i11, (this.f3633f * this.f3628a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = y1.chooseSize(i11, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = y1.chooseSize(i12, (this.f3633f * this.f3628a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void smoothScrollToPosition(RecyclerView recyclerView, n2 n2Var, int i11) {
        y0 y0Var = new y0(recyclerView.getContext());
        y0Var.setTargetPosition(i11);
        startSmoothScroll(y0Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean supportsPredictiveItemAnimations() {
        return this.f3643q == null;
    }

    public final void t(int i11, n2 n2Var) {
        int iK;
        int i12;
        if (i11 > 0) {
            iK = l();
            i12 = 1;
        } else {
            iK = k();
            i12 = -1;
        }
        s0 s0Var = this.f3634g;
        s0Var.f3903a = true;
        z(iK, n2Var);
        y(i12);
        s0Var.f3905c = iK + s0Var.f3906d;
        s0Var.f3904b = Math.abs(i11);
    }

    public final void u(f2 f2Var, s0 s0Var) {
        if (!s0Var.f3903a || s0Var.f3911i) {
            return;
        }
        int i11 = s0Var.f3904b;
        int i12 = s0Var.f3907e;
        if (i11 == 0) {
            if (i12 == -1) {
                v(s0Var.f3909g, f2Var);
                return;
            } else {
                w(s0Var.f3908f, f2Var);
                return;
            }
        }
        int i13 = 1;
        if (i12 == -1) {
            int i14 = s0Var.f3908f;
            int iH = this.f3629b[0].h(i14);
            while (i13 < this.f3628a) {
                int iH2 = this.f3629b[i13].h(i14);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i13++;
            }
            int i15 = i14 - iH;
            int iMin = s0Var.f3909g;
            if (i15 >= 0) {
                iMin -= Math.min(i15, s0Var.f3904b);
            }
            v(iMin, f2Var);
            return;
        }
        int i16 = s0Var.f3909g;
        int iF = this.f3629b[0].f(i16);
        while (i13 < this.f3628a) {
            int iF2 = this.f3629b[i13].f(i16);
            if (iF2 < iF) {
                iF = iF2;
            }
            i13++;
        }
        int i17 = iF - s0Var.f3909g;
        int iMin2 = s0Var.f3908f;
        if (i17 >= 0) {
            iMin2 += Math.min(i17, s0Var.f3904b);
        }
        w(iMin2, f2Var);
    }

    public final void v(int i11, f2 f2Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f3630c.e(childAt) < i11 || this.f3630c.n(childAt) < i11) {
                return;
            }
            a aVar = (a) childAt.getLayoutParams();
            aVar.getClass();
            if (aVar.f3649e.f3657a.size() == 1) {
                return;
            }
            a3 a3Var = aVar.f3649e;
            ArrayList arrayList = a3Var.f3657a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            a aVar2 = (a) view.getLayoutParams();
            aVar2.f3649e = null;
            if (aVar2.f3624a.isRemoved() || aVar2.f3624a.isUpdated()) {
                a3Var.f3660d -= a3Var.f3662f.f3630c.c(view);
            }
            if (size == 1) {
                a3Var.f3658b = Integer.MIN_VALUE;
            }
            a3Var.f3659c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, f2Var);
        }
    }

    public final void w(int i11, f2 f2Var) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f3630c.b(childAt) > i11 || this.f3630c.m(childAt) > i11) {
                return;
            }
            a aVar = (a) childAt.getLayoutParams();
            aVar.getClass();
            if (aVar.f3649e.f3657a.size() == 1) {
                return;
            }
            a3 a3Var = aVar.f3649e;
            ArrayList arrayList = a3Var.f3657a;
            View view = (View) arrayList.remove(0);
            a aVar2 = (a) view.getLayoutParams();
            aVar2.f3649e = null;
            if (arrayList.size() == 0) {
                a3Var.f3659c = Integer.MIN_VALUE;
            }
            if (aVar2.f3624a.isRemoved() || aVar2.f3624a.isUpdated()) {
                a3Var.f3660d -= a3Var.f3662f.f3630c.c(view);
            }
            a3Var.f3658b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, f2Var);
        }
    }

    public final void x() {
        if (this.f3632e == 1 || !isLayoutRTL()) {
            this.f3636i = this.f3635h;
        } else {
            this.f3636i = !this.f3635h;
        }
    }

    public final void y(int i11) {
        s0 s0Var = this.f3634g;
        s0Var.f3907e = i11;
        s0Var.f3906d = this.f3636i != (i11 == -1) ? -1 : 1;
    }

    public final void z(int i11, n2 n2Var) {
        int iL;
        int iL2;
        int i12;
        s0 s0Var = this.f3634g;
        boolean z11 = false;
        s0Var.f3904b = 0;
        s0Var.f3905c = i11;
        if (!isSmoothScrolling() || (i12 = n2Var.f3826a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            boolean z12 = this.f3636i;
            boolean z13 = i12 < i11;
            f1 f1Var = this.f3630c;
            if (z12 == z13) {
                iL = f1Var.l();
                iL2 = 0;
            } else {
                iL2 = f1Var.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            s0Var.f3908f = this.f3630c.k() - iL2;
            s0Var.f3909g = this.f3630c.g() + iL;
        } else {
            s0Var.f3909g = this.f3630c.f() + iL;
            s0Var.f3908f = -iL2;
        }
        s0Var.f3910h = false;
        s0Var.f3903a = true;
        if (this.f3630c.i() == 0 && this.f3630c.f() == 0) {
            z11 = true;
        }
        s0Var.f3911i = z11;
    }

    @Override // androidx.recyclerview.widget.y1
    public final RecyclerView.a generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}
