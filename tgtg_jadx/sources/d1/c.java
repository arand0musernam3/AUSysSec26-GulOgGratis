package d1;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import c1.g;
import c1.o;
import e1.h;
import e1.i;
import e1.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.b0;
import m0.c0;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13673n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13674o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f13675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f13676q;

    public c(b0 b0Var, b0 b0Var2) {
        this.f13675p = b0Var;
        this.f13676q = b0Var2;
    }

    @Override // c1.g
    public final e1.b j(c0 c0Var) {
        Map map = Collections.EMPTY_MAP;
        e1.b bVarJ = super.j(c0Var);
        this.f13673n = j.h();
        this.f13674o = j.h();
        return bVarJ;
    }

    public final void v(long j9, Surface surface, o oVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        j.d((AtomicBoolean) this.f6867c, true);
        j.c((Thread) this.f6869e);
        HashMap map = (HashMap) this.f6868d;
        pd.g.n("The surface is not registered.", map.containsKey(surface));
        e1.d dVarD = (e1.d) map.get(surface);
        Objects.requireNonNull(dVarD);
        if (dVarD == j.f15464j) {
            dVarD = d(surface);
            if (dVarD == null) {
                return;
            } else {
                map.put(surface, dVarD);
            }
        }
        e1.d dVar = dVarD;
        EGLSurface eGLSurface = dVar.f15444a;
        if (surface != ((Surface) this.f6874j)) {
            n(eGLSurface);
            this.f6874j = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE);
        w(dVar, oVar, surfaceTexture, this.f13675p, this.f13673n, true);
        w(dVar, oVar, surfaceTexture2, this.f13676q, this.f13674o, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f6870f, eGLSurface, j9);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f6870f, eGLSurface)) {
            return;
        }
        wd.a.I("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        r(surface, false);
    }

    public final void w(e1.d dVar, o oVar, SurfaceTexture surfaceTexture, b0 b0Var, int i11, boolean z11) {
        u(i11);
        int i12 = dVar.f15445b;
        int i13 = dVar.f15446c;
        GLES20.glViewport(0, 0, i12, i13);
        GLES20.glScissor(0, 0, i12, i13);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z11 ? oVar.f6914e : oVar.f6915f, 0);
        h hVar = (h) this.l;
        hVar.getClass();
        if (hVar instanceof i) {
            GLES20.glUniformMatrix4fv(((i) hVar).f15453f, 1, false, fArr2, 0);
            j.b("glUniformMatrix4fv");
        }
        g7.a aVar = (g7.a) b0Var.f28472c;
        Size size = new Size((int) (((Float) aVar.f20083a).floatValue() * i12), (int) (((Float) aVar.f20084b).floatValue() * i13));
        Size size2 = new Size(i12, i13);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        g7.a aVar2 = (g7.a) b0Var.f28471b;
        if (((Float) aVar.f20083a).floatValue() != 0.0f || ((Float) aVar.f20084b).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) aVar2.f20083a).floatValue() / ((Float) aVar.f20083a).floatValue(), ((Float) aVar2.f20084b).floatValue() / ((Float) aVar.f20084b).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(hVar.f15449b, 1, false, fArr5, 0);
        j.b("glUniformMatrix4fv");
        GLES20.glUniform1f(hVar.f15450c, 1.0f);
        j.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        j.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
