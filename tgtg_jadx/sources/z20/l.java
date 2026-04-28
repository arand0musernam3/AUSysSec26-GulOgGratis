package z20;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f46966b;

    public final m a() {
        if (this.f46966b == 3) {
            return new m(this.f46965a);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f46966b & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f46966b & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        h2.b("Missing required properties:".concat(sb2.toString()));
        return null;
    }
}
