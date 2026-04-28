package p40;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements m40.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34441a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34442b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m40.b f34443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f34444d;

    public i(g gVar) {
        this.f34444d = gVar;
    }

    @Override // m40.f
    public final m40.f add(String str) {
        if (this.f34441a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f34441a = true;
        this.f34444d.i(this.f34443c, str, this.f34442b);
        return this;
    }

    @Override // m40.f
    public final m40.f f(boolean z11) {
        if (this.f34441a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f34441a = true;
        this.f34444d.g(this.f34443c, z11 ? 1 : 0, this.f34442b);
        return this;
    }
}
