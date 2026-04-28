package z1;

import g3.u6;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l3 f46561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.LongRef f46562k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f46564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l3 f46565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f46566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f46567q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(l3 l3Var, Ref.LongRef longRef, long j9, x70.c cVar) {
        super(2, cVar);
        this.f46565o = l3Var;
        this.f46566p = longRef;
        this.f46567q = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        j3 j3Var = new j3(this.f46565o, this.f46566p, this.f46567q, cVar);
        j3Var.f46564n = obj;
        return j3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j3) create((k3) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        l3 l3Var;
        Ref.LongRef longRef;
        long j9;
        l3 l3Var2;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f46563m;
        if (i11 == 0) {
            ba0.g.M(obj);
            k3 k3Var = (k3) this.f46564n;
            l3Var = this.f46565o;
            u6 u6Var = new u6(2, l3Var, k3Var);
            l1 l1Var = l3Var.f46586c;
            longRef = this.f46566p;
            long j11 = longRef.element;
            h2 h2Var = l3Var.f46587d;
            h2 h2Var2 = h2.Horizontal;
            long j12 = this.f46567q;
            float fD = l3Var.d(h2Var == h2Var2 ? z5.q.b(j12) : z5.q.c(j12));
            this.f46564n = l3Var;
            this.f46561j = l3Var;
            this.f46562k = longRef;
            this.l = j11;
            this.f46563m = 1;
            obj = l1Var.a(u6Var, fD, this);
            if (obj == aVar) {
                return aVar;
            }
            j9 = j11;
            l3Var2 = l3Var;
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j9 = this.l;
            longRef = this.f46562k;
            l3Var = this.f46561j;
            l3Var2 = (l3) this.f46564n;
            ba0.g.M(obj);
        }
        float fD2 = l3Var2.d(((Number) obj).floatValue());
        longRef.element = l3Var.f46587d == h2.Horizontal ? z5.q.a(j9, fD2, 0.0f, 2) : z5.q.a(j9, 0.0f, fD2, 1);
        return Unit.f26487a;
    }
}
