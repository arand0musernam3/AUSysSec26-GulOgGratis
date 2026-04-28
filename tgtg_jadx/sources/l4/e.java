package l4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.fragment.app.r;
import b0.z;
import c5.y;
import i4.g0;
import i4.t;
import i4.u;
import i4.v;
import i4.w;
import java.util.concurrent.atomic.AtomicBoolean;
import z5.l;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public static final AtomicBoolean B = new AtomicBoolean(true);
    public boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f27299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.b f27300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f27301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f27303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f27304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27308k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f27311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f27313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f27314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f27315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f27316t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f27317u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f27318v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f27319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f27320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f27321y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f27322z;

    public e(y yVar, u uVar, k4.b bVar) {
        this.f27299b = uVar;
        this.f27300c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", yVar);
        this.f27301d = renderNodeCreate;
        this.f27302e = 0L;
        this.f27306i = 0L;
        if (B.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                j.c(renderNodeCreate, j.a(renderNodeCreate));
                j.d(renderNodeCreate, j.b(renderNodeCreate));
            }
            i.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        P(0);
        this.f27307j = 0;
        this.f27308k = 3;
        this.l = 1.0f;
        this.f27310n = 1.0f;
        this.f27311o = 1.0f;
        long j9 = v.f23309b;
        this.f27315s = j9;
        this.f27316t = j9;
        this.f27320x = 8.0f;
    }

    @Override // l4.d
    public final float A() {
        return this.f27320x;
    }

    @Override // l4.d
    public final float B() {
        return this.f27312p;
    }

    @Override // l4.d
    public final void C(boolean z11) {
        this.f27321y = z11;
        O();
    }

    @Override // l4.d
    public final float D() {
        return this.f27317u;
    }

    @Override // l4.d
    public final void E(int i11) {
        this.f27307j = i11;
        Q();
    }

    @Override // l4.d
    public final void F(float f11) {
        this.f27312p = f11;
        this.f27301d.setTranslationX(f11);
    }

    @Override // l4.d
    public final void G(long j9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27316t = j9;
            j.d(this.f27301d, g0.C(j9));
        }
    }

    @Override // l4.d
    public final Matrix H() {
        Matrix matrix = this.f27304g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f27304g = matrix;
        }
        this.f27301d.getMatrix(matrix);
        return matrix;
    }

    @Override // l4.d
    public final void I(z5.c cVar, m mVar, b bVar, r rVar) {
        Canvas canvasStart = this.f27301d.start(Math.max((int) (this.f27302e >> 32), (int) (this.f27306i >> 32)), Math.max((int) (this.f27302e & 4294967295L), (int) (this.f27306i & 4294967295L)));
        try {
            i4.c cVar2 = this.f27299b.f23304a;
            Canvas canvas = cVar2.f23230a;
            cVar2.f23230a = canvasStart;
            k4.b bVar2 = this.f27300c;
            j30.g gVar = bVar2.f25938b;
            long jZ = z.z(this.f27302e);
            k4.a aVar = ((k4.b) gVar.f24504d).f25937a;
            z5.c cVar3 = aVar.f25933a;
            m mVar2 = aVar.f25934b;
            t tVarI = gVar.i();
            long jO = gVar.o();
            b bVar3 = (b) gVar.f24503c;
            gVar.y(cVar);
            gVar.A(mVar);
            gVar.x(cVar2);
            gVar.B(jZ);
            gVar.f24503c = bVar;
            cVar2.e();
            try {
                rVar.invoke(bVar2);
                cVar2.o();
                gVar.y(cVar3);
                gVar.A(mVar2);
                gVar.x(tVarI);
                gVar.B(jO);
                gVar.f24503c = bVar3;
                cVar2.f23230a = canvas;
                this.f27301d.end(canvasStart);
            } catch (Throwable th2) {
                cVar2.o();
                j30.g gVar2 = bVar2.f25938b;
                gVar2.y(cVar3);
                gVar2.A(mVar2);
                gVar2.x(tVarI);
                gVar2.B(jO);
                gVar2.f24503c = bVar3;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f27301d.end(canvasStart);
            throw th3;
        }
    }

    @Override // l4.d
    public final void J(float f11) {
        this.f27320x = f11;
        this.f27301d.setCameraDistance(-f11);
    }

    @Override // l4.d
    public final float K() {
        return this.f27314r;
    }

    @Override // l4.d
    public final float L() {
        return this.f27311o;
    }

    @Override // l4.d
    public final void M(float f11) {
        this.f27317u = f11;
        this.f27301d.setRotationX(f11);
    }

    @Override // l4.d
    public final int N() {
        return this.f27308k;
    }

    public final void O() {
        boolean z11 = this.f27321y;
        boolean z12 = false;
        boolean z13 = z11 && !this.f27305h;
        if (z11 && this.f27305h) {
            z12 = true;
        }
        if (z13 != this.f27322z) {
            this.f27322z = z13;
            this.f27301d.setClipToBounds(z13);
        }
        if (z12 != this.A) {
            this.A = z12;
            this.f27301d.setClipToOutline(z12);
        }
    }

    public final void P(int i11) {
        RenderNode renderNode = this.f27301d;
        if (i11 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f27303f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i11 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f27303f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f27303f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void Q() {
        int i11 = this.f27307j;
        if (i11 != 1 && this.f27308k == 3) {
            P(i11);
        } else {
            P(1);
        }
    }

    @Override // l4.d
    public final float a() {
        return this.l;
    }

    @Override // l4.d
    public final void b(float f11) {
        this.f27318v = f11;
        this.f27301d.setRotationY(f11);
    }

    @Override // l4.d
    public final float c() {
        return this.f27310n;
    }

    @Override // l4.d
    public final void d(float f11) {
        this.f27314r = f11;
        this.f27301d.setElevation(f11);
    }

    @Override // l4.d
    public final void f(float f11) {
        this.f27319w = f11;
        this.f27301d.setRotation(f11);
    }

    @Override // l4.d
    public final void g(float f11) {
        this.f27313q = f11;
        this.f27301d.setTranslationY(f11);
    }

    @Override // l4.d
    public final void h(Outline outline, long j9) {
        this.f27306i = j9;
        this.f27301d.setOutline(outline);
        this.f27305h = outline != null;
        O();
    }

    @Override // l4.d
    public final void i(t tVar) {
        Canvas canvas = i4.d.f23233a;
        DisplayListCanvas displayListCanvas = ((i4.c) tVar).f23230a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.f27301d);
    }

    @Override // l4.d
    public final void j(int i11) {
        if (this.f27308k == i11) {
            return;
        }
        this.f27308k = i11;
        Paint paint = this.f27303f;
        if (paint == null) {
            paint = new Paint();
            this.f27303f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(i4.b.e(i11)));
        Q();
    }

    @Override // l4.d
    public final void k() {
        i.a(this.f27301d);
    }

    @Override // l4.d
    public final int l() {
        return this.f27307j;
    }

    @Override // l4.d
    public final w m() {
        return null;
    }

    @Override // l4.d
    public final void n(float f11) {
        this.f27311o = f11;
        this.f27301d.setScaleY(f11);
    }

    @Override // l4.d
    public final void o(int i11, int i12, long j9) {
        int i13 = (int) (j9 >> 32);
        int i14 = (int) (4294967295L & j9);
        this.f27301d.setLeftTopRightBottom(i11, i12, i11 + i13, i12 + i14);
        if (l.a(this.f27302e, j9)) {
            return;
        }
        if (this.f27309m) {
            this.f27301d.setPivotX(i13 / 2.0f);
            this.f27301d.setPivotY(i14 / 2.0f);
        }
        this.f27302e = j9;
    }

    @Override // l4.d
    public final float p() {
        return this.f27318v;
    }

    @Override // l4.d
    public final boolean q() {
        return this.f27301d.isValid();
    }

    @Override // l4.d
    public final float r() {
        return this.f27319w;
    }

    @Override // l4.d
    public final void s(long j9) {
        if ((9223372034707292159L & j9) == 9205357640488583168L) {
            this.f27309m = true;
            this.f27301d.setPivotX(((int) (this.f27302e >> 32)) / 2.0f);
            this.f27301d.setPivotY(((int) (4294967295L & this.f27302e)) / 2.0f);
        } else {
            this.f27309m = false;
            this.f27301d.setPivotX(Float.intBitsToFloat((int) (j9 >> 32)));
            this.f27301d.setPivotY(Float.intBitsToFloat((int) (j9 & 4294967295L)));
        }
    }

    @Override // l4.d
    public final long t() {
        return this.f27315s;
    }

    @Override // l4.d
    public final void u(float f11) {
        this.l = f11;
        this.f27301d.setAlpha(f11);
    }

    @Override // l4.d
    public final float v() {
        return this.f27313q;
    }

    @Override // l4.d
    public final long w() {
        return this.f27316t;
    }

    @Override // l4.d
    public final void x(long j9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27315s = j9;
            j.c(this.f27301d, g0.C(j9));
        }
    }

    @Override // l4.d
    public final void y() {
        Q();
    }

    @Override // l4.d
    public final void z(float f11) {
        this.f27310n = f11;
        this.f27301d.setScaleX(f11);
    }

    @Override // l4.d
    public final void e() {
    }
}
