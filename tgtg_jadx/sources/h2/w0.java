package h2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21242b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f21243c;

    public w0(z0 z0Var, int i11) {
        this.f21243c = z0Var;
        this.f21241a = i11;
    }

    public final void a(int i11) {
        z0 z0Var = this.f21243c;
        c40.q qVar = z0Var.f21253c;
        if (qVar == null) {
            return;
        }
        this.f21242b.add(new n1(qVar, i11, z0Var.f21252b, null));
    }
}
