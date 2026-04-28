package nn;

import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import d2.b2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import oo.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFeature f31161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f31162c;

    public /* synthetic */ n(ProfileFeature profileFeature, Function0 function0, int i11) {
        this.f31160a = 0;
        this.f31161b = profileFeature;
        this.f31162c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f31160a) {
            case 0:
                num.getClass();
                q.i(this.f31161b, this.f31162c, nVar, m3.i.F(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f11 = 0;
                    b2 b2Var = new b2(f11, f11, f11, f11);
                    Function0 function0 = this.f31162c;
                    boolean zF = sVar.f(function0);
                    Object objM = sVar.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new z(26, function0);
                        sVar.k0(objM);
                    }
                    rn.a.b(this.f31161b, b2Var, (Function0) objM, null, null, sVar, 48, 24);
                } else {
                    sVar.U();
                }
                break;
            default:
                int iIntValue2 = num.intValue();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f12 = 0;
                    b2 b2Var2 = new b2(f12, f12, f12, f12);
                    Function0 function02 = this.f31162c;
                    boolean zF2 = sVar2.f(function02);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == m3.m.f29332a) {
                        objM2 = new z(27, function02);
                        sVar2.k0(objM2);
                    }
                    rn.a.b(this.f31161b, b2Var2, (Function0) objM2, null, null, sVar2, 48, 24);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ n(ProfileFeature profileFeature, Function0 function0, int i11, byte b8) {
        this.f31160a = i11;
        this.f31161b = profileFeature;
        this.f31162c = function0;
    }
}
