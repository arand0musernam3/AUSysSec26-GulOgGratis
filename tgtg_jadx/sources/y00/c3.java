package y00;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3 f44661b;

    public c3(d3 d3Var, int i11) {
        this.f44660a = i11;
        switch (i11) {
            case 1:
                Objects.requireNonNull(d3Var);
                this.f44661b = d3Var;
                break;
            default:
                Objects.requireNonNull(d3Var);
                this.f44661b = d3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44660a) {
            case 0:
                d3 d3Var = this.f44661b;
                d3Var.f44681f = d3Var.f44686k;
                break;
            default:
                this.f44661b.f44686k = null;
                break;
        }
    }
}
