package y00;

import android.net.Uri;
import android.text.TextUtils;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h4 extends a4 {
    public static final boolean s(String str) {
        String str2 = (String) g0.f44809t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(MessageLogView.COMMA_SEPARATOR)) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (java.lang.Math.abs(r6.hashCode() % 100) < r8.I().t()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.g4 q(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.h4.q(java.lang.String):y00.g4");
    }

    public final String r(String str) {
        h1 h1Var = this.f44586c.f44920a;
        l4.U(h1Var);
        String strC = h1Var.C(str);
        if (TextUtils.isEmpty(strC)) {
            return (String) g0.f44805r.a(null);
        }
        Uri uri = Uri.parse((String) g0.f44805r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strC).length() + 1 + String.valueOf(authority).length());
        sb2.append(strC);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }
}
