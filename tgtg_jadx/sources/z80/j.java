package z80;

import kotlin.jvm.internal.Ref;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f47374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f47375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f47376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.j f47377d;

    public j(Ref.ObjectRef objectRef, b0 b0Var, l lVar, y80.j jVar) {
        this.f47374a = objectRef;
        this.f47375b = b0Var;
        this.f47376c = lVar;
        this.f47377d = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, v80.b2] */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, x70.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof z80.i
            if (r0 == 0) goto L13
            r0 = r9
            z80.i r0 = (z80.i) r0
            int r1 = r0.f47373n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47373n = r1
            goto L18
        L13:
            z80.i r0 = new z80.i
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f47373n
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.f47371k
            z80.j r0 = r0.f47370j
            ba0.g.M(r9)
            goto L55
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L32:
            ba0.g.M(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f47374a
            T r9 = r9.element
            v80.i1 r9 = (v80.i1) r9
            if (r9 == 0) goto L54
            kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            java.lang.String r4 = "Child of the scoped flow was cancelled"
            r2.<init>(r4)
            r9.a(r2)
            r0.f47370j = r7
            r0.f47371k = r8
            r0.f47373n = r3
            java.lang.Object r9 = r9.B(r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r0 = r7
        L55:
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f47374a
            v80.b0 r1 = r0.f47375b
            v80.d0 r2 = v80.d0.UNDISPATCHED
            z1.d3 r4 = new z1.d3
            z80.l r5 = r0.f47376c
            y80.j r0 = r0.f47377d
            r6 = 0
            r4.<init>(r5, r0, r8, r6)
            v80.b2 r8 = v80.f0.B(r1, r6, r2, r4, r3)
            r9.element = r8
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z80.j.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
