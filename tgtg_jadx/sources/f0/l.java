package f0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.n f16752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.n f16753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.g0 f16754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1 f16755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0.q1 f16756e;

    public l(h0.n nVar, e0.n nVar2, i0.g0 g0Var, l1 l1Var, e0.q1 q1Var) {
        nVar.getClass();
        nVar2.getClass();
        l1Var.getClass();
        q1Var.getClass();
        this.f16752a = nVar;
        this.f16753b = nVar2;
        this.f16754c = g0Var;
        this.f16755d = l1Var;
        this.f16756e = q1Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, u70.j] */
    @Override // f0.k2
    public final j2 a(r1 r1Var, Map map, s2 s2Var) throws Exception {
        e0.m mVarA;
        r1Var.getClass();
        map.getClass();
        s2Var.getClass();
        e0.n nVar = this.f16753b;
        if (nVar.f15376h != 2) {
            m0.i1.j("Unsupported session mode: ", o00.h0.G(this.f16753b.f15376h), " for Extension CameraGraph");
            return null;
        }
        Object obj = nVar.f15375g.get(t1.f16913a);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            com.braze.h2.b("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        int iIntValue = num.intValue();
        if (this.f16753b.f15372d != null) {
            com.braze.h2.b("Reprocessing is not supported for Extensions");
            return null;
        }
        t0 t0Var = (t0) ((k1) this.f16755d).d(r1Var.r());
        Set set = (Set) t0Var.f16910g.getValue();
        e0.q1 q1Var = this.f16756e;
        if (!set.contains(Integer.valueOf(iIntValue))) {
            q1Var.getClass();
            Log.w("CXCP", r1Var + " does not support extension mode " + iIntValue + ". Supported extensions are " + set);
        }
        if (this.f16753b.f15373e != null) {
            synchronized (t0Var.f16909f) {
                mVarA = (e0.m) t0Var.f16909f.get(Integer.valueOf(iIntValue));
            }
            if (mVarA == null) {
                k1 k1Var = t0Var.f16906c;
                String str = t0Var.f16904a;
                str.getClass();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 31) {
                    throw new Exception(j4.s.f(i11, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                }
                try {
                    Trace.beginSection(((Object) e0.s.b(str)) + "#awaitExtensionMetadata");
                    synchronized (k1Var.f16745g) {
                        e0.m mVarA2 = (e0.m) k1Var.f16745g.get(str);
                        if (mVarA2 != null) {
                            mVarA = mVarA2;
                        } else if (k1.c(k1Var)) {
                            mVarA = k1.a(k1Var, str, true, iIntValue);
                        } else {
                            mVarA2 = k1.a(k1Var, str, false, iIntValue);
                            k1Var.f16745g.put(str, mVarA2);
                            mVarA = mVarA2;
                        }
                    }
                    Trace.endSection();
                    synchronized (t0Var.f16909f) {
                        t0Var.f16909f.put(Integer.valueOf(iIntValue), mVarA);
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            e0.q1 q1Var2 = this.f16756e;
            if (!((Boolean) ((r0) mVarA).f16867d.getValue()).booleanValue()) {
                q1Var2.getClass();
                Log.w("CXCP", r1Var + " does not support Postview streams");
            }
            if (this.f16753b.f15373e.f15327a.size() != 1) {
                com.braze.h2.b("Postview streams can only have one OutputStream.config object");
                return null;
            }
        }
        b3 b3VarB = y3.b(this.f16753b, this.f16754c, map);
        if (b3VarB.f16576a.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + this.f16753b);
            s2Var.a();
            return h2.f16710a;
        }
        if (!b3VarB.f16577b.isEmpty()) {
            com.braze.h2.b("Deferred output is not supported for Extensions");
            return null;
        }
        y2 y2Var = new y2(s2Var);
        ArrayList arrayList = b3VarB.f16576a;
        d7.e eVar = new d7.e(this.f16752a.a());
        e0.n nVar2 = this.f16753b;
        if (r1Var.p(new x2(arrayList, eVar, s2Var, nVar2.f15374f, nVar2.f15375g, Integer.valueOf(iIntValue), y2Var, b3VarB.f16578c))) {
            return new i2(b3VarB.f16577b, b3VarB.f16579d);
        }
        Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + r1Var + " for " + s2Var + '!');
        s2Var.a();
        return h2.f16710a;
    }
}
