package atd.g;

import com.app.tgtg.model.remote.discover.response.DiscoverAllBucketsResponse;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4834a;

    public /* synthetic */ d(int i11) {
        this.f4834a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4834a) {
            case 0:
                return BuildConfig.ChallengeStatusHandler();
            case 1:
                return BuildConfig.onCompletion();
            case 2:
                return BuildConfig.BuildConfig();
            case 3:
                return BuildConfig.completed();
            case 4:
                return BuildConfig.cancelled();
            case 5:
                return BuildConfig.InitializeResult();
            case 6:
                return BuildConfig.InitializeResultSuccess();
            case 7:
                return BuildConfig.InitializeResultFailure();
            case 8:
                return BuildConfig.ProgressDialog();
            case 9:
                return BuildConfig.hide();
            case 10:
                return BuildConfig.getSDKTransactionID();
            case 11:
                return BuildConfig.protocolError();
            case 12:
                return BuildConfig.ChallengeResult();
            case 13:
                return BuildConfig.getMessageVersion();
            case 14:
                return BuildConfig.getSDKEphemeralPublicKey();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BuildConfig.getSDKAppID();
            case 16:
                return BuildConfig.getDeviceData();
            case 17:
                return BuildConfig.AuthenticationRequestParameters();
            case 18:
                return BuildConfig.getSDKReferenceNumber();
            case 19:
                return BuildConfig.runtimeError();
            case 20:
                return BuildConfig.InitializeResultKt();
            case 21:
                return BuildConfig.timedout();
            case 22:
                return BuildConfig.CompletionEvent();
            case 23:
                return BuildConfig.equals();
            case 24:
                return BuildConfig.ChallengeResultCancelled();
            case 25:
                return BuildConfig.getErrorDescription();
            case 26:
                return DiscoverAllBucketsResponse._childSerializers$_anonymous_();
            case 27:
                return DiscoverBucket._childSerializers$_anonymous_();
            case 28:
                return DiscoverBucket._childSerializers$_anonymous_$0();
            default:
                return DiscoverBucket._childSerializers$_anonymous_$1();
        }
    }
}
