package com.adyen.checkout.card.internal.ui.view;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardView f8809b;

    public /* synthetic */ a(CardView cardView, int i11) {
        this.f8808a = i11;
        this.f8809b = cardView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        switch (this.f8808a) {
            case 0:
                CardView.initKcpCardPasswordInput$lambda$20(this.f8809b, view, z11);
                break;
            case 1:
                CardView.initPostalCodeInput$lambda$22(this.f8809b, view, z11);
                break;
            case 2:
                CardView.initKcpBirthDateOrTaxNumberInput$lambda$18(this.f8809b, view, z11);
                break;
            case 3:
                CardView.initHolderNameInput$lambda$14(this.f8809b, view, z11);
                break;
            case 4:
                CardView.initCardNumberInput$lambda$8(this.f8809b, view, z11);
                break;
            case 5:
                CardView.initSocialSecurityNumberInput$lambda$16(this.f8809b, view, z11);
                break;
            case 6:
                CardView.initSecurityCodeInput$lambda$12(this.f8809b, view, z11);
                break;
            default:
                CardView.initExpiryDateInput$lambda$10(this.f8809b, view, z11);
                break;
        }
    }
}
