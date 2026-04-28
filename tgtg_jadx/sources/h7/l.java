package h7;

import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f21582a;

    static {
        new l("", 0, 0);
    }

    public l(String str, int i11, int i12) {
        this.f21582a = new k(str, i11, i12);
    }

    public static l a(boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
        String string;
        if (z11) {
            int i17 = i11 / 2;
            int i18 = i12 / 2;
            StringBuilder sbR = r8.k.r(i18, i17, "M0,", " A", MessageLogView.COMMA_SEPARATOR);
            e0.f.C(sbR, i18, " 0 1,1 ", i11, MessageLogView.COMMA_SEPARATOR);
            e0.f.C(sbR, i18, " A", i17, MessageLogView.COMMA_SEPARATOR);
            sbR.append(i18);
            sbR.append(" 0 1,1 0,");
            sbR.append(i18);
            sbR.append(" Z");
            string = sbR.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int iMin = Math.min(i11 / 2, i12 / 2);
            int iMin2 = Math.min(iMin, i13);
            int iMin3 = Math.min(iMin, i14);
            int iMin4 = Math.min(iMin, i15);
            int iMin5 = Math.min(iMin, i16);
            sb2.append(iMin2);
            sb2.append(",0 L ");
            sb2.append(i11 - iMin3);
            sb2.append(",0");
            if (iMin3 > 0) {
                sb2.append(" A ");
                sb2.append(iMin3);
                sb2.append(MessageLogView.COMMA_SEPARATOR);
                sb2.append(iMin3);
                sb2.append(" 0 0,1 ");
                sb2.append(i11);
                sb2.append(MessageLogView.COMMA_SEPARATOR);
                sb2.append(iMin3);
            }
            sb2.append(" L ");
            sb2.append(i11);
            sb2.append(MessageLogView.COMMA_SEPARATOR);
            sb2.append(i12 - iMin4);
            if (iMin4 > 0) {
                sb2.append(" A ");
                sb2.append(iMin4);
                sb2.append(MessageLogView.COMMA_SEPARATOR);
                sb2.append(iMin4);
                sb2.append(" 0 0,1 ");
                sb2.append(i11 - iMin4);
                sb2.append(MessageLogView.COMMA_SEPARATOR);
                sb2.append(i12);
            }
            sb2.append(" L ");
            sb2.append(iMin5);
            sb2.append(MessageLogView.COMMA_SEPARATOR);
            sb2.append(i12);
            if (iMin5 > 0) {
                sb2.append(" A ");
                sb2.append(iMin5);
                sb2.append(MessageLogView.COMMA_SEPARATOR);
                sb2.append(iMin5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i12 - iMin5);
            }
            if (iMin2 > 0) {
                sb2.append(" L 0,");
                sb2.append(iMin2);
                sb2.append(" A ");
                sb2.append(iMin2);
                sb2.append(MessageLogView.COMMA_SEPARATOR);
                sb2.append(iMin2);
                sb2.append(" 0 0,1 ");
                sb2.append(iMin2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            string = sb2.toString();
        }
        return new l(string, i11, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f21582a.equals(((l) obj).f21582a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21582a.hashCode();
    }

    public final String toString() {
        return this.f21582a.toString();
    }
}
