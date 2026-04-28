package m0;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f28613a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, x0 x0Var) {
        super(context);
        this.f28613a = x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0054  */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOrientationChanged(int r4) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L5
            goto L87
        L5:
            m0.x0 r1 = r3.f28613a
            int r2 = r1.f28637d
            if (r2 != r0) goto L27
            r0 = 45
            if (r4 < 0) goto L12
            if (r4 >= r0) goto L12
            goto L36
        L12:
            r1 = 135(0x87, float:1.89E-43)
            if (r0 > r4) goto L19
            if (r4 >= r1) goto L19
            goto L40
        L19:
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 > r4) goto L20
            if (r4 >= r0) goto L20
            goto L4a
        L20:
            if (r0 > r4) goto L36
            r0 = 315(0x13b, float:4.41E-43)
            if (r4 >= r0) goto L36
            goto L54
        L27:
            if (r4 < 0) goto L2e
            r0 = 40
            if (r4 >= r0) goto L2e
            goto L36
        L2e:
            r0 = 320(0x140, float:4.48E-43)
            if (r0 > r4) goto L38
            r0 = 360(0x168, float:5.04E-43)
            if (r4 >= r0) goto L38
        L36:
            r4 = 0
            goto L58
        L38:
            r0 = 50
            if (r0 > r4) goto L42
            r0 = 130(0x82, float:1.82E-43)
            if (r4 >= r0) goto L42
        L40:
            r4 = 3
            goto L58
        L42:
            r0 = 140(0x8c, float:1.96E-43)
            if (r0 > r4) goto L4c
            r0 = 220(0xdc, float:3.08E-43)
            if (r4 >= r0) goto L4c
        L4a:
            r4 = 2
            goto L58
        L4c:
            r0 = 230(0xe6, float:3.22E-43)
            if (r0 > r4) goto L56
            r0 = 310(0x136, float:4.34E-43)
            if (r4 >= r0) goto L56
        L54:
            r4 = 1
            goto L58
        L56:
            int r4 = r1.f28637d
        L58:
            m0.x0 r0 = r3.f28613a
            int r1 = r0.f28637d
            if (r1 == r4) goto L87
            r0.f28637d = r4
            java.lang.Object r1 = r0.f28634a
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r0.f28636c     // Catch: java.lang.Throwable -> L84
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L84
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L84
            java.util.List r0 = kotlin.collections.CollectionsKt.r0(r0)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r1)
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()
            m0.w0 r1 = (m0.w0) r1
            r1.a(r4)
            goto L74
        L84:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.v0.onOrientationChanged(int):void");
    }
}
