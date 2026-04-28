package le;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f27743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i11) {
        super(0);
        this.f27742a = i11;
        this.f27743b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27742a) {
            case 0:
                p pVar = this.f27743b;
                return Boolean.valueOf((((he.k) pVar.f27745b.getValue()) == null && ((Throwable) pVar.f27746c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) this.f27743b.f27746c.getValue()) != null);
            case 2:
                p pVar2 = this.f27743b;
                return Boolean.valueOf(((he.k) pVar2.f27745b.getValue()) == null && ((Throwable) pVar2.f27746c.getValue()) == null);
            default:
                return Boolean.valueOf(((he.k) this.f27743b.f27745b.getValue()) != null);
        }
    }
}
