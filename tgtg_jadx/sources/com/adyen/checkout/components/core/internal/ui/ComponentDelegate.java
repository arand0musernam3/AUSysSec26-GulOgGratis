package com.adyen.checkout.components.core.internal.ui;

import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "onCleared", "()V", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "getComponentParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "componentParams", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ComponentDelegate {
    @NotNull
    ComponentParams getComponentParams();

    void initialize(@NotNull b0 coroutineScope);

    void onCleared();
}
