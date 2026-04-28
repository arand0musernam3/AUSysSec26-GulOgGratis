package b0;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5424j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5425k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5428o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(x2 x2Var, n2 n2Var, Map map, s0.t0 t0Var, x70.c cVar) {
        super(1, cVar);
        this.l = x2Var;
        this.f5426m = n2Var;
        this.f5427n = map;
        this.f5428o = t0Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f5424j) {
            case 0:
                return new t2((x2) this.l, (n2) this.f5426m, (Map) this.f5427n, (s0.t0) this.f5428o, cVar);
            case 1:
                return new t2((d8.y) this.f5426m, (CoroutineContext) this.f5427n, (z70.i) this.f5428o, cVar);
            default:
                return new t2((d8.h0) this.f5427n, this.f5428o, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f5424j) {
        }
        return ((t2) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.t2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t2(d8.y yVar, CoroutineContext coroutineContext, Function2 function2, x70.c cVar) {
        super(1, cVar);
        this.f5426m = yVar;
        this.f5427n = coroutineContext;
        this.f5428o = (z70.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(d8.h0 h0Var, Object obj, x70.c cVar) {
        super(1, cVar);
        this.f5427n = h0Var;
        this.f5428o = obj;
    }
}
