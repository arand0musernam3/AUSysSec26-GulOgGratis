package lp;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f28080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hp.g f28081c;

    public /* synthetic */ o(Function1 function1, hp.g gVar, int i11) {
        this.f28079a = i11;
        this.f28080b = function1;
        this.f28081c = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28079a) {
            case 0:
                this.f28080b.invoke(this.f28081c);
                break;
            default:
                this.f28080b.invoke(this.f28081c);
                break;
        }
        return Unit.f26487a;
    }
}
