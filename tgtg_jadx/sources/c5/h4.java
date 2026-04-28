package c5;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7247k;
    public final /* synthetic */ k4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(k4 k4Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f7246j = i11;
        this.l = k4Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f7246j) {
            case 0:
                return new h4(this.l, cVar, 0);
            default:
                return new h4(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f7246j) {
        }
        return ((h4) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f7246j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f7247k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y yVar = this.l.f7276a;
                    this.f7247k = 1;
                    Object objC = yVar.f7474y.c(this);
                    if (objC != aVar) {
                        objC = Unit.f26487a;
                    }
                    if (objC == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f7247k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y yVar2 = this.l.f7276a;
                    this.f7247k = 1;
                    Object objA = yVar2.f7476z.a(this);
                    if (objA != aVar2) {
                        objA = Unit.f26487a;
                    }
                    if (objA == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
