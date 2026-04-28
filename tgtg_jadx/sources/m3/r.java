package m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29406b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f29405a = i11;
        this.f29406b = obj;
    }

    public final void a() {
        switch (this.f29405a) {
            case 0:
                s sVar = (s) this.f29406b;
                sVar.A--;
                break;
            default:
                z3.w wVar = (z3.w) this.f29406b;
                wVar.f47074k--;
                break;
        }
    }

    public final void b() {
        switch (this.f29405a) {
            case 0:
                ((s) this.f29406b).A++;
                break;
            default:
                ((z3.w) this.f29406b).f47074k++;
                break;
        }
    }
}
