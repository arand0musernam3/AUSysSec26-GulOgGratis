package a3;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f355k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f357n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(long j9, Ref.LongRef longRef, x70.c cVar) {
        super(2, cVar);
        this.f356m = j9;
        this.f357n = longRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        g1 g1Var = new g1(this.f356m, this.f357n, cVar);
        g1Var.l = obj;
        return g1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        w4.k0 k0Var;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f355k;
        Ref.LongRef longRef = this.f357n;
        if (i11 == 0) {
            ba0.g.M(obj);
            w4.k0 k0Var2 = (w4.k0) this.l;
            f1 f1Var = new f1(longRef, 0);
            this.l = k0Var2;
            this.f355k = 1;
            Object objD = z1.y0.d(k0Var2, this.f356m, f1Var, this);
            if (objD == aVar) {
                return aVar;
            }
            k0Var = k0Var2;
            obj = objD;
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k0Var = (w4.k0) this.l;
            ba0.g.M(obj);
        }
        if (((w4.v) obj) != null && (longRef.element & 9223372034707292159L) != 9205357640488583168L) {
            return m.Drag;
        }
        w4.v vVar = (w4.v) CollectionsKt.O(k0Var.f43144f.f43159s.f43165a);
        if (!w4.u.d(vVar)) {
            return m.Cancel;
        }
        vVar.a();
        return m.Up;
    }
}
