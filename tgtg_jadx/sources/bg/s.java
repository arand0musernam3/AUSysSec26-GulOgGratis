package bg;

import android.text.Editable;
import android.view.View;
import android.widget.SearchView;
import com.adyen.checkout.blik.internal.ui.view.BlikView;
import com.adyen.checkout.card.internal.ui.view.StoredCardView;
import com.adyen.checkout.mbway.internal.ui.view.MbWayView;
import com.adyen.checkout.ui.core.internal.ui.view.AddressLookupView;
import com.app.tgtg.customview.ExpandableTextView;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.text.StringsKt;
import zendesk.ui.android.conversation.form.FieldView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6219b;

    public /* synthetic */ s(Object obj, int i11) {
        this.f6218a = i11;
        this.f6219b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        int i11 = this.f6218a;
        Object obj = this.f6219b;
        switch (i11) {
            case 0:
                ExpandableTextView expandableTextView = (ExpandableTextView) obj;
                int i12 = ExpandableTextView.f8892m;
                if (z11) {
                    expandableTextView.e();
                }
                break;
            case 1:
                BlikView.initBlikCodeInput$lambda$2((BlikView) obj, view, z11);
                break;
            case 2:
                StoredCardView.initSecurityCodeInput$lambda$2((StoredCardView) obj, view, z11);
                break;
            case 3:
                MbWayView.initMobileNumberInput$lambda$2((MbWayView) obj, view, z11);
                break;
            case 4:
                AddressLookupView.initAddressLookupQuery$lambda$2$lambda$1((SearchView) obj, view, z11);
                break;
            case 5:
                EmailAccessActivity emailAccessActivity = (EmailAccessActivity) obj;
                if (z11) {
                    int i13 = EmailAccessActivity.f9043j;
                    emailAccessActivity.a0(false);
                    break;
                } else {
                    pg.x0 x0Var = emailAccessActivity.f9045g;
                    x0Var.getClass();
                    Editable text = ((TextInputEditText) x0Var.f35268i).getText();
                    if (text != null && !StringsKt.H(text)) {
                        pg.x0 x0Var2 = emailAccessActivity.f9045g;
                        x0Var2.getClass();
                        String string = StringsKt.e0(String.valueOf(((TextInputEditText) x0Var2.f35268i).getText())).toString();
                        if (string.length() == 0 || mv.r0.s(string)) {
                            emailAccessActivity.a0(true);
                            break;
                        }
                    }
                }
                break;
            case 6:
                t20.c cVar = (t20.c) obj;
                cVar.s(cVar.t());
                break;
            case 7:
                t20.i iVar = (t20.i) obj;
                iVar.l = z11;
                iVar.p();
                if (!z11) {
                    iVar.s(false);
                    iVar.f39690m = false;
                }
                break;
            default:
                FieldView.render$lambda$4((FieldView) obj, view, z11);
                break;
        }
    }
}
