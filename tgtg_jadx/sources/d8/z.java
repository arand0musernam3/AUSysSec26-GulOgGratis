package d8;

import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f14748a;

    public z() {
        this.f14748a = y80.r.c(f1.f14616b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y70.a a(y9.h0 r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y9.p
            if (r0 == 0) goto L13
            r0 = r6
            y9.p r0 = (y9.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            y9.p r0 = new y9.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f45719j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
        L28:
            r5 = 0
            return r5
        L2a:
            ba0.g.M(r6)
            goto L3c
        L2e:
            ba0.g.M(r6)
            r0.l = r3
            y80.a2 r6 = r4.f14748a
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.z.a(y9.h0, z70.c):y70.a");
    }

    public e1 b() {
        return (e1) this.f14748a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(d8.e1 r6) {
        /*
            r5 = this;
            r6.getClass()
        L3:
            y80.a2 r0 = r5.f14748a
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            d8.e1 r2 = (d8.e1) r2
            boolean r3 = r2 instanceof d8.v0
            if (r3 != 0) goto L3a
            d8.f1 r3 = d8.f1.f14616b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 == 0) goto L19
            goto L3a
        L19:
            boolean r3 = r2 instanceof d8.b
            if (r3 == 0) goto L27
            int r3 = r6.f14609a
            r4 = r2
            d8.b r4 = (d8.b) r4
            int r4 = r4.f14609a
            if (r3 <= r4) goto L3b
            goto L3a
        L27:
            boolean r3 = r2 instanceof d8.i0
            if (r3 == 0) goto L2c
            goto L3b
        L2c:
            boolean r6 = r2 instanceof d8.u0
            if (r6 == 0) goto L36
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            com.braze.h2.b(r6)
            return
        L36:
            e40.a.f()
            return
        L3a:
            r2 = r6
        L3b:
            boolean r0 = r0.g(r1, r2)
            if (r0 == 0) goto L3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.z.c(d8.e1):void");
    }

    public z(int i11) {
        this.f14748a = y80.r.c(new int[i11]);
    }
}
