package z20;

import android.os.Bundle;
import com.google.android.play.core.install.InstallException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends g {
    @Override // z20.g
    public final void A(Bundle bundle) {
        super.A(bundle);
        int i11 = bundle.getInt("error.code", -2);
        d10.g gVar = this.f46955i;
        if (i11 != 0) {
            gVar.c(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            gVar.d(null);
        }
    }
}
