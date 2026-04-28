package l10;

import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.ye;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ye f26769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f26770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public VelocityTracker f26775i;

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i11) {
        z(coordinatorLayout, view, i11, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    @Override // s6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.f26774h
            if (r0 >= 0) goto L12
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.f26774h = r0
        L12:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L42
            boolean r0 = r7.f26771e
            if (r0 == 0) goto L42
            int r0 = r7.f26772f
            if (r0 != r3) goto L26
            goto La8
        L26:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            goto La8
        L2e:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.f26773g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.f26774h
            if (r1 <= r5) goto L42
            r7.f26773g = r0
            return r2
        L42:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto La1
            r7.f26772f = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference r5 = r5.f12233n
            if (r5 == 0) goto L72
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L7a
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L7a
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L7a
        L72:
            boolean r8 = r8.p(r9, r0, r1)
            if (r8 == 0) goto L7a
            r8 = r2
            goto L7b
        L7a:
            r8 = r4
        L7b:
            r7.f26771e = r8
            if (r8 == 0) goto La1
            r7.f26773g = r1
            int r8 = r10.getPointerId(r4)
            r7.f26772f = r8
            android.view.VelocityTracker r8 = r7.f26775i
            if (r8 != 0) goto L91
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.f26775i = r8
        L91:
            android.widget.OverScroller r8 = r7.f26770d
            if (r8 == 0) goto La1
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto La1
            android.widget.OverScroller r8 = r7.f26770d
            r8.abortAnimation()
            return r2
        La1:
            android.view.VelocityTracker r8 = r7.f26775i
            if (r8 == 0) goto La8
            r8.addMovement(r10)
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l10.b.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104 A[ADDED_TO_REGION] */
    @Override // s6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l10.b.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int y();

    public abstract int z(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13);
}
