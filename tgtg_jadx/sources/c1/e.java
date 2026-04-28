package c1;

import al.u;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.c0;
import m0.h1;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements p, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f6852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f6853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0.c f6854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f6855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f6856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f6857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f6858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f6859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f6862k;

    public e(c0 c0Var) {
        Map map = Collections.EMPTY_MAP;
        this.f6856e = new AtomicBoolean(false);
        this.f6857f = new float[16];
        this.f6858g = new float[16];
        this.f6859h = new LinkedHashMap();
        this.f6860i = 0;
        this.f6861j = false;
        this.f6862k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f6853b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f6855d = handler;
        this.f6854c = new w0.c(handler);
        this.f6852a = new g();
        try {
            h(c0Var);
        } catch (RuntimeException e5) {
            a();
            throw e5;
        }
    }

    @Override // c1.p
    public final void a() {
        if (this.f6856e.getAndSet(true)) {
            return;
        }
        e(new u(this, 15), new bx.c(4));
    }

    @Override // c1.p
    public final void b(h1 h1Var) {
        if (this.f6856e.get()) {
            h1Var.c();
        } else {
            e(new a40.l(27, this, h1Var), new c(h1Var, 0));
        }
    }

    @Override // c1.p
    public final void c(o oVar) {
        if (this.f6856e.get()) {
            oVar.close();
            return;
        }
        a40.l lVar = new a40.l(25, this, oVar);
        Objects.requireNonNull(oVar);
        e(lVar, new u(oVar, 14));
    }

    public final void d() {
        if (this.f6861j && this.f6860i == 0) {
            LinkedHashMap linkedHashMap = this.f6859h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((o) it.next()).close();
            }
            Iterator it2 = this.f6862k.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).f6837c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            g gVar = this.f6852a;
            if (((AtomicBoolean) gVar.f6867c).getAndSet(false)) {
                e1.j.c((Thread) gVar.f6869e);
                gVar.p();
            }
            this.f6853b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.f6854c.execute(new a40.q(this, runnable2, runnable, 6));
        } catch (RejectedExecutionException e5) {
            wd.a.J("DefaultSurfaceProcessor", "Unable to executor runnable", e5);
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.f6862k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f6837c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i11) {
        float[] fArr2 = (float[]) fArr.clone();
        zz.f.A(i11, fArr2);
        zz.f.B(fArr2);
        Size sizeH = v0.o.h(i11, size);
        g gVar = this.f6852a;
        gVar.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeH.getHeight() * sizeH.getWidth() * 4);
        pd.g.i("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeH.getHeight() * sizeH.getWidth()) * 4);
        pd.g.i("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = e1.j.f15455a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        e1.j.b("glGenTextures");
        int i12 = iArr2[0];
        GLES20.glActiveTexture(33985);
        e1.j.b("glActiveTexture");
        GLES20.glBindTexture(3553, i12);
        e1.j.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeH.getWidth(), sizeH.getHeight(), 0, 6407, 5121, null);
        e1.j.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        e1.j.b("glGenFramebuffers");
        int i13 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i13);
        e1.j.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i12, 0);
        e1.j.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        e1.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, gVar.f6865a);
        e1.j.b("glBindTexture");
        gVar.f6874j = null;
        GLES20.glViewport(0, 0, sizeH.getWidth(), sizeH.getHeight());
        GLES20.glScissor(0, 0, sizeH.getWidth(), sizeH.getHeight());
        e1.h hVar = (e1.h) gVar.l;
        hVar.getClass();
        if (hVar instanceof e1.i) {
            GLES20.glUniformMatrix4fv(((e1.i) hVar).f15453f, 1, false, fArr2, 0);
            e1.j.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        e1.j.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeH.getWidth(), sizeH.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        e1.j.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i12}, 0);
        e1.j.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i13}, 0);
        e1.j.b("glDeleteFramebuffers");
        int i14 = gVar.f6865a;
        GLES20.glActiveTexture(33984);
        e1.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, i14);
        e1.j.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeH.getWidth(), sizeH.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.e(bitmapCreateBitmap, byteBufferAllocateDirect, sizeH.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void h(c0 c0Var) {
        Map map = Collections.EMPTY_MAP;
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = a0.class;
        try {
            e(new a40.q(this, c0Var, iVar), new bx.c(4));
            iVar.f15776a = "Init GlRenderer";
        } catch (Exception e5) {
            lVar.b(e5);
        }
        try {
            lVar.get();
        } catch (InterruptedException | ExecutionException e11) {
            e = e11;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            wy.o.k("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    public final void i(u70.u uVar) {
        ArrayList arrayList = this.f6862k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (uVar == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i11 = -1;
                int i12 = -1;
                Bitmap bitmapG = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    int i13 = aVar.f6836b;
                    int i14 = aVar.f6835a;
                    if (i11 != i13 || bitmapG == null) {
                        if (bitmapG != null) {
                            bitmapG.recycle();
                        }
                        bitmapG = g((Size) uVar.f40860b, (float[]) uVar.f40861c, i13);
                        i12 = -1;
                        i11 = i13;
                    }
                    if (i12 != i14) {
                        byteArrayOutputStream.reset();
                        bitmapG.compress(Bitmap.CompressFormat.JPEG, i14, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i12 = i14;
                    }
                    Surface surface = (Surface) uVar.f40859a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.f(byteArray, surface);
                    aVar.f6837c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e5) {
            f(e5);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f6856e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f6857f;
        surfaceTexture.getTransformMatrix(fArr);
        u70.u uVar = null;
        for (Map.Entry entry : this.f6859h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            o oVar = (o) entry.getKey();
            float[] fArr2 = oVar.f6914e;
            float[] fArr3 = this.f6858g;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i11 = oVar.f6912c;
            if (i11 == 34) {
                try {
                    this.f6852a.s(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException e5) {
                    wd.a.s("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e5);
                }
            } else {
                pd.g.n("Unsupported format: " + i11, i11 == 256);
                pd.g.n("Only one JPEG output is supported.", uVar == null);
                uVar = new u70.u(surface, oVar.f6913d, (float[]) fArr3.clone());
            }
        }
        try {
            i(uVar);
        } catch (RuntimeException e11) {
            f(e11);
        }
    }
}
