package fg;

import com.app.tgtg.model.remote.item.response.BasicItem;
import d40.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicItem f17727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17728c;

    public /* synthetic */ n(BasicItem basicItem, int i11, int i12) {
        this.f17726a = i12;
        this.f17727b = basicItem;
        this.f17728c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f17726a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                t1.e(this.f17727b, nVar, m3.i.F(this.f17728c | 1));
                break;
            case 1:
                xi.d.d(this.f17727b, nVar, m3.i.F(this.f17728c | 1));
                break;
            default:
                xi.d.i(this.f17727b, nVar, m3.i.F(this.f17728c | 1));
                break;
        }
        return Unit.f26487a;
    }
}
