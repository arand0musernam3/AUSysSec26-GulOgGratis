package com.adyen.checkout.sessions.core.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.SessionInstallmentConfiguration;
import com.adyen.checkout.components.core.internal.ui.model.SessionInstallmentOptionsParams;
import com.adyen.checkout.components.core.internal.ui.model.SessionParams;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.internal.util.LocaleUtil;
import com.adyen.checkout.sessions.core.CheckoutSession;
import com.adyen.checkout.sessions.core.SessionSetupConfiguration;
import com.adyen.checkout.sessions.core.SessionSetupInstallmentOptions;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDetails;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import u70.o;
import u70.p;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\f\u0010\r\u001a\u00020\u0004*\u00020\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/ui/model/SessionParamsFactory;", "", "()V", "create", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "checkoutSession", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "sessionDetails", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetails;", "getShopperLocale", "Ljava/util/Locale;", "shopperLocaleString", "", "mapToParams", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionParamsFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionParamsFactory.kt\ncom/adyen/checkout/sessions/core/internal/ui/model/SessionParamsFactory\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,68:1\n126#2:69\n153#2,3:70\n16#3,17:73\n*S KotlinDebug\n*F\n+ 1 SessionParamsFactory.kt\ncom/adyen/checkout/sessions/core/internal/ui/model/SessionParamsFactory\n*L\n41#1:69\n41#1:70,3\n63#1:73,17\n*E\n"})
public final class SessionParamsFactory {

    @NotNull
    public static final SessionParamsFactory INSTANCE = new SessionParamsFactory();

    private SessionParamsFactory() {
    }

    private final Locale getShopperLocale(String shopperLocaleString) {
        Object pVar;
        Object obj = null;
        if (shopperLocaleString == null) {
            return null;
        }
        try {
            o oVar = q.f40850b;
            pVar = LocaleUtil.fromLanguageTag(shopperLocaleString);
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        if (q.a(pVar) == null) {
            obj = pVar;
        } else {
            SessionParamsFactory sessionParamsFactory = INSTANCE;
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = sessionParamsFactory.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Failed to parse sessions locale ".concat(shopperLocaleString), null);
            }
        }
        return (Locale) obj;
    }

    private final SessionParams mapToParams(SessionDetails sessionDetails) {
        Map mapJ;
        Map<String, SessionSetupInstallmentOptions> installmentOptions;
        Environment environment = sessionDetails.getEnvironment();
        String clientKey = sessionDetails.getClientKey();
        SessionSetupConfiguration sessionSetupConfiguration = sessionDetails.getSessionSetupConfiguration();
        Boolean enableStoreDetails = sessionSetupConfiguration != null ? sessionSetupConfiguration.getEnableStoreDetails() : null;
        SessionSetupConfiguration sessionSetupConfiguration2 = sessionDetails.getSessionSetupConfiguration();
        if (sessionSetupConfiguration2 == null || (installmentOptions = sessionSetupConfiguration2.getInstallmentOptions()) == null) {
            mapJ = null;
        } else {
            ArrayList arrayList = new ArrayList(installmentOptions.size());
            for (Map.Entry<String, SessionSetupInstallmentOptions> entry : installmentOptions.entrySet()) {
                String key = entry.getKey();
                SessionSetupInstallmentOptions value = entry.getValue();
                List<String> plans = value != null ? value.getPlans() : null;
                SessionSetupInstallmentOptions value2 = entry.getValue();
                Integer preselectedValue = value2 != null ? value2.getPreselectedValue() : null;
                SessionSetupInstallmentOptions value3 = entry.getValue();
                arrayList.add(new Pair(key, new SessionInstallmentOptionsParams(plans, preselectedValue, value3 != null ? value3.getValues() : null)));
            }
            mapJ = x0.j(arrayList);
        }
        SessionSetupConfiguration sessionSetupConfiguration3 = sessionDetails.getSessionSetupConfiguration();
        SessionInstallmentConfiguration sessionInstallmentConfiguration = new SessionInstallmentConfiguration(mapJ, sessionSetupConfiguration3 != null ? Boolean.valueOf(sessionSetupConfiguration3.getShowInstallmentAmount()) : null);
        SessionSetupConfiguration sessionSetupConfiguration4 = sessionDetails.getSessionSetupConfiguration();
        return new SessionParams(environment, clientKey, enableStoreDetails, sessionInstallmentConfiguration, sessionSetupConfiguration4 != null ? sessionSetupConfiguration4.getShowRemovePaymentMethodButton() : null, sessionDetails.getAmount(), sessionDetails.getReturnUrl(), getShopperLocale(sessionDetails.getShopperLocale()));
    }

    @NotNull
    public final SessionParams create(@NotNull CheckoutSession checkoutSession) {
        checkoutSession.getClass();
        return mapToParams(SessionDetailsKt.mapToDetails(checkoutSession));
    }

    @NotNull
    public final SessionParams create(@NotNull SessionDetails sessionDetails) {
        sessionDetails.getClass();
        return mapToParams(sessionDetails);
    }
}
