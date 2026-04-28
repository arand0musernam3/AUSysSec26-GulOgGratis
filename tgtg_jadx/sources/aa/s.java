package aa;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f1157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f1158k;
    public final /* synthetic */ Function1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, String str, Function1 function1, x70.c cVar) {
        super(1, cVar);
        this.f1157j = uVar;
        this.f1158k = str;
        this.l = function1;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new s(this.f1157j, this.f1158k, this.l, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((s) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        ha.c cVarV0 = this.f1157j.f1164b.v0(this.f1158k);
        try {
            Object objInvoke = this.l.invoke(cVarV0);
            w.b.y(cVarV0, null);
            return objInvoke;
        } finally {
        }
    }
}
