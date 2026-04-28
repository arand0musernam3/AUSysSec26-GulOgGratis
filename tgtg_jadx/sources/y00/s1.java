package y00;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f45128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f45129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1 f45130e;

    public /* synthetic */ s1(v1 v1Var, String str, String str2, String str3, int i11) {
        this.f45126a = i11;
        this.f45127b = str;
        this.f45128c = str2;
        this.f45129d = str3;
        this.f45130e = v1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f45126a) {
            case 0:
                v1 v1Var = this.f45130e;
                v1Var.f45249g.W();
                m mVar = v1Var.f45249g.f44922c;
                l4.U(mVar);
                return mVar.n0(this.f45127b, this.f45128c, this.f45129d);
            case 1:
                v1 v1Var2 = this.f45130e;
                v1Var2.f45249g.W();
                m mVar2 = v1Var2.f45249g.f44922c;
                l4.U(mVar2);
                return mVar2.n0(this.f45127b, this.f45128c, this.f45129d);
            case 2:
                v1 v1Var3 = this.f45130e;
                v1Var3.f45249g.W();
                m mVar3 = v1Var3.f45249g.f44922c;
                l4.U(mVar3);
                return mVar3.r0(this.f45127b, this.f45128c, this.f45129d);
            default:
                v1 v1Var4 = this.f45130e;
                v1Var4.f45249g.W();
                m mVar4 = v1Var4.f45249g.f44922c;
                l4.U(mVar4);
                return mVar4.r0(this.f45127b, this.f45128c, this.f45129d);
        }
    }
}
