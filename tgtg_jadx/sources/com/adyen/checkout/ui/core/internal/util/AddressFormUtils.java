package com.adyen.checkout.ui.core.internal.util;

import com.adyen.checkout.components.core.Address;
import com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate;
import com.adyen.checkout.ui.core.internal.data.model.AddressItem;
import com.adyen.checkout.ui.core.internal.ui.AddressFormUIState;
import com.adyen.checkout.ui.core.internal.ui.model.AddressListItem;
import com.adyen.checkout.ui.core.internal.ui.model.AddressOutputData;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import e40.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0002J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004¨\u0006 "}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/AddressFormUtils;", "", "()V", "getInitialCountryCode", "", "shopperLocale", "Ljava/util/Locale;", "addressParams", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams$FullAddress;", "initializeCountryOptions", "", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressListItem;", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "countryList", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;", "initializeStateOptions", "stateList", "isAddressRequired", "", "addressFormUIState", "Lcom/adyen/checkout/ui/core/internal/ui/AddressFormUIState;", "makeAddressData", "Lcom/adyen/checkout/components/core/Address;", "addressOutputData", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressOutputData;", "makeHouseNumberOrName", "houseNumberOrName", "apartmentSuite", "mapToListItem", DefaultIssuerListDelegate.ANALYTICS_TARGET, "markAddressListItemSelected", "code", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddressFormUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressFormUtils.kt\ncom/adyen/checkout/ui/core/internal/util/AddressFormUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1755#2,3:191\n1557#2:194\n1628#2,3:195\n1557#2:198\n1628#2,3:199\n774#2:202\n865#2:203\n1755#2,3:204\n866#2:207\n774#2:209\n865#2,2:210\n1557#2:212\n1628#2,3:213\n1#3:208\n*S KotlinDebug\n*F\n+ 1 AddressFormUtils.kt\ncom/adyen/checkout/ui/core/internal/util/AddressFormUtils\n*L\n32#1:191,3\n33#1:194\n33#1:195,3\n37#1:198\n37#1:199,3\n64#1:202\n64#1:203\n65#1:204,3\n64#1:207\n169#1:209\n169#1:210,2\n181#1:212\n181#1:213,3\n*E\n"})
public final class AddressFormUtils {

