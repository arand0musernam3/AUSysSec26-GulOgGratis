package y80;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f45468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f45469b;

    public e0(Ref.IntRef intRef, j jVar) {
        this.f45468a = intRef;
        this.f45469b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y80.d0
            if (r0 == 0) goto L13
            r0 = r6
            y80.d0 r0 = (y80.d0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            y80.d0 r0 = new y80.d0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f45463j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r6)
            goto L42
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r6)
            kotlin.jvm.internal.Ref$IntRef r6 = r4.f45468a
            int r2 = r6.element
            if (r2 < r3) goto L45
            r0.l = r3
            y80.j r6 = r4.f45469b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L45:
            int r2 = r2 + r3
            r6.element = r2
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.e0.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
