package b5;

import androidx.compose.ui.node.Owner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5.d f5914a = z20.b.d();

    public static final Owner a(m0 m0Var) {
        Owner owner = m0Var.f5878o;
        if (owner != null) {
            return owner;
        }
        throw b3.i.D("LayoutNode should be attached to an owner");
    }
}
