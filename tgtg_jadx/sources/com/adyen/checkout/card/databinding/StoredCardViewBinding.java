package com.adyen.checkout.card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import c50.w;
import com.adyen.checkout.card.R;
import com.adyen.checkout.card.internal.ui.view.CardNumberInput;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.adyen.checkout.ui.core.internal.ui.view.SecurityCodeInput;
import com.google.android.material.textfield.TextInputLayout;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class StoredCardViewBinding implements a {

    @NonNull
    public final LinearLayout cardBrandLogoContainer;

    @NonNull
    public final FrameLayout cardBrandLogoContainerPrimary;

    @NonNull
    public final RoundCornerImageView cardBrandLogoImageViewPrimary;

    @NonNull
    public final CardNumberInput editTextCardNumber;

    @NonNull
    public final ExpiryDateInput editTextExpiryDate;

    @NonNull
    public final SecurityCodeInput editTextSecurityCode;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextInputLayout textInputLayoutCardNumber;

    @NonNull
    public final TextInputLayout textInputLayoutExpiryDate;

    @NonNull
    public final TextInputLayout textInputLayoutSecurityCode;

    private StoredCardViewBinding(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull RoundCornerImageView roundCornerImageView, @NonNull CardNumberInput cardNumberInput, @NonNull ExpiryDateInput expiryDateInput, @NonNull SecurityCodeInput securityCodeInput, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3) {
        this.rootView = view;
        this.cardBrandLogoContainer = linearLayout;
        this.cardBrandLogoContainerPrimary = frameLayout;
        this.cardBrandLogoImageViewPrimary = roundCornerImageView;
        this.editTextCardNumber = cardNumberInput;
        this.editTextExpiryDate = expiryDateInput;
        this.editTextSecurityCode = securityCodeInput;
        this.textInputLayoutCardNumber = textInputLayout;
        this.textInputLayoutExpiryDate = textInputLayout2;
        this.textInputLayoutSecurityCode = textInputLayout3;
    }

    @NonNull
    public static StoredCardViewBinding bind(@NonNull View view) {
        int i11 = R.id.cardBrandLogo_container;
        LinearLayout linearLayout = (LinearLayout) g.t(i11, view);
        if (linearLayout != null) {
            i11 = R.id.cardBrandLogo_container_primary;
            FrameLayout frameLayout = (FrameLayout) g.t(i11, view);
            if (frameLayout != null) {
                i11 = R.id.cardBrandLogo_imageView_primary;
                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) g.t(i11, view);
                if (roundCornerImageView != null) {
                    i11 = R.id.editText_cardNumber;
                    CardNumberInput cardNumberInput = (CardNumberInput) g.t(i11, view);
                    if (cardNumberInput != null) {
                        i11 = R.id.editText_expiryDate;
                        ExpiryDateInput expiryDateInput = (ExpiryDateInput) g.t(i11, view);
                        if (expiryDateInput != null) {
                            i11 = R.id.editText_securityCode;
                            SecurityCodeInput securityCodeInput = (SecurityCodeInput) g.t(i11, view);
                            if (securityCodeInput != null) {
                                i11 = R.id.textInputLayout_cardNumber;
                                TextInputLayout textInputLayout = (TextInputLayout) g.t(i11, view);
                                if (textInputLayout != null) {
                                    i11 = R.id.textInputLayout_expiryDate;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) g.t(i11, view);
                                    if (textInputLayout2 != null) {
                                        i11 = R.id.textInputLayout_securityCode;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) g.t(i11, view);
                                        if (textInputLayout3 != null) {
                                            return new StoredCardViewBinding(view, linearLayout, frameLayout, roundCornerImageView, cardNumberInput, expiryDateInput, securityCodeInput, textInputLayout, textInputLayout2, textInputLayout3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        return null;
    }

    @NonNull
    public static StoredCardViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.stored_card_view, viewGroup);
            return bind(viewGroup);
        }
        w.l("parent");
        return null;
    }

    @Override // sa.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
