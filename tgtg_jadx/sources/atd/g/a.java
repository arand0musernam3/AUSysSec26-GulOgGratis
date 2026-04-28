package atd.g;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f4829b;

    public /* synthetic */ a(Application application, int i11) {
        this.f4828a = i11;
        this.f4829b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4828a) {
            case 0:
                return BuildConfig.TransactionResult(this.f4829b);
            case 1:
                return BuildConfig.getProgressView(this.f4829b);
            case 2:
                return BuildConfig.TransactionResultSuccess(this.f4829b);
            case 3:
                return BuildConfig.TransactionResultFailure(this.f4829b);
            case 4:
                return BuildConfig.TransactionResultKt(this.f4829b);
            case 5:
                return BuildConfig.Warning(this.f4829b);
            case 6:
                return BuildConfig.getTransaction(this.f4829b);
            case 7:
                return BuildConfig.getMessage(this.f4829b);
            case 8:
                return BuildConfig.getID(this.f4829b);
            case 9:
                return BuildConfig.WarningSeverity(this.f4829b);
            case 10:
                return BuildConfig.ThreeDS2Service(this.f4829b);
            case 11:
                return BuildConfig.getSeverity(this.f4829b);
            case 12:
                return BuildConfig.values(this.f4829b);
            case 13:
                return BuildConfig.getCornerRadius(this.f4829b);
            case 14:
                return BuildConfig.ButtonCustomization(this.f4829b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BuildConfig.getWarnings(this.f4829b);
            case 16:
                return BuildConfig.getSDKVersion(this.f4829b);
            case 17:
                return BuildConfig.createTransaction(this.f4829b);
            case 18:
                return BuildConfig.cleanup(this.f4829b);
            case 19:
                return BuildConfig.Transaction(this.f4829b);
            case 20:
                return BuildConfig.close(this.f4829b);
            case 21:
                return BuildConfig.getAuthenticationRequestParameters(this.f4829b);
            case 22:
                return BuildConfig.doChallenge(this.f4829b);
            case 23:
                return BuildConfig.ChallengeResult(this.f4829b);
            case 24:
                return BuildConfig.ChallengeStatusHandler(this.f4829b);
            case 25:
                return BuildConfig.completed(this.f4829b);
            case 26:
                return BuildConfig.runtimeError(this.f4829b);
            case 27:
                return BuildConfig.CompletionEvent(this.f4829b);
            case 28:
                return BuildConfig.cancelled(this.f4829b);
            default:
                return BuildConfig.protocolError(this.f4829b);
        }
    }
}
