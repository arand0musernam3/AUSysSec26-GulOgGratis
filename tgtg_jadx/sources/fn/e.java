package fn;

import androidx.lifecycle.m1;
import at.c0;
import com.app.tgtg.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f17822b;

    public /* synthetic */ e(t tVar, int i11) {
        this.f17821a = i11;
        this.f17822b = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f17821a;
        x70.c cVar = null;
        int i12 = 1;
        t tVar = this.f17822b;
        switch (i11) {
            case 0:
                tVar.s().d().clear();
                tVar.s().i(true, false);
                break;
            case 1:
                tVar.A();
                break;
            case 2:
                tVar.s().h();
                break;
            case 3:
                c cVarS = tVar.s();
                cVarS.getClass();
                f0.B(m1.d(cVarS), null, null, new b(cVarS, cVar, i12), 3);
                tVar.s().g();
                break;
            case 4:
                c cVarS2 = tVar.s();
                cv.i iVar = cv.i.ACTION_DISMISS_FRIDGE_BANNER;
                cVarS2.getClass();
                iVar.getClass();
                cv.b bVar = cVarS2.f17796c;
                bVar.getClass();
                bVar.c(iVar, null);
                break;
            case 5:
                tVar.A();
                break;
            case 6:
                tVar.s().f17794a.f4431p = 0L;
                break;
            case 7:
                tVar.v();
                tVar.s().i(true, false);
                break;
            case 8:
                tVar.A();
                break;
            case 9:
                tVar.A();
                break;
            case 10:
                tVar.A();
                break;
            case 11:
                if (tVar.getActivity() != null) {
                    c cVarS3 = tVar.s();
                    String loyaltyCardTermsUrl = tVar.s().f17795b.n().getLoyaltyCardTermsUrl();
                    ct.a aVar = ct.a.TERMS_AND_CONDITIONS;
                    Integer numValueOf = Integer.valueOf(R.string.loyalty_card_info_see_full_terms);
                    cVarS3.getClass();
                    aVar.getClass();
                    c0.c(cVarS3.l, loyaltyCardTermsUrl, aVar, numValueOf, true, 16);
                }
                break;
            case 12:
                tVar.f17851j.setValue(Boolean.FALSE);
                break;
            default:
                tVar.f17851j.setValue(Boolean.FALSE);
                tVar.s().f17804k.f25316a.a(new f70.j());
                break;
        }
        return Unit.f26487a;
    }
}
