package ke;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends we.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f26321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final we.a f26322r;

    public l(he.k kVar, we.a aVar) {
        super(kVar, (PointF) aVar.f43388b, (PointF) aVar.f43389c, aVar.f43390d, aVar.f43391e, aVar.f43392f, aVar.f43393g, aVar.f43394h);
        this.f26322r = aVar;
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f43389c
            java.lang.Object r1 = r12.f43388b
            if (r0 == 0) goto L19
            if (r1 == 0) goto L19
            r2 = r1
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r3 = r0.x
            float r0 = r0.y
            boolean r0 = r2.equals(r3, r0)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r1 == 0) goto L73
            java.lang.Object r2 = r12.f43389c
            if (r2 == 0) goto L73
            if (r0 != 0) goto L73
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            we.a r0 = r12.f26322r
            android.graphics.PointF r3 = r0.f43400o
            android.graphics.PointF r0 = r0.f43401p
            android.graphics.Matrix r4 = ve.k.f42293a
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            float r4 = r1.x
            float r6 = r1.y
            r5.moveTo(r4, r6)
            if (r3 == 0) goto L6a
            if (r0 == 0) goto L6a
            float r4 = r3.length()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4f
            float r4 = r0.length()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L6a
        L4f:
            float r4 = r1.x
            float r6 = r3.x
            float r6 = r6 + r4
            float r1 = r1.y
            float r3 = r3.y
            float r7 = r1 + r3
            float r10 = r2.x
            float r1 = r0.x
            float r8 = r10 + r1
            float r11 = r2.y
            float r0 = r0.y
            float r9 = r11 + r0
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            goto L71
        L6a:
            float r0 = r2.x
            float r1 = r2.y
            r5.lineTo(r0, r1)
        L71:
            r12.f26321q = r5
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.l.d():void");
    }
}
