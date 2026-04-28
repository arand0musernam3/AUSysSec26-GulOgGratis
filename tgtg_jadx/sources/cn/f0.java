package cn;

import com.app.tgtg.model.remote.item.response.TypedItemCardsCarouselMnu;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8518d;

    public /* synthetic */ f0(Object obj, long j9, long j11, int i11, int i12) {
        this.f8515a = i12;
        this.f8518d = obj;
        this.f8516b = j9;
        this.f8517c = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8515a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                ox.h.k((TypedItemCardsCarouselMnu) this.f8518d, this.f8516b, this.f8517c, (m3.n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(7);
                g3.k.a((b4.t) this.f8518d, this.f8516b, this.f8517c, (m3.n) obj, iF2);
                break;
        }
        return Unit.f26487a;
    }
}
