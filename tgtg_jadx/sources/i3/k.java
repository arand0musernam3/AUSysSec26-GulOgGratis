package i3;

import a3.b1;
import com.braze.h2;
import g3.ea;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f23135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23136k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w4.y f23137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ea f23138n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(w4.y yVar, ea eaVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f23135j = i11;
        this.f23137m = yVar;
        this.f23138n = eaVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f23135j) {
            case 0:
                k kVar = new k(this.f23137m, this.f23138n, cVar, 0);
                kVar.l = obj;
                return kVar;
            default:
                k kVar2 = new k(this.f23137m, this.f23138n, cVar, 1);
                kVar2.l = obj;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f23135j) {
        }
        return ((k) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23135j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f23136k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    j jVar = new j((v80.b0) this.l, this.f23138n, null);
                    this.f23136k = 1;
                    if (z3.e(this.f23137m, jVar, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f23136k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    b1 b1Var = new b1((v80.b0) this.l, this.f23138n, (x70.c) null, 2);
                    this.f23136k = 1;
                    if (((w4.m0) this.f23137m).L0(b1Var, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
