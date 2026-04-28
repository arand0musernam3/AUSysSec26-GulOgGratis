package mv;

import com.app.tgtg.model.remote.FeatureExperiment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f30214a = new CopyOnWriteArraySet();

    public final String a(k kVar) {
        Object next;
        Iterator it = this.f30214a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((FeatureExperiment) next).getName(), kVar.a())) {
                break;
            }
        }
        FeatureExperiment featureExperiment = (FeatureExperiment) next;
        if (featureExperiment != null) {
            return featureExperiment.getVariant();
        }
        return null;
    }

    public final boolean b() {
        String strA = a(k.APPTRK_CM_LIST_ON_MAP_V3);
        if (strA != null) {
            return ox.h.w(strA, n.TREATMENT.a());
        }
        return false;
    }

    public final boolean c() {
        String strA = a(k.APPTRK_CM_COMPLEX_QUICK_FILTERS);
        return (strA != null ? ox.h.w(strA, j.TREATMENT.a()) : false) && b();
    }

    public final boolean d() {
        String strA = a(k.APPTRK_CM_LOCATION_SELECTOR_UPGRADE);
        boolean zW = strA != null ? ox.h.w(strA, o.TREATMENT1.a()) : false;
        String strA2 = a(k.APPTRK_CM_NEW_LOCATION_PICKER);
        return (strA2 != null ? ox.h.w(strA2, p.TREATMENT1.a()) : false) || zW;
    }

    public final boolean e() {
        String strA = a(k.APPTRK_CM_SPECIAL_REWARDS_EXP);
        return Intrinsics.areEqual(strA, s.TREATMENT1.a()) || Intrinsics.areEqual(strA, s.TREATMENT2.a());
    }
}
