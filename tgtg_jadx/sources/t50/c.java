package t50;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f39800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f39801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f39804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39805g;

    public c(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i11 = 0; i11 < length; i11++) {
            char c3 = (char) (bytes[i11] & 255);
            if (c3 == '?' && str.charAt(i11) != '?') {
                i4.a.f("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb2.append(c3);
        }
        this.f39799a = sb2.toString();
        this.f39800b = f.FORCE_NONE;
        this.f39801c = new StringBuilder(str.length());
        this.f39803e = -1;
    }

    public final char a() {
        return this.f39799a.charAt(this.f39802d);
    }

    public final boolean b() {
        return this.f39802d < this.f39799a.length() - this.f39805g;
    }

    public final void c(int i11) {
        e eVar = this.f39804f;
        if (eVar == null || i11 > eVar.f39812b) {
            this.f39804f = e.e(i11, this.f39800b);
        }
    }

    public final void d(char c3) {
        this.f39801c.append(c3);
    }
}
