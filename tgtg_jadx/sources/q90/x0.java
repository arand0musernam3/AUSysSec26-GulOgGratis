package q90;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 {
    public abstract void onClosed(w0 w0Var, int i11, String str);

    public void onClosing(@NotNull w0 w0Var, int i11, @NotNull String str) {
        w0Var.getClass();
        str.getClass();
    }

    public abstract void onFailure(w0 w0Var, Throwable th2, p0 p0Var);

    public void onMessage(@NotNull w0 w0Var, @NotNull ia0.j jVar) {
        w0Var.getClass();
        jVar.getClass();
    }

    public abstract void onMessage(w0 w0Var, String str);

    public abstract void onOpen(w0 w0Var, p0 p0Var);
}
