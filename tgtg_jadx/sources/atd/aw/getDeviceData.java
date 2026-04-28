package atd.aw;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import atd.av.getDeviceData;
import atd.av.getSDKTransactionID;
import atd.d.getAdditionalDetails;
import com.adyen.threeds2.R;
import com.adyen.threeds2.customization.ButtonCustomization;
import com.adyen.threeds2.customization.Customization;
import com.adyen.threeds2.customization.ExpandableInfoCustomization;
import com.adyen.threeds2.customization.LabelCustomization;
import com.adyen.threeds2.customization.ScreenCustomization;
import com.adyen.threeds2.customization.SelectionItemCustomization;
import com.adyen.threeds2.customization.TextBoxCustomization;
import com.adyen.threeds2.customization.ToolbarCustomization;
import com.adyen.threeds2.customization.UiCustomization;
import com.adyen.threeds2.internal.ui.activity.ChallengeActivity;
import com.app.tgtg.model.local.AppConstants;
import org.bouncycastle.iana.AEADAlgorithm;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData {
    private static int getSDKAppID = 1;
    private static int getSDKTransactionID;
    private final UiCustomization getDeviceData;

    /* JADX INFO: renamed from: atd.aw.getDeviceData$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AuthenticationRequestParameters;
        private static int getSDKAppID = 0;
        private static int getSDKReferenceNumber = 1;

        static {
            int[] iArr = new int[getDeviceData.EnumC0003getDeviceData.values().length];
            AuthenticationRequestParameters = iArr;
            try {
                iArr[getDeviceData.EnumC0003getDeviceData.HORIZONTAL.ordinal()] = 1;
                int i11 = getSDKReferenceNumber;
                getSDKAppID = (((i11 | AppConstants.RESULT_CODE_ORDER_CANCELLED) << 1) - (((~i11) & AppConstants.RESULT_CODE_ORDER_CANCELLED) | (i11 & (-124)))) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AuthenticationRequestParameters[getDeviceData.EnumC0003getDeviceData.VERTICAL.ordinal()] = 2;
                int i12 = getSDKReferenceNumber + 19;
                getSDKAppID = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public getDeviceData(UiCustomization uiCustomization) {
        this.getDeviceData = uiCustomization;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        CompoundButton compoundButton = (CompoundButton) objArr[1];
        int i11 = getSDKTransactionID;
        int i12 = i11 & 101;
        int i13 = (i11 ^ 101) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        getSDKAppID = i14 % 128;
        if (i14 % 2 == 0) {
            getdevicedata.getDeviceData.getSelectionItemCustomization();
            throw null;
        }
        SelectionItemCustomization selectionItemCustomization = getdevicedata.getDeviceData.getSelectionItemCustomization();
        if (selectionItemCustomization == null) {
            int i15 = getSDKTransactionID;
            int i16 = i15 & 7;
            int i17 = -(-((i15 ^ 7) | i16));
            getSDKAppID = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
            return null;
        }
        getSDKAppID = (getSDKTransactionID + 125) % 128;
        Integer hexColorCode = Customization.parseHexColorCode(selectionItemCustomization.getSelectionIndicatorTintColor());
        if (hexColorCode != null) {
            int i18 = getSDKTransactionID;
            int i19 = i18 & 55;
            int i21 = (i19 - (~(-(-((i18 ^ 55) | i19))))) - 1;
            getSDKAppID = i21 % 128;
            if (i21 % 2 == 0) {
                compoundButton.setButtonTintList(ColorStateList.valueOf(hexColorCode.intValue()));
                throw null;
            }
            compoundButton.setButtonTintList(ColorStateList.valueOf(hexColorCode.intValue()));
        }
        int i22 = getSDKAppID;
        int i23 = i22 & 35;
        int i24 = (((i22 | 35) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
        getSDKTransactionID = i24 % 128;
        if (i24 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object BuildConfig(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        atd.av.getDeviceData getdevicedata2 = (atd.av.getDeviceData) objArr[1];
        int i11 = getSDKAppID;
        int i12 = (i11 & (-36)) | ((~i11) & 35);
        int i13 = (i11 & 35) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        getSDKTransactionID = i14 % 128;
        if (i14 % 2 != 0) {
            getdevicedata2.getId();
            throw null;
        }
        int id2 = getdevicedata2.getId();
        if (id2 == R.id.dividerView_info) {
            ExpandableInfoCustomization expandableInfoCustomization = getdevicedata.getDeviceData.getExpandableInfoCustomization();
            if (expandableInfoCustomization != null) {
                int i15 = getSDKAppID;
                int i16 = (((i15 & (-96)) | ((~i15) & 95)) - (~(-(-((i15 & 95) << 1))))) - 1;
                getSDKTransactionID = i16 % 128;
                if (i16 % 2 != 0) {
                    Object[] objArr2 = {getdevicedata2, expandableInfoCustomization.getBorderColor(), Integer.valueOf(expandableInfoCustomization.getBorderWidth())};
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr2, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1019588951, 1019588954, ChallengeActivity.AnonymousClass4.getDeviceData());
                    throw null;
                }
                Object[] objArr3 = {getdevicedata2, expandableInfoCustomization.getBorderColor(), Integer.valueOf(expandableInfoCustomization.getBorderWidth())};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr3, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1019588951, 1019588954, ChallengeActivity.AnonymousClass4.getDeviceData());
            }
            int i17 = getSDKTransactionID;
            int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
            getSDKAppID = i18 % 128;
            if (i18 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (id2 == R.id.dividerView_select) {
            int i19 = getSDKAppID;
            getSDKTransactionID = (((i19 & (-72)) | ((~i19) & 71)) + ((i19 & 71) << 1)) % 128;
            SelectionItemCustomization selectionItemCustomization = getdevicedata.getDeviceData.getSelectionItemCustomization();
            if (selectionItemCustomization != null) {
                getSDKTransactionID = (getSDKAppID + 55) % 128;
                Object[] objArr4 = {getdevicedata2, selectionItemCustomization.getBorderColor(), Integer.valueOf(selectionItemCustomization.getBorderWidth())};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr4, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1019588951, 1019588954, ChallengeActivity.AnonymousClass4.getDeviceData());
                int i21 = getSDKTransactionID;
                int i22 = i21 & 91;
                getSDKAppID = a0.d(i22, ~(-(-((i21 ^ 91) | i22))), 1, 128);
            }
            int i23 = getSDKTransactionID;
            int i24 = i23 & 57;
            int i25 = (i23 ^ 57) | i24;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            getSDKAppID = i26 % 128;
            if (i26 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (id2 == R.id.dividerView_logos) {
            int i27 = getSDKAppID;
            getSDKTransactionID = ((-2) - (((i27 ^ 32) + ((i27 & 32) << 1)) ^ (-1))) % 128;
            ExpandableInfoCustomization expandableInfoCustomization2 = getdevicedata.getDeviceData.getExpandableInfoCustomization();
            if (expandableInfoCustomization2 != null) {
                int i28 = getSDKAppID;
                int i29 = ((i28 & (-114)) | ((~i28) & 113)) + ((i28 & 113) << 1);
                getSDKTransactionID = i29 % 128;
                if (i29 % 2 != 0) {
                    Object[] objArr5 = {getdevicedata2, expandableInfoCustomization2.getBorderColor(), Integer.valueOf(expandableInfoCustomization2.getBorderWidth())};
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr5, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1019588951, 1019588954, ChallengeActivity.AnonymousClass4.getDeviceData());
                    int i31 = 84 / 0;
                } else {
                    Object[] objArr6 = {getdevicedata2, expandableInfoCustomization2.getBorderColor(), Integer.valueOf(expandableInfoCustomization2.getBorderWidth())};
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr6, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1019588951, 1019588954, ChallengeActivity.AnonymousClass4.getDeviceData());
                }
                int i32 = getSDKTransactionID;
                getSDKAppID = k.c(i32 ^ 122, (i32 & 122) << 1, 1, 128);
            }
        }
        int i33 = getSDKTransactionID;
        int i34 = (-2) - (((i33 & 74) + (i33 | 74)) ^ (-1));
        getSDKAppID = i34 % 128;
        if (i34 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r10 = ((r8 | 71) << 1) - (r8 ^ 71);
        r11 = r10 % 128;
        atd.aw.getDeviceData.getSDKAppID = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if ((r10 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if ((r3 instanceof android.graphics.drawable.RippleDrawable) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if ((r3 instanceof android.graphics.drawable.InsetDrawable) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        atd.aw.getDeviceData.getSDKTransactionID = ((r11 & 113) + (r11 | 113)) % 128;
        getSDKAppID(com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), new java.lang.Object[]{r1, ((android.graphics.drawable.InsetDrawable) r3).getDrawable(), r5}, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), -1376657846, 1376657861, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData());
        r0 = atd.aw.getDeviceData.getSDKAppID;
        r1 = (r0 & 79) + (r0 | 79);
        atd.aw.getDeviceData.getSDKTransactionID = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if ((!(r3 instanceof android.graphics.drawable.ColorDrawable)) == true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        atd.aw.getDeviceData.getSDKAppID = w.a0.d(r8 & 113, ~(r8 | 113), 1, 128);
        r3 = (android.graphics.drawable.ColorDrawable) r3;
        r3.setTint(r5.intValue());
        r3.setColor(r5.intValue());
        r0 = atd.aw.getDeviceData.getSDKTransactionID;
        r1 = ((r0 ^ 93) | (r0 & 93)) << 1;
        r0 = -(((~r0) & 93) | (r0 & (-94)));
        atd.aw.getDeviceData.getSDKAppID = ((r1 ^ r0) + ((r0 & r1) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        r3.setColorFilter(r5.intValue(), android.graphics.PorterDuff.Mode.SRC_IN);
        r0 = atd.aw.getDeviceData.getSDKAppID + 40;
        r1 = (r0 ^ (-1)) + (r0 << 1);
        atd.aw.getDeviceData.getSDKTransactionID = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e8, code lost:
    
        r3 = (android.graphics.drawable.RippleDrawable) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        if (r6 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ec, code lost:
    
        r6 = r11 & 111;
        r8 = -(-((r11 ^ 111) | r6));
        atd.aw.getDeviceData.getSDKTransactionID = ((r6 ^ r8) + ((r6 & r8) << 1)) % 128;
        r3.setColor(android.content.res.ColorStateList.valueOf(r5.intValue()));
        r6 = atd.aw.getDeviceData.getSDKAppID;
        atd.aw.getDeviceData.getSDKTransactionID = ((-2) - (((r6 ^ 68) + ((r6 & 68) << 1)) ^ (-1))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0119, code lost:
    
        if (r3.getNumberOfLayers() <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011b, code lost:
    
        r6 = atd.aw.getDeviceData.getSDKAppID;
        r8 = (((r6 & (-12)) | ((~r6) & 11)) - (~((r6 & 11) << 1))) - 1;
        atd.aw.getDeviceData.getSDKTransactionID = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012e, code lost:
    
        if ((r8 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0130, code lost:
    
        r0 = r3.getDrawable(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0135, code lost:
    
        r0 = r3.getDrawable(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013a, code lost:
    
        r0 = atd.aw.getDeviceData.getSDKAppID;
        r3 = (r0 | 51) << 1;
        r0 = -(((~r0) & 51) | (r0 & (-52)));
        atd.aw.getDeviceData.getSDKTransactionID = (((r3 | r0) << 1) - (r0 ^ r3)) % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0150, code lost:
    
        getSDKAppID(com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), new java.lang.Object[]{r1, r0, r5}, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), -1376657846, 1376657861, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData());
        r0 = atd.aw.getDeviceData.getSDKAppID;
        r1 = (r0 ^ 96) + ((r0 & 96) << 1);
        atd.aw.getDeviceData.getSDKTransactionID = ((r1 ^ (-1)) + (r1 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r5 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r5 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object ChallengeResult(java.lang.Object[] r17) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aw.getDeviceData.ChallengeResult(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object ChallengeResultCancelled(Object[] objArr) {
        TextView textView = (TextView) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i11 = getSDKAppID;
        int i12 = i11 & 67;
        int i13 = i12 + ((i11 ^ 67) | i12);
        getSDKTransactionID = i13 % 128;
        if (i13 % 2 != 0) {
            Customization.parseHexColorCode(str);
            throw null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(str);
        if (hexColorCode != null) {
            textView.setTextColor(hexColorCode.intValue());
            int i14 = getSDKAppID;
            int i15 = i14 & 99;
            int i16 = (i14 | 99) & (~i15);
            int i17 = -(-(i15 << 1));
            getSDKTransactionID = (((i16 | i17) << 1) - (i16 ^ i17)) % 128;
        }
        Typeface typeface = Customization.parseTypeface(textView.getContext(), str2);
        if (typeface != null) {
            int i18 = getSDKTransactionID;
            int i19 = i18 ^ 109;
            int i21 = (i18 & 109) << 1;
            int i22 = (i19 ^ i21) + ((i21 & i19) << 1);
            getSDKAppID = i22 % 128;
            if (i22 % 2 == 0) {
                textView.setTypeface(typeface);
                throw null;
            }
            textView.setTypeface(typeface);
            int i23 = getSDKAppID;
            getSDKTransactionID = a0.d((i23 | 100) << 1, i23 ^ 100, 1, 128);
        }
        if (iIntValue > 0) {
            int i24 = getSDKAppID;
            int i25 = i24 & 81;
            int i26 = (i24 | 81) & (~i25);
            int i27 = i25 << 1;
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            getSDKTransactionID = i28 % 128;
            if (i28 % 2 != 0) {
                textView.setTextSize(iIntValue);
                int i29 = 34 / 0;
            } else {
                textView.setTextSize(iIntValue);
            }
        }
        int i31 = getSDKTransactionID;
        int i32 = i31 & 71;
        int i33 = (((i31 | 71) & (~i32)) - (~(i32 << 1))) - 1;
        getSDKAppID = i33 % 128;
        if (i33 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object ChallengeResultCompleted(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        Button button = (Button) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = getSDKTransactionID;
        int i12 = (i11 + 55) % 128;
        getSDKAppID = i12;
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Borderless_Cancel) {
            int i13 = (((i11 ^ 97) | (i11 & 97)) << 1) - ((i11 & (-98)) | ((~i11) & 97));
            getSDKAppID = i13 % 128;
            if (i13 % 2 != 0) {
                Object[] objArr2 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.CANCEL)};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr2, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1798054785, -1798054784, ChallengeActivity.AnonymousClass4.getDeviceData());
                return null;
            }
            Object[] objArr3 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.CANCEL)};
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr3, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1798054785, -1798054784, ChallengeActivity.AnonymousClass4.getDeviceData());
            throw null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Borderless_Resend) {
            int i14 = ((i12 ^ 13) | (i12 & 13)) << 1;
            int i15 = -((i12 & (-14)) | ((~i12) & 13));
            int i16 = (i14 & i15) + (i14 | i15);
            getSDKTransactionID = i16 % 128;
            if (i16 % 2 != 0) {
                Object[] objArr4 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.RESEND)};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr4, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1798054785, -1798054784, ChallengeActivity.AnonymousClass4.getDeviceData());
                int i17 = 94 / 0;
            } else {
                Object[] objArr5 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.RESEND)};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr5, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1798054785, -1798054784, ChallengeActivity.AnonymousClass4.getDeviceData());
            }
            getSDKAppID = (getSDKTransactionID + 41) % 128;
            return null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Colored_Verify) {
            int i18 = (i11 & 42) + (i11 | 42);
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            getSDKAppID = i19 % 128;
            if (i19 % 2 == 0) {
                Object[] objArr6 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.VERIFY)};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr6, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1308149249, 1308149251, ChallengeActivity.AnonymousClass4.getDeviceData());
                int i21 = 51 / 0;
            } else {
                Object[] objArr7 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.VERIFY)};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr7, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1308149249, 1308149251, ChallengeActivity.AnonymousClass4.getDeviceData());
            }
            return null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Colored_Continue) {
            int i22 = i11 & 93;
            int i23 = ((~i22) & (i11 | 93)) + (i22 << 1);
            getSDKAppID = i23 % 128;
            if (i23 % 2 != 0) {
                Object[] objArr8 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.CONTINUE)};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr8, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1308149249, 1308149251, ChallengeActivity.AnonymousClass4.getDeviceData());
                return null;
            }
            Object[] objArr9 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.CONTINUE)};
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr9, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1308149249, 1308149251, ChallengeActivity.AnonymousClass4.getDeviceData());
            throw null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Colored_Next) {
            ChallengeActivity.AnonymousClass4.getDeviceData();
            System.identityHashCode(getdevicedata);
            Object[] objArr10 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.NEXT)};
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr10, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1308149249, 1308149251, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i24 = getSDKTransactionID;
            int i25 = i24 & 93;
            int i26 = ((i24 ^ 93) | i25) << 1;
            int i27 = -((i24 | 93) & (~i25));
            getSDKAppID = ((i26 & i27) + (i27 | i26)) % 128;
            return null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_Button_Borderless_OutOfBand) {
            getSDKTransactionID = (i12 + 31) % 128;
            Object[] objArr11 = {getdevicedata, button, getdevicedata.getDeviceData.getButtonCustomization(UiCustomization.ButtonType.OPEN_OOB_APP)};
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr11, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1308149249, 1308149251, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i28 = getSDKAppID;
            int i29 = i28 & 39;
            int i31 = -(-((i28 ^ 39) | i29));
            getSDKTransactionID = ((i29 ^ i31) + ((i31 & i29) << 1)) % 128;
        }
        int i32 = getSDKTransactionID;
        getSDKAppID = ((i32 ^ 17) + ((i32 & 17) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ Object ChallengeResultError(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        ProgressBar progressBar = (ProgressBar) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = getSDKTransactionID;
        int i12 = i11 ^ 59;
        int i13 = -(-((i11 & 59) << 1));
        getSDKAppID = (((i12 | i13) << 1) - (i12 ^ i13)) % 128;
        if (iIntValue == R.style.Widget_ThreeDS2_ProgressBar) {
            int i14 = (i11 ^ 61) + ((i11 & 61) << 1);
            getSDKAppID = i14 % 128;
            if (i14 % 2 == 0) {
                getdevicedata.getDeviceData.getToolbarCustomization();
                throw null;
            }
            ToolbarCustomization toolbarCustomization = getdevicedata.getDeviceData.getToolbarCustomization();
            if (toolbarCustomization == null) {
                int i15 = getSDKAppID;
                int i16 = i15 & 59;
                int i17 = (i15 ^ 59) | i16;
                getSDKTransactionID = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
                return null;
            }
            Integer hexColorCode = Customization.parseHexColorCode(toolbarCustomization.getBackgroundColor());
            if (hexColorCode != null) {
                int i18 = getSDKAppID;
                int i19 = i18 & 93;
                int i21 = -(-((i18 ^ 93) | i19));
                int i22 = (i19 ^ i21) + ((i21 & i19) << 1);
                getSDKTransactionID = i22 % 128;
                if (i22 % 2 != 0) {
                    Object[] objArr2 = {getdevicedata, progressBar.getIndeterminateDrawable(), hexColorCode};
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr2, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1376657846, 1376657861, ChallengeActivity.AnonymousClass4.getDeviceData());
                    throw null;
                }
                Object[] objArr3 = {getdevicedata, progressBar.getIndeterminateDrawable(), hexColorCode};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr3, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1376657846, 1376657861, ChallengeActivity.AnonymousClass4.getDeviceData());
            }
        }
        int i23 = getSDKTransactionID + 53;
        getSDKAppID = i23 % 128;
        if (i23 % 2 == 0) {
            int i24 = 33 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object ChallengeResultTimeout(Object[] objArr) {
        int i11;
        int i12;
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[1];
        int i13 = getSDKAppID;
        int i14 = (i13 & (-82)) | ((~i13) & 81);
        int i15 = (i13 & 81) << 1;
        int i16 = (i14 & i15) + (i15 | i14);
        getSDKTransactionID = i16 % 128;
        if (i16 % 2 != 0) {
            getdevicedata.getDeviceData.getExpandableInfoCustomization();
            throw null;
        }
        ExpandableInfoCustomization expandableInfoCustomization = getdevicedata.getDeviceData.getExpandableInfoCustomization();
        if (expandableInfoCustomization == null) {
            int i17 = getSDKTransactionID;
            int i18 = i17 ^ 33;
            int i19 = (i17 & 33) << 1;
            i11 = i18 ^ i19;
            i12 = (i19 & i18) << 1;
        } else {
            Integer hexColorCode = Customization.parseHexColorCode(expandableInfoCustomization.getHighlightedBackgroundColor());
            if (hexColorCode != null) {
                int i21 = getSDKAppID;
                int i22 = i21 & 31;
                int i23 = (i21 | 31) & (~i22);
                int i24 = i22 << 1;
                int i25 = (i23 & i24) + (i23 | i24);
                getSDKTransactionID = i25 % 128;
                if (i25 % 2 != 0) {
                    getsdktransactionid.setHeaderBackgroundColor(hexColorCode.intValue());
                    int i26 = 67 / 0;
                } else {
                    getsdktransactionid.setHeaderBackgroundColor(hexColorCode.intValue());
                }
                getSDKAppID = (getSDKTransactionID + 63) % 128;
            }
            Integer hexColorCode2 = Customization.parseHexColorCode(expandableInfoCustomization.getExpandedStateIndicatorColor());
            if (hexColorCode2 != null) {
                int i27 = getSDKAppID;
                int i28 = i27 ^ 13;
                int i29 = -(-((i27 & 13) << 1));
                int i31 = (i28 ^ i29) + ((i29 & i28) << 1);
                getSDKTransactionID = i31 % 128;
                if (i31 % 2 != 0) {
                    getsdktransactionid.setStateIndicatorColor(hexColorCode2.intValue());
                    throw null;
                }
                getsdktransactionid.setStateIndicatorColor(hexColorCode2.intValue());
            }
            int i32 = getSDKTransactionID;
            int i33 = i32 & 117;
            int i34 = (i32 ^ 117) | i33;
            i11 = i33 & i34;
            i12 = i34 | i33;
        }
        getSDKAppID = (i11 + i12) % 128;
        return null;
    }

    private static /* synthetic */ Object ChallengeStatusHandler(Object[] objArr) {
        TextView textView = (TextView) objArr[0];
        Customization customization = (Customization) objArr[1];
        int i11 = getSDKAppID;
        int i12 = ((((i11 ^ 21) | (i11 & 21)) << 1) - (~(-(((~i11) & 21) | (i11 & (-22)))))) - 1;
        int i13 = i12 % 128;
        getSDKTransactionID = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (customization == null) {
            int i14 = ((i13 & (-52)) | ((~i13) & 51)) + ((i13 & 51) << 1);
            getSDKAppID = i14 % 128;
            if (i14 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Object[] objArr2 = {textView, customization.getTextColor(), customization.getTextFontName(), Integer.valueOf(customization.getTextFontSize())};
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr2, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 130234608, -130234599, ChallengeActivity.AnonymousClass4.getDeviceData());
        int i15 = getSDKTransactionID;
        int i16 = i15 & 77;
        int i17 = ((i15 ^ 77) | i16) << 1;
        int i18 = -((i15 | 77) & (~i16));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        getSDKAppID = i19 % 128;
        if (i19 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object completed(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        atd.av.AuthenticationRequestParameters authenticationRequestParameters = (atd.av.AuthenticationRequestParameters) objArr[1];
        int i11 = getSDKTransactionID;
        int i12 = i11 ^ 13;
        int i13 = (i11 & 13) << 1;
        getSDKAppID = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        ToolbarCustomization toolbarCustomization = getdevicedata.getDeviceData.getToolbarCustomization();
        if (toolbarCustomization == null) {
            int i14 = getSDKTransactionID;
            int i15 = (i14 | 91) << 1;
            int i16 = -(((~i14) & 91) | (i14 & (-92)));
            getSDKAppID = ((i15 & i16) + (i16 | i15)) % 128;
            return null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(toolbarCustomization.getBackgroundColor());
        if (hexColorCode != null) {
            int i17 = getSDKTransactionID;
            int i18 = ((i17 ^ 95) | (i17 & 95)) << 1;
            int i19 = -(((~i17) & 95) | (i17 & (-96)));
            getSDKAppID = ((i18 & i19) + (i19 | i18)) % 128;
            authenticationRequestParameters.setBackgroundColor(hexColorCode.intValue());
            getSDKAppID = ((-2) - ((getSDKTransactionID + 84) ^ (-1))) % 128;
        }
        String headerText = toolbarCustomization.getHeaderText();
        if (!TextUtils.isEmpty(headerText)) {
            int i21 = getSDKAppID + 103;
            getSDKTransactionID = i21 % 128;
            if (i21 % 2 != 0) {
                authenticationRequestParameters.setTitle(headerText);
                throw null;
            }
            authenticationRequestParameters.setTitle(headerText);
        }
        String buttonText = toolbarCustomization.getButtonText();
        if (!TextUtils.isEmpty(buttonText)) {
            int i22 = getSDKAppID;
            int i23 = ((i22 & 70) + (i22 | 70)) - 1;
            getSDKTransactionID = i23 % 128;
            if (i23 % 2 != 0) {
                authenticationRequestParameters.setCancelButtonText(buttonText);
                throw null;
            }
            authenticationRequestParameters.setCancelButtonText(buttonText);
            int i24 = getSDKTransactionID;
            int i25 = i24 ^ 101;
            int i26 = -(-((i24 & 101) << 1));
            getSDKAppID = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
        }
        Integer hexColorCode2 = Customization.parseHexColorCode(toolbarCustomization.getTextColor());
        if (hexColorCode2 != null) {
            int i27 = getSDKAppID;
            int i28 = i27 & 47;
            int i29 = ((i27 ^ 47) | i28) << 1;
            int i31 = -((i27 | 47) & (~i28));
            getSDKTransactionID = ((i29 ^ i31) + ((i31 & i29) << 1)) % 128;
            authenticationRequestParameters.setTitleTextColor(hexColorCode2.intValue());
            authenticationRequestParameters.setCancelButtonTextColor(hexColorCode2.intValue());
            int i32 = getSDKAppID;
            int i33 = (i32 | 49) << 1;
            int i34 = -(((~i32) & 49) | (i32 & (-50)));
            getSDKTransactionID = (((i33 | i34) << 1) - (i34 ^ i33)) % 128;
        }
        Typeface typeface = Customization.parseTypeface(authenticationRequestParameters.getContext(), toolbarCustomization.getTextFontName());
        if (typeface != null) {
            int i35 = getSDKAppID;
            int i36 = ((i35 ^ 63) | (i35 & 63)) << 1;
            int i37 = -(((~i35) & 63) | (i35 & (-64)));
            getSDKTransactionID = (((i36 | i37) << 1) - (i37 ^ i36)) % 128;
            authenticationRequestParameters.setTitleTypeface(typeface);
            authenticationRequestParameters.setCancelButtonTextTypeface(typeface);
            int i38 = getSDKTransactionID;
            getSDKAppID = (((i38 & (-72)) | ((~i38) & 71)) + ((i38 & 71) << 1)) % 128;
        }
        int textFontSize = toolbarCustomization.getTextFontSize();
        if (textFontSize > 0) {
            int i39 = getSDKAppID;
            getSDKTransactionID = a0.d((i39 | 13) << 1, ~(-(i39 ^ 13)), 1, 128);
            authenticationRequestParameters.setTitleFontSize(Integer.valueOf(textFontSize));
            int i41 = getSDKAppID;
            int i42 = i41 & 103;
            getSDKTransactionID = (((i41 | 103) & (~i42)) + (i42 << 1)) % 128;
        }
        getSDKAppID = (getSDKTransactionID + 45) % 128;
        return null;
    }

    private static /* synthetic */ Object getAdditionalDetails(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        Window window = (Window) objArr[1];
        int i11 = getSDKAppID;
        int i12 = i11 | 57;
        getSDKTransactionID = ((i12 << 1) - (i12 & (~(i11 & 57)))) % 128;
        UiCustomization uiCustomization = getdevicedata.getDeviceData;
        if (uiCustomization == null) {
            getSDKTransactionID = a0.d(i11 & 99, ~(-(-(i11 | 99))), 1, 128);
            return null;
        }
        ScreenCustomization screenCustomization = uiCustomization.getScreenCustomization();
        if (screenCustomization == null) {
            int i13 = getSDKAppID;
            getSDKTransactionID = ((((i13 ^ 19) | (i13 & 19)) << 1) - (((~i13) & 19) | (i13 & (-20)))) % 128;
            return null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(screenCustomization.getBackgroundColor());
        if (hexColorCode != null) {
            ColorDrawable colorDrawable = new ColorDrawable(hexColorCode.intValue());
            int i14 = getSDKTransactionID;
            getSDKAppID = (((i14 & 60) + (i14 | 60)) - 1) % 128;
            colorDrawable.setTint(hexColorCode.intValue());
            getSDKTransactionID = (getSDKAppID + 113) % 128;
            window.setBackgroundDrawable(colorDrawable);
            int i15 = getSDKTransactionID;
            int i16 = i15 ^ 59;
            int i17 = -(-((i15 & 59) << 1));
            getSDKAppID = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
        }
        System.identityHashCode(getdevicedata);
        System.identityHashCode(getdevicedata);
        Integer hexColorCode2 = Customization.parseHexColorCode(screenCustomization.getStatusBarColor());
        if (hexColorCode2 != null) {
            int i18 = (-2) - ((getSDKAppID + 46) ^ (-1));
            getSDKTransactionID = i18 % 128;
            if (i18 % 2 != 0) {
                window.setStatusBarColor(hexColorCode2.intValue());
                throw null;
            }
            window.setStatusBarColor(hexColorCode2.intValue());
            int i19 = getSDKAppID;
            int i21 = (i19 & (-94)) | ((~i19) & 93);
            int i22 = (i19 & 93) << 1;
            getSDKTransactionID = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
        }
        int i23 = getSDKAppID;
        int i24 = ((i23 & (-6)) | ((~i23) & 5)) + ((i23 & 5) << 1);
        getSDKTransactionID = i24 % 128;
        if (i24 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        Button button = (Button) objArr[1];
        ButtonCustomization buttonCustomization = (ButtonCustomization) objArr[2];
        int i11 = getSDKAppID;
        int i12 = i11 | 57;
        int i13 = i12 << 1;
        int i14 = -((~(i11 & 57)) & i12);
        int i15 = ((i13 & i14) + (i14 | i13)) % 128;
        getSDKTransactionID = i15;
        if (buttonCustomization == null) {
            int i16 = i15 & 7;
            int i17 = -(-(i15 | 7));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            getSDKAppID = i18 % 128;
            if (i18 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Integer hexColorCode = Customization.parseHexColorCode(buttonCustomization.getBackgroundColor());
        if (hexColorCode != null) {
            int i19 = getSDKTransactionID;
            int i21 = (i19 ^ 48) + ((i19 & 48) << 1);
            getSDKAppID = ((i21 ^ (-1)) + (i21 << 1)) % 128;
            Object[] objArr2 = {getdevicedata, button.getBackground(), hexColorCode};
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr2, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1376657846, 1376657861, ChallengeActivity.AnonymousClass4.getDeviceData());
            ChallengeActivity.AnonymousClass4.getDeviceData();
            System.identityHashCode(getdevicedata);
        }
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, button, buttonCustomization}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 686365583, -686365564, ChallengeActivity.AnonymousClass4.getDeviceData());
        int i22 = getSDKTransactionID + 49;
        getSDKAppID = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 40 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        TextView textView = (TextView) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = getSDKAppID;
        int i12 = (i11 + 41) % 128;
        getSDKTransactionID = i12;
        if (iIntValue == R.style.TextAppearance_ThreeDS2_Widget_Toolbar_Title) {
            int i13 = i12 + 87;
            getSDKAppID = i13 % 128;
            if (i13 % 2 != 0) {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, getdevicedata.getDeviceData.getToolbarCustomization()}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
                return null;
            }
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, getdevicedata.getDeviceData.getToolbarCustomization()}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
            throw null;
        }
        if (iIntValue == R.style.TextAppearance_ThreeDS2_Heading) {
            getSDKAppID = ((i12 ^ 31) + ((i12 & 31) << 1)) % 128;
            LabelCustomization labelCustomization = getdevicedata.getDeviceData.getLabelCustomization();
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, labelCustomization.getHeadingTextColor(), labelCustomization.getHeadingTextFontName(), Integer.valueOf(labelCustomization.getHeadingTextFontSize())}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 130234608, -130234599, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i14 = getSDKAppID;
            int i15 = (i14 ^ 111) + ((i14 & 111) << 1);
            getSDKTransactionID = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 71 / 0;
            }
            return null;
        }
        if (iIntValue == R.style.TextAppearance_ThreeDS2_InputLabel) {
            int i17 = i12 & 25;
            int i18 = (i12 ^ 25) | i17;
            int i19 = (i17 & i18) + (i17 | i18);
            getSDKAppID = i19 % 128;
            if (i19 % 2 == 0) {
                LabelCustomization labelCustomization2 = getdevicedata.getDeviceData.getLabelCustomization();
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, labelCustomization2.getInputLabelTextColor(), labelCustomization2.getInputLabelTextFontName(), Integer.valueOf(labelCustomization2.getInputLabelTextFontSize())}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 130234608, -130234599, ChallengeActivity.AnonymousClass4.getDeviceData());
                int i21 = 48 / 0;
            } else {
                LabelCustomization labelCustomization3 = getdevicedata.getDeviceData.getLabelCustomization();
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, labelCustomization3.getInputLabelTextColor(), labelCustomization3.getInputLabelTextFontName(), Integer.valueOf(labelCustomization3.getInputLabelTextFontSize())}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 130234608, -130234599, ChallengeActivity.AnonymousClass4.getDeviceData());
            }
            return null;
        }
        if (iIntValue != R.style.TextAppearance_ThreeDS2_SelectItem_Title) {
            if (iIntValue != R.style.TextAppearance_ThreeDS2_Widget_ExpandableInfoText_Title) {
                if (iIntValue != R.style.TextAppearance_ThreeDS2_Widget_ExpandableInfoText_Info) {
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, getdevicedata.getDeviceData.getLabelCustomization()}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
                    int i22 = getSDKTransactionID;
                    int i23 = (i22 | 21) << 1;
                    int i24 = -(i22 ^ 21);
                    getSDKAppID = ((i23 ^ i24) + ((i24 & i23) << 1)) % 128;
                    return null;
                }
                int i25 = i11 ^ 67;
                int i26 = -(-((i11 & 67) << 1));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                getSDKTransactionID = i27 % 128;
                if (i27 % 2 != 0) {
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, getdevicedata.getDeviceData.getExpandableInfoCustomization()}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
                    int i28 = 49 / 0;
                } else {
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, getdevicedata.getDeviceData.getExpandableInfoCustomization()}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
                }
                return null;
            }
            int i29 = ((~iIntValue) & (-1982782204)) | (1982782203 & iIntValue);
            int i31 = (-1982782204) & iIntValue;
            int i32 = ~((i29 & i31) | (i29 ^ i31));
            int i33 = ((i32 & 160440320) | (160440320 ^ i32)) * (-196);
            int i34 = (-1877205037) & i33;
            int i35 = (((-1877205037) ^ i33) | i34) << 1;
            int i36 = -((i33 | (-1877205037)) & (~i34));
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            int i38 = i37 | (-257193160);
            int i39 = ((i38 << 1) - (~(-((~((-257193160) & i37)) & i38)))) - 1;
            int i41 = ~(((-1982782204) ^ iIntValue) | i31);
            int i42 = (-2143222524) ^ i41;
            int i43 = i41 & (-2143222524);
            int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * 196));
            int i45 = (i39 & i44) + (i44 | i39);
            int iIdentityHashCode = System.identityHashCode(getdevicedata);
            int i46 = ~iIdentityHashCode;
            int i47 = ((-1033771757) & i46) | (1033771756 & iIdentityHashCode);
            int i48 = (-1033771757) & iIdentityHashCode;
            int i49 = ~((i48 & i47) | (i47 ^ i48));
            int i51 = 480116908 & i49;
            int i52 = (i49 | 480116908) & (~i51);
            int i53 = 1798272587 - (~(((i52 & i51) | (i52 ^ i51)) * (-140)));
            int i54 = (-553654849) & iIdentityHashCode;
            int i55 = ((-553654849) | iIdentityHashCode) & (~i54);
            int i56 = -(-((~((i55 & i54) | (i55 ^ i54))) * 70));
            int i57 = ((~i56) & i53) | ((~i53) & i56);
            int i58 = (i56 & i53) << 1;
            int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
            int i61 = (iIdentityHashCode & (-555876163)) | (i46 & (-555876163)) | (555876162 & iIdentityHashCode);
            int i62 = (i61 | (~i61)) & (~i61);
            int i63 = 482338222 & i62;
            int i64 = (i62 | 482338222) & (~i63);
            int i65 = ((i64 & i63) | (i64 ^ i63)) * 70;
            int i66 = i59 & i65;
            if (i45 > (i66 - (~((i65 ^ i59) | i66))) - 1) {
                ExpandableInfoCustomization expandableInfoCustomization = getdevicedata.getDeviceData.getExpandableInfoCustomization();
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, expandableInfoCustomization.getHeadingTextColor(), expandableInfoCustomization.getHeadingTextFontName(), Integer.valueOf(expandableInfoCustomization.getHeadingTextFontSize())}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 130234608, -130234599, ChallengeActivity.AnonymousClass4.getDeviceData());
                return null;
            }
            ExpandableInfoCustomization expandableInfoCustomization2 = getdevicedata.getDeviceData.getExpandableInfoCustomization();
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, expandableInfoCustomization2.getHeadingTextColor(), expandableInfoCustomization2.getHeadingTextFontName(), Integer.valueOf(expandableInfoCustomization2.getHeadingTextFontSize())}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 130234608, -130234599, ChallengeActivity.AnonymousClass4.getDeviceData());
            throw null;
        }
        int i67 = i11 & 113;
        int i68 = (i11 ^ 113) | i67;
        getSDKTransactionID = ((i67 & i68) + (i67 | i68)) % 128;
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, getdevicedata.getDeviceData.getSelectionItemCustomization()}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
        int iIdentityHashCode2 = System.identityHashCode(getdevicedata);
        int i69 = ~iIdentityHashCode2;
        int i71 = ~iIdentityHashCode2;
        int i72 = i71 | iIdentityHashCode2;
        int i73 = i69 & i72;
        int i74 = (-505332822) ^ i73;
        int i75 = (-505332822) & i73;
        int i76 = (i74 & i75) | (i74 ^ i75);
        int i77 = (i76 | (~i76)) & (~i76);
        int i78 = ((-235274245) & i77) | ((~i77) & 235274244);
        int i79 = i77 & 235274244;
        int i81 = (i79 & i78) | (i78 ^ i79);
        int i82 = i71 | (-260444845);
        int i83 = (i82 | (~i82)) & (~i82);
        int i84 = ((~i83) & i81) | ((~i81) & i83);
        int i85 = i81 & i83;
        int i86 = (i85 & i84) | (i84 ^ i85);
        int i87 = 530503421 ^ iIdentityHashCode2;
        int i88 = 530503421 & iIdentityHashCode2;
        int i89 = ~((i88 & i87) | (i87 ^ i88));
        int i91 = ((~i89) & i86) | ((~i86) & i89);
        int i92 = i86 & i89;
        int i93 = -(-(((i92 & i91) | (i91 ^ i92)) * 590));
        int i94 = (1082144836 ^ i93) + ((i93 & 1082144836) << 1);
        int i95 = (-505332822) & i71;
        int i96 = (i71 | (-505332822)) & (~i95);
        int i97 = ~((i96 & i95) | (i96 ^ i95));
        int i98 = i97 ^ 235274244;
        int i99 = i97 & 235274244;
        int i100 = (i99 & i98) | (i98 ^ i99);
        int i101 = i73 & (-260444845);
        int i102 = ((-260444845) | i73) & (~i101);
        int i103 = ~((i101 & i102) | (i102 ^ i101));
        int i104 = (i94 - (~(-(-(((i100 & i103) | (i100 ^ i103)) * (-1180)))))) - 1;
        int i105 = 260444844 & i73;
        int i106 = (i73 | 260444844) & (~i105);
        int i107 = ~((i106 & i105) | (i106 ^ i105));
        int i108 = (~iIdentityHashCode2) & i72;
        int i109 = i104 - (~(((~((i108 & 505332821) | ((i108 & (-505332822)) | ((~i108) & 505332821)))) | i107) * 590));
        int i110 = (i109 ^ (-1)) + (i109 << 1);
        int iIdentityHashCode3 = System.identityHashCode(getdevicedata);
        int i111 = ((~iIdentityHashCode3) & 1653589982) | (iIdentityHashCode3 & (-1653589983));
        int i112 = 1653589982 & iIdentityHashCode3;
        int i113 = (i111 & i112) | (i111 ^ i112);
        int i114 = (((i113 | (~i113)) & (~i113)) | 219164672) * 104;
        int i115 = (1642658029 & i114) + (i114 | 1642658029);
        int i116 = ~iIdentityHashCode3;
        int i117 = (i116 & 219885652) | (i116 ^ 219885652);
        int i118 = i117 & (-1653589983);
        int i119 = (i117 | (-1653589983)) & (~i118);
        int i120 = -(-((~((i119 & i118) | (i119 ^ i118))) * (-104)));
        int i121 = i115 & i120;
        int i122 = ((((i115 ^ i120) | i121) << 1) - (~(-((i120 | i115) & (~i121))))) - 1;
        int i123 = 219885652 & iIdentityHashCode3;
        int i124 = (iIdentityHashCode3 | 219885652) & (~i123);
        int i125 = ((i124 & i123) | (i124 ^ i123)) * 104;
        if (i110 > (i122 & i125) + (i125 | i122)) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKAppID(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) {
        int i17 = ~(i14 | i15 | i11);
        int i18 = ~i15;
        int i19 = (~(i18 | i11)) | (~((~i11) | i14));
        int i21 = (~(i11 | (~i14))) | i18;
        int i22 = ((-299892736) * i13) + (689963008 * i12) + (606076928 * i16) + ((-441125413) * i21) + (441125413 * i19) + (i17 * 441125413) + (164951516 * i15) + ((1047202342 * i14) - 713031680);
        int iC = a0.c(i13, 1743660113, ((-2044576983) * i12) + i14 + i15 + i16);
        switch (a0.e(iC, 1885470720, (i13 * (-1448904853)) + (i12 * 2142076211) + (i16 * 2048728315) + (i21 * 441) + (i19 * (-441)) + (i17 * (-441)) + (i15 * 2048728756) + ((i14 * 2048727874) - 782056376), -1618345984, ((-1081737216) * iC) + i22)) {
            case 1:
                return getSDKReferenceNumber(objArr);
            case 2:
                return getDeviceData(objArr);
            case 3:
                return getSDKAppID(objArr);
            case 4:
                return AuthenticationRequestParameters(objArr);
            case 5:
                return ChallengeResult(objArr);
            case 6:
                return getSDKEphemeralPublicKey(objArr);
            case 7:
                return BuildConfig(objArr);
            case 8:
                return getMessageVersion(objArr);
            case 9:
                return ChallengeResultCancelled(objArr);
            case 10:
                return ChallengeResultError(objArr);
            case 11:
                return getTransactionStatus(objArr);
            case 12:
                return getAdditionalDetails(objArr);
            case 13:
                return ChallengeResultCompleted(objArr);
            case 14:
                getDeviceData getdevicedata = (getDeviceData) objArr[0];
                EditText editText = (EditText) objArr[1];
                int i23 = getSDKAppID;
                int i24 = i23 & 93;
                getSDKTransactionID = a0.d(i24, ~(-(-((i23 ^ 93) | i24))), 1, 128);
                TextBoxCustomization textBoxCustomization = getdevicedata.getDeviceData.getTextBoxCustomization();
                if (textBoxCustomization == null) {
                    int i25 = getSDKTransactionID + 26;
                    getSDKAppID = ((i25 ^ (-1)) + (i25 << 1)) % 128;
                    return null;
                }
                Integer hexColorCode = Customization.parseHexColorCode(textBoxCustomization.getBorderColor());
                if (hexColorCode != null) {
                    int i26 = getSDKTransactionID;
                    int i27 = ((i26 | 28) << 1) - (i26 ^ 28);
                    int i28 = (i27 ^ (-1)) + (i27 << 1);
                    getSDKAppID = i28 % 128;
                    if (i28 % 2 != 0 || Build.VERSION.SDK_INT >= 121) {
                        editText.setBackgroundTintList(ColorStateList.valueOf(hexColorCode.intValue()));
                        int i29 = getSDKTransactionID;
                        int i31 = i29 ^ 59;
                        int i32 = ((i29 & 59) | i31) << 1;
                        int i33 = -i31;
                        getSDKAppID = ((i32 & i33) + (i32 | i33)) % 128;
                    } else {
                        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, editText.getBackground(), hexColorCode}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1376657846, 1376657861, ChallengeActivity.AnonymousClass4.getDeviceData());
                        int i34 = getSDKAppID;
                        getSDKTransactionID = a0.d((i34 & (-72)) | ((~i34) & 71), ~(-(-((i34 & 71) << 1))), 1, 128);
                    }
                }
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{editText, textBoxCustomization}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
                int i35 = getSDKAppID;
                int i36 = (i35 & 40) + (i35 | 40);
                getSDKTransactionID = ((i36 ^ (-1)) + (i36 << 1)) % 128;
                return null;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                getDeviceData getdevicedata2 = (getDeviceData) objArr[0];
                Drawable drawable = (Drawable) objArr[1];
                Integer num = (Integer) objArr[2];
                int iIdentityHashCode = System.identityHashCode(getdevicedata2);
                int i37 = (~iIdentityHashCode) & ((~iIdentityHashCode) | iIdentityHashCode);
                int i38 = 1877268651 & i37;
                int i39 = (i37 | 1877268651) & (~i38);
                int i41 = ~((i39 & i38) | (i39 ^ i38));
                int i42 = 268436032 ^ i41;
                int i43 = i41 & 268436032;
                int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * (-241)));
                int i45 = (-267254402) ^ i44;
                int i46 = ((((i44 & (-267254402)) | i45) << 1) - (~(-i45))) - 1;
                int i47 = i46 & 1837122022;
                int i48 = (i46 | 1837122022) & (~i47);
                int i49 = -(-(i47 << 1));
                int i51 = ((i48 | i49) << 1) - (i48 ^ i49);
                int i52 = ~iIdentityHashCode;
                int i53 = (i52 & 1877268651) | (1877268651 ^ i52);
                int i54 = ~((i53 & 1562696393) | (i53 ^ 1562696393));
                int i55 = -(-(((i54 & 1294260361) | ((~i54) & 1294260361) | ((-1294260362) & i54)) * 241));
                int i56 = (i51 & i55) + (i55 | i51);
                int iIdentityHashCode2 = System.identityHashCode(getdevicedata2);
                int i57 = ~iIdentityHashCode2;
                int i58 = ~iIdentityHashCode2;
                int i59 = i58 | iIdentityHashCode2;
                int i61 = i57 & i59;
                int i62 = (-1149249025) & i61;
                int i63 = (i61 | (-1149249025)) & (~i62);
                int i64 = ~((i63 & i62) | (i63 ^ i62));
                int i65 = 1170515492 & iIdentityHashCode2;
                int i66 = (~i65) & (1170515492 | iIdentityHashCode2);
                int i67 = ~((i65 & i66) | (i66 ^ i65));
                int i68 = i64 & i67;
                int i69 = (i64 | i67) & (~i68);
                int i71 = -(-(((i69 & i68) | (i69 ^ i68)) * 520));
                int i72 = (((~i71) & (-453496057)) | (453496056 & i71)) + ((i71 & (-453496057)) << 1);
                int i73 = ((~i58) & (-1170515493)) | (1170515492 & i58);
                int i74 = i58 & (-1170515493);
                int i75 = (i73 & i74) | (i73 ^ i74);
                int i76 = (i75 | (~i75)) & (~i75);
                int i77 = 1854488219 & iIdentityHashCode2;
                int i78 = ~(((~i77) & (1854488219 | iIdentityHashCode2)) | i77);
                int i79 = i76 ^ i78;
                int i81 = i76 & i78;
                int i82 = ((i81 & i79) | (i79 ^ i81)) * (-1040);
                int i83 = i72 & i82;
                int i84 = i83 + ((i82 ^ i72) | i83);
                int i85 = (~iIdentityHashCode2) & i59;
                int i86 = ~((i85 & (-1854488220)) | ((-1854488220) ^ i85));
                int i87 = i86 & 21266468;
                int i88 = ((i86 | 21266468) & (~i87)) | i87;
                int i89 = iIdentityHashCode2 ^ 1854488219;
                int i91 = ~((i89 & i77) | (i89 ^ i77));
                int i92 = i88 & i91;
                int i93 = -(-((((i91 | i88) & (~i92)) | i92) * 520));
                if (i56 <= (((~i93) & i84) | ((~i84) & i93)) + ((i93 & i84) << 1)) {
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata2, drawable, num, Boolean.TRUE}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1750298648, 1750298653, ChallengeActivity.AnonymousClass4.getDeviceData());
                } else {
                    getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata2, drawable, num, Boolean.FALSE}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1750298648, 1750298653, ChallengeActivity.AnonymousClass4.getDeviceData());
                }
                return null;
            case 16:
                return ChallengeResultTimeout(objArr);
            case 17:
                return completed(objArr);
            case 18:
                return ChallengeStatusHandler(objArr);
            case 19:
                return onCompletion(objArr);
            default:
                return getSDKTransactionID(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKEphemeralPublicKey(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aw.getDeviceData.getSDKEphemeralPublicKey(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r6 = com.adyen.threeds2.customization.Customization.parseHexColorCode(r5.getBackgroundColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r6 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r7 = atd.aw.getDeviceData.getSDKAppID;
        r9 = r7 | 97;
        r10 = r9 << 1;
        r7 = -((~(r7 & 97)) & r9);
        r9 = ((r10 | r7) << 1) - (r7 ^ r10);
        atd.aw.getDeviceData.getSDKTransactionID = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if ((r9 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        r11 = new java.lang.Object[]{r1, r3.getBackground(), r6, java.lang.Boolean.FALSE};
        getSDKAppID(com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), r11, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), -1750298648, 1750298653, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        r11 = new java.lang.Object[]{r1, r3.getBackground(), r6, java.lang.Boolean.TRUE};
        getSDKAppID(com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), r11, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), -1750298648, 1750298653, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        getSDKAppID(com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), new java.lang.Object[]{r1, r3, r5}, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData(), 686365583, -686365564, com.adyen.threeds2.internal.ui.activity.ChallengeActivity.AnonymousClass4.getDeviceData());
        r1 = atd.aw.getDeviceData.getSDKTransactionID;
        r3 = r1 & 39;
        r1 = -(-((r1 ^ 39) | r3));
        r5 = (r3 ^ r1) + ((r1 & r3) << 1);
        atd.aw.getDeviceData.getSDKAppID = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
    
        if ((r5 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dd, code lost:
    
        r1 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        r1 = r6 & 99;
        r0 = (((r6 ^ 99) | r1) << 1) - ((~r1) & (r6 | 99));
        atd.aw.getDeviceData.getSDKTransactionID = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if ((r0 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKReferenceNumber(java.lang.Object[] r24) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aw.getDeviceData.getSDKReferenceNumber(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = getSDKAppID;
        int i12 = i11 & 31;
        int i13 = -(-((i11 ^ 31) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        getSDKTransactionID = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (iIntValue == R.style.Widget_ThreeDS2_SelectItem) {
            SelectionItemCustomization selectionItemCustomization = getdevicedata.getDeviceData.getSelectionItemCustomization();
            if (selectionItemCustomization == null) {
                int i15 = getSDKTransactionID;
                int i16 = i15 & 111;
                int i17 = ((i15 ^ 111) | i16) << 1;
                int i18 = -((i15 | 111) & (~i16));
                getSDKAppID = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
                return null;
            }
            Integer hexColorCode = Customization.parseHexColorCode(selectionItemCustomization.getHighlightedBackgroundColor());
            if (hexColorCode != null) {
                int i19 = getSDKAppID;
                int i21 = i19 & 103;
                getSDKTransactionID = (((i19 | 103) & (~i21)) + (i21 << 1)) % 128;
                Object[] objArr2 = {getdevicedata, view.getBackground(), hexColorCode, Boolean.TRUE};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr2, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1750298648, 1750298653, ChallengeActivity.AnonymousClass4.getDeviceData());
                getSDKAppID = (getSDKTransactionID + 67) % 128;
            }
        }
        int i22 = getSDKAppID;
        int i23 = i22 & 53;
        getSDKTransactionID = (i23 + ((i22 ^ 53) | i23)) % 128;
        return null;
    }

    private static /* synthetic */ Object getTransactionStatus(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        View view = (View) objArr[1];
        AttributeSet attributeSet = (AttributeSet) objArr[2];
        int i11 = getSDKTransactionID;
        int i12 = (((i11 | 125) << 1) - (~(-((i11 & (-126)) | ((~i11) & 125))))) - 1;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            UiCustomization uiCustomization = getdevicedata.getDeviceData;
            throw null;
        }
        if (getdevicedata.getDeviceData == null) {
            int i13 = i11 ^ 97;
            int i14 = ((i11 & 97) | i13) << 1;
            int i15 = -i13;
            int i16 = (i14 & i15) + (i15 | i14);
            getSDKAppID = i16 % 128;
            if (i16 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int styleAttribute = attributeSet.getStyleAttribute();
        if (view instanceof ProgressBar) {
            int i17 = getSDKTransactionID;
            int i18 = ((i17 & 62) + (i17 | 62)) - 1;
            getSDKAppID = i18 % 128;
            if (i18 % 2 != 0) {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (ProgressBar) view, Integer.valueOf(styleAttribute)}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 637565295, -637565285, ChallengeActivity.AnonymousClass4.getDeviceData());
                return null;
            }
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (ProgressBar) view, Integer.valueOf(styleAttribute)}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 637565295, -637565285, ChallengeActivity.AnonymousClass4.getDeviceData());
            throw null;
        }
        if (view instanceof CompoundButton) {
            int i19 = getSDKAppID;
            int i21 = ((i19 & 92) + (i19 | 92)) - 1;
            getSDKTransactionID = i21 % 128;
            if (i21 % 2 != 0) {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (CompoundButton) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -119594556, 119594560, ChallengeActivity.AnonymousClass4.getDeviceData());
                int i22 = 47 / 0;
            } else {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (CompoundButton) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -119594556, 119594560, ChallengeActivity.AnonymousClass4.getDeviceData());
            }
            getSDKAppID = (getSDKTransactionID + 25) % 128;
            return null;
        }
        if (view instanceof Button) {
            int i23 = getSDKAppID;
            int i24 = i23 | 11;
            int i25 = i24 << 1;
            int i26 = -((~(i23 & 11)) & i24);
            int i27 = (i25 & i26) + (i26 | i25);
            getSDKTransactionID = i27 % 128;
            if (i27 % 2 != 0) {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (Button) view, Integer.valueOf(styleAttribute)}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 2019093242, -2019093229, ChallengeActivity.AnonymousClass4.getDeviceData());
                throw null;
            }
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (Button) view, Integer.valueOf(styleAttribute)}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 2019093242, -2019093229, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i28 = getSDKTransactionID;
            int i29 = (i28 & 9) + (i28 | 9);
            getSDKAppID = i29 % 128;
            if (i29 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (view instanceof EditText) {
            int i31 = getSDKTransactionID;
            int i32 = (((i31 | 56) << 1) - (i31 ^ 56)) - 1;
            getSDKAppID = i32 % 128;
            if (i32 % 2 == 0) {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (EditText) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1847701372, -1847701358, ChallengeActivity.AnonymousClass4.getDeviceData());
                int i33 = 23 / 0;
            } else {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (EditText) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1847701372, -1847701358, ChallengeActivity.AnonymousClass4.getDeviceData());
            }
            int i34 = getSDKTransactionID;
            int i35 = (i34 & (-22)) | ((~i34) & 21);
            int i36 = (i34 & 21) << 1;
            getSDKAppID = (((i35 | i36) << 1) - (i36 ^ i35)) % 128;
            return null;
        }
        if (view instanceof TextView) {
            int i37 = getSDKAppID;
            int i38 = i37 & 67;
            int i39 = -(-((i37 ^ 67) | i38));
            getSDKTransactionID = ((i38 ^ i39) + ((i39 & i38) << 1)) % 128;
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (TextView) view, Integer.valueOf(styleAttribute)}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 810692833, -810692825, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i41 = getSDKTransactionID;
            int i42 = i41 | 99;
            int i43 = i42 << 1;
            int i44 = -((~(i41 & 99)) & i42);
            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
            getSDKAppID = i45 % 128;
            if (i45 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (view instanceof atd.av.AuthenticationRequestParameters) {
            int i46 = getSDKTransactionID + 9;
            getSDKAppID = i46 % 128;
            if (i46 % 2 == 0) {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (atd.av.AuthenticationRequestParameters) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -425663999, 425664016, ChallengeActivity.AnonymousClass4.getDeviceData());
                int i47 = 99 / 0;
            } else {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (atd.av.AuthenticationRequestParameters) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -425663999, 425664016, ChallengeActivity.AnonymousClass4.getDeviceData());
            }
            int i48 = getSDKAppID;
            int i49 = (i48 ^ 119) + ((i48 & 119) << 1);
            getSDKTransactionID = i49 % 128;
            if (i49 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (view instanceof getSDKTransactionID) {
            int i51 = getSDKAppID;
            int i52 = (((i51 & (-96)) | ((~i51) & 95)) - (~((i51 & 95) << 1))) - 1;
            getSDKTransactionID = i52 % 128;
            if (i52 % 2 != 0) {
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (getSDKTransactionID) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1469951975, -1469951959, ChallengeActivity.AnonymousClass4.getDeviceData());
                throw null;
            }
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (getSDKTransactionID) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1469951975, -1469951959, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i53 = getSDKTransactionID;
            int i54 = (i53 ^ 101) + ((i53 & 101) << 1);
            getSDKAppID = i54 % 128;
            if (i54 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (view instanceof atd.av.getDeviceData) {
            int i55 = getSDKAppID;
            int i56 = i55 ^ 87;
            int i57 = -(-((i55 & 87) << 1));
            getSDKTransactionID = ((i56 ^ i57) + ((i57 & i56) << 1)) % 128;
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, (atd.av.getDeviceData) view}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1138580681, 1138580688, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i58 = getSDKAppID;
            int i59 = (i58 & (-62)) | ((~i58) & 61);
            int i61 = -(-((i58 & 61) << 1));
            getSDKTransactionID = ((i59 & i61) + (i61 | i59)) % 128;
            return null;
        }
        if (view instanceof ViewGroup) {
            getSDKTransactionID = (getSDKAppID + 39) % 128;
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{getdevicedata, view, Integer.valueOf(styleAttribute)}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 2053368269, -2053368269, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i62 = getSDKAppID;
            getSDKTransactionID = ((-2) - (((i62 ^ 24) + ((i62 & 24) << 1)) ^ (-1))) % 128;
        }
        int deviceData = ChallengeActivity.AnonymousClass4.getDeviceData();
        int i63 = (~deviceData) & ((~deviceData) | deviceData);
        int i64 = ~((-1566970651) | i63);
        int i65 = (i64 & 71303696) | (i64 ^ 71303696);
        int i66 = ~((i63 & 2067750347) | (i63 ^ 2067750347));
        int i67 = i65 & i66;
        int i68 = (i66 | i65) & (~i67);
        int i69 = -(~(((i68 & i67) | (i68 ^ i67)) * (-397)));
        int i71 = ((-1901290392) ^ i69) + ((i69 & (-1901290392)) << 1);
        int i72 = (i71 ^ (-1)) + (i71 << 1);
        int i73 = (i72 & 1757203760) + (i72 | 1757203760);
        int i74 = deviceData ^ 71303696;
        int i75 = deviceData & 71303696;
        int i76 = (i75 & i74) | (i74 ^ i75);
        int i77 = i76 ^ 572083393;
        int i78 = i76 & 572083393;
        int i79 = ((i78 & i77) | (i77 ^ i78)) * 397;
        int i81 = i73 & i79;
        int i82 = ((i73 ^ i79) | i81) << 1;
        int i83 = -((i79 | i73) & (~i81));
        int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
        int deviceData2 = ChallengeActivity.AnonymousClass4.getDeviceData();
        int i85 = ~deviceData2;
        int i86 = ~((i85 & 242605299) | ((-242605300) & i85) | ((~i85) & 242605299));
        int i87 = (((i86 & 138528881) | (((~i86) & 138528881) | ((-138528882) & i86))) * (-374)) - 694320313;
        int i88 = ((i87 ^ 2140893025) + ((i87 & 2140893025) << 1)) - 1;
        int i89 = ~deviceData2;
        int i91 = i89 & 242605299;
        int i92 = (i89 | 242605299) & (~i91);
        int i93 = (i92 & i91) | (i92 ^ i91);
        int i94 = (i93 | (~i93)) & (~i93);
        int i95 = ((~i94) & 104076418) | ((-104076419) & i94);
        int i96 = i94 & 104076418;
        int i97 = -(-(((i96 & i95) | (i95 ^ i96)) * 374));
        int i98 = i88 & i97;
        int i99 = ((i88 ^ i97) | i98) << 1;
        int i100 = -((i97 | i88) & (~i98));
        if (i84 <= ((i99 | i100) << 1) - (i100 ^ i99)) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onCompletion(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        Button button = (Button) objArr[1];
        ButtonCustomization buttonCustomization = (ButtonCustomization) objArr[2];
        getSDKTransactionID = (getSDKAppID + 101) % 128;
        int cornerRadius = buttonCustomization.getCornerRadius();
        if (cornerRadius >= 0) {
            int i11 = getSDKAppID;
            int i12 = i11 & 43;
            int i13 = -(-((i11 ^ 43) | i12));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            getSDKTransactionID = i14 % 128;
            if (i14 % 2 != 0) {
                Object[] objArr2 = {getdevicedata, button.getBackground(), Integer.valueOf(cornerRadius)};
                getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr2, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1223867209, -1223867203, ChallengeActivity.AnonymousClass4.getDeviceData());
                throw null;
            }
            Object[] objArr3 = {getdevicedata, button.getBackground(), Integer.valueOf(cornerRadius)};
            getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr3, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1223867209, -1223867203, ChallengeActivity.AnonymousClass4.getDeviceData());
            int i15 = getSDKTransactionID;
            int i16 = i15 ^ 13;
            int i17 = ((i15 & 13) | i16) << 1;
            int i18 = -i16;
            getSDKAppID = (((i17 | i18) << 1) - (i17 ^ i18)) % 128;
        }
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{button, buttonCustomization}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
        int i19 = getSDKAppID;
        getSDKTransactionID = k.c(i19 ^ 116, (i19 & 116) << 1, 1, 128);
        return null;
    }

    private void AuthenticationRequestParameters(Button button, int i11) {
        Object[] objArr = {this, button, Integer.valueOf(i11)};
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 2019093242, -2019093229, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void AuthenticationRequestParameters(ProgressBar progressBar, int i11) {
        Object[] objArr = {this, progressBar, Integer.valueOf(i11)};
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 637565295, -637565285, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    public final void AuthenticationRequestParameters(View view, AttributeSet attributeSet) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, view, attributeSet}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1106409124, -1106409113, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private static void getSDKTransactionID(TextView textView, String str, String str2, int i11) {
        Object[] objArr = {textView, str, str2, Integer.valueOf(i11)};
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 130234608, -130234599, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKTransactionID(EditText editText) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, editText}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1847701372, -1847701358, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKTransactionID(Button button, ButtonCustomization buttonCustomization) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, button, buttonCustomization}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 686365583, -686365564, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKTransactionID(CompoundButton compoundButton) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, compoundButton}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -119594556, 119594560, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getDeviceData(Drawable drawable, Integer num, boolean z11) {
        Object[] objArr = {this, drawable, num, Boolean.valueOf(z11)};
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1750298648, 1750298653, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getDeviceData(Drawable drawable, Integer num) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, drawable, num}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1376657846, 1376657861, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getDeviceData(getSDKTransactionID getsdktransactionid) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, getsdktransactionid}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1469951975, -1469951959, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getDeviceData(Button button, ButtonCustomization buttonCustomization) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, button, buttonCustomization}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1308149249, 1308149251, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKReferenceNumber(Drawable drawable, Integer num) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, drawable, num}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1223867209, -1223867203, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKReferenceNumber(atd.av.AuthenticationRequestParameters authenticationRequestParameters) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, authenticationRequestParameters}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -425663999, 425664016, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKReferenceNumber(Button button, ButtonCustomization buttonCustomization) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, button, buttonCustomization}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 1798054785, -1798054784, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        atd.av.getDeviceData getdevicedata = (atd.av.getDeviceData) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = getSDKAppID;
        int i12 = i11 & 75;
        int i13 = i12 + ((i11 ^ 75) | i12);
        getSDKTransactionID = i13 % 128;
        if (i13 % 2 == 0) {
            Integer hexColorCode = Customization.parseHexColorCode(str);
            if (hexColorCode != null) {
                int i14 = getSDKAppID;
                int i15 = i14 ^ 51;
                int i16 = ((i14 & 51) | i15) << 1;
                int i17 = -i15;
                getSDKTransactionID = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
                getdevicedata.setColor(hexColorCode.intValue());
                int i18 = getSDKTransactionID;
                int i19 = i18 ^ 25;
                int i21 = ((i18 & 25) | i19) << 1;
                int i22 = -i19;
                getSDKAppID = ((i21 ^ i22) + ((i21 & i22) << 1)) % 128;
            }
            if (iIntValue >= 0) {
                int i23 = getSDKAppID;
                int i24 = i23 & 115;
                int i25 = -(-((i23 ^ 115) | i24));
                getSDKTransactionID = ((i24 & i25) + (i25 | i24)) % 128;
                int[] iArr = AnonymousClass2.AuthenticationRequestParameters;
                int deviceData = getAdditionalDetails.getDeviceData();
                int deviceData2 = getAdditionalDetails.getDeviceData();
                int i26 = iArr[((getDeviceData.EnumC0003getDeviceData) atd.av.getDeviceData.getDeviceData(getAdditionalDetails.getDeviceData(), deviceData, new Object[]{getdevicedata}, getAdditionalDetails.getDeviceData(), deviceData2, -240153089, 240153092)).ordinal()];
                if (i26 == 1) {
                    getdevicedata.setThickness(iIntValue);
                    int i27 = getSDKAppID;
                    getSDKTransactionID = ((i27 & 117) + (i27 | 117)) % 128;
                    return null;
                }
                if (i26 == 2) {
                    getdevicedata.setThickness(iIntValue);
                    getSDKAppID = ((-2) - ((getSDKTransactionID + 90) ^ (-1))) % 128;
                }
            }
            int i28 = getSDKAppID;
            int i29 = i28 & 125;
            int i31 = ((i28 ^ 125) | i29) << 1;
            int i32 = -((i28 | 125) & (~i29));
            getSDKTransactionID = ((i31 & i32) + (i32 | i31)) % 128;
            return null;
        }
        Customization.parseHexColorCode(str);
        throw null;
    }

    private static void getSDKAppID(atd.av.getDeviceData getdevicedata, String str, int i11) {
        Object[] objArr = {getdevicedata, str, Integer.valueOf(i11)};
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1019588951, 1019588954, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKAppID(atd.av.getDeviceData getdevicedata) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, getdevicedata}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1138580681, 1138580688, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKAppID(View view, int i11) {
        Object[] objArr = {this, view, Integer.valueOf(i11)};
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 2053368269, -2053368269, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private static void getSDKAppID(TextView textView, Customization customization) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{textView, customization}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 441688404, -441688386, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    private void getSDKAppID(TextView textView, int i11) {
        Object[] objArr = {this, textView, Integer.valueOf(i11)};
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), objArr, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), 810692833, -810692825, ChallengeActivity.AnonymousClass4.getDeviceData());
    }

    public final void getSDKAppID(Window window) {
        getSDKAppID(ChallengeActivity.AnonymousClass4.getDeviceData(), new Object[]{this, window}, ChallengeActivity.AnonymousClass4.getDeviceData(), ChallengeActivity.AnonymousClass4.getDeviceData(), -1788541868, 1788541880, ChallengeActivity.AnonymousClass4.getDeviceData());
    }
}
