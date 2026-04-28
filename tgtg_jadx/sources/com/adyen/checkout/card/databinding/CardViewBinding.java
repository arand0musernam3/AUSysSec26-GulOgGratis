package com.adyen.checkout.card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import c50.w;
import com.adyen.checkout.card.R;
import com.adyen.checkout.card.internal.ui.view.CardNumberInput;
import com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.adyen.checkout.ui.core.internal.ui.view.SecurityCodeInput;
import com.adyen.checkout.ui.core.internal.ui.view.SocialSecurityNumberInput;
import com.google.android.material.textfield.TextInputLayout;
import pd.g;
import sa.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class CardViewBinding implements a {

    @NonNull
    public final AddressFormInput addressFormInput;

    @NonNull
    public final AppCompatAutoCompleteTextView autoCompleteTextViewAddressLookup;

    @NonNull
    public final AppCompatAutoCompleteTextView autoCompleteTextViewInstallments;

    @NonNull
    public final LinearLayout cardBrandLogoContainer;

    @NonNull
    public final FrameLayout cardBrandLogoContainerPrimary;

    @NonNull
    public final FrameLayout cardBrandLogoContainerSecondary;

    @NonNull
    public final RoundCornerImageView cardBrandLogoImageViewPrimary;

    @NonNull
    public final RoundCornerImageView cardBrandLogoImageViewSecondary;

    @NonNull
    public final AdyenTextInputEditText editTextCardHolder;

    @NonNull
    public final CardNumberInput editTextCardNumber;

    @NonNull
    public final ExpiryDateInput editTextExpiryDate;

    @NonNull
    public final AdyenTextInputEditText editTextKcpBirthDateOrTaxNumber;

    @NonNull
    public final AdyenTextInputEditText editTextKcpCardPassword;

    @NonNull
    public final AdyenTextInputEditText editTextPostalCode;

    @NonNull
    public final SecurityCodeInput editTextSecurityCode;

    @NonNull
    public final SocialSecurityNumberInput editTextSocialSecurityNumber;

    @NonNull
    public final FragmentContainerView fragmentContainerCardScanning;

    @NonNull
    public final RecyclerView recyclerViewCardList;

    @NonNull
    public final RecyclerView recyclerViewCobadgeBrands;

    @NonNull
    private final View rootView;

    @NonNull
    public final SwitchCompat switchStorePaymentMethod;

    @NonNull
    public final TextInputLayout textInputLayoutAddressLookup;

    @NonNull
    public final TextInputLayout textInputLayoutCardHolder;

    @NonNull
    public final TextInputLayout textInputLayoutCardNumber;

    @NonNull
    public final TextInputLayout textInputLayoutExpiryDate;

    @NonNull
    public final TextInputLayout textInputLayoutInstallments;

    @NonNull
    public final TextInputLayout textInputLayoutKcpBirthDateOrTaxNumber;

    @NonNull
    public final TextInputLayout textInputLayoutKcpCardPassword;

    @NonNull
    public final TextInputLayout textInputLayoutPostalCode;

    @NonNull
    public final TextInputLayout textInputLayoutSecurityCode;

    @NonNull
    public final TextInputLayout textInputLayoutSocialSecurityNumber;

    @NonNull
    public final TextView textViewCobadgeBrandsDescription;

    @NonNull
    public final TextView textViewCobadgeBrandsHeader;

    private CardViewBinding(@NonNull View view, @NonNull AddressFormInput addressFormInput, @NonNull AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, @NonNull AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull RoundCornerImageView roundCornerImageView, @NonNull RoundCornerImageView roundCornerImageView2, @NonNull AdyenTextInputEditText adyenTextInputEditText, @NonNull CardNumberInput cardNumberInput, @NonNull ExpiryDateInput expiryDateInput, @NonNull AdyenTextInputEditText adyenTextInputEditText2, @NonNull AdyenTextInputEditText adyenTextInputEditText3, @NonNull AdyenTextInputEditText adyenTextInputEditText4, @NonNull SecurityCodeInput securityCodeInput, @NonNull SocialSecurityNumberInput socialSecurityNumberInput, @NonNull FragmentContainerView fragmentContainerView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull SwitchCompat switchCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputLayout textInputLayout7, @NonNull TextInputLayout textInputLayout8, @NonNull TextInputLayout textInputLayout9, @NonNull TextInputLayout textInputLayout10, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.addressFormInput = addressFormInput;
        this.autoCompleteTextViewAddressLookup = appCompatAutoCompleteTextView;
        this.autoCompleteTextViewInstallments = appCompatAutoCompleteTextView2;
        this.cardBrandLogoContainer = linearLayout;
        this.cardBrandLogoContainerPrimary = frameLayout;
        this.cardBrandLogoContainerSecondary = frameLayout2;
        this.cardBrandLogoImageViewPrimary = roundCornerImageView;
        this.cardBrandLogoImageViewSecondary = roundCornerImageView2;
        this.editTextCardHolder = adyenTextInputEditText;
        this.editTextCardNumber = cardNumberInput;
        this.editTextExpiryDate = expiryDateInput;
        this.editTextKcpBirthDateOrTaxNumber = adyenTextInputEditText2;
        this.editTextKcpCardPassword = adyenTextInputEditText3;
        this.editTextPostalCode = adyenTextInputEditText4;
        this.editTextSecurityCode = securityCodeInput;
        this.editTextSocialSecurityNumber = socialSecurityNumberInput;
        this.fragmentContainerCardScanning = fragmentContainerView;
        this.recyclerViewCardList = recyclerView;
        this.recyclerViewCobadgeBrands = recyclerView2;
        this.switchStorePaymentMethod = switchCompat;
        this.textInputLayoutAddressLookup = textInputLayout;
        this.textInputLayoutCardHolder = textInputLayout2;
        this.textInputLayoutCardNumber = textInputLayout3;
        this.textInputLayoutExpiryDate = textInputLayout4;
        this.textInputLayoutInstallments = textInputLayout5;
        this.textInputLayoutKcpBirthDateOrTaxNumber = textInputLayout6;
        this.textInputLayoutKcpCardPassword = textInputLayout7;
        this.textInputLayoutPostalCode = textInputLayout8;
        this.textInputLayoutSecurityCode = textInputLayout9;
        this.textInputLayoutSocialSecurityNumber = textInputLayout10;
        this.textViewCobadgeBrandsDescription = textView;
        this.textViewCobadgeBrandsHeader = textView2;
    }

    @NonNull
    public static CardViewBinding bind(@NonNull View view) {
        int i11 = R.id.addressFormInput;
        AddressFormInput addressFormInput = (AddressFormInput) g.t(i11, view);
        if (addressFormInput != null) {
            i11 = R.id.autoCompleteTextView_addressLookup;
            AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) g.t(i11, view);
            if (appCompatAutoCompleteTextView != null) {
                i11 = R.id.autoCompleteTextView_installments;
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = (AppCompatAutoCompleteTextView) g.t(i11, view);
                if (appCompatAutoCompleteTextView2 != null) {
                    i11 = R.id.cardBrandLogo_container;
                    LinearLayout linearLayout = (LinearLayout) g.t(i11, view);
                    if (linearLayout != null) {
                        i11 = R.id.cardBrandLogo_container_primary;
                        FrameLayout frameLayout = (FrameLayout) g.t(i11, view);
                        if (frameLayout != null) {
                            i11 = R.id.cardBrandLogo_container_secondary;
                            FrameLayout frameLayout2 = (FrameLayout) g.t(i11, view);
                            if (frameLayout2 != null) {
                                i11 = R.id.cardBrandLogo_imageView_primary;
                                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) g.t(i11, view);
                                if (roundCornerImageView != null) {
                                    i11 = R.id.cardBrandLogo_imageView_secondary;
                                    RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) g.t(i11, view);
                                    if (roundCornerImageView2 != null) {
                                        i11 = R.id.editText_cardHolder;
                                        AdyenTextInputEditText adyenTextInputEditText = (AdyenTextInputEditText) g.t(i11, view);
                                        if (adyenTextInputEditText != null) {
                                            i11 = R.id.editText_cardNumber;
                                            CardNumberInput cardNumberInput = (CardNumberInput) g.t(i11, view);
                                            if (cardNumberInput != null) {
                                                i11 = R.id.editText_expiryDate;
                                                ExpiryDateInput expiryDateInput = (ExpiryDateInput) g.t(i11, view);
                                                if (expiryDateInput != null) {
                                                    i11 = R.id.editText_kcpBirthDateOrTaxNumber;
                                                    AdyenTextInputEditText adyenTextInputEditText2 = (AdyenTextInputEditText) g.t(i11, view);
                                                    if (adyenTextInputEditText2 != null) {
                                                        i11 = R.id.editText_kcpCardPassword;
                                                        AdyenTextInputEditText adyenTextInputEditText3 = (AdyenTextInputEditText) g.t(i11, view);
                                                        if (adyenTextInputEditText3 != null) {
                                                            i11 = R.id.editText_postalCode;
                                                            AdyenTextInputEditText adyenTextInputEditText4 = (AdyenTextInputEditText) g.t(i11, view);
                                                            if (adyenTextInputEditText4 != null) {
                                                                i11 = R.id.editText_securityCode;
                                                                SecurityCodeInput securityCodeInput = (SecurityCodeInput) g.t(i11, view);
                                                                if (securityCodeInput != null) {
                                                                    i11 = R.id.editText_socialSecurityNumber;
                                                                    SocialSecurityNumberInput socialSecurityNumberInput = (SocialSecurityNumberInput) g.t(i11, view);
                                                                    if (socialSecurityNumberInput != null) {
                                                                        i11 = R.id.fragmentContainer_cardScanning;
                                                                        FragmentContainerView fragmentContainerView = (FragmentContainerView) g.t(i11, view);
                                                                        if (fragmentContainerView != null) {
                                                                            i11 = R.id.recyclerView_cardList;
                                                                            RecyclerView recyclerView = (RecyclerView) g.t(i11, view);
                                                                            if (recyclerView != null) {
                                                                                i11 = R.id.recyclerView_cobadgeBrands;
                                                                                RecyclerView recyclerView2 = (RecyclerView) g.t(i11, view);
                                                                                if (recyclerView2 != null) {
                                                                                    i11 = R.id.switch_storePaymentMethod;
                                                                                    SwitchCompat switchCompat = (SwitchCompat) g.t(i11, view);
                                                                                    if (switchCompat != null) {
                                                                                        i11 = R.id.textInputLayout_addressLookup;
                                                                                        TextInputLayout textInputLayout = (TextInputLayout) g.t(i11, view);
                                                                                        if (textInputLayout != null) {
                                                                                            i11 = R.id.textInputLayout_cardHolder;
                                                                                            TextInputLayout textInputLayout2 = (TextInputLayout) g.t(i11, view);
                                                                                            if (textInputLayout2 != null) {
                                                                                                i11 = R.id.textInputLayout_cardNumber;
                                                                                                TextInputLayout textInputLayout3 = (TextInputLayout) g.t(i11, view);
                                                                                                if (textInputLayout3 != null) {
                                                                                                    i11 = R.id.textInputLayout_expiryDate;
                                                                                                    TextInputLayout textInputLayout4 = (TextInputLayout) g.t(i11, view);
                                                                                                    if (textInputLayout4 != null) {
                                                                                                        i11 = R.id.textInputLayout_installments;
                                                                                                        TextInputLayout textInputLayout5 = (TextInputLayout) g.t(i11, view);
                                                                                                        if (textInputLayout5 != null) {
                                                                                                            i11 = R.id.textInputLayout_kcpBirthDateOrTaxNumber;
                                                                                                            TextInputLayout textInputLayout6 = (TextInputLayout) g.t(i11, view);
                                                                                                            if (textInputLayout6 != null) {
                                                                                                                i11 = R.id.textInputLayout_kcpCardPassword;
                                                                                                                TextInputLayout textInputLayout7 = (TextInputLayout) g.t(i11, view);
                                                                                                                if (textInputLayout7 != null) {
                                                                                                                    i11 = R.id.textInputLayout_postalCode;
                                                                                                                    TextInputLayout textInputLayout8 = (TextInputLayout) g.t(i11, view);
                                                                                                                    if (textInputLayout8 != null) {
                                                                                                                        i11 = R.id.textInputLayout_securityCode;
                                                                                                                        TextInputLayout textInputLayout9 = (TextInputLayout) g.t(i11, view);
                                                                                                                        if (textInputLayout9 != null) {
                                                                                                                            i11 = R.id.textInputLayout_socialSecurityNumber;
                                                                                                                            TextInputLayout textInputLayout10 = (TextInputLayout) g.t(i11, view);
                                                                                                                            if (textInputLayout10 != null) {
                                                                                                                                i11 = R.id.textView_cobadgeBrandsDescription;
                                                                                                                                TextView textView = (TextView) g.t(i11, view);
                                                                                                                                if (textView != null) {
                                                                                                                                    i11 = R.id.textView_cobadgeBrandsHeader;
                                                                                                                                    TextView textView2 = (TextView) g.t(i11, view);
                                                                                                                                    if (textView2 != null) {
                                                                                                                                        return new CardViewBinding(view, addressFormInput, appCompatAutoCompleteTextView, appCompatAutoCompleteTextView2, linearLayout, frameLayout, frameLayout2, roundCornerImageView, roundCornerImageView2, adyenTextInputEditText, cardNumberInput, expiryDateInput, adyenTextInputEditText2, adyenTextInputEditText3, adyenTextInputEditText4, securityCodeInput, socialSecurityNumberInput, fragmentContainerView, recyclerView, recyclerView2, switchCompat, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textView, textView2);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static CardViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.card_view, viewGroup);
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
