package c5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f7191c;

    @Override // c5.b
    public final int[] g(int i11) {
        int length = l().length();
        if (length <= 0 || i11 >= length) {
            return null;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < length && l().charAt(i11) == '\n' && (l().charAt(i11) == '\n' || (i11 != 0 && l().charAt(i11 - 1) != '\n'))) {
            i11++;
        }
        if (i11 >= length) {
            return null;
        }
        int i12 = i11 + 1;
        while (i12 < length && !z(i12)) {
            i12++;
        }
        return k(i11, i12);
    }

    @Override // c5.b
    public final int[] t(int i11) {
        int length = l().length();
        if (length <= 0 || i11 <= 0) {
            return null;
        }
        if (i11 > length) {
            i11 = length;
        }
        while (i11 > 0 && l().charAt(i11 - 1) == '\n' && !z(i11)) {
            i11--;
        }
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        while (i12 > 0 && (l().charAt(i12) == '\n' || (i12 != 0 && l().charAt(i12 - 1) != '\n'))) {
            i12--;
        }
        return k(i12, i11);
    }

    public final boolean z(int i11) {
        if (i11 <= 0 || l().charAt(i11 - 1) == '\n') {
            return false;
        }
        return i11 == l().length() || l().charAt(i11) == '\n';
    }
}
