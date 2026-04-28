package m5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j Clickable;
    public static final j Link;
    public static final j Paragraph;
    public static final j Span;
    public static final j String;
    public static final j Url;
    public static final j VerbatimTts;

    static {
        j jVar = new j("Paragraph", 0);
        Paragraph = jVar;
        j jVar2 = new j("Span", 1);
        Span = jVar2;
        j jVar3 = new j("VerbatimTts", 2);
        VerbatimTts = jVar3;
        j jVar4 = new j("Url", 3);
        Url = jVar4;
        j jVar5 = new j("Link", 4);
        Link = jVar5;
        j jVar6 = new j("Clickable", 5);
        Clickable = jVar6;
        j jVar7 = new j("String", 6);
        String = jVar7;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        $VALUES = jVarArr;
        $ENTRIES = new a80.b(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
