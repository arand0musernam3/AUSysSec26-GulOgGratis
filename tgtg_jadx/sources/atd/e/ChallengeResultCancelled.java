package atd.e;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/adyen/threeds2/internal/SdkTransactionIdentifierNotGenerated;", "Ljava/lang/Exception;", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCancelled extends Exception {
    public ChallengeResultCancelled() {
        super("The value is not generated yet.");
    }
}
