package x;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.f f43613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f43614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f43615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t10.c f43616d;

    public i(StreamConfigurationMap streamConfigurationMap, z.f fVar) {
        fVar.getClass();
        this.f43613a = fVar;
        this.f43614b = new LinkedHashMap();
        this.f43615c = new LinkedHashMap();
        new LinkedHashMap();
        this.f43616d = Build.VERSION.SDK_INT >= 34 ? new j(streamConfigurationMap) : new t10.c(streamConfigurationMap);
    }

    public final Size[] a(int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        LinkedHashMap linkedHashMap = this.f43615c;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i11));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        Size[] sizeArrJ = this.f43616d.j(i11);
        if (sizeArrJ != null && sizeArrJ.length != 0) {
            sizeArrJ = this.f43613a.a(sizeArrJ, i11);
        }
        linkedHashMap.put(Integer.valueOf(i11), sizeArrJ);
        if (sizeArrJ != null) {
            return (Size[]) sizeArrJ.clone();
        }
        return null;
    }

    public final Size[] b(int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        LinkedHashMap linkedHashMap = this.f43614b;
        Size[] sizeArrN = null;
        if (linkedHashMap.containsKey(numValueOf)) {
            Size[] sizeArr = (Size[]) linkedHashMap.get(Integer.valueOf(i11));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        try {
            sizeArrN = this.f43616d.n(i11);
        } catch (Throwable th2) {
            wd.a.J("StreamConfigurationMapCompat", "Failed to get output sizes for " + i11, th2);
        }
        if (sizeArrN != null && sizeArrN.length != 0) {
            Size[] sizeArrA = this.f43613a.a(sizeArrN, i11);
            linkedHashMap.put(Integer.valueOf(i11), sizeArrA);
            return (Size[]) sizeArrA.clone();
        }
        wd.a.I("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i11);
        return sizeArrN;
    }
}
