package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.lifecycle.n1;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import s0.n2;
import s0.o2;
import s0.r2;
import s0.u1;
import s0.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends m1 {
    public static final h0 C = new h0();
    public v1 A;
    public final jb.b B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f28536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference f28537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f28538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f28539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Rational f28540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0.f f28541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u1 f28542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n1 f28543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r0.q f28544z;

    public j0(s0.b1 b1Var) {
        super(b1Var);
        this.f28537s = new AtomicReference(null);
        this.f28539u = -1;
        this.f28540v = null;
        this.B = new jb.b(this);
        s0.b1 b1Var2 = (s0.b1) this.f28560i;
        s0.g gVar = s0.b1.f38285b;
        if (b1Var2.g(gVar)) {
            this.f28536r = ((Integer) b1Var2.d(gVar)).intValue();
        } else {
            this.f28536r = 1;
        }
        this.f28538t = ((Integer) b1Var2.i(s0.b1.f38292i, 0)).intValue();
        this.f28541w = new y0.f((y0.f) b1Var2.i(s0.b1.f38294k, null));
    }

    public static boolean G(int i11, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i11))) {
                return true;
            }
        }
        return false;
    }

    public final void D(boolean z11) {
        r0.q qVar;
        Log.d("ImageCapture", "clearPipeline");
        a.a.t();
        v1 v1Var = this.A;
        if (v1Var != null) {
            v1Var.b();
            this.A = null;
        }
        n1 n1Var = this.f28543y;
        if (n1Var != null) {
            n1Var.i();
            this.f28543y = null;
        }
        if (!z11 && (qVar = this.f28544z) != null) {
            qVar.a();
            this.f28544z = null;
        }
        e().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s0.u1 E(java.lang.String r23, s0.b1 r24, s0.n r25) {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.j0.E(java.lang.String, s0.b1, s0.n):s0.u1");
    }

    public final int F() {
        int iIntValue;
        synchronized (this.f28537s) {
            iIntValue = this.f28539u;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((s0.b1) this.f28560i).i(s0.b1.f38286c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void H(b0 b0Var, Executor executor, jb.b bVar) {
        Rect rect;
        int iRound;
        int i11;
        int i12;
        int i13;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            w.b.U().execute(new b0.g(8, this, b0Var, executor, bVar));
            return;
        }
        a.a.t();
        if (F() == 3 && this.f28541w.f44559a == null) {
            i4.a.f("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        Log.d("ImageCapture", "takePictureInternal");
        s0.i0 i0VarD = d();
        Rect rect2 = null;
        if (i0VarD == null || !this.f28552a) {
            new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
            ((fi.b) bVar.f24851a).invoke(null);
            return;
        }
        boolean z11 = ((Integer) this.f28560i.i(s0.c1.f38308x0, 0)).intValue() != 0;
        if (z11) {
            i4.a.f("Simultaneous capture RAW and JPEG needs two output file options");
            return;
        }
        r0.q qVar = this.f28544z;
        Objects.requireNonNull(qVar);
        Rect rect3 = this.l;
        Size sizeC = c();
        Objects.requireNonNull(sizeC);
        if (rect3 == null) {
            Rational rational = this.f28540v;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect3 = new Rect(0, 0, sizeC.getWidth(), sizeC.getHeight());
                rect = rect3;
            } else {
                s0.i0 i0VarD2 = d();
                Objects.requireNonNull(i0VarD2);
                int i14 = i(i0VarD2, false);
                Rational rational2 = new Rational(this.f28540v.getDenominator(), this.f28540v.getNumerator());
                if (!v0.o.d(i14)) {
                    rational2 = this.f28540v;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    wd.a.I("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = sizeC.getWidth();
                    int height = sizeC.getHeight();
                    float f11 = width;
                    float f12 = height;
                    float f13 = f11 / f12;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f13) {
                        int iRound2 = Math.round((f11 / numerator) * denominator);
                        i13 = (height - iRound2) / 2;
                        i12 = iRound2;
                        iRound = width;
                        i11 = 0;
                    } else {
                        iRound = Math.round((f12 / denominator) * numerator);
                        i11 = (width - iRound) / 2;
                        i12 = height;
                        i13 = 0;
                    }
                    rect2 = new Rect(i11, i13, iRound + i11, i12 + i13);
                }
                Objects.requireNonNull(rect2);
                rect = rect2;
            }
        } else {
            rect = rect3;
        }
        Matrix matrix = this.f28563m;
        int i15 = i(i0VarD, false);
        s0.b1 b1Var = (s0.b1) this.f28560i;
        s0.g gVar = s0.b1.f38293j;
        if (b1Var.g(gVar)) {
            iIntValue = ((Integer) b1Var.d(gVar)).intValue();
        } else {
            int i16 = this.f28536r;
            if (i16 == 0) {
                iIntValue = 100;
            } else {
                if (i16 != 1 && i16 != 2) {
                    h2.b(r8.k.h(i16, "CaptureMode ", " is invalid"));
                    return;
                }
                iIntValue = 95;
            }
        }
        int i17 = iIntValue;
        List listUnmodifiableList = Collections.unmodifiableList(this.f28542x.f38450e);
        pd.g.i("onDiskCallback and outputFileOptions should be both null or both non-null.", !false);
        r0.f fVar = new r0.f(executor, bVar, b0Var, rect, matrix, i15, i17, this.f28536r, z11, listUnmodifiableList);
        if (z11) {
            Boolean bool = Boolean.FALSE;
            HashMap map = fVar.f37451b;
            map.put(32, bool);
            map.put(256, bool);
        }
        a.a.t();
        qVar.f37505a.offer(fVar);
        qVar.b();
    }

    public final void I() {
        synchronized (this.f28537s) {
            try {
                if (this.f28537s.get() != null) {
                    return;
                }
                e().c(F());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m0.m1
    public final o2 g(boolean z11, r2 r2Var) {
        C.getClass();
        s0.b1 b1Var = h0.f28513a;
        s0.u0 u0VarA = r2Var.a(b1Var.n(), this.f28536r);
        if (z11) {
            u0VarA = s0.u0.u(u0VarA, b1Var);
        }
        if (u0VarA == null) {
            return null;
        }
        return new s0.b1(s0.l1.e(((b0.a) m(u0VarA)).f5038b));
    }

    @Override // m0.m1
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // m0.m1
    public final n2 m(s0.u0 u0Var) {
        return new b0.a(s0.i1.s(u0Var));
    }

    @Override // m0.m1
    public final void r() {
        pd.g.m(d(), "Attached camera cannot be null");
        if (F() == 3) {
            s0.i0 i0VarD = d();
            if ((i0VarD != null ? i0VarD.b().k() : -1) == 0) {
                return;
            }
            i4.a.f("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // m0.m1
    public final void s() {
        wd.a.p("ImageCapture", "onCameraControlReady");
        I();
        e().h(this.f28541w);
    }

    @Override // m0.m1
    public final o2 t(s0.g0 g0Var, n2 n2Var) {
        HashSet<n0.b> hashSet = this.f28559h;
        boolean z11 = false;
        if (hashSet != null) {
            int i11 = 0;
            for (n0.b bVar : hashSet) {
                if (bVar instanceof p0.d) {
                    i11 = ((p0.d) bVar).f34102a;
                }
            }
            n2Var.d().v(s0.b1.f38289f, Integer.valueOf(i11));
        }
        if (g0Var.s().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            s0.i1 i1VarD = n2Var.d();
            s0.g gVar = s0.b1.f38291h;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(i1VarD.i(gVar, bool2))) {
                wd.a.I("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                wd.a.y("ImageCapture", "Requesting software JPEG due to device quirk.");
                n2Var.d().v(gVar, bool2);
            }
        }
        s0.i1 i1VarD2 = n2Var.d();
        Boolean bool3 = Boolean.TRUE;
        s0.g gVar2 = s0.b1.f38291h;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(i1VarD2.i(gVar2, bool4))) {
            if (d() != null) {
                d().h().p();
            }
            Integer num = (Integer) i1VarD2.i(s0.b1.f38288e, null);
            if (num == null || num.intValue() == 256) {
                z11 = true;
            } else {
                wd.a.I("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                wd.a.I("ImageCapture", "Unable to support software JPEG. Disabling.");
                i1VarD2.v(gVar2, bool4);
            }
        }
        Integer num2 = (Integer) n2Var.d().i(s0.b1.f38288e, null);
        if (num2 != null) {
            if (d() != null) {
                d().h().p();
            }
            n2Var.d().v(s0.c1.f38307w0, Integer.valueOf(z11 ? 35 : num2.intValue()));
        } else {
            s0.i1 i1VarD3 = n2Var.d();
            s0.g gVar3 = s0.b1.f38289f;
            if (Objects.equals(i1VarD3.i(gVar3, null), 2)) {
                n2Var.d().v(s0.c1.f38307w0, 32);
            } else if (Objects.equals(n2Var.d().i(gVar3, null), 3)) {
                n2Var.d().v(s0.c1.f38307w0, 32);
                n2Var.d().v(s0.c1.f38308x0, 256);
            } else if (Objects.equals(n2Var.d().i(gVar3, null), 1)) {
                n2Var.d().v(s0.c1.f38307w0, 4101);
                n2Var.d().v(s0.c1.f38309y0, c0.f28477c);
            } else if (z11) {
                n2Var.d().v(s0.c1.f38307w0, 35);
            } else {
                List list = (List) n2Var.d().i(s0.d1.G0, null);
                if (list == null || G(256, list)) {
                    n2Var.d().v(s0.c1.f38307w0, 256);
                } else if (G(35, list)) {
                    n2Var.d().v(s0.c1.f38307w0, 35);
                }
            }
        }
        return n2Var.f();
    }

    public final String toString() {
        return "ImageCapture:".concat(h());
    }

    @Override // m0.m1
    public final void v() {
        y0.f fVar = this.f28541w;
        fVar.c();
        fVar.b();
        r0.q qVar = this.f28544z;
        if (qVar != null) {
            qVar.a();
        }
    }

    @Override // m0.m1
    public final s0.n w(s0.u0 u0Var) {
        this.f28542x.a(u0Var);
        Object[] objArr = {this.f28542x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        g40.b bVarB = this.f28561j.b();
        bVarB.f20005f = u0Var;
        return bVarB.d();
    }

    @Override // m0.m1
    public final s0.n x(s0.n nVar, s0.n nVar2) {
        wd.a.p("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + nVar + ", secondaryStreamSpec " + nVar2);
        u1 u1VarE = E(f(), (s0.b1) this.f28560i, nVar);
        this.f28542x = u1VarE;
        Object[] objArr = {u1VarE.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        this.f28556e = k1.ACTIVE;
        q();
        return nVar;
    }

    @Override // m0.m1
    public final void y() {
        y0.f fVar = this.f28541w;
        fVar.c();
        fVar.b();
        r0.q qVar = this.f28544z;
        if (qVar != null) {
            qVar.a();
        }
        D(false);
        e().h(null);
    }
}
