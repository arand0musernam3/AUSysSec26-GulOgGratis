package ke;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26340b;

    public /* synthetic */ q(Object obj, int i11) {
        this.f26339a = i11;
        this.f26340b = obj;
    }

    @Override // ke.a
    public final void a() {
        switch (this.f26339a) {
            case 0:
                ((r) this.f26340b).f26351k = true;
                break;
            case 1:
                ((r) this.f26340b).f26351k = true;
                break;
            case 2:
                ((r) this.f26340b).f26351k = true;
                break;
            default:
                re.b bVar = (re.b) this.f26340b;
                boolean z11 = bVar.f37912r.m() == 1.0f;
                if (z11 != bVar.f37918x) {
                    bVar.f37918x = z11;
                    bVar.f37909o.invalidateSelf();
                }
                break;
        }
    }
}
