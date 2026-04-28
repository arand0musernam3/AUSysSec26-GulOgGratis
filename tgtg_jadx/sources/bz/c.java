package bz;

import c50.w;
import com.braze.h2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import n20.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements yy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6778a;

    @Override // t70.a
    public final Object get() {
        Set setUnmodifiableSet;
        switch (this.f6778a) {
            case 0:
                f fVar = new f(16);
                HashMap map = new HashMap();
                ty.d dVar = ty.d.DEFAULT;
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    map.put(dVar, new cz.b(30000L, 86400000L, set));
                    ty.d dVar2 = ty.d.HIGHEST;
                    if (set != null) {
                        map.put(dVar2, new cz.b(1000L, 86400000L, set));
                        ty.d dVar3 = ty.d.VERY_LOW;
                        if (set == null || (setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(cz.c.DEVICE_IDLE)))) == null) {
                            w.l("Null flags");
                        } else {
                            map.put(dVar3, new cz.b(86400000L, 86400000L, setUnmodifiableSet));
                            if (map.keySet().size() >= ty.d.values().length) {
                                new HashMap();
                                return new cz.a(fVar, map);
                            }
                            h2.b("Not all priorities have been configured");
                        }
                    } else {
                        w.l("Null flags");
                    }
                } else {
                    w.l("Null flags");
                }
                return null;
            default:
                return new w0.d(Executors.newSingleThreadExecutor(), 3);
        }
    }
}
