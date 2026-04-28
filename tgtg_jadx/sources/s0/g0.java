package s0;

import android.graphics.Rect;
import com.google.android.gms.internal.measurement.cg;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface g0 extends m0.q {
    Set a();

    boolean c();

    String d();

    default void f(com.google.firebase.messaging.a0 a0Var) {
        a0Var.getClass();
        cg.f11326f = a0Var;
    }

    Rect i();

    List m(int i11);

    Object o();

    r1 s();

    List v(int i11);

    Set x();

    Set y();

    boolean z();

    default g0 h() {
        return this;
    }
}
