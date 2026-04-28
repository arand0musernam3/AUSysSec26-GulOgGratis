package v1;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends b5.n implements b5.r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f41703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0 f41704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RenderNode f41705s;

    public c2(w4.m0 m0Var, i iVar, n0 n0Var) {
        this.f41703q = iVar;
        this.f41704r = n0Var;
        L0(m0Var);
    }

    public static boolean O0(float f11, EdgeEffect edgeEffect, Canvas canvas) {
        if (f11 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f11);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode P0() {
        RenderNode renderNode = this.f41705s;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = h7.q1.b();
        this.f41705s = renderNodeB;
        return renderNodeB;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01eb A[PHI: r16
      0x01eb: PHI (r16v2 boolean) = (r16v1 boolean), (r16v12 boolean) binds: [B:93:0x01a1, B:101:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(b5.o0 r25) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.c2.n(b5.o0):void");
    }
}
