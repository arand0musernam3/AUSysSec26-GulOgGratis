package org.bouncycastle.pqc.legacy.crypto.qtesla;

import i4.a;
import j4.s;

/* JADX INFO: loaded from: classes3.dex */
public class QTESLASecurityCategory {
    public static final int PROVABLY_SECURE_I = 5;
    public static final int PROVABLY_SECURE_III = 6;

    private QTESLASecurityCategory() {
    }

    public static String getName(int i11) {
        if (i11 == 5) {
            return "qTESLA-p-I";
        }
        if (i11 == 6) {
            return "qTESLA-p-III";
        }
        a.f(s.f(i11, "unknown security category: "));
        return null;
    }

    public static int getPrivateSize(int i11) {
        if (i11 == 5) {
            return 5224;
        }
        if (i11 == 6) {
            return 12392;
        }
        a.f(s.f(i11, "unknown security category: "));
        return 0;
    }

    public static int getPublicSize(int i11) {
        if (i11 == 5) {
            return 14880;
        }
        if (i11 == 6) {
            return 38432;
        }
        a.f(s.f(i11, "unknown security category: "));
        return 0;
    }

    public static int getSignatureSize(int i11) {
        if (i11 == 5) {
            return 2592;
        }
        if (i11 == 6) {
            return 5664;
        }
        a.f(s.f(i11, "unknown security category: "));
        return 0;
    }

    public static void validate(int i11) {
        if (i11 == 5 || i11 == 6) {
            return;
        }
        a.f(s.f(i11, "unknown security category: "));
    }
}
