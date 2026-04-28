package zw;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f48163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f48164b;

    static {
        int[] iArr = new int[k.values().length];
        f48164b = iArr;
        try {
            iArr[k.first_child.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48164b[k.last_child.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48164b[k.only_child.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48164b[k.first_of_type.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48164b[k.last_of_type.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f48164b[k.only_of_type.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f48164b[k.root.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f48164b[k.empty.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f48164b[k.nth_child.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f48164b[k.nth_last_child.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f48164b[k.nth_of_type.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f48164b[k.nth_last_of_type.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f48164b[k.not.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f48164b[k.target.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f48164b[k.lang.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f48164b[k.link.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f48164b[k.visited.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f48164b[k.hover.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f48164b[k.active.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f48164b[k.focus.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f48164b[k.enabled.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f48164b[k.disabled.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            f48164b[k.checked.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            f48164b[k.indeterminate.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        int[] iArr2 = new int[d.values().length];
        f48163a = iArr2;
        try {
            iArr2[d.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            f48163a[d.INCLUDES.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            f48163a[d.DASHMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
    }
}
