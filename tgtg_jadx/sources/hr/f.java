package hr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACCOUNT_DETAILS;
    public static final f BLOG;
    public static final f CHAT;
    public static final f GO_TO_MYSTORE;
    public static final f HELP_CENTER;
    public static final f HELP_WITH_ORDER;
    public static final f HIDDEN_STORES;
    public static final f INVITE_FRIENDS;
    public static final f JOIN_TGTG;
    public static final f LEGAL;
    public static final f NOTIFICATIONS;
    public static final f PAYMENT_OPTIONS;
    public static final f RECOMMEND_STORE;
    public static final f SPECIAL_REWARDS;
    public static final f STORE_SIGNUP;
    public static final f VOUCHERS;
    public static final f VOUCHER_EXPERIENCE;

    static {
        f fVar = new f("ACCOUNT_DETAILS", 0);
        ACCOUNT_DETAILS = fVar;
        f fVar2 = new f("PAYMENT_OPTIONS", 1);
        PAYMENT_OPTIONS = fVar2;
        f fVar3 = new f("VOUCHERS", 2);
        VOUCHERS = fVar3;
        f fVar4 = new f("VOUCHER_EXPERIENCE", 3);
        VOUCHER_EXPERIENCE = fVar4;
        f fVar5 = new f("SPECIAL_REWARDS", 4);
        SPECIAL_REWARDS = fVar5;
        f fVar6 = new f("NOTIFICATIONS", 5);
        NOTIFICATIONS = fVar6;
        f fVar7 = new f("INVITE_FRIENDS", 6);
        INVITE_FRIENDS = fVar7;
        f fVar8 = new f("RECOMMEND_STORE", 7);
        RECOMMEND_STORE = fVar8;
        f fVar9 = new f("STORE_SIGNUP", 8);
        STORE_SIGNUP = fVar9;
        f fVar10 = new f("GO_TO_MYSTORE", 9);
        GO_TO_MYSTORE = fVar10;
        f fVar11 = new f("HELP_WITH_ORDER", 10);
        HELP_WITH_ORDER = fVar11;
        f fVar12 = new f("HELP_CENTER", 11);
        HELP_CENTER = fVar12;
        f fVar13 = new f("JOIN_TGTG", 12);
        JOIN_TGTG = fVar13;
        f fVar14 = new f("HIDDEN_STORES", 13);
        HIDDEN_STORES = fVar14;
        f fVar15 = new f("BLOG", 14);
        BLOG = fVar15;
        f fVar16 = new f("LEGAL", 15);
        LEGAL = fVar16;
        f fVar17 = new f("CHAT", 16);
        CHAT = fVar17;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
