package com.adyen.checkout.components.core.internal.analytics.data.remote;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackError;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackInfo;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackLog;
import com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086\u0002J\f\u0010\f\u001a\u00020\r*\u00020\u000bH\u0002J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0007H\u0002J\f\u0010\u000e\u001a\u00020\u0010*\u00020\tH\u0002¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsTrackRequestProvider;", "", "()V", "invoke", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "infoList", "", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info;", "logList", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;", "errorList", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error;", "mapToErrorEvent", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackError;", "mapToTrackEvent", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsTrackRequestProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsTrackRequestProvider.kt\ncom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsTrackRequestProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1557#2:70\n1628#2,3:71\n1557#2:74\n1628#2,3:75\n1557#2:78\n1628#2,3:79\n*S KotlinDebug\n*F\n+ 1 AnalyticsTrackRequestProvider.kt\ncom/adyen/checkout/components/core/internal/analytics/data/remote/AnalyticsTrackRequestProvider\n*L\n28#1:70\n28#1:71,3\n29#1:74\n29#1:75,3\n30#1:78\n30#1:79,3\n*E\n"})
public final class AnalyticsTrackRequestProvider {
    private final AnalyticsTrackError mapToErrorEvent(AnalyticsEvent.Error error) {
        String id2 = error.getId();
        Long lValueOf = Long.valueOf(error.getTimestamp());
        String component = error.getComponent();
        AnalyticsEvent.Error.Type errorType = error.getErrorType();
        return new AnalyticsTrackError(id2, lValueOf, component, errorType != null ? errorType.getValue() : null, error.getCode(), error.getTarget(), error.getMessage());
    }

    private final AnalyticsTrackInfo mapToTrackEvent(AnalyticsEvent.Info info) {
        String id2 = info.getId();
        Long lValueOf = Long.valueOf(info.getTimestamp());
        String component = info.getComponent();
        AnalyticsEvent.Info.Type type = info.getType();
        return new AnalyticsTrackInfo(id2, lValueOf, component, type != null ? type.getValue() : null, info.getTarget(), info.isStoredPaymentMethod(), info.getBrand(), info.getIssuer(), info.getValidationErrorCode(), info.getValidationErrorMessage(), info.getConfigData());
    }

    @NotNull
    public final AnalyticsTrackRequest invoke(@NotNull List<AnalyticsEvent.Info> infoList, @NotNull List<AnalyticsEvent.Log> logList, @NotNull List<AnalyticsEvent.Error> errorList) {
        infoList.getClass();
        logList.getClass();
        errorList.getClass();
        String platform = AnalyticsPlatformParams.INSTANCE.getPlatform();
        ArrayList arrayList = new ArrayList(e0.o(infoList, 10));
        Iterator<T> it = infoList.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToTrackEvent((AnalyticsEvent.Info) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(e0.o(logList, 10));
        Iterator<T> it2 = logList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(mapToTrackEvent((AnalyticsEvent.Log) it2.next()));
        }
        ArrayList arrayList3 = new ArrayList(e0.o(errorList, 10));
        Iterator<T> it3 = errorList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(mapToErrorEvent((AnalyticsEvent.Error) it3.next()));
        }
        return new AnalyticsTrackRequest(AnalyticsPlatformParams.channel, platform, arrayList, arrayList2, arrayList3);
    }

    private final AnalyticsTrackLog mapToTrackEvent(AnalyticsEvent.Log log) {
        String id2 = log.getId();
        long timestamp = log.getTimestamp();
        String component = log.getComponent();
        AnalyticsEvent.Log.Type type = log.getType();
        String value = type != null ? type.getValue() : null;
        String subType = log.getSubType();
        String target = log.getTarget();
        String message = log.getMessage();
        return new AnalyticsTrackLog(id2, Long.valueOf(timestamp), component, value, subType, log.getResult(), target, message);
    }
}
