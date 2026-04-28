package cn;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f8609b;

    public /* synthetic */ z(int i11, Function2 function2) {
        this.f8608a = i11;
        this.f8609b = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8608a) {
            case 0:
                this.f8609b.invoke(null, Boolean.FALSE);
                break;
            default:
                this.f8609b.invoke(jl.a.SELECT, null);
                break;
        }
        return Unit.f26487a;
    }
}
