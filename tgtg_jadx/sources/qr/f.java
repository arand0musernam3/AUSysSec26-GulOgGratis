package qr;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f37245b;

    public /* synthetic */ f(Function1 function1, int i11) {
        this.f37244a = i11;
        this.f37245b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37244a) {
            case 0:
                this.f37245b.invoke(or.a.EMAIL);
                break;
            case 1:
                this.f37245b.invoke(or.a.PHONE);
                break;
            case 2:
                this.f37245b.invoke(or.a.COUNTRY);
                break;
            case 3:
                this.f37245b.invoke(dv.d.OTHER);
                break;
            case 4:
                this.f37245b.invoke(dv.d.GOT_IT_BUTTON);
                break;
            case 5:
                this.f37245b.invoke(Boolean.FALSE);
                break;
            case 6:
                this.f37245b.invoke(Boolean.FALSE);
                break;
            case 7:
                this.f37245b.invoke(Boolean.TRUE);
                break;
            case 8:
                this.f37245b.invoke(Boolean.FALSE);
                break;
            case 9:
                this.f37245b.invoke("");
                break;
            case 10:
                Function1 function1 = this.f37245b;
                if (function1 != null) {
                    function1.invoke(vg.b.CLOSE);
                }
                break;
            case 11:
                Function1 function12 = this.f37245b;
                if (function12 != null) {
                    function12.invoke(vg.b.ADD);
                }
                break;
            case 12:
                Function1 function13 = this.f37245b;
                if (function13 != null) {
                    function13.invoke(vg.b.CONFIRM);
                }
                break;
            case 13:
                Function1 function14 = this.f37245b;
                if (function14 != null) {
                    function14.invoke(vg.b.ADD_STATIONS);
                }
                break;
            case 14:
                Function1 function15 = this.f37245b;
                if (function15 != null) {
                    function15.invoke(vg.b.SAVE);
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Function1 function16 = this.f37245b;
                if (function16 != null) {
                    function16.invoke(vg.b.APPLY);
                }
                break;
            case 16:
                this.f37245b.invoke(Boolean.FALSE);
                break;
            case 17:
                this.f37245b.invoke(Boolean.TRUE);
                break;
            default:
                this.f37245b.invoke(null);
                break;
        }
        return Unit.f26487a;
    }
}
