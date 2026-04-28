package m5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f29673c = new z(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29675b;

    public z(boolean z11) {
        this.f29674a = z11;
        this.f29675b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f29674a == zVar.f29674a && this.f29675b == zVar.f29675b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29675b) + (Boolean.hashCode(this.f29674a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f29674a + ", emojiSupportMatch=" + ((Object) l.a(this.f29675b)) + ')';
    }

    public z(int i11, boolean z11) {
        this.f29674a = z11;
        this.f29675b = i11;
    }
}
