package com.adyen.checkout.components.core.internal;

import android.content.Intent;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ActivityResultHandlingComponent;", "Lcom/adyen/checkout/components/core/internal/ResultHandlingComponent;", "handleActivityResult", "", StatusResponse.RESULT_CODE, "", Bayeux.KEY_DATA, "Landroid/content/Intent;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActivityResultHandlingComponent extends ResultHandlingComponent {
    void handleActivityResult(int resultCode, @Nullable Intent data);
}
