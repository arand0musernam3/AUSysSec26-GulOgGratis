package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f18405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18406k;
    public final /* synthetic */ d3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.b f18407m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(d3 d3Var, androidx.activity.b bVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f18405j = i11;
        this.l = d3Var;
        this.f18407m = bVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f18405j) {
            case 0:
                return new c3(this.l, this.f18407m, cVar, 0);
            default:
                return new c3(this.l, this.f18407m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f18405j) {
        }
        return ((c3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f18405j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f18406k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1.b bVar = this.l.f18445b;
                    Float f11 = new Float(i3.f.f23112a.a(this.f18407m.a()));
                    this.f18406k = 1;
                    if (bVar.f(f11, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f18406k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1.b bVar2 = this.l.f18445b;
                    Float f12 = new Float(i3.f.f23112a.a(this.f18407m.a()));
                    this.f18406k = 1;
                    if (bVar2.f(f12, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
