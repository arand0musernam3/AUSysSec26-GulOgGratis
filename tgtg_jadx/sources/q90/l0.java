package q90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f36542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f36544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36545d;

    public l0(z zVar, byte[] bArr, int i11, int i12) {
        this.f36542a = zVar;
        this.f36543b = i11;
        this.f36544c = bArr;
        this.f36545d = i12;
    }

    @Override // q90.n0
    public final long contentLength() {
        return this.f36543b;
    }

    @Override // q90.n0
    public final z contentType() {
        return this.f36542a;
    }

    @Override // q90.n0
    public final void writeTo(ia0.h hVar) {
        hVar.n0(this.f36545d, this.f36543b, this.f36544c);
    }
}
