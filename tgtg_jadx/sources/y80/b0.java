package y80;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f45442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f45443b;

    public b0(j jVar, Ref.ObjectRef objectRef) {
        this.f45442a = jVar;
        this.f45443b = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Throwable] */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, x70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y80.a0
            if (r0 == 0) goto L13
            r0 = r6
            y80.a0 r0 = (y80.a0) r0
            int r1 = r0.f45432m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45432m = r1
            goto L18
        L13:
            y80.a0 r0 = new y80.a0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f45431k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45432m
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            y80.b0 r5 = r0.f45430j
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L29
            goto L42
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            y80.j r6 = r4.f45442a     // Catch: java.lang.Throwable -> L45
            r0.f45430j = r4     // Catch: java.lang.Throwable -> L45
            r0.f45432m = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L45:
            r6 = move-exception
            r5 = r4
        L47:
            kotlin.jvm.internal.Ref$ObjectRef r5 = r5.f45443b
            r5.element = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.b0.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
