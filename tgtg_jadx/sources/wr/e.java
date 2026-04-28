package wr;

import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h(with = f.class)
public final class e implements t40.b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ALLERGIC_TO_ORDER;
    public static final e APP_ERROR;
    public static final e APP_SUGGESTION;
    public static final e BAD_IN_STORE_EXPERIENCE;
    public static final e CANCEL_ORDER;
    public static final e CATERING_ARRIVAL;
    public static final e CATERING_CANCEL;
    public static final e CATERING_DAMAGED;
    public static final e CATERING_PROBLEM;

    @NotNull
    public static final d Companion;
    public static final e DELIVERY_ARRIVAL;
    public static final e DELIVERY_CANCEL;
    public static final e DELIVERY_DAMAGED;
    public static final e DELIVERY_PROBLEM;
    public static final e DIETARY_QUESTION;
    public static final e GENERIC_QUESTION;
    public static final e JOB_INQUIRY;
    public static final e LOVE_YOU;
    public static final e LOW_QUALITY;
    public static final e LOW_QUANTITY;
    public static final e MISSED_COLLECTION_CONTACT_AGAIN;
    public static final e MISSED_COLLECTION_WINDOW;
    public static final e NEXT_DAY_DELIVERY_ARRIVAL;
    public static final e NEXT_DAY_DELIVERY_CANCEL;
    public static final e NEXT_DAY_DELIVERY_DAMAGED;
    public static final e NEXT_DAY_DELIVERY_PROBLEM;
    public static final e NO_FOOD;
    public static final e NO_SELECTION;
    public static final e PICKUP_TIME_CHANGED;
    public static final e STORE_CLOSED;
    public static final e STUDENT_INQUIRY;
    public static final e UNKNOWN;
    private final int stringResId;

    static {
        e eVar = new e("NO_SELECTION", 0, R.string.contact_us_no_selection);
        NO_SELECTION = eVar;
        e eVar2 = new e("LOW_QUALITY", 1, R.string.contact_us_topic_low_quality);
        LOW_QUALITY = eVar2;
        e eVar3 = new e("LOW_QUANTITY", 2, R.string.contact_us_topic_low_quantity);
        LOW_QUANTITY = eVar3;
        e eVar4 = new e("NO_FOOD", 3, R.string.contact_us_topic_no_food);
        NO_FOOD = eVar4;
        e eVar5 = new e("STORE_CLOSED", 4, R.string.contact_us_topic_store_closed);
        STORE_CLOSED = eVar5;
        e eVar6 = new e("PICKUP_TIME_CHANGED", 5, R.string.contact_us_topic_pickup_time_changed);
        PICKUP_TIME_CHANGED = eVar6;
        e eVar7 = new e("BAD_IN_STORE_EXPERIENCE", 6, R.string.contact_us_topic_bad_in_store_experience);
        BAD_IN_STORE_EXPERIENCE = eVar7;
        e eVar8 = new e("APP_ERROR", 7, R.string.contact_us_topic_app_error);
        APP_ERROR = eVar8;
        e eVar9 = new e("APP_SUGGESTION", 8, R.string.contact_us_topic_app_suggestion);
        APP_SUGGESTION = eVar9;
        e eVar10 = new e("LOVE_YOU", 9, R.string.contact_us_topic_love_you);
        LOVE_YOU = eVar10;
        e eVar11 = new e("JOB_INQUIRY", 10, R.string.contact_us_topic_job_inquiry);
        JOB_INQUIRY = eVar11;
        e eVar12 = new e("STUDENT_INQUIRY", 11, R.string.contact_us_topic_student_inquiry);
        STUDENT_INQUIRY = eVar12;
        e eVar13 = new e("DIETARY_QUESTION", 12, R.string.contact_us_topic_dietary_question);
        DIETARY_QUESTION = eVar13;
        e eVar14 = new e("CANCEL_ORDER", 13, R.string.contact_us_topic_cancel_order);
        CANCEL_ORDER = eVar14;
        e eVar15 = new e("ALLERGIC_TO_ORDER", 14, R.string.contact_us_topic_allergies);
        ALLERGIC_TO_ORDER = eVar15;
        e eVar16 = new e("GENERIC_QUESTION", 15, R.string.contact_us_topic_generic_question);
        GENERIC_QUESTION = eVar16;
        e eVar17 = new e("DELIVERY_PROBLEM", 16, R.string.contact_us_topic_delivery_problem_v2);
        DELIVERY_PROBLEM = eVar17;
        e eVar18 = new e("DELIVERY_DAMAGED", 17, R.string.contact_us_topic_delivery_damaged);
        DELIVERY_DAMAGED = eVar18;
        e eVar19 = new e("DELIVERY_ARRIVAL", 18, R.string.contact_us_topic_delivery_arrival);
        DELIVERY_ARRIVAL = eVar19;
        e eVar20 = new e("DELIVERY_CANCEL", 19, R.string.contact_us_topic_delivery_cancel);
        DELIVERY_CANCEL = eVar20;
        e eVar21 = new e("MISSED_COLLECTION_WINDOW", 20, R.string.contact_us_topic_missed_collection);
        MISSED_COLLECTION_WINDOW = eVar21;
        e eVar22 = new e("MISSED_COLLECTION_CONTACT_AGAIN", 21, R.string.contact_us_topic_missed_collection_follow_up);
        MISSED_COLLECTION_CONTACT_AGAIN = eVar22;
        e eVar23 = new e("CATERING_PROBLEM", 22, R.string.contact_us_topic_catering_problem);
        CATERING_PROBLEM = eVar23;
        e eVar24 = new e("CATERING_DAMAGED", 23, R.string.contact_us_topic_catering_damaged);
        CATERING_DAMAGED = eVar24;
        e eVar25 = new e("CATERING_ARRIVAL", 24, R.string.contact_us_topic_catering_arrival);
        CATERING_ARRIVAL = eVar25;
        e eVar26 = new e("CATERING_CANCEL", 25, R.string.contact_us_topic_catering_cancel);
        CATERING_CANCEL = eVar26;
        e eVar27 = new e("NEXT_DAY_DELIVERY_PROBLEM", 26, R.string.contact_us_topic_next_day_delivery_problem);
        NEXT_DAY_DELIVERY_PROBLEM = eVar27;
        e eVar28 = new e("NEXT_DAY_DELIVERY_DAMAGED", 27, R.string.contact_us_topic_next_day_delivery_damaged);
        NEXT_DAY_DELIVERY_DAMAGED = eVar28;
        e eVar29 = new e("NEXT_DAY_DELIVERY_ARRIVAL", 28, R.string.contact_us_topic_next_day_delivery_arrival);
        NEXT_DAY_DELIVERY_ARRIVAL = eVar29;
        e eVar30 = new e("NEXT_DAY_DELIVERY_CANCEL", 29, R.string.contact_us_topic_next_day_delivery_cancel);
        NEXT_DAY_DELIVERY_CANCEL = eVar30;
        e eVar31 = new e("UNKNOWN", 30, 0);
        UNKNOWN = eVar31;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30, eVar31};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
        Companion = new d();
    }

    public e(String str, int i11, int i12) {
        this.stringResId = i12;
    }

    public static a80.a c() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final Integer a() {
        return Integer.valueOf(this.stringResId);
    }

    @Override // t40.b
    public final Object get() {
        return Integer.valueOf(this.stringResId);
    }
}
