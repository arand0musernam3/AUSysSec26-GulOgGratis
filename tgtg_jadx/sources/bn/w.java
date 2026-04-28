package bn;

import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2;
import com.app.tgtg.model.remote.item.response.ItemCarouselMnu;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym.y f6528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ElementMnuV2 f6530f;

    public /* synthetic */ w(ElementMnuV2 elementMnuV2, long j9, long j11, ym.y yVar, int i11, int i12) {
        this.f6525a = i12;
        this.f6530f = elementMnuV2;
        this.f6526b = j9;
        this.f6527c = j11;
        this.f6528d = yVar;
        this.f6529e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6525a) {
            case 0:
                ((Integer) obj2).getClass();
                lx.u.d((HighlightedItemCardsCarouselMnuV2) this.f6530f, this.f6526b, this.f6527c, this.f6528d, (m3.n) obj, m3.i.F(this.f6529e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                lx.u.g((ItemCarouselMnu) this.f6530f, this.f6526b, this.f6527c, this.f6528d, (m3.n) obj, m3.i.F(this.f6529e | 1));
                break;
        }
        return Unit.f26487a;
    }
}
