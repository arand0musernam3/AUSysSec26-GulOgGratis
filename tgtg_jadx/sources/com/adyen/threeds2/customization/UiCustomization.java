package com.adyen.threeds2.customization;

import a40.d0;
import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.util.Preconditions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.i18n.MessageBundle;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class UiCustomization implements Parcelable {
    public static final Parcelable.Creator<UiCustomization> CREATOR = new Parcelable.Creator<UiCustomization>() { // from class: com.adyen.threeds2.customization.UiCustomization.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UiCustomization createFromParcel(Parcel parcel) {
            return new UiCustomization(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UiCustomization[] newArray(int i11) {
            return new UiCustomization[i11];
        }
    };
    private final HashMap<ButtonType, ButtonCustomization> mButtonTypeCustomizationMap;
    private final HashMap<Class<? extends Customization>, Customization> mCustomizationMap;

    /* JADX INFO: renamed from: com.adyen.threeds2.customization.UiCustomization$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getSDKTransactionID;

        static {
            int[] iArr = new int[ButtonType.values().length];
            getSDKTransactionID = iArr;
            try {
                iArr[ButtonType.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKTransactionID[ButtonType.RESEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public enum ButtonType {
        VERIFY,
        CONTINUE,
        NEXT,
        CANCEL,
        RESEND,
        OPEN_OOB_APP
    }

    public UiCustomization(Parcel parcel) {
        this.mButtonTypeCustomizationMap = (HashMap) parcel.readSerializable();
        this.mCustomizationMap = (HashMap) parcel.readSerializable();
    }

    private ButtonCustomization getOrCreateButtonCustomization(ButtonType buttonType) {
        ButtonCustomization buttonCustomization = this.mButtonTypeCustomizationMap.get(buttonType);
        if (buttonCustomization != null) {
            return buttonCustomization;
        }
        ButtonCustomization buttonCustomization2 = new ButtonCustomization();
        this.mButtonTypeCustomizationMap.put(buttonType, buttonCustomization2);
        return buttonCustomization2;
    }

    private <T extends Customization> T getOrCreateCustomization(Class<T> cls) {
        T t9 = (T) this.mCustomizationMap.get(cls);
        if (t9 != null) {
            return t9;
        }
        try {
            T tNewInstance = cls.newInstance();
            this.mCustomizationMap.put(cls, tNewInstance);
            return tNewInstance;
        } catch (IllegalAccessException e5) {
            d0.o("Could not access constructor of ".concat(cls.getSimpleName()), e5);
            return null;
        } catch (InstantiationException e11) {
            d0.o("Could not instantiate ".concat(cls.getSimpleName()), e11);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ButtonCustomization getButtonCustomization(ButtonType buttonType) throws InvalidInputException {
        Preconditions.requireNonNull("buttonType", buttonType);
        return getOrCreateButtonCustomization(buttonType);
    }

    public final ExpandableInfoCustomization getExpandableInfoCustomization() {
        return (ExpandableInfoCustomization) getOrCreateCustomization(ExpandableInfoCustomization.class);
    }

    public final LabelCustomization getLabelCustomization() {
        return (LabelCustomization) getOrCreateCustomization(LabelCustomization.class);
    }

    public final ScreenCustomization getScreenCustomization() {
        return (ScreenCustomization) getOrCreateCustomization(ScreenCustomization.class);
    }

    public final SelectionItemCustomization getSelectionItemCustomization() {
        return (SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class);
    }

    public final TextBoxCustomization getTextBoxCustomization() {
        return (TextBoxCustomization) getOrCreateCustomization(TextBoxCustomization.class);
    }

    public final ToolbarCustomization getToolbarCustomization() {
        return (ToolbarCustomization) getOrCreateCustomization(ToolbarCustomization.class);
    }

    public final void setBorderColor(String str) throws InvalidInputException {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((TextBoxCustomization) getOrCreateCustomization(TextBoxCustomization.class)).setBorderColor(str);
        ((SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class)).setBorderColor(str);
        ((ExpandableInfoCustomization) getOrCreateCustomization(ExpandableInfoCustomization.class)).setBorderColor(str);
    }

    public final void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType) throws InvalidInputException {
        Preconditions.requireNonNull("buttonType", buttonType);
        this.mButtonTypeCustomizationMap.put(buttonType, buttonCustomization);
    }

    public final void setExpandableInfoCustomization(ExpandableInfoCustomization expandableInfoCustomization) throws InvalidInputException {
        Preconditions.requireNonNull("expandableInfoCustomization", expandableInfoCustomization);
        this.mCustomizationMap.put(ExpandableInfoCustomization.class, expandableInfoCustomization);
    }

    public final void setHighlightedBackgroundColor(String str) throws InvalidInputException {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class)).setHighlightedBackgroundColor(str);
        ((ExpandableInfoCustomization) getOrCreateCustomization(ExpandableInfoCustomization.class)).setHighlightedBackgroundColor(str);
        Iterator it = Arrays.asList(ButtonType.CANCEL, ButtonType.RESEND).iterator();
        while (it.hasNext()) {
            getOrCreateButtonCustomization((ButtonType) it.next()).setBackgroundColor(str);
        }
    }

    public final void setLabelCustomization(LabelCustomization labelCustomization) throws InvalidInputException {
        Preconditions.requireNonNull("labelCustomization", labelCustomization);
        this.mCustomizationMap.put(LabelCustomization.class, labelCustomization);
    }

    public final void setScreenBackgroundColor(String str) throws InvalidInputException {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) getOrCreateCustomization(ScreenCustomization.class)).setBackgroundColor(str);
    }

    public final void setScreenCustomization(ScreenCustomization screenCustomization) throws InvalidInputException {
        Preconditions.requireNonNull("screenCustomization", screenCustomization);
        this.mCustomizationMap.put(ScreenCustomization.class, screenCustomization);
    }

    public final void setSelectionItemCustomization(SelectionItemCustomization selectionItemCustomization) throws InvalidInputException {
        Preconditions.requireNonNull("selectionItemCustomization", selectionItemCustomization);
        this.mCustomizationMap.put(SelectionItemCustomization.class, selectionItemCustomization);
    }

    @d
    public final void setStatusBarColor(String str) throws InvalidInputException {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) getOrCreateCustomization(ScreenCustomization.class)).setStatusBarColor(str);
    }

    public final void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) throws InvalidInputException {
        Preconditions.requireNonNull("textBoxCustomization", textBoxCustomization);
        this.mCustomizationMap.put(TextBoxCustomization.class, textBoxCustomization);
    }

    public final void setTextColor(String str) throws InvalidInputException {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ScreenCustomization) getOrCreateCustomization(ScreenCustomization.class)).setTextColor(str);
        ((ToolbarCustomization) getOrCreateCustomization(ToolbarCustomization.class)).setTextColor(str);
        getOrCreateButtonCustomization(ButtonType.CANCEL).setTextColor(str);
        LabelCustomization labelCustomization = (LabelCustomization) getOrCreateCustomization(LabelCustomization.class);
        labelCustomization.setTextColor(str);
        labelCustomization.setHeadingTextColor(str);
        labelCustomization.setInputLabelTextColor(str);
        ((TextBoxCustomization) getOrCreateCustomization(TextBoxCustomization.class)).setTextColor(str);
        ((SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class)).setTextColor(str);
        ExpandableInfoCustomization expandableInfoCustomization = (ExpandableInfoCustomization) getOrCreateCustomization(ExpandableInfoCustomization.class);
        expandableInfoCustomization.setTextColor(str);
        expandableInfoCustomization.setHeadingTextColor(str);
        expandableInfoCustomization.setExpandStateIndicatorColor(str);
    }

    public final void setTintColor(String str) throws InvalidInputException {
        Preconditions.requireNonEmpty("hexColorCode", str);
        ((ToolbarCustomization) getOrCreateCustomization(ToolbarCustomization.class)).setBackgroundColor(str);
        ((SelectionItemCustomization) getOrCreateCustomization(SelectionItemCustomization.class)).setSelectionIndicatorTintColor(str);
        for (ButtonType buttonType : ButtonType.values()) {
            ButtonCustomization orCreateButtonCustomization = getOrCreateButtonCustomization(buttonType);
            int i11 = AnonymousClass1.getSDKTransactionID[buttonType.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    orCreateButtonCustomization.setBackgroundColor(str);
                } else {
                    orCreateButtonCustomization.setTextColor(str);
                }
            }
        }
    }

    public final void setToolbarCustomization(ToolbarCustomization toolbarCustomization) throws InvalidInputException {
        Preconditions.requireNonNull("toolbarCustomization", toolbarCustomization);
        this.mCustomizationMap.put(ToolbarCustomization.class, toolbarCustomization);
    }

    public final void setToolbarTitle(String str) {
        Preconditions.requireNonEmpty(MessageBundle.TITLE_ENTRY, str);
        ((ToolbarCustomization) getOrCreateCustomization(ToolbarCustomization.class)).setHeaderText(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.mButtonTypeCustomizationMap);
        parcel.writeSerializable(this.mCustomizationMap);
    }

    public UiCustomization() {
        this.mButtonTypeCustomizationMap = new HashMap<>();
        this.mCustomizationMap = new HashMap<>();
    }
}
