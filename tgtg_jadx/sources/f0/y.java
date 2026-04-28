package f0;

import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final Map a(TotalCaptureResult totalCaptureResult) {
        totalCaptureResult.getClass();
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static final List b(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        List<Integer> supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
        supportedExtensions.getClass();
        return supportedExtensions;
    }

    public static final InputConfiguration c(String str, List list) {
        list.getClass();
        str.getClass();
        if (list.isEmpty()) {
            com.braze.h2.b("Call to create InputConfiguration but list of InputConfigData is empty.");
            return null;
        }
        if (list.size() == 1) {
            z2 z2Var = (z2) CollectionsKt.O(list);
            return new InputConfiguration(z2Var.f17017a, z2Var.f17018b, z2Var.f17019c);
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z2 z2Var2 = (z2) it.next();
            x.e();
            arrayList.add(x.c(z2Var2.f17017a, z2Var2.f17018b, str));
        }
        return x.b(((z2) CollectionsKt.O(list)).f17019c, arrayList);
    }
}
