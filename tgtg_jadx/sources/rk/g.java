package rk;

import f0.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import nk.q0;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1.a f38064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f38065c;

    public /* synthetic */ g(m1.a aVar, q0 q0Var, int i11) {
        this.f38063a = i11;
        this.f38064b = aVar;
        this.f38065c = q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38063a) {
            case 0:
                ((e0) obj).getClass();
                e0 e0Var = this.f38065c.f31038d;
                m1.a aVar = this.f38064b;
                aVar.getClass();
                e0Var.getClass();
                f2 f2Var = (f2) aVar.f28697a;
                ((m1) f2Var.f16653f).i(new ok.q(e0Var));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String strMo340getItemIdFvU5WIY = this.f38065c.f31035a.getInformation().mo340getItemIdFvU5WIY();
                m1.a aVar2 = this.f38064b;
                aVar2.getClass();
                strMo340getItemIdFvU5WIY.getClass();
                f2 f2Var2 = (f2) aVar2.f28697a;
                ((m1) f2Var2.f16653f).i(new ok.h(strMo340getItemIdFvU5WIY, zBooleanValue));
                break;
        }
        return Unit.f26487a;
    }
}
