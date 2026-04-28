package androidx.fragment.app;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f3261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3262c;

    public /* synthetic */ m(m2 m2Var, p pVar, int i11) {
        this.f3260a = i11;
        this.f3261b = m2Var;
        this.f3262c = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3260a) {
            case 0:
                boolean zL = FragmentManager.L(2);
                m2 m2Var = this.f3261b;
                if (zL) {
                    Log.v("FragmentManager", "Transition for operation " + m2Var + " has completed");
                }
                m2Var.c(this.f3262c);
                break;
            default:
                boolean zL2 = FragmentManager.L(2);
                m2 m2Var2 = this.f3261b;
                if (zL2) {
                    Log.v("FragmentManager", "Transition for operation " + m2Var2 + " has completed");
                }
                m2Var2.c(this.f3262c);
                break;
        }
    }
}
