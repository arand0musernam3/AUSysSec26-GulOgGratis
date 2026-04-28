package f7;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f17450e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f17451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f17454d;

    static {
        for (int i11 = 0; i11 < 1792; i11++) {
            f17450e[i11] = Character.getDirectionality(i11);
        }
    }

    public a(CharSequence charSequence) {
        this.f17451a = charSequence;
        this.f17452b = charSequence.length();
    }

    public final byte a() {
        int i11 = this.f17453c - 1;
        CharSequence charSequence = this.f17451a;
        char cCharAt = charSequence.charAt(i11);
        this.f17454d = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i12 = this.f17453c;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i12);
            this.f17453c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f17453c = i12 - 1;
        char c3 = this.f17454d;
        return c3 < 1792 ? f17450e[c3] : Character.getDirectionality(c3);
    }
}
