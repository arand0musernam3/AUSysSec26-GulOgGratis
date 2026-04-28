package u70;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final h f40841e = new h(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f40842f = new i(2, 3, 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40846d;

    public i(int i11, int i12, int i13) {
        this.f40843a = i11;
        this.f40844b = i12;
        this.f40845c = i13;
        if (i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256 && i13 >= 0 && i13 < 256) {
            this.f40846d = (i11 << 16) + (i12 << 8) + i13;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i11 + '.' + i12 + '.' + i13).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        return this.f40846d - iVar.f40846d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        return iVar != null && this.f40846d == iVar.f40846d;
    }

    public final int hashCode() {
        return this.f40846d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40843a);
        sb2.append('.');
        sb2.append(this.f40844b);
        sb2.append('.');
        sb2.append(this.f40845c);
        return sb2.toString();
    }
}
