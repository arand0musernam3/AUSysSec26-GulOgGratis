package yk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f46120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f46121k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(h hVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f46120j = i11;
        this.f46121k = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f46120j) {
            case 0:
                return new b(this.f46121k, cVar, 0);
            case 1:
                return new b(this.f46121k, cVar, 1);
            default:
                return new b(this.f46121k, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f46120j) {
        }
        return ((b) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f46120j;
        h hVar = this.f46121k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                hVar.e(vg.b.CLOSE);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                hVar.e(vg.b.CLOSE);
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                a2 a2Var = hVar.f46137j;
                Boolean bool = Boolean.TRUE;
                a2Var.getClass();
                a2Var.k(null, bool);
                break;
        }
        return Unit.f26487a;
    }
}
