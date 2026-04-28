package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ax.a0;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1zSDK;
import com.braze.models.inappmessage.InAppMessageBase;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFa1bSDK implements AFa1aSDK {

    @NotNull
    private final AFc1fSDK AFAdRevenueData;

    @Nullable
    Map<String, Object> getCurrencyIso4217Code;
    private boolean getRevenue;

    public AFa1bSDK(@NotNull AFc1fSDK aFc1fSDK) {
        aFc1fSDK.getClass();
        this.AFAdRevenueData = aFc1fSDK;
    }

    private boolean AFAdRevenueData() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void getCurrencyIso4217Code() {
        Context context;
        if (AFAdRevenueData() && (context = this.AFAdRevenueData.getCurrencyIso4217Code) != null) {
            this.getCurrencyIso4217Code = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                a0 a0Var = a0.f4849a;
                a0.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFb1zSDK.1
                    private /* synthetic */ AFa1vSDK getCurrencyIso4217Code;
                    private /* synthetic */ Class getMediationNetwork;

                    public AnonymousClass1(Class cls3, AFa1vSDK aFa1zSDK2) {
                        cls = cls3;
                        aFa1vSDK = aFa1zSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1vSDK aFa1vSDK = aFa1vSDK;
                            if (aFa1vSDK != null) {
                                aFa1vSDK.getCurrencyIso4217Code("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj2), null));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle(InAppMessageBase.EXTRAS);
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1vSDK aFa1vSDK2 = aFa1vSDK;
                            if (aFa1vSDK2 != null) {
                                aFa1vSDK2.getCurrencyIso4217Code(string2, string3, string);
                            }
                        } else {
                            AFa1vSDK aFa1vSDK3 = aFa1vSDK;
                            if (aFa1vSDK3 != null) {
                                aFa1vSDK3.getCurrencyIso4217Code(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK2.getCurrencyIso4217Code("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e5) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e5);
                aFa1zSDK2.getCurrencyIso4217Code(e5.toString());
            } catch (IllegalAccessException e11) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e11);
                aFa1zSDK2.getCurrencyIso4217Code(e11.toString());
            } catch (NoSuchMethodException e12) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e12);
                aFa1zSDK2.getCurrencyIso4217Code(e12.toString());
            } catch (InvocationTargetException e13) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e13);
                aFa1zSDK2.getCurrencyIso4217Code(e13.toString());
            }
        }
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final boolean getMonetizationNetwork() {
        if (!AFAdRevenueData()) {
            return false;
        }
        Map<String, Object> map = this.getCurrencyIso4217Code;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    @Nullable
    public final Map<String, Object> getRevenue() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void getMonetizationNetwork(boolean z11) {
        this.getRevenue = z11;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class AFa1zSDK implements AFb1zSDK.AFa1vSDK {
        private /* synthetic */ long getRevenue;

        public AFa1zSDK(long j9) {
            this.getRevenue = j9;
        }

        @Override // com.appsflyer.internal.AFb1zSDK.AFa1vSDK
        public final void getCurrencyIso4217Code(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFa1bSDK.this.getCurrencyIso4217Code;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFa1bSDK.this.getCurrencyIso4217Code) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFa1bSDK.getCurrencyIso4217Code;
                    if (map3 != null) {
                        map3.put(InAppMessageBase.EXTRAS, linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFa1bSDK.this.getCurrencyIso4217Code;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.getRevenue);
            Map<String, Object> map5 = AFa1bSDK.this.getCurrencyIso4217Code;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }

        @Override // com.appsflyer.internal.AFb1zSDK.AFa1vSDK
        public final void getCurrencyIso4217Code(@Nullable String str) {
            Map<String, Object> map = AFa1bSDK.this.getCurrencyIso4217Code;
            if (map != null) {
                map.put(StatusResponseUtils.RESULT_ERROR, str);
            }
        }
    }
}
