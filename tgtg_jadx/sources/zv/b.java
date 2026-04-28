package zv;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.b0;
import com.braze.managers.c1;
import com.braze.managers.g0;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48110a;

    public /* synthetic */ b(int i11) {
        this.f48110a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48110a) {
            case 0:
                return BrazeGeofenceManager.tearDownGeofences$lambda$16();
            case 1:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$8();
            case 2:
                return BrazeGeofenceManager.retrieveBrazeGeofencesFromLocalStorage$lambda$43();
            case 3:
                return BrazeGeofenceManager.registerGeofences$lambda$31();
            case 4:
                return BrazeGeofenceManager.requestGeofenceRefresh$lambda$26();
            case 5:
                return BrazeGeofenceManager.tearDownGeofences$lambda$18$lambda$17();
            case 6:
                return BrazeGeofenceManager.onLocationRequestComplete$lambda$41();
            case 7:
                return BrazeGeofenceManager.unregisterGeofences$lambda$38();
            case 8:
                return BrazeGeofenceManager.unregisterGeofences$lambda$39();
            case 9:
                return BrazeGeofenceManager.setUpGeofences$lambda$11();
            case 10:
                return BrazeGeofenceManager.setUpGeofences$lambda$13();
            case 11:
                return BrazeGeofenceManager.postGeofenceReport$lambda$22();
            case 12:
                return BrazeGeofenceManager.requestGeofenceRefresh$lambda$24();
            case 13:
                return BrazeGeofenceManager.initializeGeofences$lambda$2();
            case 14:
                return BrazeGeofenceManager.initializeGeofences$lambda$3();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeGeofenceManager._init_$lambda$0();
            case 16:
                return BrazeGeofenceManager._init_$lambda$1();
            case 17:
                return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$0();
            case 18:
                return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$1();
            case 19:
                return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$2();
            case 20:
                return com.braze.managers.b.b();
            case 21:
                return b0.a();
            case 22:
                return com.braze.managers.c.b();
            case 23:
                return c1.a();
            case 24:
                return c1.b();
            case 25:
                return com.braze.managers.g.a();
            case 26:
                return g0.b();
            case 27:
                return g0.i();
            case 28:
                return g0.e();
            default:
                return g0.c();
        }
    }
}
