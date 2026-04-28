package k;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends c5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25586c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.a f25587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f25588e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.a aVar, Context context) {
        super(aVar);
        this.f25587d = aVar;
        this.f25588e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // c5.b
    public final IntentFilter f() {
        switch (this.f25586c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // c5.b
    public final int h() {
        Location location;
        boolean z11;
        long j9;
        switch (this.f25586c) {
            case 0:
                return q.a((PowerManager) this.f25588e) ? 2 : 1;
            default:
                j30.g gVar = (j30.g) this.f25588e;
                h2.a aVar = (h2.a) gVar.f24504d;
                LocationManager locationManager = (LocationManager) gVar.f24503c;
                if (aVar.f21027b <= System.currentTimeMillis()) {
                    Context context = (Context) gVar.f24502b;
                    Location lastKnownLocation = null;
                    if (ba0.g.h(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e5) {
                            Log.d("TwilightManager", "Failed to get last known location", e5);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (ba0.g.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e11) {
                            Log.d("TwilightManager", "Failed to get last known location", e11);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (e0.f25558e == null) {
                            e0.f25558e = new e0();
                        }
                        e0 e0Var = e0.f25558e;
                        e0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        e0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z11 = e0Var.f25560b == 1;
                        long j11 = e0Var.f25562d;
                        long j12 = e0Var.f25561c;
                        e0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j13 = e0Var.f25562d;
                        if (j11 == -1 || j12 == -1) {
                            j9 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j12) {
                                j11 = j13;
                            } else if (jCurrentTimeMillis > j11) {
                                j11 = j12;
                            }
                            j9 = j11 + TimeConstants.ONE_MINUTE_DIFFERENCE;
                        }
                        aVar.f21026a = z11;
                        aVar.f21027b = j9;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i11 = Calendar.getInstance().get(11);
                        if (i11 < 6 || i11 >= 22) {
                            z11 = true;
                        }
                    }
                    break;
                } else {
                    z11 = aVar.f21026a;
                }
                return z11 ? 2 : 1;
        }
    }

    @Override // c5.b
    public final void s() {
        switch (this.f25586c) {
            case 0:
                this.f25587d.L(true, true);
                break;
            default:
                this.f25587d.L(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.a aVar, j30.g gVar) {
        super(aVar);
        this.f25587d = aVar;
        this.f25588e = gVar;
    }
}
