package y80;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f45502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f45503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45504c;

    public k0(Ref.IntRef intRef, j jVar, Object obj) {
        this.f45502a = intRef;
        this.f45503b = jVar;
        this.f45504c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7.emit(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (y80.o0.a(r7, r6, r5.f45504c, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, x70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof y80.j0
            if (r0 == 0) goto L13
            r0 = r7
            y80.j0 r0 = (y80.j0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            y80.j0 r0 = new y80.j0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f45492j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r7)
            goto L5a
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            ba0.g.M(r7)
            goto L4c
        L35:
            ba0.g.M(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f45502a
            int r2 = r7.element
            int r2 = r2 + r4
            r7.element = r2
            y80.j r7 = r5.f45503b
            if (r2 >= r4) goto L4f
            r0.l = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L4c
            goto L59
        L4c:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        L4f:
            r0.l = r3
            java.lang.Object r2 = r5.f45504c
            y70.a r6 = y80.o0.a(r7, r6, r2, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.k0.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
