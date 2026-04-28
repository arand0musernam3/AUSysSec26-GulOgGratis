package jg;

import android.text.Editable;
import android.text.TextWatcher;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.model.remote.user.response.AddressField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddressField f25175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlCheckoutAddressFragment f25176b;

    public g0(AddressField addressField, XmlCheckoutAddressFragment xmlCheckoutAddressFragment) {
        this.f25175a = addressField;
        this.f25176b = xmlCheckoutAddressFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i11 = f0.$EnumSwitchMapping$0[this.f25175a.ordinal()];
        pg.r rVar = null;
        XmlCheckoutAddressFragment xmlCheckoutAddressFragment = this.f25176b;
        switch (i11) {
            case 1:
                xmlCheckoutAddressFragment.G();
                break;
            case 2:
                xmlCheckoutAddressFragment.F();
                break;
            case 3:
                xmlCheckoutAddressFragment.H();
                break;
            case 4:
                xmlCheckoutAddressFragment.H();
                break;
            case 5:
                AddressField addressField = AddressField.ADDRESS_LINE1;
                pg.r rVar2 = xmlCheckoutAddressFragment.f8936k;
                if (rVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar2;
                }
                xmlCheckoutAddressFragment.E(addressField, rVar.f35090b);
                break;
            case 6:
                AddressField addressField2 = AddressField.ADDRESS_LINE2;
                pg.r rVar3 = xmlCheckoutAddressFragment.f8936k;
                if (rVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar3;
                }
                xmlCheckoutAddressFragment.E(addressField2, rVar.f35091c);
                break;
            case 7:
                AddressField addressField3 = AddressField.STREET_NAME;
                pg.r rVar4 = xmlCheckoutAddressFragment.f8936k;
                if (rVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar4;
                }
                xmlCheckoutAddressFragment.E(addressField3, rVar.f35090b);
                break;
            case 8:
                AddressField addressField4 = AddressField.HOUSE_NUMBER;
                pg.r rVar5 = xmlCheckoutAddressFragment.f8936k;
                if (rVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar5;
                }
                xmlCheckoutAddressFragment.E(addressField4, rVar.f35112y);
                break;
            case 9:
                AddressField addressField5 = AddressField.HOUSE_NUMBER_ADDITION;
                pg.r rVar6 = xmlCheckoutAddressFragment.f8936k;
                if (rVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar6;
                }
                xmlCheckoutAddressFragment.E(addressField5, rVar.f35111x);
                break;
            case 10:
                AddressField addressField6 = AddressField.POSTAL_CODE;
                pg.r rVar7 = xmlCheckoutAddressFragment.f8936k;
                if (rVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar7;
                }
                xmlCheckoutAddressFragment.E(addressField6, rVar.C);
                break;
            case 11:
                AddressField addressField7 = AddressField.CITY;
                pg.r rVar8 = xmlCheckoutAddressFragment.f8936k;
                if (rVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rVar = rVar8;
                }
                xmlCheckoutAddressFragment.E(addressField7, rVar.f35097i);
                break;
            case 12:
                xmlCheckoutAddressFragment.I();
                break;
            case 14:
                xmlCheckoutAddressFragment.D();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
