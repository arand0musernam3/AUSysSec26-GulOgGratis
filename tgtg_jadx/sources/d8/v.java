package d8;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Serializable f14718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14719k;
    public final /* synthetic */ Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f14720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f14721n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Ref.ObjectRef objectRef, y yVar, Ref.IntRef intRef, x70.c cVar) {
        super(1, cVar);
        this.l = objectRef;
        this.f14720m = yVar;
        this.f14721n = intRef;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new v(this.l, this.f14720m, this.f14721n, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((v) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r9 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r8.f14719k
            kotlin.jvm.internal.Ref$IntRef r2 = r8.f14721n
            kotlin.jvm.internal.Ref$ObjectRef r3 = r8.l
            r4 = 3
            r5 = 2
            d8.y r6 = r8.f14720m
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 == r7) goto L2d
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1e
            java.io.Serializable r0 = r8.f14718j
            r2 = r0
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            ba0.g.M(r9)
            goto L6c
        L1e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L25:
            java.io.Serializable r1 = r8.f14718j
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            ba0.g.M(r9)     // Catch: androidx.datastore.core.CorruptionException -> L5f
            goto L56
        L2d:
            java.io.Serializable r1 = r8.f14718j
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            ba0.g.M(r9)     // Catch: androidx.datastore.core.CorruptionException -> L5f
            goto L44
        L35:
            ba0.g.M(r9)
            r8.f14718j = r3     // Catch: androidx.datastore.core.CorruptionException -> L5f
            r8.f14719k = r7     // Catch: androidx.datastore.core.CorruptionException -> L5f
            java.lang.Object r9 = r6.i(r8)     // Catch: androidx.datastore.core.CorruptionException -> L5f
            if (r9 != r0) goto L43
            goto L6b
        L43:
            r1 = r3
        L44:
            r1.element = r9     // Catch: androidx.datastore.core.CorruptionException -> L5f
            d8.k0 r9 = r6.h()     // Catch: androidx.datastore.core.CorruptionException -> L5f
            r8.f14718j = r2     // Catch: androidx.datastore.core.CorruptionException -> L5f
            r8.f14719k = r5     // Catch: androidx.datastore.core.CorruptionException -> L5f
            java.lang.Object r9 = r9.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L5f
            if (r9 != r0) goto L55
            goto L6b
        L55:
            r1 = r2
        L56:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: androidx.datastore.core.CorruptionException -> L5f
            int r9 = r9.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L5f
            r1.element = r9     // Catch: androidx.datastore.core.CorruptionException -> L5f
            goto L74
        L5f:
            T r9 = r3.element
            r8.f14718j = r2
            r8.f14719k = r4
            java.lang.Object r9 = r6.j(r9, r7, r8)
            if (r9 != r0) goto L6c
        L6b:
            return r0
        L6c:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.element = r9
        L74:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
