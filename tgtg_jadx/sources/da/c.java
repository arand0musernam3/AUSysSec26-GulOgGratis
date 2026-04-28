package da;

import b0.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v80.b0;
import v80.q;
import y9.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14801j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14802k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f14803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f14804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f14805o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x70.c cVar, o1 o1Var, q qVar, boolean z11, boolean z12) {
        super(2, cVar);
        this.l = o1Var;
        this.f14805o = qVar;
        this.f14803m = z11;
        this.f14804n = z12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14801j) {
            case 0:
                return new c((v) this.l, this.f14803m, this.f14804n, (Function1) this.f14805o, cVar);
            case 1:
                return new c(cVar, (v) this.l, this.f14803m, this.f14804n, (Function1) this.f14805o);
            default:
                return new c(cVar, (o1) this.l, (q) this.f14805o, this.f14803m, this.f14804n);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f14801j) {
        }
        return ((c) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Type inference failed for: r12v17, types: [v80.i0, v80.s1] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x70.c cVar, v vVar, boolean z11, boolean z12, Function1 function1) {
        super(2, cVar);
        this.l = vVar;
        this.f14803m = z11;
        this.f14804n = z12;
        this.f14805o = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, boolean z11, boolean z12, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.l = vVar;
        this.f14803m = z11;
        this.f14804n = z12;
        this.f14805o = function1;
    }
}
