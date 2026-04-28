package f50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f17357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f17358b;

    public k(p pVar, p pVar2) {
        pVar.getClass();
        pVar2.getClass();
        this.f17357a = pVar;
        this.f17358b = pVar2;
    }

    public final double a() {
        Double dC = this.f17357a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f17358b.c();
        if (dC2 != null) {
            double dDoubleValue2 = dC2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r6.d(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof f50.j
            if (r0 == 0) goto L13
            r0 = r6
            f50.j r0 = (f50.j) r0
            int r1 = r0.f17356m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17356m = r1
            goto L18
        L13:
            f50.j r0 = new f50.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f17355k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f17356m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r6)
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            f50.k r2 = r0.f17354j
            ba0.g.M(r6)
            goto L48
        L37:
            ba0.g.M(r6)
            r0.f17354j = r5
            r0.f17356m = r4
            f50.p r6 = r5.f17357a
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L47
            goto L55
        L47:
            r2 = r5
        L48:
            f50.p r6 = r2.f17358b
            r2 = 0
            r0.f17354j = r2
            r0.f17356m = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.k.b(z70.c):java.lang.Object");
    }
}
