package l0;

import a3.w1;
import com.braze.h2;
import h2.n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import m0.h1;
import m3.b1;
import m3.t1;
import mn.j;
import y80.a1;
import y80.a2;
import y80.r;
import y80.w;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f26742k;
    public final /* synthetic */ h1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f26743m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h1 h1Var, b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.l = h1Var;
        this.f26743m = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        d dVar = new d(this.l, this.f26743m, cVar);
        dVar.f26742k = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((t1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f26741j;
        if (i11 == 0) {
            ba0.g.M(obj);
            t1 t1Var = (t1) this.f26742k;
            b bVar = new b(0);
            d1.e eVar = new d1.e(t1Var, 28);
            h1 h1Var = this.l;
            h1Var.f28523j.a(eVar, bVar);
            a2 a2VarC = r.c(null);
            h1Var.b(new b(0), new e.b(a2VarC, 25));
            int i12 = 3;
            w wVar = new w(new a1(m3.i.D(new n0(this.f26743m, 15)), new j(new y80.h1(a2VarC), 17), new ah.j(i12, (x70.c) null, 4)), new c(new Ref.ObjectRef(), h1Var, null), 4);
            w1 w1Var = new w1(7, t1Var, h1Var);
            this.f26741j = 1;
            if (wVar.collect(w1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
