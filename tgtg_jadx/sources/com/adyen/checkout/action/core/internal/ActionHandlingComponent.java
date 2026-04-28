package com.adyen.checkout.action.core.internal;

import android.app.Activity;
import android.content.Intent;
import com.adyen.checkout.components.core.action.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/action/core/internal/ActionHandlingComponent;", "", "canHandleAction", "", "action", "Lcom/adyen/checkout/components/core/action/Action;", "handleAction", "", "activity", "Landroid/app/Activity;", "handleIntent", "intent", "Landroid/content/Intent;", "setOnRedirectListener", "listener", "Lkotlin/Function0;", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActionHandlingComponent {
    boolean canHandleAction(@NotNull Action action);

    void handleAction(@NotNull Action action, @NotNull Activity activity);

    void handleIntent(@NotNull Intent intent);

    void setOnRedirectListener(@NotNull Function0<Unit> listener);
}
