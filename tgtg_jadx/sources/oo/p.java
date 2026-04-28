package oo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Long f32854k;
    public final /* synthetic */ v80.b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f32855m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Long l, v80.b0 b0Var, b1 b1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f32853j = i11;
        this.f32854k = l;
        this.l = b0Var;
        this.f32855m = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f32853j) {
            case 0:
                return new p(this.f32854k, this.l, this.f32855m, cVar, 0);
            case 1:
                return new p(this.f32854k, this.l, this.f32855m, cVar, 1);
            default:
                return new p(this.f32854k, this.l, this.f32855m, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f32853j) {
        }
        return ((p) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f32853j;
        b1 b1Var = this.f32855m;
        Long l = this.f32854k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (l != null) {
                    mv.d.v(this.l, l.longValue(), null, new co.y(b1Var, null, 3), 6);
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (l != null) {
                    mv.d.v(this.l, l.longValue(), null, new co.y(b1Var, null, 4), 6);
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (l != null) {
                    mv.d.v(this.l, l.longValue(), null, new co.y(b1Var, null, 5), 6);
                }
                break;
        }
        return Unit.f26487a;
    }
}
