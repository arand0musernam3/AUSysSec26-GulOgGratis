package com.adyen.checkout.components.core.internal.analytics;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006J:\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J*\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006JC\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\u0002\u0010\u001cJ.\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006!"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/GenericEvents;", "", "()V", "action", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;", "component", "", "subType", InAppMessageBase.MESSAGE, "displayed", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info;", "target", "brand", "configData", "", "download", StatusResponseUtils.RESULT_ERROR, "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error;", "event", "Lcom/adyen/checkout/components/core/internal/analytics/ErrorEvent;", "focus", "input", "invalidField", "validationErrorCode", "validationErrorMessage", "rendered", "isStoredPaymentMethod", "", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info;", "selected", IssuerListPaymentMethod.ISSUER, "submit", "unfocus", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GenericEvents {

    @NotNull
    public static final GenericEvents INSTANCE = new GenericEvents();

    private GenericEvents() {
    }

    public static /* synthetic */ AnalyticsEvent.Log action$default(GenericEvents genericEvents, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return genericEvents.action(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEvent.Info displayed$default(GenericEvents genericEvents, String str, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            map = null;
        }
        return genericEvents.displayed(str, str2, str3, map);
    }

    public static /* synthetic */ AnalyticsEvent.Error error$default(GenericEvents genericEvents, String str, ErrorEvent errorEvent, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        return genericEvents.error(str, errorEvent, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEvent.Info rendered$default(GenericEvents genericEvents, String str, Boolean bool, String str2, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            map = null;
        }
        return genericEvents.rendered(str, bool, str2, map);
    }

    public static /* synthetic */ AnalyticsEvent.Info selected$default(GenericEvents genericEvents, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        return genericEvents.selected(str, str2, str3, str4);
    }

    @NotNull
    public final AnalyticsEvent.Log action(@NotNull String component, @NotNull String subType, @Nullable String message) {
        component.getClass();
        subType.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, component, AnalyticsEvent.Log.Type.ACTION, subType, null, null, message, 199, null);
    }

    @NotNull
    public final AnalyticsEvent.Info displayed(@NotNull String component, @NotNull String target, @Nullable String brand, @Nullable Map<String, String> configData) {
        component.getClass();
        target.getClass();
        return new AnalyticsEvent.Info(null, 0L, false, component, AnalyticsEvent.Info.Type.DISPLAYED, target, null, brand, null, null, null, configData, 1863, null);
    }

    @NotNull
    public final AnalyticsEvent.Info download(@NotNull String component, @NotNull String target) {
        component.getClass();
        target.getClass();
        return new AnalyticsEvent.Info(null, 0L, false, component, AnalyticsEvent.Info.Type.DOWNLOAD, target, null, null, null, null, null, null, 4039, null);
    }

    @NotNull
    public final AnalyticsEvent.Error error(@NotNull String component, @NotNull ErrorEvent event, @Nullable String target, @Nullable String message) {
        component.getClass();
        event.getClass();
        return new AnalyticsEvent.Error(null, 0L, false, component, event.getErrorType(), event.getErrorCode(), target, message, 7, null);
    }

    @NotNull
    public final AnalyticsEvent.Info focus(@NotNull String component, @NotNull String target) {
        component.getClass();
        target.getClass();
        return new AnalyticsEvent.Info(null, 0L, false, component, AnalyticsEvent.Info.Type.FOCUS, target, null, null, null, null, null, null, 4039, null);
    }

    @NotNull
    public final AnalyticsEvent.Info input(@NotNull String component, @NotNull String target) {
        component.getClass();
        target.getClass();
        return new AnalyticsEvent.Info(null, 0L, false, component, AnalyticsEvent.Info.Type.INPUT, target, null, null, null, null, null, null, 4039, null);
    }

    @NotNull
    public final AnalyticsEvent.Info invalidField(@NotNull String component, @NotNull String target, @Nullable String validationErrorCode, @Nullable String validationErrorMessage) {
        component.getClass();
        target.getClass();
        return new AnalyticsEvent.Info(null, 0L, false, component, AnalyticsEvent.Info.Type.VALIDATION_ERROR, target, null, null, null, validationErrorCode, validationErrorMessage, null, 2503, null);
    }

    @NotNull
    public final AnalyticsEvent.Info rendered(@NotNull String component, @Nullable Boolean isStoredPaymentMethod, @Nullable String brand, @Nullable Map<String, String> configData) {
        component.getClass();
        return new AnalyticsEvent.Info(null, 0L, false, component, AnalyticsEvent.Info.Type.RENDERED, null, isStoredPaymentMethod, brand, null, null, null, configData, 1831, null);
    }

    @NotNull
    public final AnalyticsEvent.Info selected(@NotNull String component, @NotNull String target, @Nullable String issuer, @Nullable String brand) {
        component.getClass();
        target.getClass();
        return new AnalyticsEvent.Info(null, 0L, false, component, AnalyticsEvent.Info.Type.SELECTED, target, null, brand, issuer, null, null, null, 3655, null);
    }

    @NotNull
    public final AnalyticsEvent.Log submit(@NotNull String component) {
        component.getClass();
        return new AnalyticsEvent.Log(null, 0L, false, component, AnalyticsEvent.Log.Type.SUBMIT, null, null, null, null, 487, null);
    }

    @NotNull
    public final AnalyticsEvent.Info unfocus(@NotNull String component, @NotNull String target) {
        component.getClass();
        target.getClass();
        return new AnalyticsEvent.Info(null, 0L, false, component, AnalyticsEvent.Info.Type.UNFOCUS, target, null, null, null, null, null, null, 4039, null);
    }
}
