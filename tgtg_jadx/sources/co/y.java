package co;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8807k;
    public final /* synthetic */ b1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(b1 b1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8806j = i11;
        this.l = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8806j) {
            case 0:
                y yVar = new y(this.l, cVar, 0);
                yVar.f8807k = obj;
                return yVar;
            case 1:
                y yVar2 = new y(this.l, cVar, 1);
                yVar2.f8807k = obj;
                return yVar2;
            case 2:
                y yVar3 = new y(this.l, cVar, 2);
                yVar3.f8807k = obj;
                return yVar3;
            case 3:
                y yVar4 = new y(this.l, cVar, 3);
                yVar4.f8807k = obj;
                return yVar4;
            case 4:
                y yVar5 = new y(this.l, cVar, 4);
                yVar5.f8807k = obj;
                return yVar5;
            default:
                y yVar6 = new y(this.l, cVar, 5);
                yVar6.f8807k = obj;
                return yVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8806j) {
        }
        return ((y) create(str, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f8806j;
        b1 b1Var = this.l;
        switch (i11) {
            case 0:
                String str = (String) this.f8807k;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(str);
                break;
            case 1:
                String str2 = (String) this.f8807k;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(str2);
                break;
            case 2:
                String str3 = (String) this.f8807k;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(str3);
                break;
            case 3:
                String str4 = (String) this.f8807k;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(str4);
                break;
            case 4:
                String str5 = (String) this.f8807k;
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(str5);
                break;
            default:
                String str6 = (String) this.f8807k;
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b1Var.setValue(str6);
                break;
        }
        return Unit.f26487a;
    }
}
