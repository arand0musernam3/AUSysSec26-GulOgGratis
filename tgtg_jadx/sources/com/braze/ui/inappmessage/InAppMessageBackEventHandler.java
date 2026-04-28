package com.braze.ui.inappmessage;

import android.app.Activity;
import android.os.Build;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageBackEventHandler;", "", "activity", "Landroid/app/Activity;", "inAppMessageView", "Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "<init>", "(Landroid/app/Activity;Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InAppMessageBackEventHandler {

    @Nullable
    private final IInAppMessageBackEventListener inAppMessageView;

    public InAppMessageBackEventHandler(@NotNull Activity activity, @Nullable IInAppMessageBackEventListener iInAppMessageBackEventListener) {
        activity.getClass();
        this.inAppMessageView = iInAppMessageBackEventListener;
        if (Build.VERSION.SDK_INT < 34 || !BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            return;
        }
        activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, new InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1(activity, this));
    }
}
