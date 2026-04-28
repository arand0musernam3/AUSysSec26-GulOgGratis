package mr;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[or.b.values().length];
        try {
            iArr[or.b.RESEND_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[or.b.SAVE_NEW_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[or.b.CANCEL_EMAIL_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[or.e.values().length];
        try {
            iArr2[or.e.VERIFY_EMAIL_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[or.e.VERIFY_CURRENT_EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[or.e.EMAIL_VERIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[or.e.EMAIL_MISSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[or.e.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[or.a.values().length];
        try {
            iArr3[or.a.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[or.a.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[or.a.PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[or.a.COUNTRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[or.a.GENDER.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[or.a.DIETARY.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[or.a.COLLECTION_TIMES.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
