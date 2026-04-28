package l4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.fragment.app.r;
import b0.z;
import i4.g0;
import i4.t;
import i4.u;
import i4.v;
import i4.w;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f27323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.b f27324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f27325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f27327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f27328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f27332k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f27333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f27335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f27336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f27337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f27338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f27339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f27340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f27341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f27343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f27344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f27345y;

    public f() {
        u uVar = new u();
        k4.b bVar = new k4.b();
        this.f27323b = uVar;
        this.f27324c = bVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f27325d = renderNode;
        this.f27326e = 0L;
        renderNode.setClipToBounds(false);
        P(renderNode, 0);
        this.f27330i = 1.0f;
        this.f27331j = 3;
        this.f27332k = 1.0f;
        this.l = 1.0f;
        long j9 = v.f23309b;
        this.f27336p = j9;
        this.f27337q = j9;
        this.f27341u = 8.0f;
        this.f27345y = 0;
    }

    @Override // l4.d
    public final float A() {
        return this.f27341u;
    }

    @Override // l4.d
    public final float B() {
        return this.f27333m;
    }

    @Override // l4.d
    public final void C(boolean z11) {
        this.f27342v = z11;
        O();
    }

    @Override // l4.d
    public final float D() {
        return this.f27338r;
    }

    @Override // l4.d
    public final void E(int i11) {
        this.f27345y = i11;
        Q();
    }

    @Override // l4.d
    public final void F(float f11) {
        this.f27333m = f11;
        this.f27325d.setTranslationX(f11);
    }

    @Override // l4.d
    public final void G(long j9) {
        this.f27337q = j9;
        this.f27325d.setSpotShadowColor(g0.C(j9));
    }

    @Override // l4.d
    public final Matrix H() {
        Matrix matrix = this.f27328g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f27328g = matrix;
        }
        this.f27325d.getMatrix(matrix);
        return matrix;
    }

    @Override // l4.d
    public final void I(z5.c cVar, m mVar, b bVar, r rVar) {
        k4.b bVar2 = this.f27324c;
        RecordingCanvas recordingCanvasBeginRecording = this.f27325d.beginRecording();
        try {
            u uVar = this.f27323b;
            i4.c cVar2 = uVar.f23304a;
            Canvas canvas = cVar2.f23230a;
            cVar2.f23230a = recordingCanvasBeginRecording;
            j30.g gVar = bVar2.f25938b;
            gVar.y(cVar);
            gVar.A(mVar);
            gVar.f24503c = bVar;
            gVar.B(this.f27326e);
            gVar.x(cVar2);
            rVar.invoke(bVar2);
            uVar.f23304a.f23230a = canvas;
        } finally {
            this.f27325d.endRecording();
        }
    }

    @Override // l4.d
    public final void J(float f11) {
        this.f27341u = f11;
        this.f27325d.setCameraDistance(f11);
    }

    @Override // l4.d
    public final float K() {
        return this.f27335o;
    }

    @Override // l4.d
    public final float L() {
        return this.l;
    }

    @Override // l4.d
    public final void M(float f11) {
        this.f27338r = f11;
        this.f27325d.setRotationX(f11);
    }

    @Override // l4.d
    public final int N() {
        return this.f27331j;
    }

    public final void O() {
        boolean z11 = this.f27342v;
        boolean z12 = false;
        boolean z13 = z11 && !this.f27329h;
        if (z11 && this.f27329h) {
            z12 = true;
        }
        if (z13 != this.f27343w) {
            this.f27343w = z13;
            this.f27325d.setClipToBounds(z13);
        }
        if (z12 != this.f27344x) {
            this.f27344x = z12;
            this.f27325d.setClipToOutline(z12);
        }
    }

    public final void P(RenderNode renderNode, int i11) {
        if (i11 == 1) {
            renderNode.setUseCompositingLayer(true, this.f27327f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f27327f;
        if (i11 == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i11 = this.f27345y;
        if (i11 != 1 && this.f27331j == 3) {
            P(this.f27325d, i11);
        } else {
            P(this.f27325d, 1);
        }
    }

    @Override // l4.d
    public final float a() {
        return this.f27330i;
    }

    @Override // l4.d
    public final void b(float f11) {
        this.f27339s = f11;
        this.f27325d.setRotationY(f11);
    }

    @Override // l4.d
    public final float c() {
        return this.f27332k;
    }

    @Override // l4.d
    public final void d(float f11) {
        this.f27335o = f11;
        this.f27325d.setElevation(f11);
    }

    @Override // l4.d
    public final void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            b7.a.o(this.f27325d);
        }
    }

    @Override // l4.d
    public final void f(float f11) {
        this.f27340t = f11;
        this.f27325d.setRotationZ(f11);
    }

    @Override // l4.d
    public final void g(float f11) {
        this.f27334n = f11;
        this.f27325d.setTranslationY(f11);
    }

    @Override // l4.d
    public final void h(Outline outline, long j9) {
        this.f27325d.setOutline(outline);
        this.f27329h = outline != null;
        O();
    }

    @Override // l4.d
    public final void i(t tVar) {
        Canvas canvas = i4.d.f23233a;
        ((i4.c) tVar).f23230a.drawRenderNode(this.f27325d);
    }

    @Override // l4.d
    public final void j(int i11) {
        this.f27331j = i11;
        Paint paint = this.f27327f;
        if (paint == null) {
            paint = new Paint();
            this.f27327f = paint;
        }
        paint.setBlendMode(i4.b.d(i11));
        Q();
    }

    @Override // l4.d
    public final void k() {
        this.f27325d.discardDisplayList();
    }

    @Override // l4.d
    public final int l() {
        return this.f27345y;
    }

    @Override // l4.d
    public final w m() {
        return null;
    }

    @Override // l4.d
    public final void n(float f11) {
        this.l = f11;
        this.f27325d.setScaleY(f11);
    }

    @Override // l4.d
    public final void o(int i11, int i12, long j9) {
        this.f27325d.setPosition(i11, i12, ((int) (j9 >> 32)) + i11, ((int) (4294967295L & j9)) + i12);
        this.f27326e = z.z(j9);
    }

    @Override // l4.d
    public final float p() {
        return this.f27339s;
    }

    @Override // l4.d
    public final boolean q() {
        return this.f27325d.hasDisplayList();
    }

    @Override // l4.d
    public final float r() {
        return this.f27340t;
    }

    @Override // l4.d
    public final void s(long j9) {
        long j11 = 9223372034707292159L & j9;
        RenderNode renderNode = this.f27325d;
        if (j11 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j9 >> 32)));
            this.f27325d.setPivotY(Float.intBitsToFloat((int) (j9 & 4294967295L)));
        }
    }

    @Override // l4.d
    public final long t() {
        return this.f27336p;
    }

    @Override // l4.d
    public final void u(float f11) {
        this.f27330i = f11;
        this.f27325d.setAlpha(f11);
    }

    @Override // l4.d
    public final float v() {
        return this.f27334n;
    }

    @Override // l4.d
    public final long w() {
        return this.f27337q;
    }

    @Override // l4.d
    public final void x(long j9) {
        this.f27336p = j9;
        this.f27325d.setAmbientShadowColor(g0.C(j9));
    }

    @Override // l4.d
    public final void y() {
        Paint paint = this.f27327f;
        if (paint == null) {
            paint = new Paint();
            this.f27327f = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // l4.d
    public final void z(float f11) {
        this.f27332k = f11;
        this.f27325d.setScaleX(f11);
    }
}
