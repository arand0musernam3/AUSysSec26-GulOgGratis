package jg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e Number;
    public static final e Phone;
    public static final e Text;
    public static final e TextAllCaps;
    public static final e TextCapSentences;
    public static final e TextEmailAddress;
    public static final e TextMultiLine;
    public static final e TextNoSuggestions;

    static {
        e eVar = new e("TextCapSentences", 0);
        TextCapSentences = eVar;
        e eVar2 = new e("TextEmailAddress", 1);
        TextEmailAddress = eVar2;
        e eVar3 = new e("Number", 2);
        Number = eVar3;
        e eVar4 = new e("Phone", 3);
        Phone = eVar4;
        e eVar5 = new e("Text", 4);
        Text = eVar5;
        e eVar6 = new e("TextNoSuggestions", 5);
        TextNoSuggestions = eVar6;
        e eVar7 = new e("TextAllCaps", 6);
        TextAllCaps = eVar7;
        e eVar8 = new e("TextMultiLine", 7);
        TextMultiLine = eVar8;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
