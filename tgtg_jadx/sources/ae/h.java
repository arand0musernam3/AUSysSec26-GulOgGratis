package ae;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v80.l f1257b;

    public /* synthetic */ h(v80.l lVar, int i11) {
        this.f1256a = i11;
        this.f1257b = lVar;
    }

    @Override // androidx.lifecycle.h
    public final void onStart(LifecycleOwner lifecycleOwner) {
        int i11 = this.f1256a;
        v80.l lVar = this.f1257b;
        switch (i11) {
            case 0:
                u70.o oVar = u70.q.f40850b;
                lVar.resumeWith(Unit.f26487a);
                break;
            default:
                u70.o oVar2 = u70.q.f40850b;
                lVar.resumeWith(Unit.f26487a);
                break;
        }
    }
}
