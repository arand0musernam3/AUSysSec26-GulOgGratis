package zendesk.messaging.android.internal.permissions;

import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;", "", "launchSinglePermissionRequest", "", "permission", "", "onPermissionResult", "Lkotlin/Function1;", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RuntimePermissionRequester {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void launchSinglePermissionRequest$default(RuntimePermissionRequester runtimePermissionRequester, String str, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: launchSinglePermissionRequest");
                return;
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            runtimePermissionRequester.launchSinglePermissionRequest(str, function1);
        }
    }

    void launchSinglePermissionRequest(@NotNull String permission, @Nullable Function1<? super Boolean, Unit> onPermissionResult);
}
