package tp;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import op.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f40392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f40393c;

    public /* synthetic */ d(Function1 function1, l lVar, int i11) {
        this.f40391a = i11;
        this.f40392b = function1;
        this.f40393c = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40391a) {
            case 0:
                this.f40392b.invoke(this.f40393c);
                break;
            default:
                this.f40392b.invoke(this.f40393c);
                break;
        }
        return Unit.f26487a;
    }
}
