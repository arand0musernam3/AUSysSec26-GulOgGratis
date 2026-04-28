package iz;

import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.i0;
import dn.k;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f24244c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24246b;

    static {
        k kVar = new k(20, false);
        kVar.f15018b = Boolean.FALSE;
        f24244c = new b(kVar);
    }

    public b(k kVar) {
        this.f24245a = ((Boolean) kVar.f15018b).booleanValue();
        this.f24246b = (String) kVar.f15019c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i0.k(null, null) && this.f24245a == bVar.f24245a && i0.k(this.f24246b, bVar.f24246b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f24245a), this.f24246b});
    }
}
