package androidx.camera.camera2;

import kotlin.Metadata;
import m0.x;
import m0.y;
import m0.z;
import org.jetbrains.annotations.NotNull;
import s0.g;
import s0.i1;
import s0.l1;
import v.a;
import v.b;
import w.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/camera/camera2/Camera2Config$DefaultProvider", "Lm0/y;", "<init>", "()V", "Lm0/z;", "getCameraXConfig", "()Lm0/z;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2Config$DefaultProvider implements y {
    @Override // m0.y
    @NotNull
    public z getCameraXConfig() {
        f fVar = new f();
        x xVar = new x(0);
        g gVar = z.f28639b;
        i1 i1Var = xVar.f28633a;
        i1Var.v(gVar, fVar);
        i1Var.v(z.f28640c, new a());
        i1Var.v(z.f28641d, new b());
        i1Var.v(z.l, Boolean.TRUE);
        return new z(l1.e(i1Var));
    }
}
