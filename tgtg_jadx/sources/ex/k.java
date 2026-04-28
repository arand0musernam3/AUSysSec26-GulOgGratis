package ex;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.d f16550a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            sensor.getClass();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            sensorEvent.getClass();
            a50.d dVar = this.f16550a;
            if (dVar != null) {
                float[] fArr = sensorEvent.values;
                double d3 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d12 * d12) + (d11 * d11) + (d3 * d3)) > 2.3d) {
                    dVar.a();
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
