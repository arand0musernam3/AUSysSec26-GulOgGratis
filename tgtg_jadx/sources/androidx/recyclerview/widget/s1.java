package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j1 f3912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f3913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3917f;

    public static void b(r2 r2Var) {
        int i11 = r2Var.mFlags;
        if (!r2Var.isInvalid() && (i11 & 4) == 0) {
            r2Var.getOldPosition();
            r2Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(r2 r2Var, r2 r2Var2, r1 r1Var, r1 r1Var2);

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.recyclerview.widget.r2 r11) {
        /*
            r10 = this;
            androidx.recyclerview.widget.j1 r0 = r10.f3912a
            if (r0 == 0) goto Laa
            androidx.recyclerview.widget.RecyclerView r0 = r0.f3791a
            r1 = 1
            r11.setIsRecyclable(r1)
            androidx.recyclerview.widget.r2 r2 = r11.mShadowedHolder
            r3 = 0
            if (r2 == 0) goto L15
            androidx.recyclerview.widget.r2 r2 = r11.mShadowingHolder
            if (r2 != 0) goto L15
            r11.mShadowedHolder = r3
        L15:
            r11.mShadowingHolder = r3
            boolean r2 = r11.shouldBeKeptAsChild()
            if (r2 != 0) goto Laa
            android.view.View r2 = r11.itemView
            androidx.recyclerview.widget.f2 r3 = r0.f3579c
            r0.n0()
            androidx.recyclerview.widget.k r4 = r0.f3582f
            androidx.recyclerview.widget.j r5 = r4.f3794b
            androidx.recyclerview.widget.j1 r6 = r4.f3793a
            int r7 = r4.f3796d
            r8 = 0
            if (r7 != r1) goto L3b
            android.view.View r1 = r4.f3797e
            if (r1 != r2) goto L35
        L33:
            r1 = r8
            goto L64
        L35:
            java.lang.String r11 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            com.braze.h2.b(r11)
            return
        L3b:
            r9 = 2
            if (r7 == r9) goto La5
            r4.f3796d = r9     // Catch: java.lang.Throwable -> L4f
            androidx.recyclerview.widget.RecyclerView r7 = r6.f3791a     // Catch: java.lang.Throwable -> L4f
            int r7 = r7.indexOfChild(r2)     // Catch: java.lang.Throwable -> L4f
            r9 = -1
            if (r7 != r9) goto L51
            r4.l(r2)     // Catch: java.lang.Throwable -> L4f
        L4c:
            r4.f3796d = r8
            goto L64
        L4f:
            r11 = move-exception
            goto La2
        L51:
            boolean r9 = r5.e(r7)     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L61
            r5.h(r7)     // Catch: java.lang.Throwable -> L4f
            r4.l(r2)     // Catch: java.lang.Throwable -> L4f
            r6.k(r7)     // Catch: java.lang.Throwable -> L4f
            goto L4c
        L61:
            r4.f3796d = r8
            goto L33
        L64:
            if (r1 == 0) goto L8f
            androidx.recyclerview.widget.r2 r4 = androidx.recyclerview.widget.RecyclerView.O(r2)
            r3.m(r4)
            r3.j(r4)
            boolean r3 = androidx.recyclerview.widget.RecyclerView.J1
            if (r3 == 0) goto L8f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "after removing animated view: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L8f:
            r2 = r1 ^ 1
            r0.p0(r2)
            if (r1 != 0) goto Laa
            boolean r1 = r11.isTmpDetached()
            if (r1 == 0) goto Laa
            android.view.View r11 = r11.itemView
            r0.removeDetachedView(r11, r8)
            return
        La2:
            r4.f3796d = r8
            throw r11
        La5:
            java.lang.String r11 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            com.braze.h2.b(r11)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.s1.c(androidx.recyclerview.widget.r2):void");
    }

    public abstract void d(r2 r2Var);

    public abstract void e();

    public abstract boolean f();
}
