package nc;

import a3.a3;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import j4.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UiModeManager f30809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30810c;

    public c(Context context) {
        context.getClass();
        this.f30808a = context;
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        this.f30809b = (UiModeManager) systemService;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        string.getClass();
        this.f30810c = string;
    }

    @Override // nc.h
    public final Map a() {
        String strF;
        String string;
        Context context = this.f30808a;
        String string2 = Settings.Global.getString(context.getContentResolver(), "device_name");
        if (string2 == null && (string = Settings.Secure.getString(context.getContentResolver(), "bluetooth_name")) != null) {
            string2 = string;
        }
        Pair pair = new Pair("d_name", string2);
        Pair pair2 = new Pair("mnf", Build.MANUFACTURER);
        Pair pair3 = new Pair("mdl", Build.MODEL);
        int currentModeType = this.f30809b.getCurrentModeType();
        if (currentModeType == 3) {
            strF = "car";
        } else if (currentModeType == 4) {
            strF = "tv";
        } else if (currentModeType == 6) {
            strF = "watch";
        } else if (currentModeType != 7) {
            int i11 = context.getResources().getConfiguration().screenLayout & 15;
            strF = (i11 == 1 || i11 == 2) ? "phone" : (i11 == 3 || i11 == 4) ? "tablet" : s.f(currentModeType, "n:");
        } else {
            strF = "headset";
        }
        Map mapE = x0.e(pair, pair2, pair3, new Pair("d_uii", strF), new Pair("dev", Build.DEVICE), new Pair("d_board", Build.BOARD), new Pair("fgp", Build.FINGERPRINT), new Pair("hrd", Build.HARDWARE), new Pair("prd", Build.PRODUCT), new Pair("camera", a3.a(context)), new Pair("d_ifv", this.f30810c));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapE.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
