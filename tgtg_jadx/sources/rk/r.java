package rk;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicItem f38102b;

    public /* synthetic */ r(BasicItem basicItem, int i11, int i12) {
        this.f38101a = i12;
        this.f38102b = basicItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f38101a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                e.l(this.f38102b, nVar, m3.i.F(1));
                break;
            case 1:
                e.b(this.f38102b, nVar, m3.i.F(1));
                break;
            case 2:
                e.f(this.f38102b, nVar, m3.i.F(1));
                break;
            case 3:
                e.f(this.f38102b, nVar, m3.i.F(1));
                break;
            case 4:
                e.M(this.f38102b, nVar, m3.i.F(1));
                break;
            case 5:
                e.e(this.f38102b, nVar, m3.i.F(1));
                break;
            case 6:
                f0.e(this.f38102b, nVar, m3.i.F(1));
                break;
            case 7:
                f0.p(this.f38102b, nVar, m3.i.F(1));
                break;
            default:
                f0.p(this.f38102b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
