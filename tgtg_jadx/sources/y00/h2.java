package y00;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f44844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f44845b;

    public h2(t2 t2Var, boolean z11) {
        this.f44844a = z11;
        Objects.requireNonNull(t2Var);
        this.f44845b = t2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            y00.t2 r0 = r9.f44845b
            java.lang.Object r1 = r0.f21216b
            y00.n1 r1 = (y00.n1) r1
            boolean r2 = r1.e()
            java.lang.Boolean r3 = r1.f45005y
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1a
            java.lang.Boolean r3 = r1.f45005y
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1a
            r3 = r5
            goto L1b
        L1a:
            r3 = r4
        L1b:
            boolean r6 = r9.f44844a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r1.f45005y = r7
            if (r3 != r6) goto L35
            y00.w0 r3 = r1.f44987f
            y00.n1.m(r3)
            y00.u0 r3 = r3.f45267o
            java.lang.String r7 = "Default data collection state already set to"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r3.b(r8, r7)
        L35:
            boolean r3 = r1.e()
            if (r3 == r2) goto L4e
            boolean r3 = r1.e()
            java.lang.Boolean r7 = r1.f45005y
            if (r7 == 0) goto L4c
            java.lang.Boolean r7 = r1.f45005y
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4c
            r4 = r5
        L4c:
            if (r3 == r4) goto L62
        L4e:
            y00.w0 r1 = r1.f44987f
            y00.n1.m(r1)
            y00.u0 r1 = r1.l
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "Default data collection is different than actual status"
            r1.c(r4, r3, r2)
        L62:
            r0.H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.h2.run():void");
    }
}
