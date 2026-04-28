package i3;

import android.view.autofill.AutofillValue;
import b5.q2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j5.b0 f23163b;

    public /* synthetic */ m(j5.b0 b0Var, int i11) {
        this.f23162a = i11;
        this.f23163b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        boolean z12;
        switch (this.f23162a) {
            case 0:
                q2 q2Var = (q2) obj;
                q2Var.getClass();
                e0 e0Var = (e0) q2Var;
                e0Var.f23111p = true;
                e0Var.f23110o.invoke(this.f23163b);
                b5.m.g(e0Var).G();
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((c4.g) obj).f7036a;
                Boolean boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    j5.z.p(this.f23163b, boolValueOf.booleanValue() ? l5.a.On : l5.a.Off);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                AutofillValue autofillValue2 = ((c4.g) obj).f7036a;
                Boolean boolValueOf2 = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf2 != null) {
                    j5.z.p(this.f23163b, boolValueOf2.booleanValue() ? l5.a.On : l5.a.Off);
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
        }
    }
}
