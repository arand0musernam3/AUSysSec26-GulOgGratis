package h1;

import android.hardware.camera2.params.SessionConfiguration;
import e10.t;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20996a;

    public a(ArrayList arrayList) {
        this.f20996a = arrayList;
    }

    @Override // h1.d
    public final t a(SessionConfiguration sessionConfiguration) {
        Iterator it = this.f20996a.iterator();
        while (it.hasNext()) {
            t tVarA = ((d) it.next()).a(sessionConfiguration);
            if (tVarA.f15548a != 0) {
                return tVarA;
            }
        }
        return new t(0);
    }
}
