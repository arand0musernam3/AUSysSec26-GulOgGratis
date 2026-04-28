package n20;

import ax.p0;
import com.braze.models.Banner;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class f implements kotlin.coroutines.f, y8.b, ax.i, c40.d, fz.a, ha0.b, i40.d, j40.a, s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30304a;

    public /* synthetic */ f(int i11) {
        this.f30304a = i11;
    }

    public static final boolean l(ia0.a0 a0Var) {
        ia0.a0 a0Var2 = ja0.j.f24812f;
        return !kotlin.text.y.j(a0Var.c(), ".class", true);
    }

    public static final float m(float f11, float[] fArr, float[] fArr2) {
        float f12;
        float f13;
        float f14;
        float f15;
        float fAbs = Math.abs(f11);
        float fSignum = Math.signum(f11);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i11 = -(iBinarySearch + 1);
        int i12 = i11 - 1;
        if (i12 >= fArr.length - 1) {
            float f16 = fArr[fArr.length - 1];
            float f17 = fArr2[fArr.length - 1];
            if (f16 == 0.0f) {
                return 0.0f;
            }
            return (f17 / f16) * f11;
        }
        if (i12 == -1) {
            float f18 = fArr[0];
            f14 = fArr2[0];
            f15 = f18;
            f13 = 0.0f;
            f12 = 0.0f;
        } else {
            float f19 = fArr[i12];
            float f20 = fArr[i11];
            f12 = fArr2[i12];
            f13 = f19;
            f14 = fArr2[i11];
            f15 = f20;
        }
        return (((f14 - f12) * Math.max(0.0f, Math.min(1.0f, f13 == f15 ? 0.0f : (fAbs - f13) / (f15 - f13)))) + f12) * fSignum;
    }

    public static String q() {
        return j4.s.e();
    }

    public static ia0.a0 s(String str) {
        str.getClass();
        ia0.j jVar = ja0.c.f24795a;
        ia0.g gVar = new ia0.g();
        gVar.F0(str);
        return ja0.c.d(gVar, false);
    }

    public static ia0.a0 t(File file) {
        String str = ia0.a0.f23602b;
        file.getClass();
        String string = file.toString();
        string.getClass();
        return s(string);
    }

    @Override // s.a
    /* JADX INFO: renamed from: apply */
    public Object mo962apply(Object obj) {
        List list = (List) obj;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return ((qb.n) list.get(0)).a();
    }

    @Override // c40.d
    public String b() {
        return null;
    }

    @Override // fz.a
    public long c() {
        return System.currentTimeMillis();
    }

    @Override // ha0.b
    public void d(String str) {
        aa0.e eVar = aa0.e.f1191a;
        aa0.e.f1191a.i(4, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // j40.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StackTraceElement[] f(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r2
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n20.f.f(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // i40.d
    public i40.b h(r40.d dVar, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        e10.t tVar = jSONObject.has("session") ? new e10.t(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new e10.t(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new i40.b(jSONObject.has(Banner.EXPIRATION) ? jSONObject.optLong(Banner.EXPIRATION) : (((long) iOptInt) * 1000) + System.currentTimeMillis(), tVar, new i40.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // ax.i
    public String i() {
        return "fb_extend_sso_token";
    }

    @Override // ax.i
    public String k() {
        return "oauth/access_token";
    }

    public float n(float f11) {
        return 1.0f;
    }

    public boolean o() {
        return this instanceof g;
    }

    public String toString() {
        switch (this.f30304a) {
            case 1:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public void u(float f11, float f12, float f13, y yVar) {
        yVar.d(f11, 0.0f);
    }

    public synchronized tx.n v() {
        tx.z zVarB = tx.c0.b(ax.a0.b());
        if (zVarB == null) {
            return tx.n.f40530d.p();
        }
        return zVarB.f40589g;
    }

    public synchronized ax.o w() {
        ax.o oVar;
        try {
            if (ax.o.f4976g == null) {
                d9.c cVarA = d9.c.a(ax.a0.a());
                cVarA.getClass();
                ax.o.f4976g = new ax.o(cVarA, new p0());
            }
            oVar = ax.o.f4976g;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                oVar = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return oVar;
    }

    @Override // c40.d
    public void a() {
    }

    @Override // c40.d
    public void j(long j9, String str) {
    }

    public void x(d6.g0 g0Var, int i11, int i12) {
    }
}
