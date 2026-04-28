package ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ib.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tx.d f32408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f32409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, sb.a aVar, int i11) {
        super(context, aVar);
        this.f32409g = i11;
        this.f32408f = new tx.d(this, 6);
    }

    @Override // ob.e
    public final Object a() {
        switch (this.f32409g) {
            case 0:
                Intent intentRegisterReceiver = this.f32414b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    w.d().b(b.f32410a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = this.f32414b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    w.d().b(c.f32411a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z11 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                Intent intentRegisterReceiver3 = this.f32414b.registerReceiver(null, e());
                boolean z12 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z12 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z12 = false;
                    }
                }
                return Boolean.valueOf(z12);
        }
    }

    @Override // ob.e
    public final void c() {
        w.d().a(d.f32412a, getClass().getSimpleName().concat(": registering receiver"));
        this.f32414b.registerReceiver(this.f32408f, e());
    }

    @Override // ob.e
    public final void d() {
        w.d().a(d.f32412a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f32414b.unregisterReceiver(this.f32408f);
    }

    public final IntentFilter e() {
        switch (this.f32409g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
