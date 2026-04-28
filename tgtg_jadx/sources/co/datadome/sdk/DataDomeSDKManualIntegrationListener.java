package co.datadome.sdk;

import com.braze.h2;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0017J#\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0017¨\u0006\u000f"}, d2 = {"Lco/datadome/sdk/DataDomeSDKManualIntegrationListener;", "", "()V", "onComplete", "", "requestId", "", "(Ljava/lang/Integer;)V", "onDismiss", "onError", "errorMessage", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "onRequestInProgress", "willDisplayCaptcha", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DataDomeSDKManualIntegrationListener {
    public static /* synthetic */ void onComplete$default(DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener, Integer num, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: onComplete");
            return;
        }
        if ((i11 & 1) != 0) {
            num = null;
        }
        dataDomeSDKManualIntegrationListener.onComplete(num);
    }

    public static /* synthetic */ void onError$default(DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener, Integer num, String str, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: onError");
            return;
        }
        if ((i11 & 1) != 0) {
            num = null;
        }
        dataDomeSDKManualIntegrationListener.onError(num, str);
    }

    public static /* synthetic */ void onRequestInProgress$default(DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener, Integer num, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: onRequestInProgress");
            return;
        }
        if ((i11 & 1) != 0) {
            num = null;
        }
        dataDomeSDKManualIntegrationListener.onRequestInProgress(num);
    }

    public void onDismiss() {
    }

    public void willDisplayCaptcha() {
    }

    public void onComplete(@Nullable Integer requestId) {
    }

    public void onRequestInProgress(@Nullable Integer requestId) {
    }

    public void onError(@Nullable Integer requestId, @Nullable String errorMessage) {
    }
}
