package j6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24744e;

    public e(float f11) {
        super(null);
        this.f24744e = f11;
    }

    @Override // j6.c
    public final float d() {
        char[] cArr;
        if (Float.isNaN(this.f24744e) && (cArr = this.f24740a) != null && cArr.length >= 1) {
            this.f24744e = Float.parseFloat(c());
        }
        return this.f24744e;
    }

    @Override // j6.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            float fD = d();
            float fD2 = ((e) obj).d();
            if ((Float.isNaN(fD) && Float.isNaN(fD2)) || fD == fD2) {
                return true;
            }
        }
        return false;
    }

    @Override // j6.c
    public final int h() {
        char[] cArr;
        if (Float.isNaN(this.f24744e) && (cArr = this.f24740a) != null && cArr.length >= 1) {
            this.f24744e = Integer.parseInt(c());
        }
        return (int) this.f24744e;
    }

    @Override // j6.c
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f11 = this.f24744e;
        return iHashCode + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
