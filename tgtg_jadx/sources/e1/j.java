package e1;

import a40.d0;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import com.braze.h2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m0.c0;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15455a = {12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15456b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f15458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f15459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f15460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f15461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FloatBuffer f15462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f15463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f15464j;

    static {
        Locale locale = Locale.US;
        f15457c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f15458d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f15459e = new e(0);
        f15460f = new e(1);
        f15461g = new e(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f15462h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        f15463i = floatBufferAsFloatBuffer2;
        f15464j = new d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        d0.s(e0.f.r(str, ": EGL error: 0x"), Integer.toHexString(iEglGetError));
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        d0.s(e0.f.r(str, ": GL error 0x"), Integer.toHexString(iGlGetError));
    }

    public static void c(Thread thread) {
        pd.g.n("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z11) {
        pd.g.n(z11 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z11 == atomicBoolean.get());
    }

    public static void e(int i11, String str) {
        if (i11 >= 0) {
            return;
        }
        h2.b(a0.p("Unable to locate '", str, "' in program"));
    }

    public static int[] f(String str, c0 c0Var) {
        int i11 = c0Var.f28484a;
        int[] iArr = f15455a;
        if (i11 == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f15456b;
            }
            wd.a.I("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(c0 c0Var) {
        Object iVar;
        g gVar;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        g[] gVarArrValues = g.values();
        int length = gVarArrValues.length;
        for (int i11 = 0; i11 < length; i11++) {
            g gVar2 = gVarArrValues[i11];
            e eVar = (e) map.get(gVar2);
            if (eVar != null) {
                iVar = new i(c0Var, eVar);
            } else if (gVar2 == g.YUV || gVar2 == (gVar = g.DEFAULT)) {
                iVar = new i(c0Var, gVar2);
            } else {
                pd.g.n("Unhandled input format: " + gVar2, gVar2 == g.UNKNOWN);
                if (c0Var.a()) {
                    iVar = new f("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    e eVar2 = (e) map.get(gVar);
                    iVar = eVar2 != null ? new i(c0Var, eVar2) : new i(c0Var, gVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + gVar2 + " created: " + iVar);
            map2.put(gVar2, iVar);
        }
        return map2;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i11 = iArr[0];
        GLES20.glBindTexture(36197, i11);
        b("glBindTexture " + i11);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i11;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        h2.b("surface was null");
        return null;
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return k.m(strGroup, ".", strGroup2);
    }

    public static int k(int i11, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        b("glCreateShader type=" + i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        wd.a.I("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i11 + ":" + strGlGetShaderInfoLog);
    }
}
