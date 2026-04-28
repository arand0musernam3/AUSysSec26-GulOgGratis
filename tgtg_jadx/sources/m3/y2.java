package m3;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f29490b;

    public /* synthetic */ y2(t1 t1Var, int i11) {
        this.f29489a = i11;
        this.f29490b = t1Var;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f29489a) {
            case 0:
                this.f29490b.setValue(obj);
                break;
            case 1:
                this.f29490b.setValue(obj);
                break;
            case 2:
                this.f29490b.setValue(obj);
                break;
            default:
                this.f29490b.setValue(obj);
                break;
        }
        return Unit.f26487a;
    }
}
