package nj;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30917k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f30918m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i11, t tVar, x70.c cVar) {
        super(2, cVar);
        this.f30916j = i11;
        this.f30918m = tVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f30916j) {
            case 0:
                f fVar = new f(0, this.f30918m, cVar);
                fVar.l = obj;
                return fVar;
            case 1:
                f fVar2 = new f(1, this.f30918m, cVar);
                fVar2.l = obj;
                return fVar2;
            default:
                f fVar3 = new f(2, this.f30918m, cVar);
                fVar3.l = obj;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        y80.j jVar = (y80.j) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f30916j) {
        }
        return ((f) create(jVar, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30916j) {
            case 0:
                y80.j jVar = (y80.j) this.l;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f30917k;
                t tVar = this.f30918m;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                    } else if (i11 != 2) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    Object value = tVar.f30956h.getValue();
                    w wVar = value instanceof w ? (w) value : null;
                    if (wVar == null) {
                        break;
                    } else {
                        dv.d dVar = dv.d.EVERYTHING;
                        this.l = jVar;
                        this.f30917k = 1;
                        if (t.a(tVar, wVar, dVar, this) == aVar) {
                        }
                    }
                }
                tVar.f30952d.a();
                Object value2 = tVar.f30956h.getValue();
                this.l = null;
                this.f30917k = 2;
                if (jVar.emit(value2, this) == aVar) {
                }
                break;
            case 1:
                y80.j jVar2 = (y80.j) this.l;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f30917k;
                t tVar2 = this.f30918m;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                    } else if (i12 != 2) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    Object value3 = tVar2.f30956h.getValue();
                    w wVar2 = value3 instanceof w ? (w) value3 : null;
                    if (wVar2 == null) {
                        break;
                    } else {
                        dv.d dVar2 = dv.d.NECESSARY;
                        this.l = jVar2;
                        this.f30917k = 1;
                        if (t.a(tVar2, wVar2, dVar2, this) == aVar2) {
                        }
                    }
                }
                tVar2.f30952d.a();
                Object value4 = tVar2.f30956h.getValue();
                this.l = null;
                this.f30917k = 2;
                if (jVar2.emit(value4, this) == aVar2) {
                }
                break;
            default:
                y80.j jVar3 = (y80.j) this.l;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f30917k;
                t tVar3 = this.f30918m;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                    } else if (i13 != 2) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    Object value5 = tVar3.f30956h.getValue();
                    w wVar3 = value5 instanceof w ? (w) value5 : null;
                    if (wVar3 == null) {
                        break;
                    } else {
                        dv.d dVar3 = dv.d.BACK;
                        this.l = jVar3;
                        this.f30917k = 1;
                        if (t.b(tVar3, wVar3, dVar3, this) == aVar3) {
                        }
                    }
                }
                tVar3.f30952d.f30957a.a(new f70.a());
                Object value6 = tVar3.f30956h.getValue();
                this.l = null;
                this.f30917k = 2;
                if (jVar3.emit(value6, this) == aVar3) {
                }
                break;
        }
        return Unit.f26487a;
    }
}
