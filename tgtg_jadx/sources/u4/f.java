package u4;

import android.view.KeyEvent;
import b4.s;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends s implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f40737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function1 f40738p;

    @Override // u4.e
    public final boolean e(KeyEvent keyEvent) {
        Function1 function1 = this.f40738p;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // u4.e
    public final boolean w(KeyEvent keyEvent) {
        Function1 function1 = this.f40737o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
