package h8;

import com.braze.h2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f21660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21661k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f21662m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function2 function2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f21660j = i11;
        switch (i11) {
            case 1:
                this.f21662m = (i) function2;
                super(2, cVar);
                break;
            case 2:
                this.f21662m = (i) function2;
                super(2, cVar);
                break;
            default:
                this.f21662m = (i) function2;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f21660j) {
            case 0:
                b bVar = new b(this.f21662m, cVar, 0);
                bVar.l = obj;
                return bVar;
            case 1:
                b bVar2 = new b(this.f21662m, cVar, 1);
                bVar2.l = obj;
                return bVar2;
            default:
                b bVar3 = new b(this.f21662m, cVar, 2);
                bVar3.l = obj;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21660j) {
            case 0:
                return ((b) create((g) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((b) create((g) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r5v18, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21660j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f21661k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    g gVar = (g) this.l;
                    this.f21661k = 1;
                    obj = this.f21662m.invoke(gVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                g gVar2 = (g) obj;
                gVar2.getClass();
                ((AtomicBoolean) ((a) gVar2).f21659b.f28446b).set(true);
                return gVar2;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f21661k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    a aVarC = ((g) this.l).c();
                    this.l = aVarC;
                    this.f21661k = 1;
                    return this.f21662m.invoke(aVarC, this) == aVar2 ? aVar2 : aVarC;
                }
                if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a aVar3 = (a) this.l;
                ba0.g.M(obj);
                return aVar3;
            default:
                b0 b0Var = (b0) this.l;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f21661k;
                try {
                    if (i13 == 0) {
                        ba0.g.M(obj);
                        ?? r52 = this.f21662m;
                        this.l = null;
                        this.f21661k = 1;
                        if (r52.invoke(b0Var, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i13 != 1) {
                            h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                    }
                    break;
                } catch (Throwable th2) {
                    sa0.a.f38953a.i(e0.f.k("Exception Ignored: ", th2.getMessage()), new Object[0]);
                }
                return Unit.f26487a;
        }
    }
}
