package eg;

import b4.t;
import bx.o;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f15992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManufacturerItem f15993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15994d;

    public /* synthetic */ g(t tVar, ManufacturerItem manufacturerItem, long j9, int i11, int i12) {
        this.f15991a = i12;
        this.f15992b = tVar;
        this.f15993c = manufacturerItem;
        this.f15994d = j9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15991a) {
            case 0:
                ((Integer) obj2).getClass();
                o.k(m3.i.F(1), this.f15994d, this.f15992b, this.f15993c, (n) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                o.q(m3.i.F(1), this.f15994d, this.f15992b, this.f15993c, (n) obj);
                break;
        }
        return Unit.f26487a;
    }
}