    @NotNull
    public static final AddressFormUtils INSTANCE = new AddressFormUtils();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressFormUIState.values().length];
            try {
                iArr[AddressFormUIState.FULL_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressFormUIState.LOOKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressFormUIState.POSTAL_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddressFormUIState.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AddressFormUtils() {
    }

    private final String getInitialCountryCode(Locale shopperLocale, AddressParams.FullAddress addressParams) {
        String defaultCountryCode = addressParams.getDefaultCountryCode();
        if (defaultCountryCode != null) {
            return defaultCountryCode;
        }
        String country = shopperLocale.getCountry();
        return country == null ? "" : country;
    }

    private final List<AddressListItem> mapToListItem(List<AddressItem> list) {
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        for (AddressItem addressItem : list) {
            String name = addressItem.getName();
            String str = "";
            if (name == null) {
                name = "";
            }
            String id2 = addressItem.getId();
            if (id2 != null) {
                str = id2;
            }
            arrayList.add(new AddressListItem(name, str, false));
        }
        return arrayList;
    }

    public static /* synthetic */ List markAddressListItemSelected$default(AddressFormUtils addressFormUtils, List list, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return addressFormUtils.markAddressListItemSelected(list, str);
    }

    @NotNull
    public final List<AddressListItem> initializeCountryOptions(@NotNull Locale shopperLocale, @Nullable AddressParams addressParams, @NotNull List<AddressItem> countryList) {
        shopperLocale.getClass();
        countryList.getClass();
        if (!(addressParams instanceof AddressParams.FullAddress)) {
            return addressParams instanceof AddressParams.Lookup ? mapToListItem(countryList) : n0.f26529a;
        }
        AddressParams.FullAddress fullAddress = (AddressParams.FullAddress) addressParams;
        if (!fullAddress.getSupportedCountryCodes().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : countryList) {
                AddressItem addressItem = (AddressItem) obj;
                List<String> supportedCountryCodes = fullAddress.getSupportedCountryCodes();
                if (supportedCountryCodes == null || !supportedCountryCodes.isEmpty()) {
                    Iterator<T> it = supportedCountryCodes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (Intrinsics.areEqual((String) it.next(), addressItem.getId())) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            countryList = arrayList;
        }
        return markAddressListItemSelected(mapToListItem(countryList), getInitialCountryCode(shopperLocale, fullAddress));
    }

    @NotNull
    public final List<AddressListItem> initializeStateOptions(@NotNull List<AddressItem> stateList) {
        stateList.getClass();
        return markAddressListItemSelected$default(this, mapToListItem(stateList), null, 2, null);
    }

    public final boolean isAddressRequired(@NotNull AddressFormUIState addressFormUIState) {
        addressFormUIState.getClass();
        return addressFormUIState != AddressFormUIState.NONE;
    }

    @Nullable
    public final Address makeAddressData(@NotNull AddressOutputData addressOutputData, @NotNull AddressFormUIState addressFormUIState) {
        addressOutputData.getClass();
        addressFormUIState.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[addressFormUIState.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                return new Address(Address.ADDRESS_NULL_PLACEHOLDER, Address.ADDRESS_COUNTRY_NULL_PLACEHOLDER, Address.ADDRESS_NULL_PLACEHOLDER, addressOutputData.getPostalCode().getValue(), Address.ADDRESS_NULL_PLACEHOLDER, Address.ADDRESS_NULL_PLACEHOLDER);
            }
            if (i11 == 4) {
                return null;
            }
            a.f();
            return null;
        }
        String value = addressOutputData.getPostalCode().getValue();
        int length = value.length();
        String str = Address.ADDRESS_NULL_PLACEHOLDER;
        if (length == 0) {
            value = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String str2 = value;
        String value2 = addressOutputData.getStreet().getValue();
        if (value2.length() == 0) {
            value2 = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String str3 = value2;
        String value3 = addressOutputData.getStateOrProvince().getValue();
        if (value3.length() == 0) {
            value3 = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String str4 = value3;
        String strMakeHouseNumberOrName = makeHouseNumberOrName(addressOutputData.getHouseNumberOrName().getValue(), addressOutputData.getApartmentSuite().getValue());
        String str5 = strMakeHouseNumberOrName.length() == 0 ? Address.ADDRESS_NULL_PLACEHOLDER : strMakeHouseNumberOrName;
        String value4 = addressOutputData.getCity().getValue();
        if (value4.length() != 0) {
            str = value4;
        }
        return new Address(str, addressOutputData.getCountry().getValue(), str5, str2, str4, str3);
    }

    @NotNull
    public final String makeHouseNumberOrName(@NotNull String houseNumberOrName, @NotNull String apartmentSuite) {
        houseNumberOrName.getClass();
        apartmentSuite.getClass();
        List listH = d0.h(houseNumberOrName, apartmentSuite);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.U(arrayList, " ", null, null, null, 62);
    }

    @NotNull
    public final List<AddressListItem> markAddressListItemSelected(@NotNull List<AddressListItem> list, @Nullable String code) {
        list.getClass();
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(((AddressListItem) it.next()).getCode(), code)) {
                    if (code != null && code.length() > 0) {
                        ArrayList arrayList = new ArrayList(e0.o(list, 10));
                        for (AddressListItem addressListItem : list) {
                            arrayList.add(AddressListItem.copy$default(addressListItem, null, null, Intrinsics.areEqual(addressListItem.getCode(), code), 3, null));
                        }
                        return arrayList;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.o(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AddressListItem.copy$default((AddressListItem) it2.next(), null, null, false, 3, null));
        }
        return arrayList2;
    }
}
