package o00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31785a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(String str, int i11) {
        super(str);
        this.f31785a = i11;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        int i11 = this.f31785a;
        return this;
    }
}
