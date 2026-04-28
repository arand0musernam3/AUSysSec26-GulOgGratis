package w2;

import android.view.autofill.AutofillValue;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import m2.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f42991b;

    public /* synthetic */ n(o oVar, j5.b0 b0Var) {
        this.f42990a = 3;
        this.f42991b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f42990a;
        boolean z11 = false;
        o oVar = this.f42991b;
        switch (i11) {
            case 0:
                m3.k1 k1Var = oVar.f43000s.f28836t;
                Boolean bool = Boolean.TRUE;
                k1Var.setValue(bool);
                oVar.f43000s.f28835s.setValue(bool);
                m2.e1 e1Var = oVar.f43000s;
                AutofillValue autofillValue = ((c4.g) obj).f7036a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                o.O0(e1Var, (String) textValue, oVar.f43001t, oVar.f43002u);
                return bool;
            case 1:
                List list = (List) obj;
                if (oVar.f43000s.d() != null) {
                    a2 a2VarD = oVar.f43000s.d();
                    a2VarD.getClass();
                    list.add(a2VarD.f28762a);
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 2:
                o.O0(oVar.f43000s, ((m5.h) obj).f29538b, oVar.f43001t, oVar.f43002u);
                return Boolean.TRUE;
            default:
                m5.h hVar = (m5.h) obj;
                if (!oVar.f43001t && oVar.f43002u) {
                    r5.d0 d0Var = oVar.f43000s.f28822e;
                    if (d0Var != null) {
                        List listH = kotlin.collections.d0.h(new r5.j(), new r5.a(hVar, 1));
                        m2.e1 e1Var2 = oVar.f43000s;
                        r5.h hVar2 = e1Var2.f28821d;
                        m2.j0 j0Var = e1Var2.f28838v;
                        r5.y yVarA = hVar2.a(listH);
                        d0Var.a(null, yVarA);
                        j0Var.invoke(yVarA);
                    } else {
                        r5.y yVar = oVar.f42999r;
                        String str = yVar.f37714a.f29538b;
                        long j9 = yVar.f37715b;
                        int i12 = m5.t0.f29649c;
                        String string = StringsKt.Q(str, (int) (j9 >> 32), (int) (j9 & 4294967295L), hVar).toString();
                        int length = hVar.f29538b.length() + ((int) (oVar.f42999r.f37715b >> 32));
                        oVar.f43000s.f28838v.invoke(new r5.y(4, m5.k0.b(length, length), string));
                    }
                    z11 = true;
                }
                return Boolean.valueOf(z11);
        }
    }

    public /* synthetic */ n(o oVar, int i11) {
        this.f42990a = i11;
        this.f42991b = oVar;
    }
}
