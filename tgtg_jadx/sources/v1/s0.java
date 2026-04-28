package v1;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends b5.n implements b5.r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f41837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0 f41838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d2.z1 f41839s;

    public s0(w4.m0 m0Var, i iVar, n0 n0Var, d2.z1 z1Var) {
        this.f41837q = iVar;
        this.f41838r = n0Var;
        this.f41839s = z1Var;
        L0(m0Var);
    }

    public static boolean O0(float f11, long j9, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f11);
        canvas.translate(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // b5.r
    public final void n(b5.o0 o0Var) {
        boolean zO0;
        char c3;
        long j9;
        k4.b bVar = o0Var.f5908a;
        long jD = bVar.d();
        i iVar = this.f41837q;
        iVar.i(jD);
        if (h4.e.e(bVar.d())) {
            o0Var.b();
            return;
        }
        o0Var.b();
        iVar.f41754d.getValue();
        Canvas canvasA = i4.d.a(bVar.f25938b.i());
        n0 n0Var = this.f41838r;
        boolean zF = n0.f(n0Var.f41796f);
        d2.z1 z1Var = this.f41839s;
        if (zF) {
            zO0 = O0(270.0f, (((long) Float.floatToRawIntBits(o0Var.c0(z1Var.d(o0Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) << 32), n0Var.c(), canvasA);
        } else {
            zO0 = false;
        }
        if (n0.f(n0Var.f41794d)) {
            c3 = ' ';
            j9 = 4294967295L;
            zO0 = O0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(o0Var.c0(z1Var.c()))) & 4294967295L), n0Var.e(), canvasA) || zO0;
        } else {
            c3 = ' ';
            j9 = 4294967295L;
        }
        if (n0.f(n0Var.f41797g)) {
            zO0 = O0(90.0f, (((long) Float.floatToRawIntBits(o0Var.c0(z1Var.b(o0Var.getLayoutDirection())) + (-((float) j80.c.b(Float.intBitsToFloat((int) (bVar.d() >> c3))))))) & j9) | (((long) Float.floatToRawIntBits(0.0f)) << c3), n0Var.d(), canvasA) || zO0;
        }
        if (n0.f(n0Var.f41795e)) {
            EdgeEffect edgeEffectB = n0Var.b();
            zO0 = O0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (bVar.d() & j9))) + o0Var.c0(z1Var.a()))) & j9) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.d() >> c3)))) << c3), edgeEffectB, canvasA) || zO0;
        }
        if (zO0) {
            iVar.d();
        }
    }
}
