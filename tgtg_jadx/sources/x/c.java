package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.p0;
import m0.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f43600a;

    public c(DynamicRangeProfiles dynamicRangeProfiles) {
        this.f43600a = dynamicRangeProfiles;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return p0.f26531a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            c0 c0Var = (c0) c0.a.f6788a.get(Long.valueOf(jLongValue));
            if (c0Var == null && wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            }
            if (c0Var != null) {
                linkedHashSet.add(c0Var);
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // x.b
    public final Set a() {
        Set<Long> supportedProfiles = this.f43600a.getSupportedProfiles();
        supportedProfiles.getClass();
        return d(supportedProfiles);
    }

    @Override // x.b
    public final DynamicRangeProfiles b() {
        return this.f43600a;
    }

    @Override // x.b
    public final Set c(c0 c0Var) {
        c0Var.getClass();
        LinkedHashMap linkedHashMap = c0.a.f6788a;
        Long lA = c0.a.a(c0Var, this.f43600a);
        if (lA == null) {
            i4.a.j(c0Var, "DynamicRange is not supported: ");
            return null;
        }
        Set<Long> profileCaptureRequestConstraints = this.f43600a.getProfileCaptureRequestConstraints(lA.longValue());
        profileCaptureRequestConstraints.getClass();
        return d(profileCaptureRequestConstraints);
    }
}
