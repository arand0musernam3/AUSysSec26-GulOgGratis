package c1;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.braze.h2;
import j4.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import m0.c0;
import m0.i1;
import q1.f0;
import q1.g0;
import t1.c2;
import t1.u;
import t1.y1;
import t1.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class g implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f6872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f6873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f6874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f6875k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f6876m;

    public g() {
        this.f6867c = new AtomicBoolean(false);
        this.f6868d = new HashMap();
        this.f6870f = EGL14.EGL_NO_DISPLAY;
        this.f6871g = EGL14.EGL_NO_CONTEXT;
        this.f6866b = e1.j.f15455a;
        this.f6873i = EGL14.EGL_NO_SURFACE;
        this.f6875k = Collections.EMPTY_MAP;
        this.l = null;
        this.f6876m = e1.g.UNKNOWN;
        this.f6865a = -1;
    }

    public void c(c0 c0Var, e1.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f6870f = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            h2.b("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f6870f, iArr, 0, iArr, 1)) {
            this.f6870f = EGL14.EGL_NO_DISPLAY;
            h2.b("Unable to initialize EGL14");
            return;
        }
        if (aVar != null) {
            aVar.f15430b = iArr[0] + "." + iArr[1];
        }
        int i11 = c0Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f6870f, new int[]{12324, i11, 12323, i11, 12322, i11, 12321, c0Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, c0Var.a() ? 64 : 4, 12610, c0Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            h2.b("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f6870f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c0Var.a() ? 3 : 2, 12344}, 0);
        e1.j.a("eglCreateContext");
        this.f6872h = eGLConfig;
        this.f6871g = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.f6870f, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public e1.d d(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f6870f;
            EGLConfig eGLConfig = (EGLConfig) this.f6872h;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceI = e1.j.i(eGLDisplay, eGLConfig, surface, this.f6866b);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f6870f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
            int i11 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
            Size size = new Size(i11, iArr2[0]);
            return new e1.d(eGLSurfaceI, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e5) {
            wd.a.J("OpenGlRenderer", "Failed to create EGL surface: " + e5.getMessage(), e5);
            return null;
        }
    }

    @Override // t1.x1
    public t1.o e(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        t1.o oVar4;
        t1.o oVar5;
        float f11;
        t1.q[][] qVarArr;
        boolean z11;
        t1.o oVar6 = oVar;
        t1.o oVar7 = oVar2;
        f0 f0Var = (f0) this.f6867c;
        int[] iArr = y1.f39621a;
        int i11 = 0;
        long j11 = (j9 / 1000000) - ((long) 0);
        int i12 = this.f6865a;
        long j12 = i12;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 <= j12) {
            j12 = j11;
        }
        int i13 = (int) j12;
        g0 g0Var = (g0) this.f6868d;
        c2 c2Var = (c2) g0Var.b(i13);
        if (c2Var != null) {
            return c2Var.f39402a;
        }
        if (i13 >= i12) {
            return oVar7;
        }
        if (i13 <= 0) {
            return oVar6;
        }
        l(oVar6, oVar7, oVar3);
        t1.o oVar8 = (t1.o) this.f6871g;
        oVar8.getClass();
        boolean z12 = true;
        if (((ky.o) this.f6876m) != y1.f39623c) {
            float fH = h(g(i13), i13, false);
            float[] fArr = (float[]) this.f6875k;
            t1.q[][] qVarArr2 = (t1.q[][]) ((ky.o) this.f6876m).f26718b;
            int length = qVarArr2.length - 1;
            float f12 = qVarArr2[0][0].f39518a;
            float f13 = qVarArr2[length][0].f39519b;
            int length2 = fArr.length;
            if (fH < f12 || fH > f13) {
                if (fH > f13) {
                    f12 = f13;
                } else {
                    length = 0;
                }
                float f14 = fH - f12;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length2 - 1) {
                    t1.q qVar = qVarArr2[length][i15];
                    boolean z13 = qVar.f39532p;
                    float f15 = qVar.f39534r;
                    float f16 = qVar.f39533q;
                    if (z13) {
                        float f17 = qVar.f39518a;
                        float f18 = qVar.f39528k;
                        f11 = f14;
                        float f19 = qVar.f39520c;
                        qVarArr = qVarArr2;
                        fArr[i14] = (f11 * f16) + s.a(qVar.f39522e, f19, (f12 - f17) * f18, f19);
                        float f20 = (f12 - f17) * f18;
                        float f21 = qVar.f39521d;
                        fArr[i14 + 1] = (f11 * f15) + s.a(qVar.f39523f, f21, f20, f21);
                    } else {
                        f11 = f14;
                        qVarArr = qVarArr2;
                        qVar.c(f12);
                        fArr[i14] = (qVar.a() * f11) + (qVar.f39530n * qVar.f39525h) + f16;
                        fArr[i14 + 1] = (qVar.b() * f11) + (qVar.f39531o * qVar.f39526i) + f15;
                    }
                    i14 += 2;
                    i15++;
                    f14 = f11;
                    qVarArr2 = qVarArr;
                }
            } else {
                int length3 = qVarArr2.length;
                int i16 = 0;
                boolean z14 = false;
                while (i16 < length3) {
                    int i17 = i11;
                    int i18 = i17;
                    while (i17 < length2 - 1) {
                        t1.q qVar2 = qVarArr2[i16][i18];
                        if (fH <= qVar2.f39519b) {
                            if (qVar2.f39532p) {
                                float f22 = qVar2.f39518a;
                                float f23 = qVar2.f39528k;
                                float f24 = qVar2.f39520c;
                                z11 = z12;
                                fArr[i17] = s.a(qVar2.f39522e, f24, (fH - f22) * f23, f24);
                                float f25 = qVar2.f39521d;
                                fArr[i17 + 1] = s.a(qVar2.f39523f, f25, (fH - f22) * f23, f25);
                            } else {
                                z11 = z12;
                                qVar2.c(fH);
                                fArr[i17] = (qVar2.f39530n * qVar2.f39525h) + qVar2.f39533q;
                                fArr[i17 + 1] = (qVar2.f39531o * qVar2.f39526i) + qVar2.f39534r;
                            }
                            z14 = z11;
                        } else {
                            z11 = z12;
                        }
                        i17 += 2;
                        i18++;
                        z12 = z11;
                    }
                    boolean z15 = z12;
                    if (z14) {
                        break;
                    }
                    i16++;
                    z12 = z15;
                    i11 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i19 = 0; i19 < length4; i19++) {
                oVar8.e(fArr[i19], i19);
            }
        } else {
            int iG = g(i13);
            float fH2 = h(iG, i13, true);
            c2 c2Var2 = (c2) g0Var.b(f0Var.a(iG));
            if (c2Var2 != null && (oVar5 = c2Var2.f39402a) != null) {
                oVar6 = oVar5;
            }
            c2 c2Var3 = (c2) g0Var.b(f0Var.a(iG + 1));
            if (c2Var3 != null && (oVar4 = c2Var3.f39402a) != null) {
                oVar7 = oVar4;
            }
            int iB = oVar8.b();
            for (int i21 = 0; i21 < iB; i21++) {
                oVar8.e((oVar7.a(i21) * fH2) + ((1 - fH2) * oVar6.a(i21)), i21);
            }
        }
        return oVar8;
    }

    public void f() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f6870f;
        EGLConfig eGLConfig = (EGLConfig) this.f6872h;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = e1.j.f15455a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        e1.j.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.f6873i = eGLSurfaceEglCreatePbufferSurface;
        } else {
            h2.b("surface was null");
        }
    }

    public int g(int i11) {
        int i12;
        f0 f0Var = (f0) this.f6867c;
        int i13 = f0Var.f35790b;
        if (i13 <= 0) {
            org.bouncycastle.jce.provider.a.v("");
            return 0;
        }
        int i14 = i13 - 1;
        int i15 = 0;
        while (true) {
            if (i15 <= i14) {
                i12 = (i15 + i14) >>> 1;
                int i16 = f0Var.f35789a[i12];
                if (i16 >= i11) {
                    if (i16 <= i11) {
                        break;
                    }
                    i14 = i12 - 1;
                } else {
                    i15 = i12 + 1;
                }
            } else {
                i12 = -(i15 + 1);
                break;
            }
        }
        return i12 < -1 ? -(i12 + 2) : i12;
    }

    public float h(int i11, int i12, boolean z11) {
        u uVar;
        float f11;
        f0 f0Var = (f0) this.f6867c;
        if (i11 >= f0Var.f35790b - 1) {
            f11 = i12;
        } else {
            int iA = f0Var.a(i11);
            int iA2 = f0Var.a(i11 + 1);
            if (i12 == iA) {
                f11 = iA;
            } else {
                int i13 = iA2 - iA;
                c2 c2Var = (c2) ((g0) this.f6868d).b(iA);
                if (c2Var == null || (uVar = c2Var.f39403b) == null) {
                    uVar = (u) this.f6869e;
                }
                float f12 = i13;
                float fA = uVar.a((i12 - iA) / f12);
                if (z11) {
                    return fA;
                }
                f11 = (f12 * fA) + iA;
            }
        }
        return f11 / 1000;
    }

    public g7.a i(c0 c0Var) {
        e1.j.d((AtomicBoolean) this.f6867c, false);
        try {
            c(c0Var, null);
            f();
            n((EGLSurface) this.f6873i);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f6870f, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new g7.a(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e5) {
            wd.a.J("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e5.getMessage(), e5);
            return new g7.a("", "");
        } finally {
            p();
        }
    }

    public e1.b j(c0 c0Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6867c;
        e1.j.d(atomicBoolean, false);
        e1.a aVar = new e1.a();
        aVar.f15429a = "0.0";
        aVar.f15430b = "0.0";
        aVar.f15431c = "";
        aVar.f15432d = "";
        try {
            if (c0Var.a()) {
                g7.a aVarI = i(c0Var);
                String str = (String) aVarI.f20083a;
                str.getClass();
                String str2 = (String) aVarI.f20084b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    wd.a.I("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c0Var = c0.f28478d;
                }
                this.f6866b = e1.j.f(str2, c0Var);
                aVar.f15431c = str;
                aVar.f15432d = str2;
            }
            c(c0Var, aVar);
            f();
            n((EGLSurface) this.f6873i);
            aVar.f15429a = e1.j.j();
            this.f6875k = e1.j.g(c0Var);
            int iH = e1.j.h();
            this.f6865a = iH;
            u(iH);
            this.f6869e = Thread.currentThread();
            atomicBoolean.set(true);
            String strConcat = aVar.f15431c == null ? "".concat(" glExtensions") : "";
            if (aVar.f15432d == null) {
                strConcat = strConcat.concat(" eglExtensions");
            }
            if (strConcat.isEmpty()) {
                return new e1.b(aVar.f15429a, aVar.f15430b, aVar.f15431c, aVar.f15432d);
            }
            h2.b("Missing required properties:".concat(strConcat));
            return null;
        } catch (IllegalArgumentException e5) {
            e = e5;
            p();
            throw e;
        } catch (IllegalStateException e11) {
            e = e11;
            p();
            throw e;
        }
    }

    public void l(t1.o oVar, t1.o oVar2, t1.o oVar3) {
        float[] fArr;
        g0 g0Var = (g0) this.f6868d;
        f0 f0Var = (f0) this.f6867c;
        boolean z11 = ((ky.o) this.f6876m) != y1.f39623c;
        if (((t1.o) this.f6871g) == null) {
            this.f6871g = oVar.c();
            this.f6872h = oVar3.c();
            int i11 = f0Var.f35790b;
            float[] fArr2 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr2[i12] = f0Var.a(i12) / 1000;
            }
            this.f6870f = fArr2;
            int i13 = f0Var.f35790b;
            int[] iArr = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                iArr[i14] = 0;
            }
            this.f6866b = iArr;
        }
        if (z11) {
            if (((ky.o) this.f6876m) != y1.f39623c && Intrinsics.areEqual((t1.o) this.f6873i, oVar) && Intrinsics.areEqual((t1.o) this.f6874j, oVar2)) {
                return;
            }
            this.f6873i = oVar;
            this.f6874j = oVar2;
            int iB = oVar.b() + (oVar.b() % 2);
            this.f6875k = new float[iB];
            this.l = new float[iB];
            int i15 = f0Var.f35790b;
            float[][] fArr3 = new float[i15][];
            for (int i16 = 0; i16 < i15; i16++) {
                int iA = f0Var.a(i16);
                c2 c2Var = (c2) g0Var.b(iA);
                if (iA == 0 && c2Var == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = oVar.a(i17);
                    }
                } else if (iA == this.f6865a && c2Var == null) {
                    fArr = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr[i18] = oVar2.a(i18);
                    }
                } else {
                    c2Var.getClass();
                    t1.o oVar4 = c2Var.f39402a;
                    float[] fArr4 = new float[iB];
                    for (int i19 = 0; i19 < iB; i19++) {
                        fArr4[i19] = oVar4.a(i19);
                    }
                    fArr = fArr4;
                }
                fArr3[i16] = fArr;
            }
            this.f6876m = new ky.o(this.f6866b, (float[]) this.f6870f, fArr3);
        }
    }

    @Override // t1.x1
    public t1.o m(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        int[] iArr = y1.f39621a;
        int i11 = 0;
        long j11 = (j9 / 1000000) - ((long) 0);
        long j12 = this.f6865a;
        if (j11 < 0) {
            j11 = 0;
        }
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 < 0) {
            return oVar3;
        }
        l(oVar, oVar2, oVar3);
        t1.o oVar4 = (t1.o) this.f6872h;
        oVar4.getClass();
        if (((ky.o) this.f6876m) != y1.f39623c) {
            int i12 = (int) j13;
            float fH = h(g(i12), i12, false);
            float[] fArr = (float[]) this.l;
            t1.q[][] qVarArr = (t1.q[][]) ((ky.o) this.f6876m).f26718b;
            float f11 = qVarArr[0][0].f39518a;
            float f12 = qVarArr[qVarArr.length - 1][0].f39519b;
            if (fH < f11) {
                fH = f11;
            }
            if (fH <= f12) {
                f12 = fH;
            }
            int length = fArr.length;
            boolean z11 = false;
            for (t1.q[] qVarArr2 : qVarArr) {
                int i13 = 0;
                int i14 = 0;
                while (i13 < length - 1) {
                    t1.q qVar = qVarArr2[i14];
                    if (f12 <= qVar.f39519b) {
                        if (qVar.f39532p) {
                            fArr[i13] = qVar.f39533q;
                            fArr[i13 + 1] = qVar.f39534r;
                        } else {
                            qVar.c(f12);
                            fArr[i13] = qVar.a();
                            fArr[i13 + 1] = qVar.b();
                        }
                        z11 = true;
                    }
                    i13 += 2;
                    i14++;
                }
                if (z11) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i11 < length2) {
                oVar4.e(fArr[i11], i11);
                i11++;
            }
        } else {
            t1.o oVarE = e((j13 - 1) * 1000000, oVar, oVar2, oVar3);
            t1.o oVarE2 = e(j13 * 1000000, oVar, oVar2, oVar3);
            int iB = oVarE.b();
            while (i11 < iB) {
                oVar4.e((oVarE.a(i11) - oVarE2.a(i11)) * 1000.0f, i11);
                i11++;
            }
        }
        return oVar4;
    }

    public void n(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f6870f).getClass();
        ((EGLContext) this.f6871g).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.f6870f, eGLSurface, eGLSurface, (EGLContext) this.f6871g)) {
            return;
        }
        h2.b("eglMakeCurrent failed");
    }

    public void o(Surface surface) {
        e1.j.d((AtomicBoolean) this.f6867c, true);
        e1.j.c((Thread) this.f6869e);
        HashMap map = (HashMap) this.f6868d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, e1.j.f15464j);
    }

    public void p() {
        HashMap map = (HashMap) this.f6868d;
        Iterator it = ((Map) this.f6875k).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((e1.h) it.next()).f15448a);
        }
        this.f6875k = Collections.EMPTY_MAP;
        this.l = null;
        if (!Objects.equals((EGLDisplay) this.f6870f, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f6870f;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (e1.d dVar : map.values()) {
                if (!Objects.equals(dVar.f15444a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f6870f, dVar.f15444a)) {
                    try {
                        e1.j.a("eglDestroySurface");
                    } catch (IllegalStateException e5) {
                        wd.a.s("GLUtils", e5.toString(), e5);
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.f6873i, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f6870f, (EGLSurface) this.f6873i);
                this.f6873i = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f6871g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f6870f, (EGLContext) this.f6871g);
                this.f6871g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f6870f);
            this.f6870f = EGL14.EGL_NO_DISPLAY;
        }
        this.f6872h = null;
        this.f6865a = -1;
        this.f6876m = e1.g.UNKNOWN;
        this.f6874j = null;
        this.f6869e = null;
    }

    @Override // t1.z1
    public int q() {
        return 0;
    }

    public void r(Surface surface, boolean z11) {
        if (((Surface) this.f6874j) == surface) {
            this.f6874j = null;
            n((EGLSurface) this.f6873i);
        }
        HashMap map = (HashMap) this.f6868d;
        e1.d dVar = z11 ? (e1.d) map.remove(surface) : (e1.d) map.put(surface, e1.j.f15464j);
        if (dVar == null || dVar == e1.j.f15464j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f6870f, dVar.f15444a);
        } catch (RuntimeException e5) {
            wd.a.J("OpenGlRenderer", "Failed to destroy EGL surface: " + e5.getMessage(), e5);
        }
    }

    public void s(long j9, float[] fArr, Surface surface) {
        e1.j.d((AtomicBoolean) this.f6867c, true);
        e1.j.c((Thread) this.f6869e);
        HashMap map = (HashMap) this.f6868d;
        pd.g.n("The surface is not registered.", map.containsKey(surface));
        e1.d dVarD = (e1.d) map.get(surface);
        Objects.requireNonNull(dVarD);
        if (dVarD == e1.j.f15464j) {
            dVarD = d(surface);
            if (dVarD == null) {
                return;
            } else {
                map.put(surface, dVarD);
            }
        }
        int i11 = dVarD.f15446c;
        int i12 = dVarD.f15445b;
        EGLSurface eGLSurface = dVarD.f15444a;
        if (surface != ((Surface) this.f6874j)) {
            n(eGLSurface);
            this.f6874j = surface;
            GLES20.glViewport(0, 0, i12, i11);
            GLES20.glScissor(0, 0, i12, i11);
        }
        e1.h hVar = (e1.h) this.l;
        hVar.getClass();
        if (hVar instanceof e1.i) {
            GLES20.glUniformMatrix4fv(((e1.i) hVar).f15453f, 1, false, fArr, 0);
            e1.j.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        e1.j.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f6870f, eGLSurface, j9);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f6870f, eGLSurface)) {
            return;
        }
        wd.a.I("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        r(surface, false);
    }

    @Override // t1.z1
    public int t() {
        return this.f6865a;
    }

    public void u(int i11) {
        e1.h hVar = (e1.h) ((Map) this.f6875k).get((e1.g) this.f6876m);
        if (hVar == null) {
            i1.q((e1.g) this.f6876m, "Unable to configure program for input format: ");
            return;
        }
        if (((e1.h) this.l) != hVar) {
            this.l = hVar;
            hVar.b();
            Log.d("OpenGlRenderer", "Using program for input format " + ((e1.g) this.f6876m) + ": " + ((e1.h) this.l));
        }
        GLES20.glActiveTexture(33984);
        e1.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, i11);
        e1.j.b("glBindTexture");
    }

    public g(f0 f0Var, g0 g0Var, int i11, u uVar) {
        this.f6867c = f0Var;
        this.f6868d = g0Var;
        this.f6865a = i11;
        this.f6869e = uVar;
        this.f6866b = y1.f39621a;
        float[] fArr = y1.f39622b;
        this.f6870f = fArr;
        this.f6875k = fArr;
        this.l = fArr;
        this.f6876m = y1.f39623c;
    }
}
