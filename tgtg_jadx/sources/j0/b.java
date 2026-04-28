package j0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import f0.c1;
import f0.g0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24284a;

    public b(a aVar) {
        aVar.getClass();
        this.f24284a = aVar;
    }

    public static ArrayList a(b bVar) {
        ArrayList arrayListD;
        c1 c1Var = ((g0) bVar.d()).f16675b;
        synchronized (c1Var.f16588f) {
            arrayListD = c1Var.f16589g;
        }
        if (arrayListD == null) {
            arrayListD = c1Var.d();
        }
        if (arrayListD == null) {
            Log.w("CXCP", "Failed to load cameraIds from " + ((Object) e0.g.a("CXCP-Camera2")));
        }
        return arrayListD;
    }

    public static e0.v b(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        return ((g0) bVar.d()).f16676c.d(str);
    }

    public static Set c(b bVar) {
        c1 c1Var = ((g0) bVar.d()).f16675b;
        if (Build.VERSION.SDK_INT < 30) {
            c1Var.getClass();
            return p0.f26531a;
        }
        synchronized (c1Var.f16588f) {
        }
        CameraManager cameraManager = (CameraManager) c1Var.f16583a.get();
        try {
            cameraManager.getClass();
            Set setA = f0.w.a(cameraManager);
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + setA);
            Set<Set> set = setA;
            ArrayList arrayList = new ArrayList(e0.o(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(e0.o(set2, 10));
                for (String str : set2) {
                    e0.s.a(str);
                    arrayList2.add(new e0.s(str));
                }
                arrayList.add(CollectionsKt.v0(arrayList2));
            }
            return CollectionsKt.v0(arrayList);
        } catch (CameraAccessException e5) {
            Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e5);
            return null;
        }
    }

    public final e0.e d() {
        a aVar = this.f24284a;
        try {
            Trace.beginSection("getCameraBackend");
            aVar.f24281d.getClass();
            e0.e eVarA = aVar.a("CXCP-Camera2");
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) e0.g.a("CXCP-Camera2"))).toString());
        } finally {
            Trace.endSection();
        }
    }
}
