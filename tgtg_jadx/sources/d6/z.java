package d6;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.k1;
import m3.w1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends c5.a implements b0, h7.w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Window f14535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f14536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14537k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14539n;

    public z(Context context, Window window) {
        super(context);
        this.f14535i = window;
        this.f14536j = m3.i.w(x.f14533a);
        ViewCompat.k0(this, this);
        ViewCompat.q0(this, new c6.a(this, 1));
    }

    @Override // c5.a
    public final void a(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1735448596);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            ((Function2) this.f14536j.getValue()).invoke(sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b4.p(this, i11, 5);
        }
    }

    @Override // c5.a
    public final void f(int i11, int i12, int i13, int i14, boolean z11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i15 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i16 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // c5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r13, int r14) {
        /*
            r12 = this;
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.g(r13, r14)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r14)
            r5 = -2
            android.view.Window r6 = r12.f14535i
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L49
            boolean r8 = r12.f14537k
            if (r8 != 0) goto L49
            android.view.WindowManager$LayoutParams r8 = r6.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L49
            boolean r8 = r12.l
            if (r8 == 0) goto L46
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 >= r9) goto L3b
            d6.s r8 = d6.s.f14525a
            int r8 = r8.a(r6)
            goto L4a
        L3b:
            r9 = 32
            if (r8 >= r9) goto L49
            d6.u r8 = d6.u.f14527a
            int r8 = r8.a(r6)
            goto L4a
        L46:
            int r8 = r3 + 1
            goto L4a
        L49:
            r8 = r3
        L4a:
            int r9 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r10 = r10 + r9
            int r9 = r12.getPaddingTop()
            int r11 = r12.getPaddingBottom()
            int r11 = r11 + r9
            int r9 = r2 - r10
            if (r9 >= 0) goto L61
            r9 = r0
        L61:
            int r8 = r8 - r11
            if (r8 >= 0) goto L65
            goto L66
        L65:
            r0 = r8
        L66:
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            if (r8 != 0) goto L6d
            goto L71
        L6d:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L71:
            if (r4 != 0) goto L74
            goto L78
        L74:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
        L78:
            r1.measure(r13, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r7) goto L88
            if (r8 == r13) goto L91
            int r14 = r1.getMeasuredWidth()
            int r2 = r14 + r10
            goto L91
        L88:
            int r14 = r1.getMeasuredWidth()
            int r14 = r14 + r10
            int r2 = java.lang.Math.min(r2, r14)
        L91:
            if (r4 == r7) goto L9d
            if (r4 == r13) goto L9b
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            goto La6
        L9b:
            r13 = r3
            goto La6
        L9d:
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            int r13 = java.lang.Math.min(r3, r13)
        La6:
            r12.setMeasuredDimension(r2, r13)
            boolean r13 = r12.l
            if (r13 != 0) goto Lc7
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            if (r13 <= r3) goto Lc7
            android.view.WindowManager$LayoutParams r13 = r6.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lc7
            r6.addFlags(r7)
            boolean r13 = r12.f14537k
            if (r13 != 0) goto Lc7
            r13 = -1
            r6.setLayout(r13, r13)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.z.g(int, int):void");
    }

    @Override // c5.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f14539n;
    }

    @Override // d6.b0
    public final Window getWindow() {
        return this.f14535i;
    }

    @Override // h7.w
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (!this.l) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return windowInsetsCompat.o(iMax, iMax2, iMax3, iMax4);
            }
        }
        return windowInsetsCompat;
    }

    public final void setContent(@NotNull m3.x xVar, @NotNull Function2<? super m3.n, ? super Integer, Unit> function2) {
        setParentCompositionContext(xVar);
        this.f14536j.setValue(function2);
        this.f14539n = true;
        c();
    }
}
