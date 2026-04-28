package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f3068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3069d;

    public z0(z zVar, String str, Object[] objArr) {
        this.f3066a = zVar;
        this.f3067b = str;
        this.f3068c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f3069d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f3069d = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    public final w0 a() {
        int i11 = this.f3069d;
        return (i11 & 1) != 0 ? w0.PROTO2 : (i11 & 4) == 4 ? w0.EDITIONS : w0.PROTO3;
    }
}
