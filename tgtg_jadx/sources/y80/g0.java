package y80;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f45479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f45480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z70.i f45481c;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(Ref.BooleanRef booleanRef, j jVar, Function2 function2) {
        this.f45479a = booleanRef;
        this.f45480b = jVar;
        this.f45481c = (z70.i) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r6.f45480b.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, x70.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof y80.f0
            if (r0 == 0) goto L13
            r0 = r8
            y80.f0 r0 = (y80.f0) r0
            int r1 = r0.f45475n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45475n = r1
            goto L18
        L13:
            y80.f0 r0 = new y80.f0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45475n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            ba0.g.M(r8)
            goto L83
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L34:
            java.lang.Object r7 = r0.f45473k
            y80.g0 r2 = r0.f45472j
            ba0.g.M(r8)
            goto L67
        L3c:
            ba0.g.M(r8)
            goto L54
        L40:
            ba0.g.M(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f45479a
            boolean r8 = r8.element
            if (r8 == 0) goto L57
            r0.f45475n = r5
            y80.j r8 = r6.f45480b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L54
            goto L82
        L54:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L57:
            r0.f45472j = r6
            r0.f45473k = r7
            r0.f45475n = r4
            z70.i r8 = r6.f45481c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L66
            goto L82
        L66:
            r2 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L86
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f45479a
            r8.element = r5
            y80.j r8 = r2.f45480b
            r2 = 0
            r0.f45472j = r2
            r0.f45473k = r2
            r0.f45475n = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L86:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.g0.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
