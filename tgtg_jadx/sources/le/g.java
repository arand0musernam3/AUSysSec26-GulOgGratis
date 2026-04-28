package le;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f27674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ he.k f27675k;
    public final /* synthetic */ float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f27676m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, he.k kVar, float f11, boolean z11, x70.c cVar) {
        super(1, cVar);
        this.f27674j = hVar;
        this.f27675k = kVar;
        this.l = f11;
        this.f27676m = z11;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new g(this.f27674j, this.f27675k, this.l, this.f27676m, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        he.k kVar = this.f27675k;
        h hVar = this.f27674j;
        hVar.f27685i.setValue(kVar);
        hVar.h(this.l);
        hVar.g(1);
        hVar.f27677a.setValue(Boolean.FALSE);
        if (this.f27676m) {
            hVar.l.setValue(Long.MIN_VALUE);
        }
        return Unit.f26487a;
    }
}
