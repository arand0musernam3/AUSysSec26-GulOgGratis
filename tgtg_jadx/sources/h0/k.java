package h0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import v80.b0;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f20978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20979k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q2 f20980m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q2 q2Var, x70.c cVar) {
        super(2, cVar);
        this.f20980m = q2Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        k kVar = new k(this.f20980m, cVar);
        kVar.l = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Path cross not found for [B:13:0x0033, B:23:0x0079], limit reached: 36 */
    /* JADX WARN: Path cross not found for [B:13:0x0033, B:26:0x007e], limit reached: 36 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x001c, CancellationException -> 0x00b6, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00b6, all -> 0x001c, blocks: (B:6:0x0018, B:15:0x0039, B:17:0x005a, B:18:0x0066), top: B:37:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, v80.j0, v80.s1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            zw.q2 r0 = r11.f20980m
            java.lang.Object r1 = r0.f48338f
            kotlin.collections.t r1 = (kotlin.collections.t) r1
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r11.f20979k
            r4 = 1
            java.lang.String r5 = "CXCP"
            r6 = 0
            if (r3 == 0) goto L26
            if (r3 != r4) goto L1f
            kotlin.jvm.internal.Ref$ObjectRef r3 = r11.f20978j
            java.lang.Object r7 = r11.l
            v80.b0 r7 = (v80.b0) r7
            ba0.g.M(r12)     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            goto L73
        L1c:
            r12 = move-exception
            goto Lb0
        L1f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L26:
            ba0.g.M(r12)
            java.lang.Object r12 = r11.l
            v80.b0 r12 = (v80.b0) r12
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            r7 = r12
        L33:
            boolean r12 = v80.f0.y(r7)
            if (r12 == 0) goto La8
            d90.e r12 = new d90.e     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            kotlin.coroutines.CoroutineContext r8 = r11.getContext()     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            java.lang.Object r8 = r0.f48337e     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            x80.i r8 = (x80.i) r8     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            com.google.firebase.messaging.a0 r8 = r8.t()     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            aa.l0 r9 = new aa.l0     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            r10 = 28
            r9.<init>(r0, r6, r10)     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            r12.g(r8, r9)     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            T r8 = r3.element     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            v80.i0 r8 = (v80.i0) r8     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            if (r8 == 0) goto L66
            com.google.firebase.messaging.a0 r8 = r8.u()     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            h0.j r9 = new h0.j     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            r9.<init>(r3, r6)     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            r12.g(r8, r9)     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
        L66:
            r11.l = r7     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            r11.f20978j = r3     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            r11.f20979k = r4     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            java.lang.Object r12 = r12.d(r11)     // Catch: java.lang.Throwable -> L1c java.util.concurrent.CancellationException -> Lb6
            if (r12 != r2) goto L73
            return r2
        L73:
            boolean r12 = r1.isEmpty()
            if (r12 != 0) goto L33
            T r12 = r3.element
            if (r12 == 0) goto L7e
            goto L33
        L7e:
            java.lang.Object r12 = r1.first()
            gf.g r8 = new gf.g
            r9 = 3
            r8.<init>(r0, r12, r6, r9)
            v80.j0 r8 = v80.f0.f(r7, r6, r6, r8, r9)
            boolean r9 = r8.isCancelled()
            if (r9 == 0) goto Laa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to process "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = " due to Job cancellation"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            android.util.Log.i(r5, r12)
        La8:
            r12 = r6
            goto Lbc
        Laa:
            r1.removeFirst()
            r3.element = r8
            goto L33
        Lb0:
            java.lang.String r1 = "Encountered exception during processing"
            android.util.Log.e(r5, r1, r12)
            goto Lbc
        Lb6:
            java.lang.String r12 = "PruningProcessingQueue: Scope cancelled"
            android.util.Log.d(r5, r12)
            goto La8
        Lbc:
            zw.q2.i(r0, r12)
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
