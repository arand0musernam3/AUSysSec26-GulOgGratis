package cn;

import a3.f2;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f8525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym.y f8528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym.z f8529e;

    public g0(BaseItemMnuV2 baseItemMnuV2, int i11, boolean z11, ym.y yVar, ym.z zVar) {
        this.f8525a = baseItemMnuV2;
        this.f8526b = i11;
        this.f8527c = z11;
        this.f8528d = yVar;
        this.f8529e = zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            LatestInteractionOrigin latestInteractionOrigin = LatestInteractionOrigin.SCREEN_DELIVERY;
            ym.y yVar = this.f8528d;
            boolean zH = sVar.h(yVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new f2(yVar, 2);
                sVar.k0(objM);
            }
            jb.u.i(b4.q.f5711a, this.f8525a, this.f8526b, this.f8527c, latestInteractionOrigin, (Function1) objM, this.f8529e, sVar, 24582);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
