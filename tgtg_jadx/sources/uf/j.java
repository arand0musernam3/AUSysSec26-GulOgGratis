package uf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f41115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f41116k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f41115j = i11;
        this.f41116k = kVar;
        this.l = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f41115j) {
            case 0:
                return new j(this.f41116k, this.l, cVar, 0);
            case 1:
                return new j(this.f41116k, this.l, cVar, 1);
            case 2:
                return new j(this.f41116k, this.l, cVar, 2);
            default:
                return new j(this.f41116k, this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f41115j) {
        }
        return ((j) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f41115j;
        Object obj2 = this.l;
        k kVar = this.f41116k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                kVar.f41117a.c((String) obj2);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                hf.g gVar = kVar.f41117a;
                obj2.getClass();
                gVar.c((String) obj2);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                hf.g gVar2 = kVar.f41117a;
                obj2.getClass();
                gVar2.c((String) obj2);
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                hf.g gVar3 = kVar.f41117a;
                obj2.getClass();
                gVar3.c((String) obj2);
                break;
        }
        return Unit.f26487a;
    }
}
