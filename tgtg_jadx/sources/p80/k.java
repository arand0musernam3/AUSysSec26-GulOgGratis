package p80;

import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends i {
    public static final long b(long j9, h hVar) {
        long j11;
        hVar.getClass();
        int i11 = j.$EnumSwitchMapping$0[hVar.ordinal()];
        if (i11 == 1) {
            j11 = 86400000;
        } else if (i11 == 2) {
            j11 = 3600000;
        } else if (i11 == 3) {
            j11 = TimeConstants.ONE_MINUTE_DIFFERENCE;
        } else if (i11 == 4) {
            j11 = 1000;
        } else {
            if (i11 != 5) {
                org.bouncycastle.jce.provider.a.p(hVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j11 = 1;
        }
        if (j9 == 0) {
            return 0L;
        }
        if (j9 == 1) {
            if (j11 <= 4611686018427387903L) {
                return j11;
            }
        } else if (j11 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j9)) - Long.numberOfLeadingZeros(j11);
            if (iNumberOfLeadingZeros < 63) {
                return j9 * j11;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j12 = j9 * j11;
                if (j12 <= 4611686018427387903L) {
                    return j12;
                }
            }
        } else if (j9 <= 4611686018427387903L) {
            return j9;
        }
        return 4611686018427387903L;
    }
}
