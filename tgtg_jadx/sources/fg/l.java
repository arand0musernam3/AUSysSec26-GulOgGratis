package fg;

import com.app.tgtg.model.remote.item.response.BasicItem;
import d40.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicItem f17717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17719d;

    public /* synthetic */ l(BasicItem basicItem, long j9, int i11, int i12) {
        this.f17716a = i12;
        this.f17717b = basicItem;
        this.f17718c = j9;
        this.f17719d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f17716a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                bx.o.h(this.f17717b, this.f17718c, nVar, m3.i.F(this.f17719d | 1));
                break;
            case 1:
                bx.o.s(this.f17717b, this.f17718c, nVar, m3.i.F(this.f17719d | 1));
                break;
            default:
                t1.h(this.f17717b, this.f17718c, nVar, m3.i.F(this.f17719d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
