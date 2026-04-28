package yj;

import androidx.lifecycle.m1;
import com.app.tgtg.model.local.SnackBarType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xj.k f46109b;

    public /* synthetic */ o(xj.k kVar, int i11) {
        this.f46108a = i11;
        this.f46109b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f46108a) {
            case 0:
                SnackBarType snackBarType = (SnackBarType) obj;
                snackBarType.getClass();
                xj.k kVar = this.f46109b;
                f0.B(m1.d(kVar), null, null, new tm.d(kVar, snackBarType, null, 19), 3);
                break;
            default:
                SnackBarType snackBarType2 = (SnackBarType) obj;
                snackBarType2.getClass();
                xj.k kVar2 = this.f46109b;
                f0.B(m1.d(kVar2), null, null, new tm.d(kVar2, snackBarType2, null, 19), 3);
                break;
        }
        return Unit.f26487a;
    }
}
