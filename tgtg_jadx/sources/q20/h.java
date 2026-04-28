package q20;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.app.tgtg.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends g {
    public static final int[] C = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager A;
    public boolean B;

    public h(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q20.h g(android.view.View r7, java.lang.CharSequence r8, int r9) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L73
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = q20.h.C
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            if (r5 == r4) goto L53
            if (r6 == r4) goto L53
            r2 = 2131558698(0x7f0d012a, float:1.874272E38)
            goto L56
        L53:
            r2 = 2131558534(0x7f0d0086, float:1.8742387E38)
        L56:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            q20.h r2 = new q20.h
            r2.<init>(r0, r7, r1, r1)
            q20.f r7 = r2.f35938i
            android.view.View r7 = r7.getChildAt(r3)
            com.google.android.material.snackbar.SnackbarContentLayout r7 = (com.google.android.material.snackbar.SnackbarContentLayout) r7
            android.widget.TextView r7 = r7.getMessageView()
            r7.setText(r8)
            r2.f35940k = r9
            return r2
        L73:
            java.lang.String r7 = "No suitable parent found from the given view. Please provide a valid view."
            i4.a.f(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q20.h.g(android.view.View, java.lang.CharSequence, int):q20.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r9 = this;
            com.google.firebase.messaging.a0 r0 = com.google.firebase.messaging.a0.K()
            android.view.accessibility.AccessibilityManager r1 = r9.A
            int r2 = r9.f35940k
            r3 = 0
            r4 = 4
            r5 = -2
            if (r2 != r5) goto Le
            goto L2a
        Le:
            int r6 = android.os.Build.VERSION.SDK_INT
            boolean r7 = r9.B
            r8 = 29
            if (r6 < r8) goto L22
            if (r7 == 0) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r3
        L1b:
            r5 = r5 | 3
            int r2 = r1.getRecommendedTimeoutMillis(r2, r5)
            goto L2b
        L22:
            if (r7 == 0) goto L2b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L2b
        L2a:
            r2 = r5
        L2b:
            q20.e r1 = r9.f35948t
            java.lang.Object r5 = r0.f12779b
            monitor-enter(r5)
            boolean r6 = r0.R(r1)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L4e
            java.lang.Object r1 = r0.f12781d     // Catch: java.lang.Throwable -> L4c
            q20.i r1 = (q20.i) r1     // Catch: java.lang.Throwable -> L4c
            r1.f35950b = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r2 = r0.f12780c     // Catch: java.lang.Throwable -> L4c
            android.os.Handler r2 = (android.os.Handler) r2     // Catch: java.lang.Throwable -> L4c
            r2.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r0.f12781d     // Catch: java.lang.Throwable -> L4c
            q20.i r1 = (q20.i) r1     // Catch: java.lang.Throwable -> L4c
            r0.W(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            return
        L4c:
            r0 = move-exception
            goto L83
        L4e:
            java.lang.Object r6 = r0.f12782e     // Catch: java.lang.Throwable -> L4c
            q20.i r6 = (q20.i) r6     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L5d
            java.lang.ref.WeakReference r6 = r6.f35949a     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L5d
            r3 = 1
        L5d:
            if (r3 == 0) goto L66
            java.lang.Object r1 = r0.f12782e     // Catch: java.lang.Throwable -> L4c
            q20.i r1 = (q20.i) r1     // Catch: java.lang.Throwable -> L4c
            r1.f35950b = r2     // Catch: java.lang.Throwable -> L4c
            goto L6d
        L66:
            q20.i r3 = new q20.i     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L4c
            r0.f12782e = r3     // Catch: java.lang.Throwable -> L4c
        L6d:
            java.lang.Object r1 = r0.f12781d     // Catch: java.lang.Throwable -> L4c
            q20.i r1 = (q20.i) r1     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L7b
            boolean r1 = r0.A(r1, r4)     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L7b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            return
        L7b:
            r1 = 0
            r0.f12781d = r1     // Catch: java.lang.Throwable -> L4c
            r0.Y()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            return
        L83:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q20.h.h():void");
    }
}
