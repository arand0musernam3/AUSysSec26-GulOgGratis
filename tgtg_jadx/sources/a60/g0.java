package a60;

import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f870f;

    public g0(b0 b0Var) {
        this.f865a = b0Var;
        Set set = b60.f.f6049a;
        this.f866b = b0Var.a(List.class, set, null);
        this.f867c = b0Var.a(Map.class, set, null);
        this.f868d = b0Var.a(String.class, set, null);
        this.f869e = b0Var.a(Double.class, set, null);
        this.f870f = b0Var.a(Boolean.class, set, null);
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        switch (e0.f853a[pVar.i0().ordinal()]) {
            case 1:
                return this.f866b.a(pVar);
            case 2:
                return this.f867c.a(pVar);
            case 3:
                return this.f868d.a(pVar);
            case 4:
                return this.f869e.a(pVar);
            case 5:
                return this.f870f.a(pVar);
            case 6:
                pVar.Q();
                return null;
            default:
                StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                sb2.append(pVar.i0());
                String strB = pVar.B();
                sb2.append(" at path ");
                sb2.append(strB);
                throw new IllegalStateException(sb2.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r1
      0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a60.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(a60.q r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.g()
            r5.r()
            return
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = b60.f.f6049a
            r2 = 0
            a60.b0 r3 = r4.f865a
            a60.k r0 = r3.a(r0, r1, r2)
            r0.e(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a60.g0.e(a60.q, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
