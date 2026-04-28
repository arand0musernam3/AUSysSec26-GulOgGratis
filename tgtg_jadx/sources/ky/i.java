package ky;

import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.s1;
import ax.f0;
import com.app.tgtg.feature.postpurchase.specialrewards.SpecialRewardCelebrationFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import m3.a0;
import m3.i2;
import org.bouncycastle.iana.AEADAlgorithm;
import p4.j0;
import r5.c0;
import s1.h0;
import t1.q1;
import v80.b0;
import v80.x;
import yi.d0;
import ym.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i11) {
        super(0);
        this.f26706a = i11;
        this.f26707b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        i2 i2Var;
        switch (this.f26706a) {
            case 0:
                ActivityManager activityManager = (ActivityManager) ((se.d) this.f26707b).f39013b;
                activityManager.getClass();
                ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
                deviceConfigurationInfo.getClass();
                String glEsVersion = deviceConfigurationInfo.getGlEsVersion();
                glEsVersion.getClass();
                return glEsVersion;
            case 1:
                InputManager inputManager = (InputManager) ((jd.f) this.f26707b).f24983b;
                inputManager.getClass();
                int[] inputDeviceIds = inputManager.getInputDeviceIds();
                inputDeviceIds.getClass();
                ArrayList arrayList = new ArrayList(inputDeviceIds.length);
                for (int i11 : inputDeviceIds) {
                    InputDevice inputDevice = inputManager.getInputDevice(i11);
                    inputDevice.getClass();
                    String strValueOf = String.valueOf(inputDevice.getVendorId());
                    String name = inputDevice.getName();
                    name.getClass();
                    arrayList.add(new j(name, strValueOf));
                }
                return arrayList;
            case 2:
                SensorManager sensorManager = (SensorManager) ((jb.b) this.f26707b).f24851a;
                sensorManager.getClass();
                List<Sensor> sensorList = sensorManager.getSensorList(-1);
                sensorList.getClass();
                ArrayList arrayList2 = new ArrayList(e0.o(sensorList, 10));
                for (Sensor sensor : sensorList) {
                    sensor.getClass();
                    sensor.getName().getClass();
                    sensor.getVendor().getClass();
                    arrayList2.add(new p(0));
                }
                return arrayList2;
            case 3:
                return Float.valueOf(((Number) ((le.h) this.f26707b).getValue()).floatValue());
            case 4:
                return new lf.a((f0) this.f26707b);
            case 5:
                return (mn.c) this.f26707b;
            case 6:
                return (s1) ((i) this.f26707b).invoke();
            case 7:
                return (ng.d) this.f26707b;
            case 8:
                return (s1) ((i) this.f26707b).invoke();
            case 9:
                j0 j0Var = (j0) this.f26707b;
                Unit unit = Unit.f26487a;
                j0Var.f34361i.setValue(unit);
                return unit;
            case 10:
                qf.a aVar = (qf.a) this.f26707b;
                hf.g gVar = aVar.f37034e;
                ye.b bVar = aVar.f37030a;
                ye.g gVar2 = bVar.f45852a;
                b0 b0Var = aVar.f37035f;
                x xVar = bVar.f45857f;
                gVar.getClass();
                b0Var.getClass();
                return new uf.k(gVar, aVar, gVar2, b0Var, xVar, gVar.f22027a, gVar.f22029c.get());
            case 11:
                Object systemService = ((View) ((j30.g) this.f26707b).f24502b).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 12:
                return new BaseInputConnection(((c0) this.f26707b).f37652a, false);
            case 13:
                q1 q1Var = (q1) this.f26707b;
                Object objJ = q1Var.f39537a.j();
                h0 h0Var = h0.PostExit;
                return Boolean.valueOf(objJ == h0Var && q1Var.f39540d.getValue() == h0Var);
            case 14:
                return (s1) ((to.d) this.f26707b).invoke();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return (uk.c) this.f26707b;
            case 16:
                return (s1) ((i) this.f26707b).invoke();
            case 17:
                return (s1) ((uo.d) this.f26707b).invoke();
            case 18:
                return ((v4.d) this.f26707b).f41982d;
            case 19:
                return ((v4.i) this.f26707b).L0();
            case 20:
                return (s1) ((vo.c) this.f26707b).invoke();
            case 21:
                return (SpecialRewardCelebrationFragment) this.f26707b;
            case 22:
                return (s1) ((i) this.f26707b).invoke();
            case 23:
                return (xj.d) this.f26707b;
            case 24:
                return (s1) ((i) this.f26707b).invoke();
            case 25:
                return (s1) ((d0) this.f26707b).invoke();
            case 26:
                return (u) this.f26707b;
            case 27:
                return (s1) ((i) this.f26707b).invoke();
            case 28:
                return (s1) ((yo.a) this.f26707b).invoke();
            default:
                z4.j0 j0Var2 = (z4.j0) this.f26707b;
                if (!((Boolean) j0Var2.f47155g.getValue()).booleanValue() && (i2Var = j0Var2.f47151c) != null) {
                    ((a0) i2Var).o();
                }
                return Unit.f26487a;
        }
    }
}
