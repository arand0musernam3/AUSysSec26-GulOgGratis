package qa;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f36674b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f36673a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f36675c = new ArrayList();

    public h0(View view) {
        this.f36674b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f36674b == h0Var.f36674b && this.f36673a.equals(h0Var.f36673a);
    }

    public final int hashCode() {
        return this.f36673a.hashCode() + (this.f36674b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbR = e0.f.r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbR.append(this.f36674b);
        sbR.append("\n");
        String strConcat = sbR.toString().concat("    values:");
        HashMap map = this.f36673a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
