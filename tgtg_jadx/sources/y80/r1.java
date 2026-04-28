package y80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45567a;

    @Override // y80.q1
    public final i a(z80.y yVar) {
        switch (this.f45567a) {
            case 0:
                return new at.o(o1.START, 7);
            default:
                return new at.o(new u1(yVar, null));
        }
    }

    public final String toString() {
        switch (this.f45567a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
