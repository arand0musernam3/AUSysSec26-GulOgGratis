package c5;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 implements androidx.lifecycle.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a90.d f7186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.n1 f7187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3.b2 f7188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f7190e;

    public e4(a90.d dVar, m3.n1 n1Var, m3.b2 b2Var, Ref.ObjectRef objectRef, View view) {
        this.f7186a = dVar;
        this.f7187b = n1Var;
        this.f7188c = b2Var;
        this.f7189d = objectRef;
        this.f7190e = view;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        boolean z11;
        v80.k kVarC = null;
        switch (c4.$EnumSwitchMapping$0[wVar.ordinal()]) {
            case 1:
                v80.f0.B(this.f7186a, null, v80.d0.UNDISPATCHED, new d4(this.f7189d, this.f7188c, lifecycleOwner, this, this.f7190e, null), 1);
                return;
            case 2:
                m3.n1 n1Var = this.f7187b;
                if (n1Var != null) {
                    c40.q qVar = n1Var.f29349b;
                    synchronized (qVar.f7093c) {
                        try {
                            synchronized (qVar.f7093c) {
                                z11 = qVar.f7092b;
                            }
                            if (!z11) {
                                ArrayList arrayList = (ArrayList) qVar.f7094d;
                                qVar.f7094d = (ArrayList) qVar.f7095e;
                                qVar.f7095e = arrayList;
                                qVar.f7092b = true;
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    x70.c cVar = (x70.c) arrayList.get(i11);
                                    u70.o oVar = u70.q.f40850b;
                                    cVar.resumeWith(Unit.f26487a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                m3.b2 b2Var = this.f7188c;
                synchronized (b2Var.f29227c) {
                    if (b2Var.f29243t) {
                        b2Var.f29243t = false;
                        kVarC = b2Var.C();
                    }
                    break;
                }
                if (kVarC != null) {
                    u70.o oVar2 = u70.q.f40850b;
                    ((v80.l) kVarC).resumeWith(Unit.f26487a);
                    return;
                }
                return;
            case 3:
                m3.b2 b2Var2 = this.f7188c;
                synchronized (b2Var2.f29227c) {
                    b2Var2.f29243t = true;
                }
                return;
            case 4:
                this.f7188c.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                e40.a.f();
                return;
        }
    }
}
