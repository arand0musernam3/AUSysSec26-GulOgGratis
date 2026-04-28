package i0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.pipe.compat.ObjectUnavailableException;
import com.adyen.checkout.components.core.Address;
import com.braze.h2;
import e0.h1;
import e0.i1;
import e0.k1;
import e0.r0;
import f0.w0;
import f0.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q1.l1;
import s0.j1;
import s0.k2;
import s0.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f22749f;

    public w(String str) {
        this.f22744a = 4;
        str.getClass();
        a3.j jVar = new a3.j(7, (char) 0);
        jVar.f399c = new Object[8];
        int[] iArr = new int[8];
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = -1;
        }
        jVar.f400d = iArr;
        jVar.f398b = -1;
        this.f22746c = jVar;
        this.f22748e = new StringBuilder();
        this.f22749f = str;
    }

    public static /* synthetic */ void t(w wVar, String str, int i11, String str2, int i12) {
        if ((i12 & 2) != 0) {
            i11 = wVar.f22745b;
        }
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        wVar.s(i11, str, str2);
        throw null;
    }

    public g9.y A(g9.y yVar, a8.h hVar, boolean z11, g9.z zVar) {
        g9.y yVarN;
        g9.b0 b0Var = (g9.b0) this.f22746c;
        zVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = b0Var.iterator();
        while (true) {
            l9.i iVar = (l9.i) it;
            if (!iVar.hasNext()) {
                break;
            }
            g9.z zVar2 = (g9.z) iVar.next();
            yVarN = Intrinsics.areEqual(zVar2, zVar) ? null : zVar2.i(hVar);
            if (yVarN != null) {
                arrayList.add(yVarN);
            }
        }
        g9.y yVar2 = (g9.y) CollectionsKt.Y(arrayList);
        g9.b0 b0Var2 = b0Var.f20259c;
        if (b0Var2 != null && z11 && !Intrinsics.areEqual(b0Var2, zVar)) {
            yVarN = b0Var2.n(hVar, b0Var);
        }
        return (g9.y) CollectionsKt.Y(kotlin.collections.y.w(new g9.y[]{yVar, yVar2, yVarN}));
    }

    public String B(String str, boolean z11) {
        str.getClass();
        int i11 = this.f22745b;
        try {
            if (l() == 6 && Intrinsics.areEqual(D(z11), str)) {
                this.f22747d = null;
                if (l() == 5) {
                    return D(z11);
                }
            }
            return null;
        } finally {
            this.f22745b = i11;
            this.f22747d = null;
        }
    }

    public byte C() {
        String str = (String) this.f22749f;
        int i11 = this.f22745b;
        while (true) {
            int iE = E(i11);
            if (iE == -1) {
                this.f22745b = iE;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iE);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f22745b = iE;
                return o90.k.g(cCharAt);
            }
            i11 = iE + 1;
        }
    }

    public String D(boolean z11) {
        String strP;
        byte bC = C();
        if (z11) {
            if (bC != 1 && bC != 0) {
                return null;
            }
            strP = q();
        } else {
            if (bC != 1) {
                return null;
            }
            strP = p();
        }
        this.f22747d = strP;
        return strP;
    }

    public int E(int i11) {
        if (i11 < ((String) this.f22749f).length()) {
            return i11;
        }
        return -1;
    }

    public void F(float f11) {
        ((Paint) this.f22746c).setAlpha((int) Math.rint(f11 * 255.0f));
    }

    public void G(int i11) {
        if (this.f22745b == i11) {
            return;
        }
        this.f22745b = i11;
        Paint paint = (Paint) this.f22746c;
        if (Build.VERSION.SDK_INT >= 29) {
            i4.b.c(paint, i11);
        } else {
            paint.setXfermode(new PorterDuffXfermode(i4.b.e(i11)));
        }
    }

    public void H(long j9) {
        ((Paint) this.f22746c).setColor(i4.g0.C(j9));
    }

    public void I(i4.w wVar) {
        this.f22748e = wVar;
        ((Paint) this.f22746c).setColorFilter(wVar != null ? wVar.f23318a : null);
    }

    public void J(int i11) {
        ((Paint) this.f22746c).setFilterBitmap(!(i11 == 0));
    }

    public void K(i4.i iVar) {
        ((Paint) this.f22746c).setPathEffect(iVar != null ? iVar.f23263a : null);
        this.f22749f = iVar;
    }

    public void L(Shader shader) {
        this.f22747d = shader;
        ((Paint) this.f22746c).setShader(shader);
    }

    public void M(int i11) {
        g9.b0 b0Var = (g9.b0) this.f22746c;
        if (i11 != b0Var.f20258b.f27563e) {
            if (((String) this.f22749f) != null) {
                N(null);
            }
            this.f22745b = i11;
            this.f22748e = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i11 + " cannot use the same id as the graph " + b0Var).toString());
    }

    public void N(String str) {
        int iHashCode;
        g9.b0 b0Var = (g9.b0) this.f22746c;
        if (str == null) {
            iHashCode = 0;
        } else if (Intrinsics.areEqual(str, b0Var.f20258b.f27564f)) {
            i4.a.g("Start destination ", str, " cannot use the same route as the graph ", b0Var);
            return;
        } else if (StringsKt.H(str)) {
            i4.a.f("Cannot have an empty start destination route");
            return;
        } else {
            int i11 = g9.z.f20256f;
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.f22745b = iHashCode;
        this.f22749f = str;
    }

    public void O(int i11) {
        ((Paint) this.f22746c).setStrokeCap(i11 == 2 ? Paint.Cap.SQUARE : i11 == 1 ? Paint.Cap.ROUND : i11 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void P(int i11) {
        ((Paint) this.f22746c).setStrokeJoin(i11 == 0 ? Paint.Join.MITER : i11 == 2 ? Paint.Join.BEVEL : i11 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void Q(float f11) {
        ((Paint) this.f22746c).setStrokeWidth(f11);
    }

    public void R(int i11) {
        ((Paint) this.f22746c).setStyle(i11 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public Unit S() {
        Log.d("CXCP", "Closing " + this);
        if (!((r80.a) this.f22747d).a()) {
            return Unit.f26487a;
        }
        ((x0) this.f22746c).c();
        Unit unit = Unit.f26487a;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return unit;
    }

    public int T() {
        char cCharAt;
        int i11 = this.f22745b;
        if (i11 == -1) {
            return i11;
        }
        String str = (String) this.f22749f;
        while (i11 < str.length() && ((cCharAt = str.charAt(i11)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i11++;
        }
        this.f22745b = i11;
        return i11;
    }

    public void U() {
        x0 x0Var = (x0) this.f22746c;
        synchronized (x0Var.f16979j) {
            Log.d("CXCP", x0Var + "#stopRepeating");
            x0Var.f16970a.d0();
        }
    }

    public boolean V(boolean z11, List list, Map map, Map map2, Map map3, List list2) throws Exception {
        Throwable th2;
        boolean z12;
        boolean zIsTerminated;
        list.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        list2.getClass();
        if (((r80.a) this.f22747d).b()) {
            Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            w0 w0VarB = ((x0) this.f22746c).b(z11, list, map, map2, map3, (a50.c) this.f22749f, list2);
            Trace.endSection();
            boolean z13 = true;
            if (w0VarB == null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((i1) it.next()).f15360f != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                i1 i1Var = (i1) it2.next();
                                r0 r0Var = i1Var.f15360f;
                                if (r0Var != null) {
                                    k0.f fVar = r0Var.f15401a;
                                    if (fVar instanceof AutoCloseable) {
                                        fVar.close();
                                    } else {
                                        if (!(fVar instanceof ExecutorService)) {
                                            i4.a.h();
                                            return false;
                                        }
                                        ExecutorService executorService = (ExecutorService) fVar;
                                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                            executorService.shutdown();
                                            boolean z14 = false;
                                            while (!zIsTerminated) {
                                                try {
                                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
                                                    if (!z14) {
                                                        executorService.shutdownNow();
                                                        z14 = true;
                                                    }
                                                }
                                            }
                                            if (z14) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
                                Iterator it3 = i1Var.f15358d.iterator();
                                while (it3.hasNext()) {
                                    ((h1) it3.next()).t(i1Var);
                                }
                            }
                            return true;
                        }
                    }
                }
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            }
            if (((r80.a) this.f22747d).b()) {
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            }
            if (!w0VarB.f16939b) {
                synchronized (((ArrayList) this.f22748e)) {
                    ((ArrayList) this.f22748e).add(w0VarB);
                }
            }
            try {
                Log.d("CXCP", this + " submitting " + w0VarB);
                Trace.beginSection("InvokeInternalListeners");
                int size = w0VarB.f16941d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    k1 k1Var = (k1) w0VarB.f16941d.get(i11);
                    int size2 = w0VarB.f16942e.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((h1) w0VarB.f16942e.get(i12)).e(k1Var);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = w0VarB.f16941d.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    k1 k1Var2 = (k1) w0VarB.f16941d.get(i13);
                    int size4 = k1Var2.e().f15358d.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        ((h1) k1Var2.e().f15358d.get(i14)).e(k1Var2);
                    }
                }
            } catch (CameraAccessException unused2) {
                if (!w0VarB.f16939b) {
                    synchronized (((ArrayList) this.f22748e)) {
                        ((ArrayList) this.f22748e).remove(w0VarB);
                        Trace.beginSection("InvokeInternalListeners");
                        int size5 = w0VarB.f16941d.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            k1 k1Var3 = (k1) w0VarB.f16941d.get(i15);
                            int size6 = w0VarB.f16942e.size();
                            for (int i16 = 0; i16 < size6; i16++) {
                                ((h1) w0VarB.f16942e.get(i16)).t(k1Var3.e());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size7 = w0VarB.f16941d.size();
                        for (int i17 = 0; i17 < size7; i17++) {
                            k1 k1Var4 = (k1) w0VarB.f16941d.get(i17);
                            int size8 = k1Var4.e().f15358d.size();
                            for (int i18 = 0; i18 < size8; i18++) {
                                ((h1) k1Var4.e().f15358d.get(i18)).t(k1Var4.e());
                            }
                        }
                    }
                }
            } catch (ObjectUnavailableException unused3) {
                if (!w0VarB.f16939b) {
                    synchronized (((ArrayList) this.f22748e)) {
                        ((ArrayList) this.f22748e).remove(w0VarB);
                        Trace.beginSection("InvokeInternalListeners");
                        int size9 = w0VarB.f16941d.size();
                        for (int i19 = 0; i19 < size9; i19++) {
                            k1 k1Var5 = (k1) w0VarB.f16941d.get(i19);
                            int size10 = w0VarB.f16942e.size();
                            for (int i21 = 0; i21 < size10; i21++) {
                                ((h1) w0VarB.f16942e.get(i21)).t(k1Var5.e());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size11 = w0VarB.f16941d.size();
                        for (int i22 = 0; i22 < size11; i22++) {
                            k1 k1Var6 = (k1) w0VarB.f16941d.get(i22);
                            int size12 = k1Var6.e().f15358d.size();
                            for (int i23 = 0; i23 < size12; i23++) {
                                ((h1) k1Var6.e().f15358d.get(i23)).t(k1Var6.e());
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                z13 = false;
            }
            synchronized (w0VarB) {
                if (!((r80.a) this.f22747d).b()) {
                    try {
                        Trace.beginSection("CXCP#submit(CaptureSequence)");
                        Integer numD = ((x0) this.f22746c).d(w0VarB);
                        int iIntValue = numD != null ? numD.intValue() : -1;
                        w0VarB.f16949m = Integer.valueOf(iIntValue);
                        if (iIntValue != -1) {
                            Trace.beginSection("InvokeInternalListeners");
                            int size13 = w0VarB.f16941d.size();
                            for (int i24 = 0; i24 < size13; i24++) {
                                k1 k1Var7 = (k1) w0VarB.f16941d.get(i24);
                                int size14 = w0VarB.f16942e.size();
                                for (int i25 = 0; i25 < size14; i25++) {
                                    ((h1) w0VarB.f16942e.get(i25)).J(k1Var7);
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = w0VarB.f16941d.size();
                            for (int i26 = 0; i26 < size15; i26++) {
                                k1 k1Var8 = (k1) w0VarB.f16941d.get(i26);
                                int size16 = k1Var8.e().f15358d.size();
                                for (int i27 = 0; i27 < size16; i27++) {
                                    ((h1) k1Var8.e().f15358d.get(i27)).J(k1Var8);
                                }
                            }
                            try {
                                Log.d("CXCP", this + " submitted " + w0VarB);
                                z12 = true;
                            } catch (CameraAccessException | ObjectUnavailableException unused4) {
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (z13 || w0VarB.f16939b) {
                                    throw th2;
                                }
                                synchronized (((ArrayList) this.f22748e)) {
                                    ((ArrayList) this.f22748e).remove(w0VarB);
                                }
                                Trace.beginSection("InvokeInternalListeners");
                                int size17 = w0VarB.f16941d.size();
                                for (int i28 = 0; i28 < size17; i28++) {
                                    k1 k1Var9 = (k1) w0VarB.f16941d.get(i28);
                                    int size18 = w0VarB.f16942e.size();
                                    for (int i29 = 0; i29 < size18; i29++) {
                                        ((h1) w0VarB.f16942e.get(i29)).t(k1Var9.e());
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size19 = w0VarB.f16941d.size();
                                for (int i31 = 0; i31 < size19; i31++) {
                                    k1 k1Var10 = (k1) w0VarB.f16941d.get(i31);
                                    int size20 = k1Var10.e().f15358d.size();
                                    for (int i32 = 0; i32 < size20; i32++) {
                                        ((h1) k1Var10.e().f15358d.get(i32)).t(k1Var10.e());
                                    }
                                }
                                throw th2;
                            }
                        } else {
                            Log.w("CXCP", "Failed to submit " + w0VarB + ": " + this + " received -1 from submit.");
                            z12 = false;
                            z13 = false;
                        }
                        if (z12 || w0VarB.f16939b) {
                            return z13;
                        }
                        synchronized (((ArrayList) this.f22748e)) {
                            ((ArrayList) this.f22748e).remove(w0VarB);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = w0VarB.f16941d.size();
                        for (int i33 = 0; i33 < size21; i33++) {
                            k1 k1Var11 = (k1) w0VarB.f16941d.get(i33);
                            int size22 = w0VarB.f16942e.size();
                            for (int i34 = 0; i34 < size22; i34++) {
                                ((h1) w0VarB.f16942e.get(i34)).t(k1Var11.e());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = w0VarB.f16941d.size();
                        for (int i35 = 0; i35 < size23; i35++) {
                            k1 k1Var12 = (k1) w0VarB.f16941d.get(i35);
                            int size24 = k1Var12.e().f15358d.size();
                            for (int i36 = 0; i36 < size24; i36++) {
                                ((h1) k1Var12.e().f15358d.get(i36)).t(k1Var12.e());
                            }
                        }
                        return z13;
                    } finally {
                    }
                }
                Log.w("CXCP", "Failed to submit " + w0VarB + ": " + this + " is closed.");
                if (!w0VarB.f16939b) {
                    synchronized (((ArrayList) this.f22748e)) {
                        ((ArrayList) this.f22748e).remove(w0VarB);
                    }
                    Trace.beginSection("InvokeInternalListeners");
                    int size25 = w0VarB.f16941d.size();
                    for (int i37 = 0; i37 < size25; i37++) {
                        k1 k1Var13 = (k1) w0VarB.f16941d.get(i37);
                        int size26 = w0VarB.f16942e.size();
                        for (int i38 = 0; i38 < size26; i38++) {
                            ((h1) w0VarB.f16942e.get(i38)).t(k1Var13.e());
                        }
                    }
                    Trace.endSection();
                    Trace.beginSection("InvokeRequestListeners");
                    int size27 = w0VarB.f16941d.size();
                    for (int i39 = 0; i39 < size27; i39++) {
                        k1 k1Var14 = (k1) w0VarB.f16941d.get(i39);
                        int size28 = k1Var14.e().f15358d.size();
                        for (int i41 = 0; i41 < size28; i41++) {
                            ((h1) k1Var14.e().f15358d.get(i41)).t(k1Var14.e());
                        }
                    }
                    return false;
                }
                return false;
            }
        } finally {
            Trace.endSection();
        }
    }

    public boolean W() {
        int iT = T();
        String str = (String) this.f22749f;
        if (iT >= str.length() || iT == -1 || str.charAt(iT) != ',') {
            return false;
        }
        this.f22745b++;
        return true;
    }

    public void X(char c3) {
        String str = (String) this.f22749f;
        int i11 = this.f22745b;
        if (i11 > 0 && c3 == '\"') {
            try {
                this.f22745b = i11 - 1;
                String strQ = q();
                this.f22745b = i11;
                if (Intrinsics.areEqual(strQ, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    s(this.f22745b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f22745b = i11;
                throw th2;
            }
        }
        String strS = o90.k.s(o90.k.g(c3));
        int i12 = this.f22745b;
        int i13 = i12 - 1;
        t(this, org.bouncycastle.jcajce.provider.asymmetric.a.d("Expected ", strS, ", but had '", (i12 == str.length() || i13 < 0) ? "EOF" : String.valueOf(str.charAt(i13)), "' instead"), i13, null, 4);
        throw null;
    }

    public void a() {
        List<w0> listR0;
        synchronized (((ArrayList) this.f22748e)) {
            listR0 = CollectionsKt.r0((ArrayList) this.f22748e);
            ((ArrayList) this.f22748e).clear();
        }
        for (w0 w0Var : listR0) {
            Trace.beginSection("InvokeInternalListeners");
            int size = w0Var.f16941d.size();
            for (int i11 = 0; i11 < size; i11++) {
                k1 k1Var = (k1) w0Var.f16941d.get(i11);
                int size2 = w0Var.f16942e.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((h1) w0Var.f16942e.get(i12)).t(k1Var.e());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = w0Var.f16941d.size();
            for (int i13 = 0; i13 < size3; i13++) {
                k1 k1Var2 = (k1) w0Var.f16941d.get(i13);
                int size4 = k1Var2.e().f15358d.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((h1) k1Var2.e().f15358d.get(i14)).t(k1Var2.e());
                }
            }
            Trace.endSection();
        }
        x0 x0Var = (x0) this.f22746c;
        synchronized (x0Var.f16979j) {
            Log.d("CXCP", x0Var + "#abortCaptures");
            x0Var.f16970a.K();
        }
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((s0.p) it.next());
        }
    }

    public void c(s0.p pVar) {
        ArrayList arrayList = (ArrayList) this.f22748e;
        if (arrayList.contains(pVar)) {
            return;
        }
        arrayList.add(pVar);
    }

    public void d(g9.z zVar) {
        l1 l1Var = (l1) this.f22747d;
        g9.b0 b0Var = (g9.b0) this.f22746c;
        l9.h hVar = b0Var.f20258b;
        zVar.getClass();
        l9.h hVar2 = zVar.f20258b;
        int i11 = hVar2.f27563e;
        String str = hVar2.f27564f;
        if (i11 == 0 && str == null) {
            i4.a.f("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = hVar.f27564f;
        if (str2 != null && Intrinsics.areEqual(str, str2)) {
            i4.a.g("Destination ", zVar, " cannot have the same route as graph ", b0Var);
            return;
        }
        if (i11 == hVar.f27563e) {
            i4.a.g("Destination ", zVar, " cannot have the same id as graph ", b0Var);
            return;
        }
        g9.z zVar2 = (g9.z) l1Var.b(i11);
        if (zVar2 == zVar) {
            return;
        }
        if (zVar.f20259c != null) {
            h2.b("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (zVar2 != null) {
            zVar2.f20259c = null;
        }
        zVar.f20259c = b0Var;
        l1Var.d(hVar2.f27563e, zVar);
    }

    public void e(u0 u0Var) {
        for (s0.g gVar : u0Var.c()) {
            ((s0.i1) this.f22747d).i(gVar, null);
            ((s0.i1) this.f22747d).x(gVar, u0Var.f(gVar), u0Var.d(gVar));
        }
    }

    public void f(double d3, float f11) {
        int length = ((float[]) this.f22746c).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.f22747d, d3);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f22747d = Arrays.copyOf((double[]) this.f22747d, length);
        this.f22746c = Arrays.copyOf((float[]) this.f22746c, length);
        this.f22748e = new double[length];
        double[] dArr = (double[]) this.f22747d;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.f22747d)[iBinarySearch] = d3;
        ((float[]) this.f22746c)[iBinarySearch] = f11;
    }

    public int g(int i11, CharSequence charSequence) {
        int i12 = i11 + 4;
        if (i12 < charSequence.length()) {
            ((StringBuilder) this.f22748e).append((char) (x(i11 + 3, charSequence) + (x(i11, charSequence) << 12) + (x(i11 + 1, charSequence) << 8) + (x(i11 + 2, charSequence) << 4)));
            return i12;
        }
        this.f22745b = i11;
        if (i12 < charSequence.length()) {
            return g(this.f22745b, charSequence);
        }
        t(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public s0.r0 h() {
        ArrayList arrayList = new ArrayList((HashSet) this.f22746c);
        s0.l1 l1VarE = s0.l1.e((s0.i1) this.f22747d);
        int i11 = this.f22745b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f22748e);
        j1 j1Var = (j1) this.f22749f;
        k2 k2Var = k2.f38372b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : j1Var.f38373a.keySet()) {
            arrayMap.put(str, j1Var.f38373a.get(str));
        }
        return new s0.r0(arrayList, l1VarE, i11, arrayList2, new k2(arrayMap));
    }

    public boolean i() {
        int i11 = this.f22745b;
        if (i11 == -1) {
            return false;
        }
        String str = (String) this.f22749f;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f22745b = i11;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i11++;
        }
        this.f22745b = i11;
        return false;
    }

    public void j(int i11, String str) {
        String str2 = (String) this.f22749f;
        if (str2.length() - i11 < str.length()) {
            t(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) != (str2.charAt(i11 + i12) | ' ')) {
                t(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f22745b = str.length() + i11;
    }

    public String k() {
        String string;
        StringBuilder sb2 = (StringBuilder) this.f22748e;
        String str = (String) this.f22749f;
        n('\"');
        int i11 = this.f22745b;
        int iF = StringsKt.F(str, '\"', i11, false, 4);
        if (iF == -1) {
            q();
            int i12 = this.f22745b;
            t(this, w.a0.p("Expected quotation mark '\"', but had '", (i12 == str.length() || i12 < 0) ? "EOF" : String.valueOf(str.charAt(i12)), "' instead"), i12, null, 4);
            throw null;
        }
        int i13 = i11;
        while (i13 < iF) {
            if (str.charAt(i13) == '\\') {
                int iE = this.f22745b;
                char cCharAt = str.charAt(i13);
                boolean z11 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb2.append((CharSequence) str, iE, i13);
                        int iE2 = E(i13 + 1);
                        if (iE2 == -1) {
                            t(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iG = iE2 + 1;
                        char cCharAt2 = str.charAt(iE2);
                        if (cCharAt2 == 'u') {
                            iG = g(iG, str);
                        } else {
                            char c3 = cCharAt2 < 'u' ? o90.e.f32164a[cCharAt2] : (char) 0;
                            if (c3 == 0) {
                                t(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb2.append(c3);
                        }
                        iE = E(iG);
                        if (iE == -1) {
                            t(this, "Unexpected EOF", iE, null, 4);
                            throw null;
                        }
                    } else {
                        i13++;
                        if (i13 >= str.length()) {
                            sb2.append((CharSequence) str, iE, i13);
                            iE = E(i13);
                            if (iE == -1) {
                                t(this, "Unexpected EOF", iE, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i13);
                        }
                    }
                    i13 = iE;
                    z11 = true;
                    cCharAt = str.charAt(i13);
                }
                if (z11) {
                    sb2.append((CharSequence) str, iE, i13);
                    String string2 = sb2.toString();
                    sb2.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iE, i13).toString();
                }
                this.f22745b = i13 + 1;
                return string;
            }
            i13++;
        }
        this.f22745b = iF + 1;
        return str.substring(i11, iF);
    }

    public byte l() {
        String str = (String) this.f22749f;
        int i11 = this.f22745b;
        while (i11 != -1 && i11 < str.length()) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f22745b = i12;
                return o90.k.g(cCharAt);
            }
            i11 = i12;
        }
        this.f22745b = str.length();
        return (byte) 10;
    }

    public byte m(byte b8) {
        String str = (String) this.f22749f;
        byte bL = l();
        if (bL == b8) {
            return bL;
        }
        String strS = o90.k.s(b8);
        int i11 = this.f22745b;
        int i12 = i11 - 1;
        t(this, org.bouncycastle.jcajce.provider.asymmetric.a.d("Expected ", strS, ", but had '", (i11 == str.length() || i12 < 0) ? "EOF" : String.valueOf(str.charAt(i12)), "' instead"), i12, null, 4);
        throw null;
    }

    public void n(char c3) {
        int i11 = this.f22745b;
        if (i11 == -1) {
            X(c3);
            throw null;
        }
        String str = (String) this.f22749f;
        while (i11 < str.length()) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f22745b = i12;
                if (cCharAt == c3) {
                    return;
                }
                X(c3);
                throw null;
            }
            i11 = i12;
        }
        this.f22745b = -1;
        X(c3);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0182, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0183, code lost:
    
        e40.a.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0188, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0191, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0194, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0195, code lost:
    
        t(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019b, code lost:
    
        t(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        t(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
    
        t(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        t(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        r21.f22745b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013c, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0146, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        t(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        t(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o() {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.w.o():long");
    }

    public String p() {
        String str = (String) this.f22747d;
        if (str == null) {
            return k();
        }
        str.getClass();
        this.f22747d = null;
        return str;
    }

    public String q() {
        String string;
        StringBuilder sb2 = (StringBuilder) this.f22748e;
        String str = (String) this.f22749f;
        String str2 = (String) this.f22747d;
        if (str2 != null) {
            str2.getClass();
            this.f22747d = null;
            return str2;
        }
        int iT = T();
        if (iT >= str.length() || iT == -1) {
            t(this, "EOF", iT, null, 4);
            throw null;
        }
        byte bG = o90.k.g(str.charAt(iT));
        if (bG == 1) {
            return p();
        }
        if (bG != 0) {
            t(this, "Expected beginning of the string, but got " + str.charAt(iT), 0, null, 6);
            throw null;
        }
        boolean z11 = false;
        while (o90.k.g(str.charAt(iT)) == 0) {
            iT++;
            if (iT >= str.length()) {
                sb2.append((CharSequence) str, this.f22745b, iT);
                int iE = E(iT);
                if (iE == -1) {
                    this.f22745b = iT;
                    sb2.append((CharSequence) str, 0, 0);
                    String string2 = sb2.toString();
                    sb2.setLength(0);
                    return string2;
                }
                iT = iE;
                z11 = true;
            }
        }
        int i11 = this.f22745b;
        if (z11) {
            sb2.append((CharSequence) str, i11, iT);
            String string3 = sb2.toString();
            sb2.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i11, iT).toString();
        }
        this.f22745b = iT;
        return string;
    }

    public String r() {
        String strQ = q();
        if (!Intrinsics.areEqual(strQ, Address.ADDRESS_NULL_PLACEHOLDER) || ((String) this.f22749f).charAt(this.f22745b - 1) == '\"') {
            return strQ;
        }
        t(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void s(int i11, String str, String str2) {
        str2.getClass();
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbR = e0.f.r(str, " at path: ");
        sbR.append(((a3.j) this.f22746c).m());
        sbR.append(strConcat);
        throw o90.k.d(i11, sbR.toString(), (String) this.f22749f);
    }

    public String toString() {
        switch (this.f22744a) {
            case 0:
                return "GraphRequestProcessor-" + this.f22745b;
            case 1:
            case 3:
            default:
                return super.toString();
            case 2:
                return "pos =" + Arrays.toString((double[]) this.f22747d) + " period=" + Arrays.toString((float[]) this.f22746c);
            case 4:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.f22749f);
                sb2.append("', currentPosition=");
                return r8.k.o(sb2, this.f22745b, ')');
        }
    }

    public g9.z u(int i11) {
        return w(i11, (g9.b0) this.f22746c, null, false);
    }

    public g9.z v(String str, boolean z11) {
        Object next;
        g9.b0 b0Var;
        str.getClass();
        l1 l1Var = (l1) this.f22747d;
        l1Var.getClass();
        Iterator it = o80.o.b(new k90.f(l1Var, 2)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            g9.z zVar = (g9.z) next;
            if (kotlin.text.y.k(zVar.f20258b.f27564f, str, false) || zVar.f20258b.a(str) != null) {
                break;
            }
        }
        g9.z zVar2 = (g9.z) next;
        if (zVar2 != null) {
            return zVar2;
        }
        if (!z11 || (b0Var = ((g9.b0) this.f22746c).f20259c) == null) {
            return null;
        }
        w wVar = b0Var.f20106g;
        wVar.getClass();
        if (StringsKt.H(str)) {
            return null;
        }
        return wVar.v(str, true);
    }

    public g9.z w(int i11, g9.z zVar, g9.z zVar2, boolean z11) {
        g9.b0 b0Var = (g9.b0) this.f22746c;
        l1 l1Var = (l1) this.f22747d;
        g9.z zVarW = (g9.z) l1Var.b(i11);
        if (zVar2 != null) {
            if (Intrinsics.areEqual(zVarW, zVar2) && Intrinsics.areEqual(zVarW.f20259c, zVar2.f20259c)) {
                return zVarW;
            }
            zVarW = null;
        } else if (zVarW != null) {
            return zVarW;
        }
        if (z11) {
            Iterator it = o80.o.b(new k90.f(l1Var, 2)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    zVarW = null;
                    break;
                }
                g9.z zVar3 = (g9.z) it.next();
                zVarW = (!(zVar3 instanceof g9.b0) || Intrinsics.areEqual(zVar3, zVar)) ? null : ((g9.b0) zVar3).f20106g.w(i11, b0Var, zVar2, true);
                if (zVarW != null) {
                    break;
                }
            }
        }
        if (zVarW != null) {
            return zVarW;
        }
        g9.b0 b0Var2 = b0Var.f20259c;
        if (b0Var2 == null || Intrinsics.areEqual(b0Var2, zVar)) {
            return null;
        }
        g9.b0 b0Var3 = b0Var.f20259c;
        b0Var3.getClass();
        return b0Var3.f20106g.w(i11, b0Var, zVar2, z11);
    }

    public int x(int i11, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i11);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        t(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public int y() {
        Paint.Cap strokeCap = ((Paint) this.f22746c).getStrokeCap();
        int i11 = strokeCap == null ? -1 : i4.g.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int z() {
        Paint.Join strokeJoin = ((Paint) this.f22746c).getStrokeJoin();
        int i11 = strokeJoin == null ? -1 : i4.g.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 1;
        }
        return 2;
    }

    public w(Paint paint) {
        this.f22744a = 1;
        this.f22746c = paint;
        this.f22745b = 3;
    }

    public w(x0 x0Var) {
        this.f22744a = 0;
        this.f22746c = x0Var;
        r80.b bVar = x.f22750a;
        bVar.getClass();
        this.f22745b = r80.b.f37780b.incrementAndGet(bVar);
        this.f22747d = w.b.p(false);
        this.f22748e = new ArrayList();
        this.f22749f = new a50.c(this, 24);
    }

    public w(g9.b0 b0Var) {
        this.f22744a = 3;
        this.f22746c = b0Var;
        this.f22747d = new l1(0);
    }

    public w(int i11) {
        this.f22744a = i11;
        switch (i11) {
            case 5:
                this.f22746c = new HashSet();
                this.f22747d = s0.i1.h();
                this.f22745b = -1;
                this.f22748e = new ArrayList();
                this.f22749f = j1.a();
                break;
        }
    }
}
