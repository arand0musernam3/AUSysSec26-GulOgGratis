package uh;

import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.model.remote.item.AverageItemRating;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lv.w;
import m3.n;
import m3.s;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AverageItemRating f41149b;

    public /* synthetic */ c(AverageItemRating averageItemRating, int i11) {
        this.f41148a = i11;
        this.f41149b = averageItemRating;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41148a;
        int i12 = 1;
        n nVar = (n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                int i13 = CateringItemDetailsActivity.f8972o;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w.a(false, u3.e.e(-1612787247, sVar, new c(this.f41149b, i12)), sVar, MLKEMEngine.KyberPolyBytes);
                } else {
                    sVar.U();
                }
                break;
            default:
                int i14 = CateringItemDetailsActivity.f8972o;
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rk.e.C(this.f41149b, false, true, sVar2, MLKEMEngine.KyberPolyBytes, 2);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
