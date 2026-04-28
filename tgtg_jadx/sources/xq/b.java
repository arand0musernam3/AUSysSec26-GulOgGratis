package xq;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import yk.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f44490b;

    public /* synthetic */ b(b1 b1Var, int i11) {
        this.f44489a = i11;
        this.f44490b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44489a) {
            case 0:
                this.f44490b.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f44490b.setValue(Boolean.TRUE);
                break;
            case 2:
                this.f44490b.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f44490b.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f44490b.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f44490b.setValue(j.SELECT_AREA);
                break;
            case 6:
                this.f44490b.setValue(Boolean.FALSE);
                break;
            case 7:
                this.f44490b.setValue(Boolean.FALSE);
                break;
            default:
                this.f44490b.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f26487a;
    }
}
