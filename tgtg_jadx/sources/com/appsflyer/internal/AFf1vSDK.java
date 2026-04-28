package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1vSDK extends AFe1uSDK<AFf1nSDK> {
    private final AFc1gSDK AFKeystoreWrapper;
    private final AFf1qSDK areAllFieldsValid;
    public AFi1vSDK component1;
    private final AFc1kSDK component2;
    public AFf1nSDK component3;
    public final AFf1uSDK component4;
    private final String copy;
    private final AFf1oSDK copydefault;
    private final AFf1kSDK equals;
    private final AFf1pSDK hashCode;
    private final AFd1mSDK toString;

    public AFf1vSDK(@NonNull AFf1qSDK aFf1qSDK, @NonNull AFc1kSDK aFc1kSDK, @NonNull AFf1kSDK aFf1kSDK, @NonNull AFf1pSDK aFf1pSDK, @NonNull AFd1mSDK aFd1mSDK, @NonNull AFf1oSDK aFf1oSDK, @NonNull String str, AFf1uSDK aFf1uSDK, AFc1gSDK aFc1gSDK) {
        super(AFe1lSDK.RC_CDN, new AFe1lSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.areAllFieldsValid = aFf1qSDK;
        this.component2 = aFc1kSDK;
        this.equals = aFf1kSDK;
        this.hashCode = aFf1pSDK;
        this.toString = aFd1mSDK;
        this.copydefault = aFf1oSDK;
        this.copy = str;
        this.component4 = aFf1uSDK;
        this.AFKeystoreWrapper = aFc1gSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFf1nSDK areAllFieldsValid() throws java.lang.InterruptedException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1vSDK.areAllFieldsValid():com.appsflyer.internal.AFf1nSDK");
    }

    private void getCurrencyIso4217Code(String str, long j9, AFe1ySDK<?> aFe1ySDK, AFh1cSDK aFh1cSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th2) {
        long j11;
        int statusCode;
        Throwable th3;
        if (aFe1ySDK != null) {
            j11 = aFe1ySDK.AFAdRevenueData.AFAdRevenueData;
            statusCode = aFe1ySDK.getStatusCode();
        } else {
            j11 = 0;
            statusCode = 0;
        }
        int i11 = statusCode;
        if (th2 instanceof HttpException) {
            Throwable cause = th2.getCause();
            j11 = ((HttpException) th2).getMetrics().AFAdRevenueData;
            th3 = cause;
        } else {
            th3 = th2;
        }
        this.component1 = new AFi1vSDK(aFh1cSDK != null ? aFh1cSDK.AFAdRevenueData : null, str, j11, System.currentTimeMillis() - j9, i11, aFi1ySDK, str2, th3);
    }

    private void getMonetizationNetwork(String str, long j9, AFi1ySDK aFi1ySDK, String str2, AFe1ySDK<AFh1cSDK> aFe1ySDK) {
        getCurrencyIso4217Code(str, j9, aFe1ySDK, aFe1ySDK != null ? aFe1ySDK.getBody() : null, aFi1ySDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    @NonNull
    public final AFe1rSDK getMediationNetwork() throws Exception {
        try {
            AFf1nSDK aFf1nSDKAreAllFieldsValid = areAllFieldsValid();
            this.component3 = aFf1nSDKAreAllFieldsValid;
            return aFf1nSDKAreAllFieldsValid == AFf1nSDK.FAILURE ? AFe1rSDK.FAILURE : AFe1rSDK.SUCCESS;
        } catch (InterruptedIOException e5) {
            e = e5;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (InterruptedException e11) {
            e = e11;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1nSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return MessageLogView.NEW_MESSAGE_VIEW_DELAY;
    }
}
