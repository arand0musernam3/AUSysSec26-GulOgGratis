package m60;

import android.os.SystemClock;
import com.app.tgtg.model.remote.payment.request.PaymentMethodsRequest;
import com.app.tgtg.model.remote.payment.request.PaymentMethodsRequestItem;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PackageUtils;
import com.braze.support.PermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29682a;

    public /* synthetic */ a(int i11) {
        this.f29682a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29682a) {
            case 0:
                return Unit.f26487a;
            case 1:
                return PaymentMethodsRequest._childSerializers$_anonymous_();
            case 2:
                return PaymentMethodsRequestItem._childSerializers$_anonymous_();
            case 3:
                return Unit.f26487a;
            case 4:
                return BrazeFileUtils.downloadFileToPath$lambda$10();
            case 5:
                return BrazeFileUtils.downloadFileToPath$lambda$9();
            case 6:
                return BrazeFileUtils.downloadFileToPath$lambda$8();
            case 7:
                return BrazeFileUtils.isRemoteUri$lambda$6();
            case 8:
                return BrazeImageUtils.calculateInSampleSize$lambda$4();
            case 9:
                return BrazeImageUtils.resizeToBitmapDimensions$lambda$0();
            case 10:
                return BrazeImageUtils.getRemoteBitmap$lambda$22();
            case 11:
                return BrazeImageUtils.getLocalBitmap$lambda$16();
            case 12:
                return BrazeImageUtils.getLocalBitmap$lambda$14();
            case 13:
                return BrazeImageUtils.getLocalBitmap$lambda$11();
            case 14:
                return BrazeLogger.checkForSystemLogLevelProperty$lambda$1();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return DateTimeUtils.nowInMilliseconds$lambda$1();
            case 16:
                return SystemClock.currentNetworkTimeClock();
            case 17:
                return IntentUtils.random_delegate$lambda$0();
            case 18:
                return JsonUtils.getPrettyPrintedString$lambda$6();
            case 19:
                return JsonUtils.parseJsonObjectIntoBundle$lambda$10();
            case 20:
                return JsonUtils.getPrettyPrintedString$lambda$7();
            case 21:
                return JsonUtils.getColorIntegerOrNull$lambda$8();
            case 22:
                return PackageUtils.setResourcePackageName$lambda$0();
            case 23:
                return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$10();
            case 24:
                return PermissionUtils.requestPushPermissionPrompt$lambda$1();
            case 25:
                return PermissionUtils.requestPushPermissionPrompt$lambda$2();
            case 26:
                return PermissionUtils.requestPushPermissionPrompt$lambda$4();
            case 27:
                return PermissionUtils.requestPushPermissionPrompt$lambda$3();
            case 28:
                return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$5();
            default:
                return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$6();
        }
    }
}
