package mr;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f30089b;

    public /* synthetic */ i(r rVar, int i11) {
        this.f30088a = i11;
        this.f30089b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30088a) {
            case 0:
                r rVar = this.f30089b;
                rVar.f30119k.k(Boolean.FALSE);
                rVar.f30122o.k(Boolean.TRUE);
                break;
            default:
                r rVar2 = this.f30089b;
                rVar2.f30119k.k(Boolean.FALSE);
                rVar2.f30122o.k(Boolean.TRUE);
                break;
        }
        return Unit.f26487a;
    }
}
