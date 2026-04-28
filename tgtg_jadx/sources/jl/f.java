package jl;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f EXPLORING_NEW_STORES_AND_CUISINES;
    public static final f FINDING_AN_IMMEDIATE_MEAL_OPTION;
    public static final f FINDING_EASY_OPTIONS_TO_COMPLEMENT_MY_MEALS;
    public static final f GETTING_A_FUN_TREAT_FOR_MYSELF_OR_OTHERS;
    public static final f SAVING_MONEY_ON_GROCERIES;
    public static final f SUPPLEMENTING_MY_GROCERY_SHOPPING;

    @NotNull
    private final String value;

    static {
        f fVar = new f("SUPPLEMENTING_MY_GROCERY_SHOPPING", 0, "supplementing_my_grocery_shopping");
        SUPPLEMENTING_MY_GROCERY_SHOPPING = fVar;
        f fVar2 = new f("SAVING_MONEY_ON_GROCERIES", 1, "saving_money_on_groceries");
        SAVING_MONEY_ON_GROCERIES = fVar2;
        f fVar3 = new f("GETTING_A_FUN_TREAT_FOR_MYSELF_OR_OTHERS", 2, "getting_a_fun_treat_for_myself_or_others");
        GETTING_A_FUN_TREAT_FOR_MYSELF_OR_OTHERS = fVar3;
        f fVar4 = new f("FINDING_EASY_OPTIONS_TO_COMPLEMENT_MY_MEALS", 3, "finding_easy_options_to_complement_my_meals");
        FINDING_EASY_OPTIONS_TO_COMPLEMENT_MY_MEALS = fVar4;
        f fVar5 = new f("FINDING_AN_IMMEDIATE_MEAL_OPTION", 4, "finding_an_immediate_meal_option");
        FINDING_AN_IMMEDIATE_MEAL_OPTION = fVar5;
        f fVar6 = new f("EXPLORING_NEW_STORES_AND_CUISINES", 5, "exploring_new_stores_and_cuisines");
        EXPLORING_NEW_STORES_AND_CUISINES = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public f(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String c() {
        return this.value;
    }
}
