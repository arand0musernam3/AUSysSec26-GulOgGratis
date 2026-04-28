package nc;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Display f30815b;

    public g(Context context) {
        this.f30814a = context;
        Object systemService = context.getApplicationContext().getSystemService("window");
        systemService.getClass();
        this.f30815b = ((WindowManager) systemService).getDefaultDisplay();
    }

    @Override // nc.h
    public final Map a() {
        String str;
        Display.Mode mode;
        Display.Mode mode2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DisplayMetrics displayMetrics = this.f30814a.getResources().getDisplayMetrics();
        linkedHashMap.put("d_s_is_w", Integer.valueOf(displayMetrics.widthPixels));
        linkedHashMap.put("d_s_is_h", Integer.valueOf(displayMetrics.heightPixels));
        linkedHashMap.put("screen_d", Float.valueOf(displayMetrics.density));
        linkedHashMap.put("d_s_dpi", Integer.valueOf(displayMetrics.densityDpi));
        Float fValueOf = null;
        Display display = this.f30815b;
        linkedHashMap.put("d_s_mrr", display != null ? Integer.valueOf((int) display.getRefreshRate()) : null);
        if (Build.VERSION.SDK_INT >= 29) {
            linkedHashMap.put("d_s_cutout", Boolean.valueOf((display != null ? display.getCutout() : null) != null));
        }
        Integer numValueOf = display != null ? Integer.valueOf(display.getRotation()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            str = "portrait";
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            str = "landscape_left";
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            str = "portrait_upside_down";
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            str = "landscape_right";
        } else {
            str = "n:" + numValueOf;
        }
        linkedHashMap.put("d_or", str);
        linkedHashMap.put("d_s_n", display != null ? display.getName() : null);
        linkedHashMap.put("d_s_hdr", display != null ? Boolean.valueOf(display.isHdr()) : null);
        linkedHashMap.put("screen_x", (display == null || (mode2 = display.getMode()) == null) ? null : Integer.valueOf(mode2.getPhysicalWidth()));
        linkedHashMap.put("screen_y", (display == null || (mode = display.getMode()) == null) ? null : Integer.valueOf(mode.getPhysicalHeight()));
        try {
            fValueOf = Float.valueOf((float) (((double) Math.round((Settings.System.getInt(r1.getContentResolver(), "screen_brightness") / 255.0f) * 100)) / 100.0d));
        } catch (Settings.SettingNotFoundException unused) {
        }
        linkedHashMap.put("d_s_br", fValueOf);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if (value != null && !TextUtils.isEmpty(value.toString())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }
}
