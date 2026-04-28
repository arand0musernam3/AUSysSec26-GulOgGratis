package z20;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46967a;

    public m(int i11) {
        this.f46967a = i11;
    }

    public static l a(int i11) {
        l lVar = new l();
        lVar.f46965a = i11;
        lVar.f46966b = (byte) (((byte) (lVar.f46966b | 1)) | 2);
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof m) && this.f46967a == ((m) obj).f46967a;
    }

    public final int hashCode() {
        return ((this.f46967a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return r8.k.h(this.f46967a, "AppUpdateOptions{appUpdateType=", ", allowAssetPackDeletion=false}");
    }
}
