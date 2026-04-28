package al;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ boolean f1517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f1518k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f1518k = c0Var;
        this.l = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        b0 b0Var = new b0(this.f1518k, this.l, cVar);
        b0Var.f1517j = ((Boolean) obj).booleanValue();
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((b0) create(bool, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        boolean z11 = this.f1517j;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        if (z11) {
            return Unit.f26487a;
        }
        c0 c0Var = this.f1518k;
        ((av.e) c0Var.l.getValue()).i(Boolean.valueOf(this.l));
        c0Var.f1533n = true;
        return Unit.f26487a;
    }
}
