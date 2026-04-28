package p50;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f34489e = new e(f.f34494b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f34491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34493d;

    public e(f fVar, int i11, int i12, int i13) {
        this.f34491b = fVar;
        this.f34490a = i11;
        this.f34492c = i12;
        this.f34493d = i13;
    }

    public final e a(int i11) {
        f dVar = this.f34491b;
        int i12 = this.f34490a;
        int i13 = this.f34493d;
        if (i12 == 4 || i12 == 2) {
            int[] iArr = c.f34484b[i12];
            i12 = 0;
            int i14 = iArr[0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            dVar.getClass();
            i13 += i16;
            dVar = new d(dVar, i15, i16);
        }
        int i17 = this.f34492c;
        int i18 = (i17 == 0 || i17 == 31) ? 18 : i17 == 62 ? 9 : 8;
        int i19 = i17 + 1;
        e eVar = new e(dVar, i12, i19, i13 + i18);
        return i19 == 2078 ? eVar.b(i11 + 1) : eVar;
    }

    public final e b(int i11) {
        int i12 = this.f34492c;
        if (i12 == 0) {
            return this;
        }
        f fVar = this.f34491b;
        fVar.getClass();
        return new e(new a(fVar, i11 - i12, i12), this.f34490a, 0, this.f34493d);
    }

    public final boolean c(e eVar) {
        int i11;
        int i12 = this.f34493d + (c.f34484b[this.f34490a][eVar.f34490a] >> 16);
        int i13 = eVar.f34492c;
        if (i13 > 0 && ((i11 = this.f34492c) == 0 || i11 > i13)) {
            i12 += 10;
        }
        return i12 <= eVar.f34493d;
    }

    public final e d(int i11, int i12) {
        int i13 = this.f34493d;
        f dVar = this.f34491b;
        int i14 = this.f34490a;
        if (i11 != i14) {
            int i15 = c.f34484b[i14][i11];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            dVar.getClass();
            i13 += i17;
            dVar = new d(dVar, i16, i17);
        }
        int i18 = i11 == 2 ? 4 : 5;
        dVar.getClass();
        return new e(new d(dVar, i12, i18), i11, 0, i13 + i18);
    }

    public final e e(int i11, int i12) {
        int i13 = this.f34490a;
        int i14 = i13 == 2 ? 4 : 5;
        int i15 = c.f34486d[i13][i11];
        f fVar = this.f34491b;
        fVar.getClass();
        return new e(new d(new d(fVar, i15, i14), i12, 5), i13, 0, this.f34493d + i14 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", c.f34483a[this.f34490a], Integer.valueOf(this.f34493d), Integer.valueOf(this.f34492c));
    }
}
