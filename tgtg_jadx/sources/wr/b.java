package wr;

import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h(with = c.class)
public final class b implements t40.b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b APP_QUESTION;
    public static final b BAD_ORDER_EXPERIENCE;
    public static final b BUSINESS_GENERAL_QUESTION;
    public static final b CATERING_ISSUE;
    public static final b COMPLIMENT;
    public static final b CONSUMER_GENERAL_QUESTION;

    @NotNull
    public static final a Companion;
    public static final b DELIVERY_ISSUE;
    public static final b INVOICES;
    public static final b MY_STORE;
    public static final b NEXT_DAY_DELIVERY_ISSUE;
    public static final b NO_SELECTION;
    public static final b PACKAGING;
    public static final b STORE_SUGGESTION;
    public static final b UNKNOWN;
    private boolean allowAttachments;
    private boolean allowOrderReference;
    private final int stringResId;

    @Nullable
    private e[] topics;

    static {
        String str = "NO_SELECTION";
        b bVar = new b(str, 0, R.string.contact_us_no_selection, new e[0]);
        NO_SELECTION = bVar;
        e eVar = e.NO_SELECTION;
        b bVar2 = new b("BAD_ORDER_EXPERIENCE", 1, R.string.contact_us_reason_consumer_bad_order_experience, true, true, eVar, e.LOW_QUALITY, e.LOW_QUANTITY, e.NO_FOOD, e.ALLERGIC_TO_ORDER, e.STORE_CLOSED, e.PICKUP_TIME_CHANGED, e.BAD_IN_STORE_EXPERIENCE, e.MISSED_COLLECTION_WINDOW, e.CANCEL_ORDER);
        BAD_ORDER_EXPERIENCE = bVar2;
        e eVar2 = e.APP_ERROR;
        e eVar3 = e.APP_SUGGESTION;
        b bVar3 = new b("APP_QUESTION", 2, R.string.contact_us_reason_consumer_app_question, false, false, eVar, eVar2, eVar3);
        APP_QUESTION = bVar3;
        b bVar4 = new b("STORE_SUGGESTION", 3, R.string.contact_us_reason_consumer_store_suggestion, new e[0]);
        STORE_SUGGESTION = bVar4;
        b bVar5 = new b("COMPLIMENT", 4, R.string.contact_us_reason_consumer_compliment, false, false, eVar, e.LOVE_YOU, e.JOB_INQUIRY, e.STUDENT_INQUIRY);
        COMPLIMENT = bVar5;
        b bVar6 = new b("CONSUMER_GENERAL_QUESTION", 5, R.string.contact_us_reason_consumer_something_else, false, false, eVar, e.GENERIC_QUESTION, eVar2, eVar3);
        CONSUMER_GENERAL_QUESTION = bVar6;
        b bVar7 = new b("DELIVERY_ISSUE", 6, R.string.contact_us_reason_delivery_issue, true, true, eVar, e.DELIVERY_PROBLEM, e.DELIVERY_DAMAGED, e.DELIVERY_ARRIVAL, e.DELIVERY_CANCEL);
        DELIVERY_ISSUE = bVar7;
        b bVar8 = new b("CATERING_ISSUE", 7, R.string.contact_us_reason_catering_issue, true, true, eVar, e.CATERING_PROBLEM, e.CATERING_DAMAGED, e.CATERING_ARRIVAL, e.CATERING_CANCEL);
        CATERING_ISSUE = bVar8;
        b bVar9 = new b("NEXT_DAY_DELIVERY_ISSUE", 8, R.string.contact_us_reason_catering_issue, true, true, eVar, e.NEXT_DAY_DELIVERY_PROBLEM, e.NEXT_DAY_DELIVERY_DAMAGED, e.NEXT_DAY_DELIVERY_ARRIVAL, e.NEXT_DAY_DELIVERY_CANCEL);
        NEXT_DAY_DELIVERY_ISSUE = bVar9;
        b bVar10 = new b("MY_STORE", 9, R.string.contact_us_reason_business_mystore, new e[0]);
        MY_STORE = bVar10;
        b bVar11 = new b("PACKAGING", 10, R.string.contact_us_reason_business_packaging, new e[0]);
        PACKAGING = bVar11;
        b bVar12 = new b("INVOICES", 11, R.string.contact_us_reason_business_invoices, new e[0]);
        INVOICES = bVar12;
        b bVar13 = new b("BUSINESS_GENERAL_QUESTION", 12, R.string.contact_us_reason_business_general_question, new e[0]);
        BUSINESS_GENERAL_QUESTION = bVar13;
        b bVar14 = new b("UNKNOWN", 13, 0, new e[0]);
        UNKNOWN = bVar14;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
        Companion = new a();
    }

    public b(String str, int i11, int i12, boolean z11, boolean z12, e... eVarArr) {
        this.allowAttachments = z11;
        this.allowOrderReference = z12;
        this.stringResId = i12;
        this.topics = eVarArr;
    }

    public static a80.a e() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.allowAttachments;
    }

    public final boolean c() {
        return this.allowOrderReference;
    }

    public final Integer d() {
        return Integer.valueOf(this.stringResId);
    }

    public final e[] f() {
        return this.topics;
    }

    @Override // t40.b
    public final Object get() {
        return Integer.valueOf(this.stringResId);
    }

    public /* synthetic */ b(String str, int i11, int i12, e[] eVarArr) {
        this(str, i11, i12, false, false, eVarArr);
    }
}
