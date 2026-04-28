package y80;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f45591k;
    public final /* synthetic */ z80.y l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(z80.y yVar, x70.c cVar) {
        super(2, cVar);
        this.l = yVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        u1 u1Var = new u1(this.l, cVar);
        u1Var.f45591k = obj;
        return u1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f45590j;
        if (i11 == 0) {
            ba0.g.M(obj);
            t1 t1Var = new t1(new Ref.BooleanRef(), (j) this.f45591k);
            this.f45590j = 1;
            if (m1.k(this.l, t1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        qc.y.m();
        return null;
    }
}
