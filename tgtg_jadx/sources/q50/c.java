package q50;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.i18n.LocalizedMessage;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, LocalizedMessage.DEFAULT_ENCODING),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, ArticleContentView.UTF_8_ENCODING_TYPE),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(new int[]{28}, new String[0]),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");

    private final String[] otherEncodingNames;
    private final int[] values;
    private static final Map<Integer, c> VALUE_TO_ECI = new HashMap();
    private static final Map<String, c> NAME_TO_ECI = new HashMap();

    static {
        for (c cVar : values()) {
            for (int i11 : cVar.values) {
                VALUE_TO_ECI.put(Integer.valueOf(i11), cVar);
            }
            NAME_TO_ECI.put(cVar.name(), cVar);
            for (String str : cVar.otherEncodingNames) {
                NAME_TO_ECI.put(str, cVar);
            }
        }
    }

    c(int i11, String... strArr) {
        this.values = new int[]{i11};
        this.otherEncodingNames = strArr;
    }

    public static c a(String str) {
        return NAME_TO_ECI.get(str);
    }

    public final int c() {
        return this.values[0];
    }

    c(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }
}
