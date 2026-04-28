package nc;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import j4.s;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BatteryManager f30807a;

    public b(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("batterymanager");
        systemService.getClass();
        this.f30807a = (BatteryManager) systemService;
    }

    @Override // nc.h
    public final Map a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = Build.VERSION.SDK_INT;
        BatteryManager batteryManager = this.f30807a;
        if (i11 >= 28) {
            linkedHashMap.put("d_b_ttfc", Long.valueOf(batteryManager.computeChargeTimeRemaining()));
        }
        int intProperty = batteryManager.getIntProperty(6);
        linkedHashMap.put("d_b_state", intProperty != 2 ? intProperty != 3 ? intProperty != 4 ? intProperty != 5 ? s.f(intProperty, "n:") : "full" : "not_charging" : "discharging" : "charging");
        linkedHashMap.put("d_b_c", Integer.valueOf(batteryManager.getIntProperty(1)));
        linkedHashMap.put("d_b_lvl", Integer.valueOf(batteryManager.getIntProperty(4)));
        linkedHashMap.put("d_b_e", Integer.valueOf(batteryManager.getIntProperty(5)));
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
