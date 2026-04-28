package atd.g;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f4831b;

    public /* synthetic */ b(Application application, int i11) {
        this.f4830a = i11;
        this.f4831b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4830a) {
            case 0:
                return BuildConfig.timedout(this.f4831b);
            case 1:
                return BuildConfig.ErrorMessage(this.f4831b);
            case 2:
                return BuildConfig.getErrorCode(this.f4831b);
            case 3:
                return BuildConfig.getErrorDescription(this.f4831b);
            case 4:
                return BuildConfig.BuildConfig(this.f4831b);
            case 5:
                return BuildConfig.getErrorDetails(this.f4831b);
            case 6:
                return BuildConfig.getTransactionID(this.f4831b);
            case 7:
                return BuildConfig.InitializeResultSuccess(this.f4831b);
            case 8:
                return BuildConfig.hashCode(this.f4831b);
            case 9:
                return BuildConfig.InitializeResultFailure(this.f4831b);
            case 10:
                return BuildConfig.toString(this.f4831b);
            case 11:
                return BuildConfig.InitializeResult(this.f4831b);
            case 12:
                return BuildConfig.ProgressDialog(this.f4831b);
            case 13:
                return BuildConfig.InitializeResultKt(this.f4831b);
            case 14:
                return BuildConfig.show(this.f4831b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BuildConfig.ChallengeResultError(this.f4831b);
            case 16:
                return BuildConfig.hide(this.f4831b);
            case 17:
                return BuildConfig.equals(this.f4831b);
            case 18:
                return BuildConfig.RuntimeErrorEvent(this.f4831b);
            case 19:
                return BuildConfig.ProtocolErrorEvent(this.f4831b);
            case 20:
                return BuildConfig.initialize(this.f4831b);
            case 21:
                return BuildConfig.getErrorMessage(this.f4831b);
            case 22:
                return BuildConfig.ChallengeResultCompleted(this.f4831b);
            case 23:
                return BuildConfig.getAdditionalDetails(this.f4831b);
            case 24:
                return BuildConfig.getTransactionStatus(this.f4831b);
            case 25:
                return BuildConfig.ChallengeResultTimeout(this.f4831b);
            case 26:
                return BuildConfig.ChallengeStatusReceiver(this.f4831b);
            case 27:
                return BuildConfig.ChallengeResultKt(this.f4831b);
            case 28:
                return BuildConfig.onCompletion(this.f4831b);
            default:
                return BuildConfig.setBorderColor(this.f4831b);
        }
    }
}
