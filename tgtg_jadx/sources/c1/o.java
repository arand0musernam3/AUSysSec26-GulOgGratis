package c1;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.core.util.Consumer;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import s0.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f6911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f6913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f6914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f6915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Consumer f6916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f6917h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e6.l f6920k;
    public final e6.i l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6910a = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6918i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6919j = false;

    public o(Surface surface, int i11, Size size, m0.g gVar, m0.g gVar2) {
        float[] fArr = new float[16];
        this.f6914e = fArr;
        float[] fArr2 = new float[16];
        this.f6915f = fArr2;
        this.f6911b = surface;
        this.f6912c = i11;
        this.f6913d = size;
        a(fArr, new float[16], gVar);
        a(fArr2, new float[16], gVar2);
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        try {
            this.l = iVar;
            iVar.f15776a = "SurfaceOutputImpl close future complete";
        } catch (Exception e5) {
            lVar.b(e5);
        }
        this.f6920k = lVar;
    }

    public static void a(float[] fArr, float[] fArr2, m0.g gVar) {
        Matrix.setIdentityM(fArr, 0);
        if (gVar == null) {
            return;
        }
        Size size = gVar.f28505a;
        boolean z11 = gVar.f28509e;
        int i11 = gVar.f28508d;
        zz.f.B(fArr);
        zz.f.A(i11, fArr);
        if (z11) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix matrixA = v0.o.a(v0.o.i(size), v0.o.i(v0.o.h(i11, size)), i11, z11);
        RectF rectF = new RectF(gVar.f28506b);
        matrixA.mapRect(rectF);
        float width = rectF.left / r7.getWidth();
        float height = ((r7.getHeight() - rectF.height()) - rectF.top) / r7.getHeight();
        float fWidth = rectF.width() / r7.getWidth();
        float fHeight = rectF.height() / r7.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        i0 i0Var = gVar.f28507c;
        Matrix.setIdentityM(fArr2, 0);
        zz.f.B(fArr2);
        if (i0Var != null) {
            pd.g.n("Camera has no transform.", i0Var.o());
            zz.f.A(i0Var.b().b(), fArr2);
            if (i0Var.d()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f6910a) {
            try {
                if (!this.f6919j) {
                    this.f6919j = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.l.b(null);
    }

    public final Surface e(w0.c cVar, Consumer consumer) {
        boolean z11;
        synchronized (this.f6910a) {
            this.f6917h = cVar;
            this.f6916g = consumer;
            z11 = this.f6918i;
        }
        if (z11) {
            g();
        }
        return this.f6911b;
    }

    public final void g() {
        Executor executor;
        Consumer consumer;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f6910a) {
            try {
                if (this.f6917h == null || (consumer = this.f6916g) == null) {
                    this.f6918i = true;
                } else if (!this.f6919j) {
                    atomicReference.set(consumer);
                    executor = this.f6917h;
                    this.f6918i = false;
                }
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new a40.l(28, this, atomicReference));
            } catch (RejectedExecutionException e5) {
                if (wd.a.B(3, "SurfaceOutputImpl")) {
                    Log.d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e5);
                }
            }
        }
    }
}
