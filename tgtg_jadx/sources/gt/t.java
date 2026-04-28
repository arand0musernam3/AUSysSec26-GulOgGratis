package gt;

import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Order f20891c;

    public /* synthetic */ t(w wVar, Order order, int i11) {
        this.f20889a = i11;
        this.f20890b = wVar;
        this.f20891c = order;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ha.a aVar = (ha.a) obj;
        switch (this.f20889a) {
            case 0:
                aVar.getClass();
                this.f20890b.f20898d.c(aVar, this.f20891c);
                break;
            case 1:
                aVar.getClass();
                this.f20890b.f20897c.c(aVar, this.f20891c);
                break;
            default:
                aVar.getClass();
                this.f20890b.f20896b.v(aVar, this.f20891c);
                break;
        }
        return Unit.f26487a;
    }
}
