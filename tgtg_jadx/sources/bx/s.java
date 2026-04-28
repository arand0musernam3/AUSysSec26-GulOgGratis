package bx;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f6750b = w0.b(new Pair(t.IAPParameters, new Pair(kotlin.collections.y.W(new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"}), kotlin.collections.y.W(new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"}))));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6751a = new LinkedHashMap();

    public final void a(t tVar, String str, Object obj) {
        LinkedHashMap linkedHashMap = this.f6751a;
        tVar.getClass();
        str.getClass();
        obj.getClass();
        try {
            HashSet hashSet = g.f6717f;
            e.a(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            if (!linkedHashMap.containsKey(tVar)) {
                linkedHashMap.put(tVar, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(tVar);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }
}
