package com.adyen.checkout.components.core.internal.ui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/StatusPollingDelegate;", "", "", "refreshStatus", "()V", "Ly80/i;", "Lcom/adyen/checkout/components/core/internal/ui/model/TimerData;", "getTimerFlow", "()Ly80/i;", "timerFlow", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StatusPollingDelegate {
    @NotNull
    i getTimerFlow();

    void refreshStatus();
}
