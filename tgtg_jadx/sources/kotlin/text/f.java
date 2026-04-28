package kotlin.text;

import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f26599a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f26600b;

    static {
        f fVar = new f();
        if (!c0.a("  ") && !c0.a("") && !c0.a("")) {
            c0.a("");
        }
        f26600b = fVar;
    }

    public final void a(String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append("bytesPerLine = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(MessageLogView.COMMA_SEPARATOR);
        sb2.append('\n');
        sb2.append(str);
        sb2.append("bytesPerGroup = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(MessageLogView.COMMA_SEPARATOR);
        sb2.append('\n');
        sb2.append(str);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSeparator = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        j4.s.A(sb2, str, "bytePrefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSuffix = \"");
        sb2.append("");
        sb2.append("\"");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        a("    ", sb2);
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
