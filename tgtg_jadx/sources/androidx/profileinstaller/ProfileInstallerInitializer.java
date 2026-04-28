package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import l20.c;
import ma.b;
import w80.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // ma.b
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new d(this, context.getApplicationContext()));
        return new c(24);
    }

    @Override // ma.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
