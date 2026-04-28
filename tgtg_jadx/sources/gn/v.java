package gn;

import ao.e1;
import com.braze.h2;
import f2.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f20677j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20678k;
    public final /* synthetic */ dn.k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c0 f20679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z3.u f20680n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dn.k kVar, c0 c0Var, z3.u uVar, x70.c cVar) {
        super(2, cVar);
        this.l = kVar;
        this.f20679m = c0Var;
        this.f20680n = uVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f20677j) {
            case 0:
                return new v(this.f20679m, this.l, this.f20680n, cVar);
            default:
                return new v(this.l, this.f20679m, this.f20680n, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f20677j) {
        }
        return ((v) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20677j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f20678k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    at.o oVarD = m3.i.D(new f2.f(this.f20679m, 1));
                    e1 e1Var = new e1(this.l, this.f20680n, null, 5);
                    this.f20678k = 1;
                    if (y80.r.i(oVarD, e1Var, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f20678k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    dn.k kVar = this.l;
                    at.o oVarD2 = m3.i.D(new cw.b(kVar, 23));
                    w wVar = new w(this.f20679m, kVar, this.f20680n, (x70.c) null);
                    this.f20678k = 1;
                    if (y80.r.i(oVarD2, wVar, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c0 c0Var, dn.k kVar, z3.u uVar, x70.c cVar) {
        super(2, cVar);
        this.f20679m = c0Var;
        this.l = kVar;
        this.f20680n = uVar;
    }
}
