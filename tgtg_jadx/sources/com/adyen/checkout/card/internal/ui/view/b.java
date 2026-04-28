package com.adyen.checkout.card.internal.ui.view;

import android.text.Editable;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements AdyenTextInputEditText.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardView f8811b;

    public /* synthetic */ b(CardView cardView, int i11) {
        this.f8810a = i11;
        this.f8811b = cardView;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText.Listener
    public final void onTextChanged(Editable editable) {
        switch (this.f8810a) {
            case 0:
                CardView.initPostalCodeInput$lambda$21(this.f8811b, editable);
                break;
            case 1:
                CardView.initKcpBirthDateOrTaxNumberInput$lambda$17(this.f8811b, editable);
                break;
            case 2:
                CardView.initHolderNameInput$lambda$13(this.f8811b, editable);
                break;
            case 3:
                CardView.initCardNumberInput$lambda$7(this.f8811b, editable);
                break;
            case 4:
                CardView.initSocialSecurityNumberInput$lambda$15(this.f8811b, editable);
                break;
            case 5:
                CardView.initSecurityCodeInput$lambda$11(this.f8811b, editable);
                break;
            case 6:
                CardView.initExpiryDateInput$lambda$9(this.f8811b, editable);
                break;
            default:
                CardView.initKcpCardPasswordInput$lambda$19(this.f8811b, editable);
                break;
        }
    }
}
