package nc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import android.text.TextUtils;
import ax.p0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.x0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30811a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30812b;

    public d(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        systemService.getClass();
        this.f30812b = (ConnectivityManager) systemService;
    }

    @Override // nc.h
    public final Map a() {
        Unit unit;
        switch (this.f30811a) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f30812b;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    linkedHashMap.put("d_n_type", networkCapabilities.hasTransport(1) ? "w" : networkCapabilities.hasTransport(0) ? "c" : networkCapabilities.hasTransport(3) ? "e" : "none");
                    unit = Unit.f26487a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    linkedHashMap.put("d.n.type", "none");
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null && !TextUtils.isEmpty(value.toString())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap2;
            default:
                return x0.e(new Pair("r_up", Long.valueOf(SystemClock.uptimeMillis())), new Pair("r_lc", Integer.valueOf(((p0) this.f30812b).f4990a.getInt("launch_count", 1))));
        }
    }

    public d(p0 p0Var) {
        p0Var.getClass();
        this.f30812b = p0Var;
    }
}
