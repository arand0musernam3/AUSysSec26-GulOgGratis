package wi;

import com.app.tgtg.model.remote.user.requests.UserAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserAddress f43439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jg.c f43440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f43441d;

    public /* synthetic */ f(UserAddress userAddress, jg.c cVar, int i11, int i12) {
        this.f43438a = i12;
        this.f43439b = userAddress;
        this.f43440c = cVar;
        this.f43441d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f43438a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                h.c(this.f43439b, this.f43440c, nVar, m3.i.F(this.f43441d | 1));
                break;
            case 1:
                h.b(this.f43439b, this.f43440c, nVar, m3.i.F(this.f43441d | 1));
                break;
            case 2:
                h.e(this.f43439b, this.f43440c, nVar, m3.i.F(this.f43441d | 1));
                break;
            case 3:
                a.b(this.f43439b, this.f43440c, nVar, m3.i.F(this.f43441d | 1));
                break;
            default:
                a.i(this.f43439b, this.f43440c, nVar, m3.i.F(this.f43441d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
