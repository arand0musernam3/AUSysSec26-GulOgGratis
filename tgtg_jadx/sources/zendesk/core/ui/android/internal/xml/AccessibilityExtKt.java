package zendesk.core.ui.android.internal.xml;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.InternalZendeskUIApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001c\u0010\t\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001c\u0010\n\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"isAccessibilityServiceRunning", "", "Landroid/content/Context;", "postDelayRequestFocusWhenAccessibilityRunning", "", "Landroid/view/View;", "context", "eventDelay", "", "postDelayRequestFocusByAccessibilityEventWhenAccessibilityRunning", "overrideAccessibilityNodeActionInfo", "announcement", "", "actionId", "", "overrideAccessibilityNodeClassNameInfo", "className", "zendesk.core.ui_core-ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AccessibilityExtKt {
    @InternalZendeskUIApi
    public static final boolean isAccessibilityServiceRunning(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        ((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1).getClass();
        return !r1.isEmpty();
    }

    @InternalZendeskUIApi
    public static final void overrideAccessibilityNodeActionInfo(@NotNull View view, @NotNull final String str, final int i11) {
        view.getClass();
        str.getClass();
        ViewCompat.b0(view, new h7.b() { // from class: zendesk.core.ui.android.internal.xml.AccessibilityExtKt.overrideAccessibilityNodeActionInfo.1
            @Override // h7.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.h0(null);
                info.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, str));
            }
        });
    }

    @InternalZendeskUIApi
    public static final void overrideAccessibilityNodeClassNameInfo(@NotNull View view, @NotNull final String str) {
        view.getClass();
        str.getClass();
        ViewCompat.b0(view, new h7.b() { // from class: zendesk.core.ui.android.internal.xml.AccessibilityExtKt.overrideAccessibilityNodeClassNameInfo.1
            @Override // h7.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.h0(str);
            }
        });
    }

    @InternalZendeskUIApi
    public static final void postDelayRequestFocusByAccessibilityEventWhenAccessibilityRunning(@NotNull View view, @NotNull Context context, long j9) {
        view.getClass();
        context.getClass();
        if (isAccessibilityServiceRunning(context)) {
            view.postDelayed(new com.braze.ui.inappmessage.views.c(5, view), j9);
        }
    }

    @InternalZendeskUIApi
    public static final void postDelayRequestFocusWhenAccessibilityRunning(@NotNull View view, @NotNull Context context, long j9) {
        view.getClass();
        context.getClass();
        if (isAccessibilityServiceRunning(context)) {
            view.postDelayed(new com.braze.ui.inappmessage.views.c(6, view), j9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postDelayRequestFocusWhenAccessibilityRunning$lambda$0(View view) {
        view.sendAccessibilityEvent(8);
        view.requestFocusFromTouch();
    }
}
