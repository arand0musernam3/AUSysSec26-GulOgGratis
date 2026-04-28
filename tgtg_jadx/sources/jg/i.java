package jg;

import com.app.tgtg.model.remote.ServerKeyboardTypes;
import com.app.tgtg.model.remote.user.response.AddressField;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[AddressField.values().length];
        try {
            iArr[AddressField.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressField.ADDRESS_LINE1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddressField.ADDRESS_LINE2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AddressField.STREET_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AddressField.HOUSE_NUMBER_ADDITION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AddressField.CITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AddressField.STATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AddressField.DELIVERY_ACCESS_CODE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AddressField.DELIVERY_INSTRUCTIONS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ServerKeyboardTypes.values().length];
        try {
            iArr2[ServerKeyboardTypes.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ServerKeyboardTypes.ONLY_DIGITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ServerKeyboardTypes.EMAIL_ADDRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ServerKeyboardTypes.ALL_CAPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[c.values().length];
        try {
            iArr3[c.DK.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[c.NL.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[c.BE.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[c.AT.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[c.DE.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[c.IT.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[c.ES.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[c.PT.ordinal()] = 8;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[c.FR.ordinal()] = 9;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[c.GB.ordinal()] = 10;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[c.PL.ordinal()] = 11;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[c.US.ordinal()] = 12;
        } catch (NoSuchFieldError unused25) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[e.values().length];
        try {
            iArr4[e.TextCapSentences.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[e.TextEmailAddress.ordinal()] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[e.Number.ordinal()] = 3;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[e.Phone.ordinal()] = 4;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[e.Text.ordinal()] = 5;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[e.TextNoSuggestions.ordinal()] = 6;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr4[e.TextAllCaps.ordinal()] = 7;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr4[e.TextMultiLine.ordinal()] = 8;
        } catch (NoSuchFieldError unused33) {
        }
        $EnumSwitchMapping$3 = iArr4;
    }
}
