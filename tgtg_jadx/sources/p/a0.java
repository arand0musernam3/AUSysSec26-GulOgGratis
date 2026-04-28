package p;

import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends n1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0 f33850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f33851k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, g0 g0Var) {
        super(appCompatSpinner2);
        this.f33851k = appCompatSpinner;
        this.f33850j = g0Var;
    }

    @Override // p.n1
    public final o.b0 b() {
        return this.f33850j;
    }

    @Override // p.n1
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f33851k;
        if (appCompatSpinner.getInternalPopup().a()) {
            return true;
        }
        appCompatSpinner.f2021f.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
