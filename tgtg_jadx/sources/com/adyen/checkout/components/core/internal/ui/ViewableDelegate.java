package com.adyen.checkout.components.core.internal.ui;

import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/ViewableDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "OutputDataT", "", "Ly80/i;", "getOutputDataFlow", "()Ly80/i;", "outputDataFlow", "getOutputData", "()Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "outputData", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ViewableDelegate<OutputDataT extends OutputData> {
    @NotNull
    OutputDataT getOutputData();

    @NotNull
    i getOutputDataFlow();
}
