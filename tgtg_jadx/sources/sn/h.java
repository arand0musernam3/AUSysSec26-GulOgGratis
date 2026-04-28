package sn;

import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import d2.b2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFeature f39075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoyaltyCardDetails f39076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f39077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f39078e;

    public /* synthetic */ h(ProfileFeature profileFeature, LoyaltyCardDetails loyaltyCardDetails, Function1 function1, b1 b1Var, int i11) {
        this.f39074a = i11;
        this.f39075b = profileFeature;
        this.f39076c = loyaltyCardDetails;
        this.f39077d = function1;
        this.f39078e = b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39074a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ProfileFeatureState featureState = this.f39075b.getFeatureState();
                    float f11 = 0;
                    b2 b2Var = new b2(f11, f11, f11, f11);
                    Function1 function1 = this.f39077d;
                    boolean zF = sVar.f(function1);
                    Object objM = sVar.M();
                    if (zF || objM == m.f29332a) {
                        objM = new qr.f(function1, 5);
                        sVar.k0(objM);
                    }
                    a.b(null, featureState, this.f39076c, b2Var, null, (Function0) objM, false, this.f39078e, sVar, 12585984, 81);
                } else {
                    sVar.U();
                }
                break;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ProfileFeatureState featureState2 = this.f39075b.getFeatureState();
                    float f12 = 0;
                    b2 b2Var2 = new b2(f12, f12, f12, f12);
                    Function1 function12 = this.f39077d;
                    boolean zF2 = sVar2.f(function12);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == m.f29332a) {
                        objM2 = new qr.f(function12, 6);
                        sVar2.k0(objM2);
                    }
                    a.b(null, featureState2, this.f39076c, b2Var2, null, (Function0) objM2, false, this.f39078e, sVar2, 12585984, 81);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
