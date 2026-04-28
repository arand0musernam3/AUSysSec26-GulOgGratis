package com.adyen.checkout.components.core.internal;

import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/components/core/internal/IntentHandlingComponent;", "Lcom/adyen/checkout/components/core/internal/ResultHandlingComponent;", "handleIntent", "", "intent", "Landroid/content/Intent;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IntentHandlingComponent extends ResultHandlingComponent {
    void handleIntent(@NotNull Intent intent);
}
