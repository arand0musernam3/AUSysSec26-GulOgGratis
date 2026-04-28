package vm;

import a3.f2;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.s;
import um.u;
import ym.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f42482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f42484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f42485d;

    public o(BaseItemMnuV2 baseItemMnuV2, int i11, u uVar, z zVar) {
        this.f42482a = baseItemMnuV2;
        this.f42483b = i11;
        this.f42484c = uVar;
        this.f42485d = zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            LatestInteractionOrigin latestInteractionOrigin = LatestInteractionOrigin.SCREEN_RECOMMENDATION;
            u uVar = this.f42484c;
            boolean zH = sVar.h(uVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new f2(uVar, 10);
                sVar.k0(objM);
            }
            jb.u.i(b4.q.f5711a, this.f42482a, this.f42483b, true, latestInteractionOrigin, (Function1) objM, this.f42485d, sVar, 27654);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
