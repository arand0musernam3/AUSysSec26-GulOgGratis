package y80;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f45456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gj.v f45457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f45458c;

    public c1(Ref.ObjectRef objectRef, gj.v vVar, j jVar) {
        this.f45456a = objectRef;
        this.f45457b = vVar;
        this.f45458c = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, x70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof y80.b1
            if (r0 == 0) goto L13
            r0 = r7
            y80.b1 r0 = (y80.b1) r0
            int r1 = r0.f45447n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45447n = r1
            goto L18
        L13:
            y80.b1 r0 = new y80.b1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45447n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r7)
            goto L69
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f45445k
            y80.c1 r2 = r0.f45444j
            ba0.g.M(r7)
            goto L53
        L39:
            ba0.g.M(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = r5.f45456a
            T r2 = r7.element
            r0.f45444j = r5
            r0.f45445k = r7
            r0.f45447n = r4
            gj.v r4 = r5.f45457b
            java.lang.Object r6 = r4.invoke(r2, r6, r0)
            if (r6 != r1) goto L4f
            goto L68
        L4f:
            r2 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L53:
            r6.element = r7
            y80.j r6 = r2.f45458c
            kotlin.jvm.internal.Ref$ObjectRef r7 = r2.f45456a
            T r7 = r7.element
            r2 = 0
            r0.f45444j = r2
            r0.f45445k = r2
            r0.f45447n = r3
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.c1.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
