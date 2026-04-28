package an;

import com.app.tgtg.model.remote.item.response.TypedItemCardsCarouselMnu;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import ym.y;
import ym.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1636a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypedItemCardsCarouselMnu f1637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f1639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f1640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1642g;

    public /* synthetic */ h(int i11, int i12, TypedItemCardsCarouselMnu typedItemCardsCarouselMnu, y yVar, z zVar, boolean z11) {
        this.f1637b = typedItemCardsCarouselMnu;
        this.f1638c = i11;
        this.f1639d = yVar;
        this.f1640e = zVar;
        this.f1641f = i12;
        this.f1642g = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1636a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ox.h.b(this.f1637b, this.f1638c, this.f1639d, this.f1640e, this.f1641f, this.f1642g, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ox.h.b(this.f1637b, this.f1638c, this.f1639d, this.f1640e, this.f1641f, this.f1642g, (n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(TypedItemCardsCarouselMnu typedItemCardsCarouselMnu, int i11, y yVar, z zVar, int i12, boolean z11, int i13) {
        this.f1637b = typedItemCardsCarouselMnu;
        this.f1638c = i11;
        this.f1639d = yVar;
        this.f1640e = zVar;
        this.f1641f = i12;
        this.f1642g = z11;
    }
}
