package m5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements y3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f29535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f29536b;

    public g0(Function2 function2, Function1 function1) {
        this.f29535a = function2;
        this.f29536b = function1;
    }

    @Override // y3.i
    public final Object e(Object obj) {
        return this.f29536b.invoke(obj);
    }

    @Override // y3.i
    public final Object i(y3.a aVar, Object obj) {
        return this.f29535a.invoke(aVar, obj);
    }
}
