package s00;

import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pz.d[] f38519a = {new pz.d("name_ulr_private", 1), new pz.d("name_sleep_segment_request", 1), new pz.d("get_last_activity_feature_id", 1), new pz.d("support_context_feature_id", 1), new pz.d("get_current_location", 2), new pz.d("get_last_location_with_request", 1), new pz.d("set_mock_mode_with_callback", 1), new pz.d("set_mock_location_with_callback", 1), new pz.d("inject_location_with_callback", 1), new pz.d("location_updates_with_callback", 1), new pz.d("use_safe_parcelable_in_intents", 1), new pz.d("flp_debug_updates", 1), new pz.d("google_location_accuracy_enabled", 1), new pz.d("geofences_with_callback", 1), new pz.d("location_enabled", 1)};

    public static void a(int i11) {
        boolean z11 = true;
        if (i11 != 100 && i11 != 102 && i11 != 104) {
            if (i11 == 105) {
                i11 = 105;
            } else {
                z11 = false;
            }
        }
        i0.c(z11, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i11));
    }

    public static String b(int i11) {
        if (i11 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i11 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i11 == 104) {
            return "LOW_POWER";
        }
        if (i11 == 105) {
            return "PASSIVE";
        }
        i4.a.h();
        return null;
    }
}
