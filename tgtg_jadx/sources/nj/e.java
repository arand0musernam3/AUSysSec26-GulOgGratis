package nj;

import com.braze.h2;
import h2.a0;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30913k;
    public /* synthetic */ y80.j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f30914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f30915n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, t tVar, x70.c cVar) {
        super(3, cVar);
        this.f30912j = i11;
        this.f30915n = tVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj3;
        switch (this.f30912j) {
            case 0:
                e eVar = new e(0, this.f30915n, cVar);
                eVar.l = jVar;
                eVar.f30914m = obj2;
                return eVar.invokeSuspend(Unit.f26487a);
            case 1:
                e eVar2 = new e(1, this.f30915n, cVar);
                eVar2.l = jVar;
                eVar2.f30914m = obj2;
                return eVar2.invokeSuspend(Unit.f26487a);
            case 2:
                e eVar3 = new e(2, this.f30915n, cVar);
                eVar3.l = jVar;
                eVar3.f30914m = obj2;
                return eVar3.invokeSuspend(Unit.f26487a);
            case 3:
                e eVar4 = new e(3, this.f30915n, cVar);
                eVar4.l = jVar;
                eVar4.f30914m = obj2;
                return eVar4.invokeSuspend(Unit.f26487a);
            default:
                e eVar5 = new e(4, this.f30915n, cVar);
                eVar5.l = jVar;
                eVar5.f30914m = obj2;
                return eVar5.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30912j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f30913k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return Unit.f26487a;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                y80.j jVar = this.l;
                if (this.f30914m != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return null;
                }
                at.o oVar = new at.o(new f(0, this.f30915n, null));
                this.l = null;
                this.f30914m = null;
                this.f30913k = 1;
                if (y80.r.n(jVar, oVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f26487a;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f30913k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return Unit.f26487a;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                y80.j jVar2 = this.l;
                if (this.f30914m != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return null;
                }
                at.o oVar2 = new at.o(new f(1, this.f30915n, null));
                this.l = null;
                this.f30914m = null;
                this.f30913k = 1;
                if (y80.r.n(jVar2, oVar2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f26487a;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f30913k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                        return Unit.f26487a;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                y80.j jVar3 = this.l;
                if (this.f30914m != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return null;
                }
                at.o oVar3 = new at.o(new a0(this.f30915n, (x70.c) null, 28));
                this.l = null;
                this.f30914m = null;
                this.f30913k = 1;
                if (y80.r.n(jVar3, oVar3, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f26487a;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f30913k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ba0.g.M(obj);
                        return Unit.f26487a;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                y80.j jVar4 = this.l;
                if (this.f30914m != null) {
                    org.bouncycastle.jce.provider.a.c();
                    return null;
                }
                at.o oVar4 = new at.o(new f(2, this.f30915n, null));
                this.l = null;
                this.f30914m = null;
                this.f30913k = 1;
                if (y80.r.n(jVar4, oVar4, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f26487a;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f30913k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    y80.j jVar5 = this.l;
                    at.o oVar5 = new at.o(new a0(this.f30915n, (a) this.f30914m, (x70.c) null, 29));
                    this.l = null;
                    this.f30914m = null;
                    this.f30913k = 1;
                    if (y80.r.n(jVar5, oVar5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }
}
