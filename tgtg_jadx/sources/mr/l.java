package mr;

import ao.g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f30097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f30099d;

    public /* synthetic */ l(r rVar, String str, String str2, int i11) {
        this.f30096a = i11;
        this.f30097b = rVar;
        this.f30098c = str;
        this.f30099d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30096a) {
            case 0:
                g3 g3Var = this.f30097b.f30110b;
                g3Var.m().setPhoneNumber(this.f30098c);
                g3Var.m().setPhoneCountryCode(this.f30099d);
                break;
            default:
                g3 g3Var2 = this.f30097b.f30110b;
                g3Var2.m().setPhoneNumber(this.f30098c);
                g3Var2.m().setPhoneCountryCode(this.f30099d);
                break;
        }
    }
}
