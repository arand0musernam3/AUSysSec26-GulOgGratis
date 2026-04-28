package com.braze.support;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.braze.storage.l2;
import com.braze.storage.m2;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import v80.f0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\t\u001a\f\u0010\n\u001a\u00020\u0004*\u0004\u0018\u00010\t\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TAG", "", "NOTIFICATION_PERMISSION", "hasPermission", "", "Landroid/content/Context;", "permission", "requestPushPermissionPrompt", "", "Landroid/app/Activity;", "wouldPushPermissionPromptDisplay", "getPermissionRequestCount", "", "context", "incrementPermissionRequestCount", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PermissionUtils {
    private static final String NOTIFICATION_PERMISSION = "android.permission.POST_NOTIFICATIONS";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    public static final int getPermissionRequestCount(Context context, String str) {
        context.getClass();
        str.getClass();
        return new m2(context).a(str);
    }

    public static final boolean hasPermission(Context context, String str) {
        str.getClass();
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission(str) == 0) {
                    return true;
                }
            } catch (Throwable th2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th2, false, (Function0) new mw.d(str, 7), 8, (Object) null);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasPermission$lambda$0(String str) {
        return e0.f.k("Failure checking permission ", str);
    }

    public static final void incrementPermissionRequestCount(Context context, String str) throws Throwable {
        context.getClass();
        str.getClass();
        f0.E(kotlin.coroutines.g.f26549a, new l2(new m2(context), str, null));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new mw.d(str, 8), 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementPermissionRequestCount$lambda$11(String str) {
        return a0.p("Incremented permission request counter for ", str, ".");
    }

    public static final void requestPushPermissionPrompt(Activity activity) throws Throwable {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, (Function0) new m60.a(24), 12, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m60.a(25), 14, (Object) null);
            return;
        }
        if (!wouldPushPermissionPromptDisplay(activity) || Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m60.a(27), 14, (Object) null);
            return;
        }
        incrementPermissionRequestCount(activity, NOTIFICATION_PERMISSION);
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, (Function0) new m60.a(26), 12, (Object) null);
        activity.requestPermissions(new String[]{NOTIFICATION_PERMISSION}, IntentUtils.getRequestCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$1() {
        return "Attempting to execute requestPushPermissionPrompt()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$2() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$3() {
        return "Permission prompt would not display, not attempting to request push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$4() {
        return "Requesting push permission from system.";
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m60.a(28), 14, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m60.a(29), 12, (Object) null);
            return false;
        }
        int i11 = activity.getApplicationInfo().targetSdkVersion;
        if (i11 < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(i11, 15), 12, (Object) null);
            return false;
        }
        if (hasPermission(activity, NOTIFICATION_PERMISSION)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new mw.e(0), 12, (Object) null);
            return false;
        }
        int permissionRequestCount = getPermissionRequestCount(activity, NOTIFICATION_PERMISSION);
        if (permissionRequestCount >= 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(permissionRequestCount, 14), 12, (Object) null);
            return activity.shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new m60.a(23), 12, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$10() {
        return "Push Prompt can be shown on this device, within a reasonable confidence.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$5() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$6() {
        return r8.k.h(Build.VERSION.SDK_INT, "Device API version of ", " is too low to display push permission prompt.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$7(int i11) {
        return r8.k.h(i11, "App Target API version of ", " is too low to display push permission prompt.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$8() {
        return "Notification permission already granted, doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$9(int i11) {
        return r8.k.h(i11, "Notification permission request count is ", ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'");
    }
}
