package dp;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ap.n f15110b;

    public /* synthetic */ q(ap.n nVar, int i11) {
        this.f15109a = i11;
        this.f15110b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15109a) {
            case 0:
                this.f15110b.m(((Integer) obj).intValue(), bp.v.OVERALL);
                break;
            default:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    this.f15110b.g(uri);
                }
                break;
        }
        return Unit.f26487a;
    }
}
