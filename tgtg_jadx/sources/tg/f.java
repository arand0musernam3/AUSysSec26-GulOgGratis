package tg;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t1.w1;
import v80.b0;
import y80.m1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f40154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40155k;
    public final /* synthetic */ i l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f40154j = i11;
        this.l = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f40154j) {
            case 0:
                return new f(this.l, cVar, 0);
            default:
                return new f(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f40154j) {
        }
        return ((f) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40154j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f40155k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    i iVar = this.l;
                    y80.h hVarM = r.m(r.k(iVar.f40174n, 300L), new w1(3), r.f45561b);
                    rf.c cVar = new rf.c(iVar, null, 10);
                    this.f40155k = 1;
                    if (r.i(hVarM, cVar, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f40155k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    m1 m1Var = this.l.f40171j;
                    vg.e eVar = vg.e.MAP_CLICK;
                    this.f40155k = 1;
                    if (m1Var.emit(eVar, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
