package nc;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import j4.s;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PowerManager f30813a;

    public f(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        this.f30813a = (PowerManager) systemService;
    }

    @Override // nc.h
    public final Map a() {
        String strF;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = Build.VERSION.SDK_INT;
        PowerManager powerManager = this.f30813a;
        if (i11 >= 29) {
            int currentThermalStatus = powerManager.getCurrentThermalStatus();
            switch (currentThermalStatus) {
                case 1:
                    strF = "light";
                    break;
                case 2:
                    strF = "moderate";
                    break;
                case 3:
                    strF = "severe";
                    break;
                case 4:
                    strF = "critical";
                    break;
                case 5:
                    strF = "emergency";
                    break;
                case 6:
                    strF = "shutdown";
                    break;
                default:
                    strF = s.f(currentThermalStatus, "n:");
                    break;
            }
            linkedHashMap.put("d_p_thermal", strF);
        }
        linkedHashMap.put("d_p_idle", Boolean.valueOf(powerManager.isDeviceIdleMode()));
        if (i11 >= 33) {
            linkedHashMap.put("d_p_lidle", Boolean.valueOf(powerManager.isDeviceLightIdleMode()));
            linkedHashMap.put("d_p_low", Boolean.valueOf(powerManager.isLowPowerStandbyEnabled()));
        }
        linkedHashMap.put("d_p_save", Boolean.valueOf(powerManager.isPowerSaveMode()));
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
