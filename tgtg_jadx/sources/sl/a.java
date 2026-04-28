package sl;

import c5.f1;
import cv.i;
import kotlin.jvm.functions.Function1;
import m5.n;
import m5.o;
import m5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f39053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39054c;

    public /* synthetic */ a(int i11, Object obj, Function1 function1) {
        this.f39052a = i11;
        this.f39053b = function1;
        this.f39054c = obj;
    }

    @Override // m5.p
    public final void a(o oVar) {
        switch (this.f39052a) {
            case 0:
                f1 f1Var = (f1) this.f39054c;
                oVar.getClass();
                String str = ((n) oVar).f29597a;
                this.f39053b.invoke(i.CHARITY_LOGIN_CHARITY_USER_TERMS);
                f1Var.a(str);
                break;
            case 1:
                f1 f1Var2 = (f1) this.f39054c;
                oVar.getClass();
                String str2 = ((n) oVar).f29597a;
                this.f39053b.invoke(i.CHARITY_LOGIN_PRIVACY_POLICY);
                f1Var2.a(str2);
                break;
            default:
                String str3 = (String) this.f39054c;
                oVar.getClass();
                this.f39053b.invoke(str3);
                break;
        }
    }
}
