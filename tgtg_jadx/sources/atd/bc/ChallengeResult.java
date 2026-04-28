package atd.bc;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResult {
    private static int getDeviceData = 1;
    private static int getSDKAppID;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean AuthenticationRequestParameters(java.lang.Object r6, java.lang.Object r7) {
        /*
            int r0 = atd.bc.ChallengeResult.getDeviceData
            int r1 = r0 + 55
            int r1 = r1 % 128
            atd.bc.ChallengeResult.getSDKAppID = r1
            r1 = 1
            if (r6 == r7) goto L5c
            r2 = r0 ^ 96
            r3 = r0 & 96
            int r3 = r3 << r1
            int r2 = r2 + r3
            r3 = r2 ^ (-1)
            int r2 = r2 << r1
            int r3 = r3 + r2
            int r2 = r3 % 128
            atd.bc.ChallengeResult.getSDKAppID = r2
            int r3 = r3 % 2
            r2 = 0
            if (r3 == 0) goto L23
            r3 = 4
            int r3 = r3 / r2
            if (r6 == 0) goto L4c
            goto L25
        L23:
            if (r6 == 0) goto L4c
        L25:
            r3 = r0 ^ 101(0x65, float:1.42E-43)
            r4 = r0 & 101(0x65, float:1.42E-43)
            r3 = r3 | r4
            int r3 = r3 << r1
            r4 = r0 & (-102(0xffffffffffffff9a, float:NaN))
            int r0 = ~r0
            r5 = 101(0x65, float:1.42E-43)
            r0 = r0 & r5
            r0 = r0 | r4
            int r0 = -r0
            r4 = r3 & r0
            r0 = r0 | r3
            int r4 = r4 + r0
            int r0 = r4 % 128
            atd.bc.ChallengeResult.getSDKAppID = r0
            int r4 = r4 % 2
            boolean r6 = r6.equals(r7)
            if (r4 == 0) goto L49
            r7 = 83
            int r7 = r7 / r2
            if (r6 == 0) goto L4c
            goto L5c
        L49:
            if (r6 == 0) goto L4c
            goto L5c
        L4c:
            int r6 = atd.bc.ChallengeResult.getDeviceData
            r7 = r6 & 27
            r6 = r6 ^ 27
            r6 = r6 | r7
            r0 = r7 & r6
            r6 = r6 | r7
            int r0 = r0 + r6
            int r0 = r0 % 128
            atd.bc.ChallengeResult.getSDKAppID = r0
            return r2
        L5c:
            int r6 = atd.bc.ChallengeResult.getDeviceData
            r7 = r6 | 71
            int r0 = r7 << 1
            r6 = r6 & 71
            int r6 = ~r6
            r6 = r6 & r7
            int r6 = -r6
            r7 = r0 ^ r6
            r6 = r6 & r0
            int r6 = r6 << r1
            int r7 = r7 + r6
            int r6 = r7 % 128
            atd.bc.ChallengeResult.getSDKAppID = r6
            int r7 = r7 % 2
            if (r7 != 0) goto L75
            return r1
        L75:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.ChallengeResult.AuthenticationRequestParameters(java.lang.Object, java.lang.Object):boolean");
    }
}
