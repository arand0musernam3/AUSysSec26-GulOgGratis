package m3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f29455a;

    public u1(Function0 function0) {
        this.f29455a = new w0(function0);
    }

    public abstract v1 a(Object obj);

    public f3 b() {
        return this.f29455a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 m3.f3) = (r5v8 m3.f3), (r5v9 m3.f3) binds: [B:21:0x0041, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m3.f3 c(m3.v1 r4, m3.f3 r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof m3.m0
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r4.f29467b
            if (r0 == 0) goto L44
            r1 = r5
            m3.m0 r1 = (m3.m0) r1
            m3.k1 r5 = r1.f29333a
            java.lang.Object r0 = r4.c()
            r5.setValue(r0)
            goto L44
        L16:
            boolean r0 = r5 instanceof m3.e3
            if (r0 == 0) goto L36
            boolean r0 = r4.f29466a
            if (r0 != 0) goto L22
            java.lang.Object r0 = r4.f29471f
            if (r0 == 0) goto L44
        L22:
            boolean r0 = r4.f29467b
            if (r0 != 0) goto L44
            java.lang.Object r0 = r4.c()
            m3.e3 r5 = (m3.e3) r5
            java.lang.Object r2 = r5.f29269a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L44
        L34:
            r1 = r5
            goto L44
        L36:
            boolean r0 = r5 instanceof m3.f0
            if (r0 == 0) goto L44
            r4.getClass()
            m3.f0 r5 = (m3.f0) r5
            kotlin.jvm.functions.Function1 r0 = r5.f29277a
            if (r0 != 0) goto L44
            goto L34
        L44:
            if (r1 != 0) goto L69
            boolean r5 = r4.f29467b
            if (r5 == 0) goto L5f
            m3.m0 r5 = new m3.m0
            java.lang.Object r0 = r4.f29471f
            java.lang.Object r4 = r4.f29470e
            m3.v2 r4 = (m3.v2) r4
            if (r4 != 0) goto L56
            m3.f r4 = m3.f.f29275g
        L56:
            m3.k1 r1 = new m3.k1
            r1.<init>(r0, r4)
            r5.<init>(r1)
            return r5
        L5f:
            m3.e3 r5 = new m3.e3
            java.lang.Object r4 = r4.c()
            r5.<init>(r4)
            return r5
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.u1.c(m3.v1, m3.f3):m3.f3");
    }
}
