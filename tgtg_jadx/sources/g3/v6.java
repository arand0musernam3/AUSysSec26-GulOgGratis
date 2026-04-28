package g3;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v6 extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19651k;
    public final /* synthetic */ Ref.FloatRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z1.l1 f19652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w6 f19653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f19654o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(Ref.FloatRef floatRef, z1.l1 l1Var, w6 w6Var, float f11, x70.c cVar) {
        super(3, cVar);
        this.l = floatRef;
        this.f19652m = l1Var;
        this.f19653n = w6Var;
        this.f19654o = f11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w6 w6Var = this.f19653n;
        float f11 = this.f19654o;
        v6 v6Var = new v6(this.l, this.f19652m, w6Var, f11, (x70.c) obj3);
        v6Var.f19651k = (z1.q) obj;
        return v6Var.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Ref.FloatRef floatRef;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f19650j;
        if (i11 == 0) {
            ba0.g.M(obj);
            int i12 = 0;
            u6 u6Var = new u6(i12, this.f19653n, (z1.q) this.f19651k);
            Ref.FloatRef floatRef2 = this.l;
            this.f19651k = floatRef2;
            this.f19650j = 1;
            Object objA = this.f19652m.a(u6Var, this.f19654o, this);
            if (objA == aVar) {
                return aVar;
            }
            floatRef = floatRef2;
            obj = objA;
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            floatRef = (Ref.FloatRef) this.f19651k;
            ba0.g.M(obj);
        }
        floatRef.element = ((Number) obj).floatValue();
        return Unit.f26487a;
    }
}
