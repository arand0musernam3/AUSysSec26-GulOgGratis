package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w4.n f46708k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f46710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f46711o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f46712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f46713q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, x70.c cVar) {
        super(2, cVar);
        this.f46711o = booleanRef;
        this.f46712p = objectRef;
        this.f46713q = objectRef2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        u0 u0Var = new u0(this.f46711o, this.f46712p, this.f46713q, cVar);
        u0Var.f46710n = obj;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf A[EDGE_INSN: B:69:0x00cf->B:45:0x00cf BREAK  A[LOOP:0: B:40:0x00bc->B:44:0x00cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10, types: [T, w4.v] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b0 -> B:39:0x00b3). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
