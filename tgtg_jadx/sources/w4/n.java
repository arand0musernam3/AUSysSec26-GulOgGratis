package w4;

import a3.i3;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f43166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43170f;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(java.util.List r7, a3.i3 r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f43165a = r7
            r6.f43166b = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r8 < r0) goto L19
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L19
            int r8 = r8.getClassification()
            goto L1a
        L19:
            r8 = r1
        L1a:
            r6.f43167c = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L27
            int r8 = r8.getButtonState()
            goto L28
        L27:
            r8 = r1
        L28:
            r6.f43168d = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L35
            int r8 = r8.getMetaState()
            goto L36
        L35:
            r8 = r1
        L36:
            r6.f43169e = r8
            android.view.MotionEvent r8 = r6.a()
            r0 = 3
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L5b
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L59
            if (r7 == r3) goto L57
            if (r7 == r2) goto L55
            switch(r7) {
                case 5: goto L59;
                case 6: goto L57;
                case 7: goto L55;
                case 8: goto L53;
                case 9: goto L51;
                case 10: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L78
        L4f:
            r1 = 5
            goto L78
        L51:
            r1 = 4
            goto L78
        L53:
            r1 = 6
            goto L78
        L55:
            r1 = r0
            goto L78
        L57:
            r1 = r2
            goto L78
        L59:
            r1 = r3
            goto L78
        L5b:
            int r8 = r7.size()
        L5f:
            if (r1 >= r8) goto L55
            java.lang.Object r4 = r7.get(r1)
            w4.v r4 = (w4.v) r4
            boolean r5 = w4.u.d(r4)
            if (r5 == 0) goto L6e
            goto L57
        L6e:
            boolean r4 = w4.u.b(r4)
            if (r4 == 0) goto L75
            goto L59
        L75:
            int r1 = r1 + 1
            goto L5f
        L78:
            r6.f43170f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.n.<init>(java.util.List, a3.i3):void");
    }

    public final MotionEvent a() {
        i3 i3Var = this.f43166b;
        if (i3Var != null) {
            return (MotionEvent) ((ub.a) i3Var.f396c).f40982c;
        }
        return null;
    }
}
