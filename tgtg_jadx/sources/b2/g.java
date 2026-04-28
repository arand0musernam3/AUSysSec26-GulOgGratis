package b2;

import com.braze.h2;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5560k;
    public final /* synthetic */ k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f5561m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, b1 b1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5559j = i11;
        this.l = kVar;
        this.f5561m = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5559j) {
            case 0:
                return new g(this.l, this.f5561m, cVar, 0);
            case 1:
                return new g(this.l, this.f5561m, cVar, 1);
            default:
                return new g(this.l, this.f5561m, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f5559j) {
        }
        return ((g) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5559j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f5560k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    ArrayList arrayList = new ArrayList();
                    y80.i iVarA = this.l.a();
                    f fVar = new f(arrayList, this.f5561m, 0);
                    this.f5560k = 1;
                    if (iVarA.collect(fVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f5560k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    ArrayList arrayList2 = new ArrayList();
                    y80.i iVarA2 = this.l.a();
                    f fVar2 = new f(arrayList2, this.f5561m, 1);
                    this.f5560k = 1;
                    if (iVarA2.collect(fVar2, this) == aVar2) {
                    }
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f5560k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    ArrayList arrayList3 = new ArrayList();
                    y80.i iVarA3 = this.l.a();
                    f fVar3 = new f(arrayList3, this.f5561m, 2);
                    this.f5560k = 1;
                    if (iVarA3.collect(fVar3, this) == aVar3) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
