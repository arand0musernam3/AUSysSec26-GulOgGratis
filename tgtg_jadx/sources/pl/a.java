package pl;

import a3.x1;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.lifecycle.m1;
import bg.p;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.login.terms.TermsAccessActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ky.o;
import mv.r0;
import pg.s1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TermsAccessActivity f35472b;

    public /* synthetic */ a(TermsAccessActivity termsAccessActivity, int i11) {
        this.f35471a = i11;
        this.f35472b = termsAccessActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f35471a;
        TermsAccessActivity termsAccessActivity = this.f35472b;
        switch (i11) {
            case 0:
                View view = (View) obj;
                int i12 = TermsAccessActivity.f9064j;
                view.getClass();
                p pVar = termsAccessActivity.f9068i;
                if (pVar != null) {
                    pVar.showAtLocation(view, 17, 0, 0);
                }
                break;
            case 1:
                int i13 = TermsAccessActivity.f9064j;
                ((View) obj).getClass();
                al.p pVarA0 = termsAccessActivity.a0();
                if (pVarA0.f1582u != null && pVarA0.f1583v != null) {
                    f0.B(m1.d(pVarA0), null, null, new x1(pVarA0, (x70.c) null, 2), 3);
                }
                break;
            case 2:
                int i14 = TermsAccessActivity.f9064j;
                ((View) obj).getClass();
                termsAccessActivity.getOnBackPressedDispatcher().d();
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                s1 s1Var = termsAccessActivity.f9066g;
                s1Var.getClass();
                ((Button) s1Var.f35150d).setEnabled(zBooleanValue);
                break;
            case 4:
                ArrayList arrayList = (ArrayList) obj;
                s1 s1Var2 = termsAccessActivity.f9066g;
                s1Var2.getClass();
                ((TGTGLoadingView) s1Var2.f35154h).setVisibility(8);
                if (arrayList.isEmpty()) {
                    Toast.makeText(termsAccessActivity, R.string.generic_err_undefined_error, 0).show();
                    termsAccessActivity.getOnBackPressedDispatcher().d();
                } else {
                    termsAccessActivity.f9068i = new p(termsAccessActivity, arrayList, new o(termsAccessActivity, 13));
                    termsAccessActivity.a0().f1582u = r0.d(termsAccessActivity, arrayList);
                    termsAccessActivity.b0(termsAccessActivity.a0().f1582u);
                }
                break;
            default:
                cl.g gVar = (cl.g) obj;
                int i15 = TermsAccessActivity.f9064j;
                gVar.getClass();
                if (gVar.f8448a == 2) {
                    Integer num = gVar.f8449b;
                    if (num != null) {
                        Toast.makeText(termsAccessActivity, num.intValue(), 0).show();
                    }
                    termsAccessActivity.getOnBackPressedDispatcher().d();
                }
                break;
        }
        return Unit.f26487a;
    }
}
