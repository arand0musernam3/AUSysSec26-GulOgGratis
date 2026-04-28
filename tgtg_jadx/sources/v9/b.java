package v9;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, int i11) {
        context.getClass();
        switch (i11) {
            case 1:
                Object systemService = context.getSystemService((Class<Object>) y.d());
                systemService.getClass();
                super(y.b(systemService));
                break;
            default:
                MeasurementManager measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                super(measurementManager);
                break;
        }
    }
}
