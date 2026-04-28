package uf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f41113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f41114k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f41113j = i11;
        this.f41114k = kVar;
        this.l = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f41113j) {
            case 0:
                return new i(this.f41114k, this.l, cVar, 0);
            case 1:
                return new i(this.f41114k, this.l, cVar, 1);
            case 2:
                return new i(this.f41114k, this.l, cVar, 2);
            default:
                return new i(this.f41114k, this.l, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f41113j) {
        }
        return ((i) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f41113j;
        String str = this.l;
        k kVar = this.f41114k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                kVar.f41117a.e(str);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                kVar.f41117a.e(str);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                kVar.f41117a.e(str);
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                kVar.f41117a.e(str);
                break;
        }
        return Unit.f26487a;
    }
}
