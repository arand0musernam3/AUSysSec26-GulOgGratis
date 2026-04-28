package v0;

import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41605b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.f41604a) {
            case 0:
                int i11 = this.f41605b;
                m[] mVarArr = k.f41613c;
                if (i11 < 4) {
                }
                break;
            default:
                int i12 = this.f41605b;
                m[] mVarArr2 = k.f41613c;
                if (i12 < 4) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f41604a) {
            case 0:
                HashMap map = new HashMap();
                for (m mVar : k.f41614d[this.f41605b]) {
                    map.put(mVar.f41627b, mVar);
                }
                this.f41605b++;
                return map;
            default:
                this.f41605b++;
                return new HashMap();
        }
    }
}
