package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f46715k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w4.v f46716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f46718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f46719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i80.n f46720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function1 f46721r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f46722s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f46723t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k2 f46724u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(v80.b0 b0Var, i80.n nVar, Function1 function1, Function1 function12, Function1 function13, k2 k2Var, x70.c cVar) {
        super(2, cVar);
        this.f46719p = b0Var;
        this.f46720q = nVar;
        this.f46721r = function1;
        this.f46722s = function12;
        this.f46723t = function13;
        this.f46724u = k2Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        u3 u3Var = new u3(this.f46719p, this.f46720q, this.f46721r, this.f46722s, this.f46723t, this.f46724u, cVar);
        u3Var.f46718o = obj;
        return u3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u3) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0113, code lost:
    
        if (r6 == r1) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0275  */
    /* JADX WARN: Type inference failed for: r17v2, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r3v21, types: [w4.v] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r4v11, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r4v16, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [kotlin.coroutines.CoroutineContext, x70.c] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, w4.v] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.u3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
