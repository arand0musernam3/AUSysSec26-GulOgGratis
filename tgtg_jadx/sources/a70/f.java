package a70;

import kotlin.jvm.internal.Ref;
import v80.b0;
import y80.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f957c;

    public f(Ref.ObjectRef objectRef, j jVar, b0 b0Var) {
        this.f955a = objectRef;
        this.f956b = jVar;
        this.f957c = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, v80.b2] */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, x70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a70.e
            if (r0 == 0) goto L13
            r0 = r7
            a70.e r0 = (a70.e) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a70.e r0 = new a70.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f953j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            kotlin.jvm.internal.Ref$ObjectRef r3 = r5.f955a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            ba0.g.M(r7)
            goto L48
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L30:
            ba0.g.M(r7)
            T r7 = r3.element
            v80.i1 r7 = (v80.i1) r7
            boolean r7 = r7.g()
            if (r7 != 0) goto L59
            r0.l = r4
            y80.j r7 = r5.f956b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            a70.d r6 = new a70.d
            r7 = 2
            r0 = 0
            r1 = 0
            r6.<init>(r7, r1, r0)
            r7 = 3
            v80.b0 r0 = r5.f957c
            v80.b2 r6 = v80.f0.B(r0, r1, r1, r6, r7)
            r3.element = r6
        L59:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a70.f.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
