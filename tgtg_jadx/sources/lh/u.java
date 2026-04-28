package lh;

import com.braze.h2;
import kotlin.Unit;
import nk.p0;
import ss.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27825k;
    public /* synthetic */ y80.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Throwable f27826m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f27824j = i12;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y80.j jVar = (y80.j) obj;
        Throwable th2 = (Throwable) obj2;
        x70.c cVar = (x70.c) obj3;
        switch (this.f27824j) {
            case 0:
                u uVar = new u(3, cVar, 0);
                uVar.l = jVar;
                uVar.f27826m = th2;
                return uVar.invokeSuspend(Unit.f26487a);
            case 1:
                u uVar2 = new u(3, cVar, 1);
                uVar2.l = jVar;
                uVar2.f27826m = th2;
                return uVar2.invokeSuspend(Unit.f26487a);
            case 2:
                u uVar3 = new u(3, cVar, 2);
                uVar3.l = jVar;
                uVar3.f27826m = th2;
                return uVar3.invokeSuspend(Unit.f26487a);
            case 3:
                u uVar4 = new u(3, cVar, 3);
                uVar4.l = jVar;
                uVar4.f27826m = th2;
                return uVar4.invokeSuspend(Unit.f26487a);
            default:
                u uVar5 = new u(3, cVar, 4);
                uVar5.l = jVar;
                uVar5.f27826m = th2;
                return uVar5.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27824j) {
            case 0:
                y80.j jVar = this.l;
                Throwable th2 = this.f27826m;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f27825k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y yVar = new y(th2);
                    this.l = null;
                    this.f27826m = null;
                    this.f27825k = 1;
                    if (jVar.emit(yVar, this) == aVar) {
                    }
                }
                break;
            case 1:
                y80.j jVar2 = this.l;
                Throwable th3 = this.f27826m;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f27825k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    nj.v vVar = new nj.v(th3);
                    this.l = null;
                    this.f27826m = null;
                    this.f27825k = 1;
                    if (jVar2.emit(vVar, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y80.j jVar3 = this.l;
                Throwable th4 = this.f27826m;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f27825k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    p0 p0Var = new p0(th4);
                    this.l = null;
                    this.f27826m = null;
                    this.f27825k = 1;
                    if (jVar3.emit(p0Var, this) == aVar3) {
                    }
                }
                break;
            case 3:
                y80.j jVar4 = this.l;
                Throwable th5 = this.f27826m;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f27825k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    f1 f1Var = new f1(th5);
                    this.l = null;
                    this.f27826m = null;
                    this.f27825k = 1;
                    if (jVar4.emit(f1Var, this) == aVar4) {
                    }
                }
                break;
            default:
                y80.j jVar5 = this.l;
                Throwable th6 = this.f27826m;
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f27825k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    xg.z zVar = new xg.z(th6);
                    this.l = null;
                    this.f27826m = null;
                    this.f27825k = 1;
                    if (jVar5.emit(zVar, this) == aVar5) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
