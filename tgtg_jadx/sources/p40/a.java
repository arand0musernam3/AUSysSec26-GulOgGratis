package p40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f34428d;

    public a(int i11, d dVar) {
        this.f34427c = i11;
        this.f34428d = dVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f34427c == eVar.tag() && this.f34428d.equals(eVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f34427c) + (this.f34428d.hashCode() ^ 2041407134);
    }

    @Override // p40.e
    public final d intEncoding() {
        return this.f34428d;
    }

    @Override // p40.e
    public final int tag() {
        return this.f34427c;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f34427c + "intEncoding=" + this.f34428d + ')';
    }
}
