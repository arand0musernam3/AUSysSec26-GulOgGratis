package defpackage;

import cl.a;
import co.q;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import hr.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6784b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f6783a = i11;
        this.f6784b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6783a) {
            case 0:
                this.f6784b.invoke(a.f8439a);
                break;
            case 1:
                this.f6784b.invoke(q.MINIMISED);
                break;
            case 2:
                this.f6784b.invoke(Boolean.FALSE);
                break;
            case 3:
                this.f6784b.invoke(ChipVariant.TextOnly);
                break;
            case 4:
                this.f6784b.invoke(ChipVariant.Icon);
                break;
            case 5:
                this.f6784b.invoke(ChipVariant.Avatar);
                break;
            case 6:
                this.f6784b.invoke(Boolean.FALSE);
                break;
            case 7:
                this.f6784b.invoke(gj.a.NOW);
                break;
            case 8:
                this.f6784b.invoke(gj.a.TODAY);
                break;
            case 9:
                this.f6784b.invoke(gj.a.TOMORROW);
                break;
            case 10:
                this.f6784b.invoke(f.JOIN_TGTG);
                break;
            case 11:
                this.f6784b.invoke(f.HIDDEN_STORES);
                break;
            case 12:
                this.f6784b.invoke(f.BLOG);
                break;
            case 13:
                this.f6784b.invoke(f.LEGAL);
                break;
            case 14:
                this.f6784b.invoke(f.PAYMENT_OPTIONS);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f6784b.invoke(f.SPECIAL_REWARDS);
                break;
            case 16:
                this.f6784b.invoke(f.NOTIFICATIONS);
                break;
            case 17:
                this.f6784b.invoke(f.CHAT);
                break;
            case 18:
                this.f6784b.invoke(f.INVITE_FRIENDS);
                break;
            case 19:
                this.f6784b.invoke(f.RECOMMEND_STORE);
                break;
            case 20:
                this.f6784b.invoke(f.GO_TO_MYSTORE);
                break;
            case 21:
                this.f6784b.invoke(f.STORE_SIGNUP);
                break;
            case 22:
                this.f6784b.invoke(f.ACCOUNT_DETAILS);
                break;
            case 23:
                this.f6784b.invoke(f.JOIN_TGTG);
                break;
            case 24:
                this.f6784b.invoke(f.HELP_WITH_ORDER);
                break;
            case 25:
                this.f6784b.invoke(f.HELP_CENTER);
                break;
            case 26:
                this.f6784b.invoke(Boolean.TRUE);
                break;
            case 27:
                this.f6784b.invoke(Boolean.FALSE);
                break;
            case 28:
                this.f6784b.invoke(or.a.NAME);
                break;
            default:
                this.f6784b.invoke(fr.a.DELETE_ACCOUNT);
                break;
        }
        return Unit.f26487a;
    }
}
