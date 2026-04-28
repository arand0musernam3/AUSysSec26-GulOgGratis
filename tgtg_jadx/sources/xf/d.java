package xf;

import ba0.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f44254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q2 f44255k;
    public final /* synthetic */ a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f44256m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z11, q2 q2Var, a aVar, boolean z12, x70.c cVar) {
        super(2, cVar);
        this.f44254j = z11;
        this.f44255k = q2Var;
        this.l = aVar;
        this.f44256m = z12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f44254j, this.f44255k, this.l, this.f44256m, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        ub.a aVar = (ub.a) this.f44255k.f48333a;
        y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
        g.M(obj);
        boolean z11 = this.f44254j;
        a aVar3 = this.l;
        if (z11) {
            String str = aVar3.f44243a;
            t5.a aVar4 = (t5.a) aVar.f40982c;
            if (str == null) {
                str = "";
            }
            aVar4.D("user_id", str);
        }
        if (this.f44256m) {
            String str2 = aVar3.f44244b;
            ((t5.a) aVar.f40982c).D("device_id", str2 != null ? str2 : "");
        }
        return Unit.f26487a;
    }
}
