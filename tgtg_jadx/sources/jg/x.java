package jg;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f25240b;

    public /* synthetic */ x(a0 a0Var, int i11) {
        this.f25239a = i11;
        this.f25240b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        switch (this.f25239a) {
            case 0:
                view.getClass();
                com.google.android.material.bottomsheet.l lVar = this.f25240b.l;
                if (lVar != null) {
                    lVar.dismiss();
                }
                break;
            case 1:
                view.getClass();
                a0 a0Var = this.f25240b;
                a0Var.f25148d.A();
                a0Var.f();
                a0Var.f25146b.c();
                break;
            default:
                view.getClass();
                this.f25240b.f25148d.C();
                break;
        }
        return Unit.f26487a;
    }
}
