package mv;

import com.app.tgtg.model.remote.FeatureActivation;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f30215a = new CopyOnWriteArraySet();

    public final w a(v vVar) {
        Object next;
        Iterator it = this.f30215a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FeatureActivation) next).getActivationName() == vVar) {
                break;
            }
        }
        FeatureActivation featureActivation = (FeatureActivation) next;
        if (featureActivation != null) {
            return featureActivation.getActivationVersion();
        }
        return null;
    }

    public final boolean b() {
        w wVarA = a(v.TOKYO_STATIONS);
        if (wVarA != null) {
            return wVarA.equals(w.DEFAULT);
        }
        return false;
    }
}
