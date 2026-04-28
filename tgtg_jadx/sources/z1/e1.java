package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f46479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f46480k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f46481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f1 f46482n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, x70.c cVar) {
        super(2, cVar);
        this.f46482n = f1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        e1 e1Var = new e1(this.f46482n, cVar);
        e1Var.f46481m = obj;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        if (z1.f1.O0(r3, r6) != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:44:0x00c2, B:40:0x00b0], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:46:0x00c6, B:19:0x0055], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[PHI: r1 r4
      0x0031: PHI (r1v11 kotlin.jvm.internal.Ref$ObjectRef) = (r1v3 kotlin.jvm.internal.Ref$ObjectRef), (r1v15 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x002e, B:36:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r4v6 v80.b0) = (r4v4 v80.b0), (r4v7 v80.b0) binds: [B:13:0x002e, B:36:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[PHI: r5
      0x0055: PHI (r5v7 v80.b0) = (r5v0 v80.b0), (r5v3 v80.b0), (r5v3 v80.b0), (r5v3 v80.b0), (r5v5 v80.b0), (r5v8 v80.b0) binds: [B:18:0x004d, B:45:0x00c4, B:47:0x00d1, B:41:0x00bd, B:30:0x0081, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[Catch: CancellationException -> 0x00c0, TryCatch #0 {CancellationException -> 0x00c0, blocks: (B:38:0x00aa, B:40:0x00b0, B:44:0x00c2, B:46:0x00c6), top: B:55:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[Catch: CancellationException -> 0x00c0, TryCatch #0 {CancellationException -> 0x00c0, blocks: (B:38:0x00aa, B:40:0x00b0, B:44:0x00c2, B:46:0x00c6), top: B:55:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0081 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bd -> B:19:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c4 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d1 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00df -> B:11:0x0026). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
