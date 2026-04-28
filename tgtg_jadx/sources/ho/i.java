package ho;

import com.braze.h2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22205k;
    public final /* synthetic */ j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f22206m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, List list, x70.c cVar, int i11) {
        super(2, cVar);
        this.f22204j = i11;
        this.l = jVar;
        this.f22206m = list;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f22204j) {
            case 0:
                return new i(this.l, this.f22206m, cVar, 0);
            default:
                return new i(this.l, this.f22206m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f22204j) {
        }
        return ((i) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22204j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f22205k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var = this.l.f22216j;
                    this.f22205k = 1;
                    a2Var.j(this.f22206m);
                    if (Unit.f26487a == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f22205k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    a2 a2Var2 = this.l.l;
                    this.f22205k = 1;
                    a2Var2.j(this.f22206m);
                    if (Unit.f26487a == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
