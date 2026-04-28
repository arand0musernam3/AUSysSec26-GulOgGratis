package da;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.s;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final boolean a(String str, String str2) {
        str.getClass();
        if (Intrinsics.areEqual(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    int i14 = i13 + 1;
                    if (i13 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i12++;
                    } else if (cCharAt == ')' && i12 - 1 == 0 && i13 != str.length() - 1) {
                        break;
                    }
                    i11++;
                    i13 = i14;
                } else if (i12 == 0) {
                    return Intrinsics.areEqual(StringsKt.e0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String b(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? s.b(CollectionsKt.U(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final String c(Collection collection) {
        return s.b(CollectionsKt.U(collection, MessageLogView.COMMA_SEPARATOR, null, null, null, 62)).concat(s.b(" }"));
    }

    public static final String d(Collection collection) {
        return s.b(CollectionsKt.U(collection, MessageLogView.COMMA_SEPARATOR, null, null, null, 62)).concat(s.b("},"));
    }
}
