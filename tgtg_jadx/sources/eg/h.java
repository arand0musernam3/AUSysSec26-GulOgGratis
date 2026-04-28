package eg;

import b4.t;
import bx.o;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15995a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f15996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManufacturerItem f15997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15999e;

    public /* synthetic */ h(t tVar, ManufacturerItem manufacturerItem, long j9, int i11) {
        this.f15996b = tVar;
        this.f15997c = manufacturerItem;
        this.f15998d = j9;
        this.f15999e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15995a) {
            case 0:
                ((Integer) obj2).getClass();
                o.n(m3.i.F(this.f15999e | 1), this.f15998d, this.f15996b, this.f15997c, (n) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                o.D(m3.i.F(this.f15999e | 1), this.f15998d, this.f15996b, this.f15997c, (n) obj);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(ManufacturerItem manufacturerItem, t tVar, long j9, int i11) {
        this.f15997c = manufacturerItem;
        this.f15996b = tVar;
        this.f15998d = j9;
        this.f15999e = i11;
    }
}
