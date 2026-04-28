package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4.t f14482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f14483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b4.t tVar, Function2 function2, int i11) {
        super(2);
        this.f14482a = tVar;
        this.f14483b = function2;
        this.f14484c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iF = m3.i.F(this.f14484c | 1);
        ex.i.i(this.f14482a, this.f14483b, (m3.n) obj, iF);
        return Unit.f26487a;
    }
}
