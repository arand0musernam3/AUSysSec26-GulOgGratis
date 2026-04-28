package z80;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import z1.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y80.i f47369d;

    public g(int i11, CoroutineContext coroutineContext, x80.a aVar, y80.i iVar) {
        super(coroutineContext, i11, aVar);
        this.f47369d = iVar;
    }

    @Override // z80.d
    public final Object c(x80.u uVar, x70.c cVar) {
        Object objG = g(new w(uVar), cVar);
        return objG == y70.a.COROUTINE_SUSPENDED ? objG : Unit.f26487a;
    }

    @Override // z80.d, y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        if (this.f47361b == -3) {
            CoroutineContext context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            u60.a aVar = new u60.a(10);
            CoroutineContext coroutineContext = this.f47360a;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, aVar)).booleanValue() ? context.plus(coroutineContext) : v80.v.a(context, coroutineContext, false);
            if (Intrinsics.areEqual(coroutineContextPlus, context)) {
                Object objG = g(jVar, cVar);
                return objG == y70.a.COROUTINE_SUSPENDED ? objG : Unit.f26487a;
            }
            x70.d dVar = kotlin.coroutines.d.f26548k0;
            if (Intrinsics.areEqual(coroutineContextPlus.get(dVar), context.get(dVar))) {
                CoroutineContext context2 = cVar.getContext();
                if (!(jVar instanceof w) && !(jVar instanceof s)) {
                    jVar = new e70.a(jVar, context2);
                }
                Object objC = b.c(coroutineContextPlus, jVar, a90.x.b(coroutineContextPlus), new a2(this, null, 6), cVar);
                return objC == y70.a.COROUTINE_SUSPENDED ? objC : Unit.f26487a;
            }
        }
        Object objCollect = super.collect(jVar, cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }

    public abstract Object g(y80.j jVar, x70.c cVar);

    @Override // z80.d
    public final String toString() {
        return this.f47369d + " -> " + super.toString();
    }
}
