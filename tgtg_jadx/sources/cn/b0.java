package cn;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f8481b;

    public /* synthetic */ b0(int i11, Function2 function2) {
        this.f8480a = i11;
        this.f8481b = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8480a) {
            case 0:
                this.f8481b.invoke(null, Boolean.FALSE);
                break;
            case 1:
                this.f8481b.invoke(null, Boolean.TRUE);
                break;
            case 2:
                this.f8481b.invoke(jl.a.ROW_CLICK, null);
                break;
            default:
                this.f8481b.invoke(jl.a.ADD, null);
                break;
        }
        return Unit.f26487a;
    }
}
