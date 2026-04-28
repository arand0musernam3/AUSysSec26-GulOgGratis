package i3;

import g3.ea;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f1 f23126k;
    public w4.o l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f23127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f23129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f23130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ea f23131q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v80.b0 b0Var, ea eaVar, x70.c cVar) {
        super(2, cVar);
        this.f23130p = b0Var;
        this.f23131q = eaVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        j jVar = new j(this.f23130p, this.f23131q, cVar);
        jVar.f23129o = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c4, B:43:0x00c8), top: B:55:0x0014 }] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [y80.f1] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
